package Experiment_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {
        public static void main(String[] args) {
                List<Employee> employees = Arrays.asList(new Employee("Vivek", 30, 70000, "HR"),
                                new Employee("Kuldip", 25, 80000, "IT"),
                                new Employee("Jay", 35, 60000, "IT"),
                                new Employee("Sahil", 28, 75000, "HR"),
                                new Employee("Utsav", 40, 90000, "Finance"));
                EmployeePredicate predicate = new EmployeePredicate() {

                        @Override
                        public boolean test(Employee t) {
                                // TODO Auto-generated method stub
                                throw new UnsupportedOperationException("Unimplemented method 'test'");
                        }

                };
                // Filter employees by age
                List<Employee> ageFiltered = employees.stream()
                                .filter(predicate.byAge(30))
                                .collect(Collectors.toList());
                System.out.println("Employees aged 30: " + ageFiltered);
                // Filter employees by department
                List<Employee> departmentFiltered = employees.stream()
                                .filter(predicate.byDepartment("IT"))
                                .collect(Collectors.toList());
                System.out.println("Employees in IT department: " +
                                departmentFiltered);
                // Calculate average salary
                double averageSalary = employees.stream()
                                .mapToDouble(Employee::getSalary)
                                .average()
                                .orElse(0.0);
                System.out.println("Average Salary: " + averageSalary);
        }
}