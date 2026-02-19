package org.example;

public class Intern extends Employee {
    private static final int MAX_SALARY = 20_000;

    public Intern(String name, String email, byte age, int salary) {
        super(name, email, age, salary);
    }

    @Override
    protected int salaryValidation(int salary) {
        salary = super.salaryValidation(salary);
        if (salary > MAX_SALARY) {
            System.err.println("Salary can't be bigger than max salary!");
            return MAX_SALARY;
        }
        return salary;
    }

    @Override
    public int setSalary(int salary) {
        return super.setSalary(salaryValidation(salary));
    }
}
