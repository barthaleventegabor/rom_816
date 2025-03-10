/*
* File: Employee.java
* Author: Bartha Levente
* Copyright: 2025, Bartha Levente
* Group: IN
* Date: 2025-03-10
* Github: https://github.com/barthaleventegabor/
* Licenc: MIT
*/
import java.time.LocalDate;

public class Employee {
    String name;
    String city;
    String address;
    LocalDate birth;
    Double wage;

    public Employee() {
    }

    public Employee(String name, String city, String address, LocalDate birth, Double wage) {
        this.name = name;
        this.city = city;
        this.address = address;
        this.birth = birth;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
    public String getAddress() {
        return address;
    }
    public LocalDate getBirth() {
        return birth;
    }
    public Double getWage() {
        return wage;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }
    public void setWage(Double wage) {
        this.wage = wage;
    }
}
