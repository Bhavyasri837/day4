import java.util.*;
public class demoswitch
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int age=sc.nextInt();
       int flag=0;
       if(age>=18)
       flag=1;
       switch(flag)
       {
        case 1:
        System.out.println("eligible");
        break;
        case 0:
        System.out.println("not eligible");
        break;
       }
    }
}