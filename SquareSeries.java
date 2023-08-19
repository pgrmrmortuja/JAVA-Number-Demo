import java.util.Scanner;

 class SqrSeries
 {
   public static void main(String[] args)
   {
    
     String nam;
     int n;
    
     Scanner input = new Scanner(System.in);
    
     System.out.print("Enter Your Name: ");
     nam = input.nextLine();
     
     System.out.print("Enter Last Number: ");
     n = input.nextInt();
     
     input.close();
     
     int sum = 0;
     
     for(int i = 1; i <= n; i++){
        
        sum = sum + i*i;
        System.out.print(i+"^2   ");
     }
      
      System.out.println("\n\nSum: "+sum);
    
    
    
     System.out.println("\n\nThanks "+nam);
    
   }
 }
