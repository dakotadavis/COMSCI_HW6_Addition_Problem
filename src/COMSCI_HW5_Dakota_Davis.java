import java.util.Scanner;
public class COMSCI_HW5_Dakota_Davis {
	public static void main(String[] args) {
	        // Outline for addition problem.
	        
			System.out.println("Let's play a game!");
			System.out.println("With every correct answer, the next question will be harder.");
			System.out.println("With every incorrect answer, the next question will be easier.");
			System.out.println("There will be four rounds. Highest possible score is 11110.");
			System.out.println("Good luck!");
			int score = 0;
	        int hardnessOfQuestion = 10;
	        // Round 1
	        
	        // Generate 2 random numbers
	        int number1 = (int)(Math.random() * hardnessOfQuestion);
	        int number2 = (int)(Math.random() * hardnessOfQuestion);
	        
	        //define the correct answer
	        int correctAnswer = number1 + number2;
	        
	        //Prompt the user to add the two numbers together
	        System.out.println
	        ("What is " + number1 + " + " + number2 + "?");
	        
	        //Read in their response
	        Scanner input = new Scanner(System.in);
	        int studentAnswer = input.nextInt();
	        
	        //Check if the answer was correct
	        //       IF correct
	        if (studentAnswer == correctAnswer){
	        	
	            //            Tell them it was correct
	        	System.out.println("Answer was correct");
	        	
	            //            Give them points
	            score += hardnessOfQuestion;
	            
	            //			  Display the points
	            System.out.println("Score:" + score);
	            
	            //            Make the next question harder
	            
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
	                hardnessOfQuestion /=10;}}
	                
	       //Round 2
	                
	                //Repeat the process, without ints
	        
	        number1 = (int)(Math.random() * hardnessOfQuestion);
	        number2 = (int)(Math.random() * hardnessOfQuestion);
	        
	        correctAnswer = number1 + number2;
	        
	        System.out.println
	        ("What is " + number1 + " + " + number2 + "?");
	        
	        studentAnswer = input.nextInt();
	        
	        if (studentAnswer == correctAnswer){
	        	
	        	System.out.println("Answer was correct");
	        	
	            score += hardnessOfQuestion;
	            
	            System.out.println("Score:" + score);
	            
	            hardnessOfQuestion *= 10;
	        }
	        
	        else{
	        	
	            System.out.println("Answer was not correct");
	            
	            System.out.println("Correct answer was: " + correctAnswer);
	            
	            if(hardnessOfQuestion>10){
	                hardnessOfQuestion /=10;}}
	                
	        //Round 3
	                number1 = (int)(Math.random() * hardnessOfQuestion);
	    	        number2 = (int)(Math.random() * hardnessOfQuestion);
	    	        
	    	        correctAnswer = number1 + number2;
	    	        
	    	        System.out.println
	    	        ("What is " + number1 + " + " + number2 + "?");
	    	        
	    	        studentAnswer = input.nextInt();
	    	        
	    	        if (studentAnswer == correctAnswer){
	    	        	
	    	        	System.out.println("Answer was correct");
	    	        	
	    	            score += hardnessOfQuestion;
	    	            
	    	            System.out.println("Score:" + score);
	    	            
	    	            hardnessOfQuestion *= 10;
	    	        }
	    	        
	    	        else{
	    	        	
	    	            System.out.println("Answer was not correct");
	    	            
	    	            System.out.println("Correct answer was: " + correctAnswer);
	    	            
	    	            if(hardnessOfQuestion>10){
	    	                hardnessOfQuestion /=10;}}
	    	  //Round 4
	    	        number1 = (int)(Math.random() * hardnessOfQuestion);
	    	        number2 = (int)(Math.random() * hardnessOfQuestion);
	    	        
	    	        correctAnswer = number1 + number2;
	    	        
	    	        System.out.println
	    	        ("What is " + number1 + " + " + number2 + "?");
	    	        
	    	        studentAnswer = input.nextInt();
	    	        
	    	        if (studentAnswer == correctAnswer){
	    	        	
	    	        	System.out.println("Answer was correct");
	    	        	
	    	            score += hardnessOfQuestion;
	    	            
	    	            System.out.println("Score:" + score);
	    	            
	    	            hardnessOfQuestion *= 10;
	    	        }
	    	        
	    	        else{
	    	        	
	    	            System.out.println("Answer was not correct");
	    	            
	    	            System.out.println("Correct answer was: " + correctAnswer);
	    	            
	    	            if(hardnessOfQuestion>10){
	    	                hardnessOfQuestion /=10;}}
	    	                
	    	    	    if(score == 11110)     {
	    	    	    	System.out.println("Good job, you got the high score!");}
	    	    	    else{
	    	    	    	System.out.println("Nice try, but you could have done better.");
	    	    	    }

	    	            }}
	    	            