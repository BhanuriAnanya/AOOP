package com.employee;

public class SalaryCalculator {
	public double calculateSalary(Employee employee) {
        switch (employee.getRole()) {
            case "Manager":
                return 8000;
            case "Developer":
                return 6000;
            case "Tester":
                return 4000;
            default:
                return 3000;

}
	}
}
