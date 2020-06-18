package yyx.ssm.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import yyx.ssm.domain.Classes;

import java.util.List;

@Repository
public interface ClassesDao {
    public List<Classes> findAll();

    public Classes findClassesById(@Param("cid") String classesid);

    public void saveClasses(Classes classes);

    void deleteClassesByCid(String cid);
}
