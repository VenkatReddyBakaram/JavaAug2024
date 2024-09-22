package com.vtech.coreApps;

class A12 {

    int empId;
    String empName;
    double salary;

    A12() {

    }

    A12(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class TestApp10 {

    public static void main(String[] args) {

        A12 consOb = new A12(1235, "John", 3696594.30);

        A12 ob = new A12();
        ob.setEmpId(1234);
        ob.setEmpName("VenkatReddy");
        ob.setSalary(5439959.30);
        System.out.println("Emp ID :" + ob.getEmpId());
        System.out.println("Emp Name :" + ob.getEmpName());
        System.out.println("Salary :" + ob.getSalary());

        System.out.println("Emp ID :" + consOb.getEmpId());
        System.out.println("Emp Name :" + consOb.getEmpName());
        System.out.println("Salary :" + consOb.getSalary());
    }
}
