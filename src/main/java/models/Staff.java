package models;

import java.util.ArrayList;
import java.util.List;

public class Staff extends Users {
    private String employeeID;
    private double salary;
    private Department department;

    public Staff (String nik, String password, String nama, int umur, String email, String phone, String address, String employeeID, double salary,  Department department) {
        super(nik, password, nama, umur, email, phone, address, UserType.STAFF);
        this.employeeID = employeeID;
        this.salary = salary;
        this.department = department;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
