import java.util.Scanner;
public class PrimeNoOpt{
    public static void main (String[] args) {
        int n;
        int c=0;
        System.out.print("enter the number");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        sc.close();// resource saving
        
        if(n<=1){
            System.out.print("not prime");// edge case
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                c++;
                break;//no more search
            }
            
        }
        if(c==0)
         System.out.print("prime");
        else
         System.out.print("not prime");
    }
}















// optimization

// sc.close() resource management
// handling edge cases 
// changing the condition
// adding the break statement 



//import java.util.*;
// public class Main
// {
//   public static void main (String[]args)
//   {
// 	int n;
// 	int c = 0;
// 	  System.out.print ("ENTER THE NO: ");
// 	Scanner sc = new Scanner (System.in);
// 	  n = sc.nextInt ();
// 	  sc.close ();====>//Close the Scanner object to avoid resource leaks.

// 	if (n <= 1)===>handling edge cases 
// 	  {
// 		System.out.print ("not prime");
// 		return;
// 	  }
// 	for (int i = 2; i * i <= n; i++)==>
// 	  {
// // " i*i < n " Because if we find a factor greater than the square root, 
// //it must correspond to a factor smaller than the square root.
// 		if (n % i == 0)
// 		  {
// 			c++;
// 			break;===>early exit				//no need if factor is found 
// 		  }
// 	  }
// 	if (c == 0)
// 	  {
// 		System.out.print ("prime");
// 	  }
// 	else
// 	  {
// 		System.out.print ("not prime");
// 	  }

//   }
// }
