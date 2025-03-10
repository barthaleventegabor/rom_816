/*
* File: Solution.java
* Author: Bartha Levente
* Copyright: 2025, Bartha Levente
* Group: IN
* Date: 2025-03-10
* Github: https://github.com/barthaleventegabor/
* Licenc: MIT
*/
import java.time.LocalDate;
import java.util.ArrayList;

public class Solution {
    public static void startSolution(){
        ArrayList <Employee> employeeList = Store.readFile();
        task01(employeeList);
        task02(employeeList);
        task03(employeeList);
    }

    public static void task01(ArrayList <Employee> employeeList){
        Employee minDate = new Employee();
        boolean ifFirst = false;

        for(Employee dol : employeeList){
            if (dol.getCity().equals("Szeged")) {
                if (!ifFirst) {
                    minDate.setBirth(dol.getBirth());
                    ifFirst = true;
                }
                if (dol.getBirth().isBefore(minDate.getBirth())) {
                    minDate = dol;
                }
            }

        }
        System.out.println("A legfiatalbb szegedi dolgozó: "+ minDate.getName());
    }

    public static void task02(ArrayList <Employee> employeeList){
        Double szegedSum = 0d;
        Double szegedDb = 0d;
        for(Employee dol : employeeList){
            if (dol.getCity().equals("Szeged")) {
                szegedSum += dol.getWage();
                szegedDb += 1;
            }

        }
        Double szegedAtlag = szegedSum / szegedDb;

        System.out.printf("A szegediek átlagfizetése: %.2f\n", szegedAtlag);
        
    }

    public static void task03(ArrayList <Employee> employeeList){

        Integer counter = 0;
        for(Employee dol : employeeList){
            if (dol.getWage() < 200000) {
                counter += 1;
            }

        }
        System.out.println(counter + " dolgozónak van 200 000 alatti fizetése.");

        
    }

}
