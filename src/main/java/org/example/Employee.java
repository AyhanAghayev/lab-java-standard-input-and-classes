package org.example;

public class Employee {
    private String name;
    private String email;
    private byte age;
    private int salary;
    private int id;
    private static int counter = 0;

    public Employee(String name, String email, byte age, int salary) {
        id = counter++;
        this.name = name;
        this.email = email;
        this.age = age;
        this.salary = salaryValidation(salary);
    }

    protected int salaryValidation(int salary) {
        if (salary < 0) {
            System.err.println("Salary can't be below zero!");
            return 0;
        }
        return salary;
    }

    public Employee() {
        this.name = "John Doe";
        this.email = "johndoe@company.com";
        this.age = 69;
        this.salary = 1_000_000;
    }

    public String getName() {
        return this.name;
    }

    public String setName(String name) {
        this.name = name;
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String setEmail(String email) {
        this.email = email;
        return this.email;
    }

    public byte getAge() {
        return this.age;
    }

    public byte setAge(byte age) {
        this.age = age;
        return this.age;
    }

    public int getSalary() {
        return this.salary;
    }

    public int setSalary(int salary) {
        this.salary = salaryValidation(salary);
        return this.salary;
    }

    // We will need this to simplify our job of writing data to file
    public String returnData() {
        return "Employee ID: " + id +
                " name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", salary=" + salary + "\n";
    }
}
