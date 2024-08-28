import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a Number");
        int a =s.nextInt();
        System.out.print("Entered Number is ");
        if(a>0){
            System.out.println("Positive");
        }
        else if(a<0){
            System.out.println("Negative");
        }
        else
        System.out.println("Zero");
        System.out.print("Day of the week is ");
        int ans =0;
        if(a>6){
            ans=a%7;
        }
        switch (ans){
            case 0:{
                System.out.println("Sunday");
                break;
          }
           case 1:{
                System.out.println("Monday");
                 break;
          }
           case 2:{
                System.out.println("Tuesday");
                 break;
          }
           case 3:{
                System.out.println("Wednesday");
                 break;
          }
           case 4:{
                System.out.println("Thursday");
                 break;
          }
           case 5:{
                System.out.println("Friday");
                 break;
          }
           case 6:{
                System.out.println("Saturday");
                 break;
          }
        }
        System.out.print("The numbers from 1 to input is :");
          for(int i=1;i<=a;i++){
              System.out.print(i);
          }
          System.out.println();
          System.out.print("The numbers from from input to 1 is ");
          while(a>0){
              System.out.print(a);
              a--;
          }
          System.out.println();
          a++;
          System.out.print("The numbers from 1 to 3 ");
          do{
              System.out.print(a);
              a++;
          }while(a<=3);

        
        }
}