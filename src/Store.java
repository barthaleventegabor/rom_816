/*
* File: Store.java
* Author: Bartha Levente
* Copyright: 2025, Bartha Levente
* Group: IN
* Date: 2025-03-10
* Github: https://github.com/barthaleventegabor/
* Licenc: MIT
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {

    public static ArrayList <Employee> readFile(){
        ArrayList <Employee> employeeList = new ArrayList<>();
        try {
            employeeList = tryReadFile();
        } catch (IOException e) {
            System.err.println("Hiba! A fájl nem található!");
            e.getMessage();
        }
        return employeeList;
    }

    public static ArrayList <Employee> tryReadFile() throws FileNotFoundException{
        ArrayList <Employee> employeeList = new ArrayList<>();
        File file = new File("rombt.txt");
        try(Scanner fileScanner = new Scanner(file,"utf-8")){
            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                String[] lineSp = line.split(":");

                Employee employee = new Employee();

                employee.setName(lineSp[0]);
                employee.setCity(lineSp[1]);
                employee.setAddress(lineSp[2]);
                
                String[] date = lineSp[3].split("-");
                int year = Integer.parseInt(date[0]);
                int month = Integer.parseInt(date[1]);
                int day = Integer.parseInt(date[2]);
                LocalDate dLocalDate = LocalDate.of(year, month, day);
                employee.setBirth(dLocalDate);


                employee.setWage(Double.parseDouble(lineSp[4]));

                employeeList.add(employee);


            }
            
            return employeeList;
        }
    }


}
