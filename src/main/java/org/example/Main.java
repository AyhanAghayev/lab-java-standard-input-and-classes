package org.example;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
    static void main(String[] args) throws IOException{
        // For the sake of simplicity and not repeating ourselves we will be using dynamic arrays

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ayhan Aghayev", "agayevayhan@company.com", (byte) 25, 50_000));
        employees.add(new Employee("Yunis Sadiq", "yunissadiq@company.com", (byte) 30, 60_000));
        employees.add(new Employee("Charlie Brown", "charliebrown@company.com", (byte) 28, 55_000));
        employees.add(new Employee("Clark Kent", "clarkkent@company.com", (byte) 35, 70_000));
        employees.add(new Employee("Kent Clark", "kentclark@company.com", (byte) 40, 80_000));
        employees.add(new Employee("Green Yellow", "yellowgreen@company.com", (byte) 27, 52_000));
        employees.add(new Employee("Kick Buttowski", "buttowskikick@company.com", (byte) 45, 90_000));
        employees.add(new Employee("Hannah Montana", "hannah@company.com", (byte) 32, 65_000));
        employees.add(new Employee("Ian Moore", "moore@company.com", (byte) 29, 58_000));
        employees.add(new Employee("Adam Adams", "adamadams@company.com", (byte) 26, 54_000));

        // Unpaid internship :((((((((((((
        employees.add(new Intern("Miserable Guy", "guyintern@company.com", (byte) 18, 0));

        File file = new File("employees.txt");
        try(FileWriter writer = new FileWriter(file, false)) {
            for (Employee employee : employees) {
                writer.write(employee.returnData());
            }
        }
    }
}
