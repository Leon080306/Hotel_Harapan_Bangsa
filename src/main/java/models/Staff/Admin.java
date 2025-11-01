package models.Staff;

import models.UserType;
import models.Users;

public class Admin extends Users {
    private Department department;

    public Admin (String nik, String password, String nama, int umur, String email, String phone, String address,  Department department) {
        super(nik, password, nama, umur, email, phone, address, UserType.ADMIN);
        this.department = department;
    }
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
