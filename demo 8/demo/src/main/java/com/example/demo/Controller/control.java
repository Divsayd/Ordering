package com.example.demo.Controller;

import com.example.demo.Model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class control {


    @GetMapping("/home")
    public List<Employee> displayEmployee(Employee employee) {
        List<Employee> listt= Arrays.asList( new Employee("Divya","c",13),new Employee("iya","v",5));
        List<Employee> l=listt.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList());
        return l;
    }
}