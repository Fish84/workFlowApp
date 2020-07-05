package com.saltsoftware.entity;

public class EmployeeRole {

    private int empID;
    private int roleID;

    public static class Builder {
        private int empID, roleID;
    }

    public EmployeeRole(int empID, int roleID) {
        this.empID = empID;
        this.roleID = roleID;
    }

    public int getEmpID() {
        return empID;
    }

    public int getRoleID() {
        return roleID;
    }

    @Override
    public String toString() {
        return "EmployeeRole{" +
                "empID=" + empID +
                ", roleID=" + roleID +
                '}';
    }


}
