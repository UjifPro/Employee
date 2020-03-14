package ru.geekbrains.java_one.lesson_d;

public class Main {

    //TODO
    //    Создать класс "Сотрудник" с полями: Фамилия, зарплата, возраст, должность;
    //    Конструктор класса должен заполнять эти поля при создании объекта;
    //    Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
    //    Вывести при помощи методов из пункта 3 ФИО и должность.
    //    Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
    //    * Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
    //    * Подсчитать средние арифметические зарплаты и возраста сотрудников из п.5
    //    *** Продумать конструктор таким образом, чтобы при создании каждому сотруднику присваивался личный уникальный идентификационный порядковый номер


    public static void main(String[] arg){

        Employee empl1 = new Employee("Печкин", 50000, 40, "Почтальон");
        System.out.print(empl1.getLastName() + " " + empl1.getPosition() + " " + empl1.getSalary() + " " + empl1.getAge());

        Employee[] arrEmp = new Employee[6];

        for(int i = 0; i<arrEmp.length; i++){
            Employee emp = new Employee("Name"+i, i,43+i,"программист");
            arrEmp[i] = emp;
        }

        int ageAll = 0;
        int salaryAll = 0;
        for(int i = 0; i<arrEmp.length; i++) {
            Employee emp = arrEmp[i];
            emp.changeSalary();
            ageAll+=emp.getAge();
            salaryAll +=emp.getSalary();
            System.out.println(emp.getLastName() + " " + emp.getPosition() + " " + emp.getSalary() + " " + emp.getAge() + "  " + emp.getId());
            System.out.println(emp.toString());
        }

        System.out.println("Средний возраст =" + ageAll/arrEmp.length);
        System.out.println("Средняя зп = " + salaryAll/arrEmp.length);


    }
}