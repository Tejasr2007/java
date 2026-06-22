import java.util.Scanner;
abstract class Subject
{
    int marks;
    abstract void Maths();
    void Score()
    {
        Scanner get = new Scanner(System.in);
        System.out.print("Enter your Maths Score:");
        marks=get.nextInt();
    }
}
class Std1 extends Subject
{
    void Maths()
    {
        System.out.println("Numbers");
        Score();
    }
    void display()
    {
        System.out.println("Maths marks in Std1:"+marks);
    }
}
class Std2 extends Subject
{
    void Maths()
    {
        System.out.println("Arithmetic Operations");
        Score();
    }
    void display()
    {
        System.out.println("Maths marks in Std1:"+marks);
    }
}
public class Abstract 
{
    public static void main(String[] args) 
    {
        
    }
    
}