import java.util.Scanner;

 class IT24103011Lab7Q3 {
    
  public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);//creating a Scanner object
        
        int amount,i;
        
        for (i=1;i<=5;i++)
        {
            System.out.println("Customer "+i);
            System.out.print("Enter total bill amount : ");
            amount = sc.nextInt();
            System.out.print("Enter mode of payment (C for cash,O for other ): ");
            char ModeOfPayment = sc.next().charAt(0);
            
            if ( ModeOfPayment == 'C' || ModeOfPayment == 'c')
            {
                double discount = amount*0.05;
                double paid = amount - discount;
                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid :"+ paid);
            }
            else if ( ModeOfPayment == 'O' || ModeOfPayment == 'o' )
            {
                
                double paid = (double) amount;
                System.out.println("No discount applicable ");
                System.out.println("Amount to be paid :"+ paid);
            }
            else
            {
                System.out.println("Payment Mode is Not Valid");
		
            }
            
		System.out.println();
           
            
        }
        
        
    }
}