import java.util.Scanner;
import java.io.*;
public class Exception_Handling 
{
   static void readFile() throws IOException
    {
        FileReader text = new FileReader("Prime.java");
        System.out.println("File Opened");
    }
public static void main(String[] args) 
{
    try {
        readFile();
    } catch (IOException e) {
        System.out.println("Something went Wrong");
    }
    /*Scanner get = new Scanner(System.in);
    System.out.print("Enter the age:");
    int age=get.nextInt();
    if (age<18) 
    {   
        throw new ArithmeticException("Not Eligible to Vote");        
    }
    System.out.println("The Person Can Vote");*/    
}
}
