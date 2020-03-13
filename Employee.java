package ru.geekbrains.java_one.lesson_d;

public class Employee {

    private static int nextId = 0;

    private int id;
    private String lastName;
    private int salary;
    private int age;
    private String position;

    public String getLastName(){
        return this.lastName;
    }

    public int getSalary(){
        return this.salary;
    }

    public int getAge(){
        return this.age;
    }

    public String getPosition(){
        return this.position;
    }

    public  int getId(){
        return this.id;
    }

    public void changeSalary(){
        if(this.age > 45){
            this.salary +=5000;
        }
    }

    Employee(String lastName, int salary, int age, String position){
        this.lastName = lastName;
        this.salary = salary;
        this.position = position;
        this.age = age;
        this.id = nextId++;
    }

}
