import java.util.Scanner;

class IT24103011Lab7Q1B {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i <= 3; i++) {
            double totalMarks = 0;
            System.out.println("Student " + i);
            System.out.print("Enter 4 subject marks: ");

            for (int j = 0; j < 4; j++) {
                totalMarks += sc.nextInt();
            }

            double average = totalMarks / 4;

            String grade = (average >= 75) ? "Distinction" :
                           (average >= 50) ? "Credit" :
                           "Fail";

            System.out.println("Average is: " + average);
            System.out.println("Overall grade is: " + grade);
            System.out.println();
        }

        sc.close();
    }
}
