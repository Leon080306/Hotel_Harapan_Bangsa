package models.Staff.Cleaning;

import models.Staff.Department;
import models.Staff.Staff;
import models.UserType;

public class Cleaning extends Staff {
    public Cleaning (String nik, String password, String nama, int umur, String email, String phone, String address, UserType userType, String employeeID, double salary) {
        super(nik, password, nama, umur, email, phone, address, employeeID, salary, Department.CLEANING);
    }
}
