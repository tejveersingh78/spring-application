package com.sunglowsys.domain;

import java.util.Objects;

public class Employee {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;

    public void getId() {
        System.out.println("Id:" + id);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void getFirstName() {
        System.out.println("First Name:" + firstName);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void getLastName() {
        System.out.println("Last Name:" + lastName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void getEmail() {
        System.out.println("Email:" + email);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void getMobile() {
        System.out.println("Mobile:" + mobile);
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(email, employee.email) && Objects.equals(mobile, employee.mobile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, mobile);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
