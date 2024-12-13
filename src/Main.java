import model.Employee;

import java.io.File;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      //  FileManipulation fileManipulation = new FileManipulation();
      //  fileManipulation.checkForAbsoluteOrRelative();

      //  fileManipulation.accessDirAndFiles();
     //   fileManipulation.useFileClassMethods();
       // fileManipulation.createANewFile();
       // fileManipulation.createADirectory();
       // fileManipulation.readFileUseScanner();
        Employee employee = new Employee();
        employee.readEmpFile();
    }
}