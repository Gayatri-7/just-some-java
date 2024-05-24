
import java.util.Scanner;
public class Primeno{
    public static void main (String[] args) {
         int n;
         int count=0;
         System.out.print("enter the number");
         Scanner sc=new Scanner(System.in);
         n= sc.nextInt();
         for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
            
         }
         if(count==2){
             System.out.print("prime no");
         }
         else{
             System.out.print("not prime");
         }
    }
}
