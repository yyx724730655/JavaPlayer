package yyx.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yyx.ssm.dao.ClassesDao;
import yyx.ssm.domain.Classes;
import yyx.ssm.service.ClassesService;

import java.util.List;

@Service("classesService")
public class ClassesServiceImpl implements ClassesService {

    @Autowired
    private ClassesDao classesDao;

    @Override
    public List<Classes> findAll() {
        return classesDao.findAll();
    }

    @Override
    public Classes findClassesById(String classesid) {
        Classes classes= classesDao.findClassesById(classesid);
        return classes;
    }

    @Override
    public void saveClasses(Classes classes) {
        classesDao.saveClasses(classes);
    }
}
