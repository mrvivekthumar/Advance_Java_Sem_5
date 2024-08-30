package Experiment_2;

import java.util.function.Predicate;

@FunctionalInterface
public interface EmployeePredicate extends Predicate<Employee> {

    default EmployeePredicate byAge(int age) {
        return employee -> employee.getAge() == age;
    }

    default EmployeePredicate byDepartment(String department) {
        return employee -> employee.getDepartment().equalsIgnoreCase(department);
    }
}