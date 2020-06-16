package yyx.ssm.api;

import yyx.ssm.domain.Classes;

import java.util.List;

public interface ClassesService {
    public List<Classes> findAll();

    public Classes findClassesById(String classesid);

    public void saveClasses(Classes classes);
}
