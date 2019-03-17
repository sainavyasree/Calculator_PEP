import Calculations.*;
import java.util.*;
public class Calculator {
    public static void main(String args[])
    {
    Scanner ob=new Scanner(System.in);
    int choice=0;
    System.out.println(".....................CALCULATOR..................");
    System.out.println("1.Addition of N numbers");
    System.out.println("2.Multiplication of N numbers");
    System.out.println("3.Division of 2 numbers");
    System.out.println(".................................................");
    System.out.println("Enter your choice:");
    choice=ob.nextInt();
    switch(choice)
    {
    case 1: 
    { 
        Scanner ob1=new Scanner(System.in);
        ArrayList<Integer> l=new ArrayList<Integer>();
      //static input
      l.add(1);
      l.add(10);
      l.add(20);
      Addition a=new Addition();
      int result=a.disp(l);
      System.out.println("\nAddition of 1,10,20(Static input):"+result);

      //dynamic output
      System.out.println("DYNAMIC INPUT\n"+"enter the numbers...\n"+"Press ctrl-z after u enter required input");
      ArrayList<Integer> l1=new ArrayList<Integer>();
      while(ob1.hasNextInt())
      {
          int i=ob1.nextInt();
      l1.add(i);
      }
      result=a.disp(l1);
      System.out.println("\n(Dynamic input)Addition result=:"+result);
    }
        break;
    case 2:
    {
       Scanner ob1=new Scanner(System.in);
       ArrayList<Integer> l=new ArrayList<Integer>();
      //static input
      l.add(1);
      l.add(5);
      l.add(20);
      Multiplication m=new Multiplication();
      int result=m.disp(l);
      System.out.println("\nMultiplication of 1,5,20(Static input):"+result);
      //dynamic output
      System.out.println("DYNAMIC INPUT\n"+"enter the numbers...\n"+"Press ctrl-z after u enter required input");
      ArrayList<Integer> l1=new ArrayList<Integer>();
      while(ob1.hasNextInt())
      {
          int i=ob1.nextInt();
      l1.add(i);
      }
      
      result=m.disp(l1);
      System.out.println("\n(Dynamic input)Multiplication result=:"+result);
    }
        break;
    case 3:
        {
            int n1,n2;
            Scanner ob1=new Scanner(System.in);
            //static input
            n1=10;
            n2=2;
            Division d=new Division();
            int result=d.disp(n1, n2);
            System.out.println("Division of 10,2 is ");
            d.disp(n1, n2);
            //Dynamic input
            System.out.println("DYNAMIC INPUT\n"+"enter two numbers...\n"+"Press ctrl-z after u enter required input\n");
            n1=ob1.nextInt();
            n2=ob.nextInt();
            result=d.disp(n1,n2);
            System.out.println("\n(Dynamic input)Division result=:"+result);
        }   
        break;
    default:System.out.println("Enter a Valid Choice");
    }
    }
}
