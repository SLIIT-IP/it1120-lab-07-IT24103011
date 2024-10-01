import java.util.Scanner;

class IT24103011Lab7Q1A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks [];
        marks = new int[4];
        
        for(int i=0;i<marks.length;i++){
        System.out.print("Enter Subject Mark "+ (i+1)+": ");
        marks[i]=sc.nextInt();
        }
        
         int sum = 0;
        for (int mark : marks) {
            sum += mark; 
        }
        double avg=(double)sum/marks.length;
        System.out.println("\nThe average  is: " + avg);
        
        
       String grade = (avg >= 75) ? "Distinction" :
                       (avg >= 50) ? "Credit" :
                       (avg >= 0)  ? "Fail" : "";
        
        System.out.println("Overall Grade is: " + grade);
    }
}