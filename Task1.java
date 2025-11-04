import java.util.Scanner;
public class Task1 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double sc1,sc2,sc3,average;
       System.out.println("First Student");
       sc1 = input.nextDouble();
       System.out.println("Second Student");
       sc2 = input.nextDouble();
       System.out.println("Third Student");
       sc3 = input.nextDouble();
       average = (sc1+sc2+sc3)/3;
       System.out.println("Average"+average);

   } 
}
