package yyx.ssm.service.impl;

import com.alibaba.dubbo.common.json.JSON;
import com.alibaba.dubbo.common.json.ParseException;
import com.alibaba.dubbo.common.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yyx.ssm.dao.ClassesDao;
import yyx.ssm.dao.StudentDao;
import yyx.ssm.domain.Classes;
import yyx.ssm.api.ClassesService;
import yyx.ssm.util.RedisUtil;

import java.io.IOException;
import java.util.List;

@Service("classesService")
public class ClassesServiceImpl implements ClassesService {

    @Autowired
    private ClassesDao classesDao;

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Classes> findAll() {
        return classesDao.findAll();
    }

    @Override
    public Classes findClassesById(String classesid) {
        Classes classes=null;
        String classesJSON=RedisUtil.get("classes"+classesid);
        if (StringUtils.isEmpty(classesJSON)){
            classes= classesDao.findClassesById(classesid);
            if (classes!=null){
                try {
                    RedisUtil.set("classes"+classes.getCid(), JSON.json(classes));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else {
                //数据库中也不存在就把这个id也存进缓存中标识，防止雪崩或者穿透
            }
        }else {
            System.out.println("从缓存中找到数据直接取出Classes对象，ID为"+classesid);
            try {
                classes=JSON.parse(RedisUtil.get("classes"+classesid), Classes.class);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        return classes;
    }

    @Override
    public void saveClasses(Classes classes) {
        classesDao.saveClasses(classes);
        String classesJSON= RedisUtil.get("classes"+classes.getCid());
        if (StringUtils.isEmpty(classesJSON)){
            try {
                System.out.println("开始插入缓存");
                RedisUtil.set("classes"+classes.getCid(), JSON.json(classes));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void deleteClassesByCid(String cid) {
        studentDao.updateStudentByDeleteClassesCid(cid);
        classesDao.deleteClassesByCid(cid);
    }
}
