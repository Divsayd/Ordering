package com.example.demo.Model;

public class Employee  {

  public  String name ;
  public String name1;
  int age;

    public Employee(String name,String name1,int age) {
        this.name = name;
     this.name1=name1;
     this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", name1='" + name1 + '\'' +
                ", age=" + age +
                '}';
    }
}


