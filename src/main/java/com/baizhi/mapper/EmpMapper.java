package com.baizhi.mapper;

import com.baizhi.entity.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {
    public List<Emp> queryAll();

    public void insertEmp(@Param("name") String name, @Param("salary") Double salary, @Param("age") Integer age);

    public void deleteEmp(Integer id);

    public void updateEmp(Emp emp);

    public Emp getOne(Integer id);
}
