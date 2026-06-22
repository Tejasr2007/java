import java.util.Scanner;
public class Exception_Handling 
{
public static void main(String[] args) 
{
    Scanner get = new Scanner(System.in);
    System.out.print("Enter a num:");
    int num1=get.nextInt();
    System.out.print("Enter a num:");
    int num2=get.nextInt();
    try {
    System.out.println("The Division Value of numbers is : "+(num1/num2));    
    } 
    catch (ArithmeticException e) 
    {
    System.out.println("No number can be divided by Zero");
    System.out.print("Enter a num:");
    num1=get.nextInt();
    System.out.print("Enter a num:");
    num2=get.nextInt();
    System.out.println("The Division Value of numbers is : "+(num1/num2));        
    }
    finally
    {
        System.out.println("Program Executed Succesfully");
    }
}
}