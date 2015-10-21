import java.util.Scanner;
public class COMSCI_HW5_Dakota_Davis {
	public static void main(String[] args) {
	        // Outline for addition problem.
	        
			System.out.println("Let's play a game!");
			
			int score = 0;
	        int hardnessOfQuestion = 10;
	        // Round 1
	        //    Generate 2 random numbers
	        int number1 = (int)(Math.random() * hardnessOfQuestion);
	        int number2 = (int)(Math.random() * hardnessOfQuestion);
	        
	        int correctAnswer = number1 + number2;
	        
	        //  Ask the user to add these two numbers together
	        System.out.println
	        ("What is " + number1 + " + " + number2 + "?");
	        
	        //  Read in their response
	        Scanner input = new Scanner(System.in);
	        int studentAnswer = input.nextInt();
	        //  Check if the answer was correct
	        //        IF correct
	        if (studentAnswer == correctAnswer){
	            //            Tell them it was correct
	            
	            //            Give them points
	            score += hardnessOfQuestion;
	            System.out.println("Score:" + score);
	            //            Make the next question harder
	            System.out.println("Answer was correct");
	            hardnessOfQuestion *= 10;
	        }
	        //        IF not correct
	        else{
	            //            Tell them it was wrong
	            System.out.println("Answer was not correct");
	            //             Tell them the correct answer
	            System.out.println("Correct answer was: " + correctAnswer);
	            //            Do not give them points
	            //            Make the next question easier
	            if(hardnessOfQuestion>10){
	                hardnessOfQuestion /=10;
	            }
	            
	        }
	}
}