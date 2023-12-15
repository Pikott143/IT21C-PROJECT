package employee;

/**
 *
 * @author Aj Cervantes
 */

import java.time.LocalDate;

public class employee {

    String name;
    int salary;
    LocalDate hiredate;

    public employee(String name, int salary, LocalDate hiredate) {

        this.name = name;
        this.salary = salary;
         this.hiredate = hiredate;

    }

    public static void main(String[] args) {

        employee employee1 = new employee("Roberta Petrus ", 50000, LocalDate.parse("2021-04-01"));
        employee employee2 = new employee("Lyod Blair ", 70000000, LocalDate.parse("2011-09-05"));
        employee employee3 = new employee("Magdalena Artemon ", 100, LocalDate.parse("2001-08-05"));

        System.out.println("name:" + employee1.name + "salary:" + employee1.salary + " " + "hiredate:" + employee1.hiredate);
        System.out.println("name:" + employee2.name + "salary:" + employee2.salary + " " + "hiredate:" + employee2.hiredate);
        System.out.println("name:" + employee3.name + "salary :" + employee3.salary + " " + "hiredate:" + employee3.hiredate);

    }
}