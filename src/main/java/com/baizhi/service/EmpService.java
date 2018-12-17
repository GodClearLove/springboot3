package com.baizhi.service;

import com.baizhi.entity.Emp;

import java.util.List;

public interface EmpService {
    public List<Emp> getAll();

    public void addEmp(String name, Double salary, Integer age);

    public void deleteEmp(Integer id);

    public void updateEmp(Emp emp);

    public Emp getOne(Integer id);
}
