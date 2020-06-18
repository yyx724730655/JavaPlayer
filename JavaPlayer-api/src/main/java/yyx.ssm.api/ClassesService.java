package yyx.ssm.api;

import yyx.ssm.domain.Classes;

import java.util.List;

public interface ClassesService {
    public List<Classes> findAll();

    /**
     * 结合redis查找，有存则取，无存则存
     * @param classesid
     * @return
     */
    public Classes findClassesById(String classesid);

    /**
     * 保存并存入redis缓存
     * @param classes
     */
    public void saveClasses(Classes classes);

    void deleteClassesByCid(String cid);
}
