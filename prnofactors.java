// to print that factor
import java.util.Scanner;
public class Primenofac{
    public static void main (String[] args) {
         int n;
         int count=0;
         System.out.print("enter the number");
         Scanner sc=new Scanner(System.in);
         n= sc.nextInt();
         for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
             System.out.println(i); //just add this one sentence
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