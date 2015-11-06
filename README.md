# Homework 6: Addition Problem

## Introduction 
In this problem, I will set up a four round addition problem. I will also use Git for source code management.

## Code

```Java
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
```

## Console Output

Let's play a game!
With every correct answer, the next question will be harder.
With every incorrect answer, the next question will be easier.
There will be four rounds. Highest possible score is 11110.
Good luck!
What is 3 + 8?
11
Answer was correct
Score:10
What is 84 + 85?
169
Answer was correct
Score:110
What is 151 + 254?
405
Answer was correct
Score:1110
What is 8094 + 7291?
15385
Answer was correct
Score:11110
Good job, you got the high score!

## Git Commands

C:\Users\Dakota\workspace\COMSCI_HW5_Dakota_Davis>git push -u origin master
Username for 'https://github.com': dakotadavis
Password for 'https://dakotadavis@github.com':
Counting objects: 9, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (8/8), done.
Writing objects: 100% (9/9), 3.31 KiB | 0 bytes/s, done.
Total 9 (delta 0), reused 0 (delta 0)
To https://github.com/dakotadavis/COMSCI_HW6_Addition_Problem.git
 * [new branch]      master -> master
Branch master set up to track remote branch master from origin.
C:\Users\Dakota\workspace\COMSCI_HW5_Dakota_Davis>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': dakotadavis
Password for 'https://dakotadavis@github.com':
Everything up-to-date

C:\Users\Dakota\workspace\COMSCI_HW5_Dakota_Davis>git checkout -b dev
Switched to a new branch 'dev'

C:\Users\Dakota\workspace\COMSCI_HW5_Dakota_Davis>git add .

C:\Users\Dakota\workspace\COMSCI_HW5_Dakota_Davis>git commit -m "First round wor
king"
[dev aa4a017] First round working
 2 files changed, 50 insertions(+), 177 deletions(-)
 rewrite bin/COMSCI_HW5_Dakota_Davis.class (93%)
 rewrite src/COMSCI_HW5_Dakota_Davis.java (98%)

C:\Users\Dakota\workspace\COMSCI_HW5_Dakota_Davis>git push --set-upstream origin
 dev
Username for 'https://github.com': dakotadavis
Password for 'https://dakotadavis@github.com':
Counting objects: 6, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 1.66 KiB | 0 bytes/s, done.
Total 6 (delta 2), reused 0 (delta 0)
To https://github.com/dakotadavis/COMSCI_HW6_Addition_Problem.git
 * [new branch]      dev -> dev
Branch dev set up to track remote branch dev from origin.

C:\Users\Dakota\workspace\COMSCI_HW5_Dakota_Davis>git add .

C:\Users\Dakota\workspace\COMSCI_HW5_Dakota_Davis>git commit -m "cleaned up the
first round"
[dev 7c4cb13] cleaned up the first round
 2 files changed, 24 insertions(+), 7 deletions(-)

C:\Users\Dakota\workspace\COMSCI_HW5_Dakota_Davis>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': dakotadavis
Password for 'https://dakotadavis@github.com':
Counting objects: 6, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 880 bytes | 0 bytes/s, done.
Total 6 (delta 3), reused 0 (delta 0)
To https://github.com/dakotadavis/COMSCI_HW6_Addition_Problem.git
   aa4a017..7c4cb13  dev -> dev

C:\Users\Dakota\workspace\COMSCI_HW5_Dakota_Davis>git add .

C:\Users\Dakota\workspace\COMSCI_HW5_Dakota_Davis>git commit -m "Finished all fo
ur rounds, ready for merge."
[dev ae3120a] Finished all four rounds, ready for merge.
 2 files changed, 103 insertions(+), 6 deletions(-)
 rewrite bin/COMSCI_HW5_Dakota_Davis.class (75%)

C:\Users\Dakota\workspace\COMSCI_HW5_Dakota_Davis>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': dakotadavis
Password for 'https://dakotadavis@github.com':
Counting objects: 6, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 2.71 KiB | 0 bytes/s, done.
Total 6 (delta 1), reused 0 (delta 0)
To https://github.com/dakotadavis/COMSCI_HW6_Addition_Problem.git
   7c4cb13..ae3120a  dev -> dev

C:\Users\Dakota\workspace\COMSCI_HW5_Dakota_Davis>git checkout master
Switched to branch 'master'
Your branch is up-to-date with 'origin/master'.

C:\Users\Dakota\workspace\COMSCI_HW5_Dakota_Davis>git merge dev
Updating a7cf663..ae3120a
Fast-forward
 bin/COMSCI_HW5_Dakota_Davis.class | Bin 2748 -> 2626 bytes
 src/COMSCI_HW5_Dakota_Davis.java  | 333 ++++++++++++++++++--------------------
 2 files changed, 160 insertions(+), 173 deletions(-)

C:\Users\Dakota\workspace\COMSCI_HW5_Dakota_Davis>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': dakotadavis
Password for 'https://dakotadavis@github.com':
Total 0 (delta 0), reused 0 (delta 0)
To https://github.com/dakotadavis/COMSCI_HW6_Addition_Problem.git
   a7cf663..ae3120a  master -> master

C:\Users\Dakota\workspace\COMSCI_HW5_Dakota_Davis>git status
On branch master
Your branch is up-to-date with 'origin/master'.
nothing to commit, working directory clean

## Conclusion

In this problem I have learned to more efficiently use Git as source code management, and how I can use it for debugging, as I did several times. By using Git, I learned that the reason my code was not advancing was a simple missing “}” symbol at the end of each if statement. It took me some time, but I believe I have better learned to use Git because of it. As for the java code itself, the process of creating repeating variables also gave me trouble, but I eventually figured them out. Again I feel all the better as a programmer because of my struggles with this code.
