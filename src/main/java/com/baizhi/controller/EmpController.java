package com.baizhi.controller;

import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("emp")
public class EmpController {
    @Autowired
    EmpService empService;

    @RequestMapping("test")
    public String test() {
        return "hahhahahha";
    }

    @RequestMapping("/showAll")
    public List<Emp> showAll() {
        List<Emp> list = empService.getAll();
        return list;
    }

    @RequestMapping("deleteEmp")
    public String deleteEmp(Integer id) {
        empService.deleteEmp(id);
        return "redirect:/emp/showAll";
    }

    @RequestMapping("addEmp")
    public String addEmp(String name, Double salary, Integer age) {
        empService.addEmp(name, salary, age);
        return "redirect:/emp/showAll";
    }

    @RequestMapping("updateEmp")
    public String updateEmp(Emp emp) {
        empService.updateEmp(emp);
        return "redirect:/emp/showAll";
    }

    @RequestMapping("getOne")
    public String getOne(Integer id, Model model) {
        Emp emp = empService.getOne(id);
        model.addAttribute("emp", emp);
        return "forward:/main/updateEmp.jsp";
    }

}
