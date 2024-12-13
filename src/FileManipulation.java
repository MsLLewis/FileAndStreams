import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileManipulation {

    public void checkForAbsoluteOrRelative(){
        File f1 = new File("myfile.doc");
        System.out.println(f1.isAbsolute());

        File f2 = new File("C:\\temp");
        System.out.println(f2.isAbsolute());

        File f3 = new File("\\directory\\file.xml");
        System.out.println(f3.getAbsolutePath());

        File f4 = new File("c:\\directory\\file.xml");
        System.out.println(f4.getAbsolutePath());

    }

    public void accessDirAndFiles(){
        String path = "C:/Users/LaTonyaLewis/Downloads/myboot";
        File dir = new File(path);
        System.out.println(dir.isDirectory());

        File[] fileWithPath = dir.listFiles();
        System.out.println(Arrays.toString(fileWithPath));
    }

    public void useFileClassMethods() {
        String path = "C:/Users/LaTonyaLewis/Downloads/testingFile.txt";
        File f1 = new File(path);
        System.out.println("File Name: " + f1.getName());
        System.out.println("File Path: " + f1.getPath());
        System.out.println("Is path absolute: " + f1.isAbsolute());
        System.out.println("Return Absolute path of the File " + f1.getAbsolutePath());
        System.out.println("Return Parent folder of the given File " + f1.getParent());
        System.out.println("File is Exist " + f1.exists());
        System.out.println(f1.exists() ? "Yes file exists" : "file does not exist");
        if (f1.exists())  // return true or False
        {
            System.out.println("File is Found");
            System.out.println("IS file Readable " + f1.canRead());
            System.out.println("IS file Writeable " + f1.canWrite());
            System.out.println("File size in a bytes " + f1.length()); // file size in byte

        }
    }

    public void createANewFile(){

        try{
            File f = new File("C:/Users/LaTonyaLewis/Downloads/datafile.txt");
            if(f.createNewFile()){
                System.out.println("New File Created!");
            }else{
                System.out.println("File already exist.");
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void createADirectory(){
        File file = new File("C:/Users/LaTonyaLewis/Downloads/MyNewDirectory");
        System.out.println(file.mkdir());
    }

    public void readFileUseScanner(){
        try{
             File file = new File ("C:/Users/LaTonyaLewis/Downloads/testingFile.txt");
            Scanner sc = new Scanner(file);
            String data = "";
            while(sc.hasNextLine()){
                data = sc.nextLine();
                System.out.println(data);
            }
        }catch (FileNotFoundException e){
            System.out.println("Either file is not found our file is not accessible");
            System.out.println(e.getStackTrace());
            e.printStackTrace();
        }
    }
}
