package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Employee {

    String emplId, empFN, empLN, empTitle;

    public Employee(){}

    public Employee(String emplId, String empFN, String empLN, String empTitle) {
        this.emplId = emplId;
        this.empFN = empFN;
        this.empLN = empLN;
        this.empTitle = empTitle;
    }

    public void readEmpFile(){
        String file_path = "C:\\Users\\LaTonyaLewis\\Documents\\employees.csv";
        File file = new File(file_path);

            try (Scanner input = new Scanner(file)) { //try with resource
                ArrayList<Employee> empdata = new ArrayList<Employee>();

                while(input.hasNextLine()) {
                    String[] line = input.nextLine().split(","); //split on delimiter with a comma , to separate each column
                    empdata.add(new Employee(line[0],line[1],line[2],line[3]));
                }
                System.out.println("EmpID: \tFirst Name\tLast Name\tTitle");
                for(Employee emp : empdata) {
                    System.out.println(emp.getEmplId()+ "\t" + emp.getEmpFN()+ "\t"+ emp.getEmpLN()+ "\t" + emp.getEmpTitle());
                }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }



    public String getEmplId() {
        return emplId;
    }

    public void setEmplId(String emplId) {
        this.emplId = emplId;
    }

    public String getEmpLN() {
        return empLN;
    }

    public void setEmpLN(String empLN) {
        this.empLN = empLN;
    }

    public String getEmpFN() {
        return empFN;
    }

    public void setEmpFN(String empFN) {
        this.empFN = empFN;
    }

    public String getEmpTitle() {
        return empTitle;
    }

    public void setEmpTitle(String empTitle) {
        this.empTitle = empTitle;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emplId='" + emplId + '\'' +
                ", empFN='" + empFN + '\'' +
                ", empLN='" + empLN + '\'' +
                ", empTitle='" + empTitle + '\'' +
                '}';
    }
}
