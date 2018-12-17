package com.baizhi.service;

import com.baizhi.entity.Emp;
import com.baizhi.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Emp> getAll() {
        List<Emp> list = empMapper.queryAll();
        return list;
    }

    public void addEmp(String name, Double salary, Integer age) {
        empMapper.insertEmp(name, salary, age);
    }

    public void deleteEmp(Integer id) {
        empMapper.deleteEmp(id);
    }

    public void updateEmp(Emp emp) {
        empMapper.updateEmp(emp);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public Emp getOne(Integer id) {
        return empMapper.getOne(id);
    }

}
