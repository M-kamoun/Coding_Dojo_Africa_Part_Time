import java.util.Random;
public class NumbersGame {

    public void playGame(){
        int answer = new Random().nextInt(0,10);
        int round = 0;
        System.out.println("You have only 3 Rounds!");
        System.out.println("Enter a number : (1-10) or (q) to quit the game!).");
        System.out.printf("Round %d : ",round+1);
        
        
        while(round!=3){
            String guess = System.console().readLine();
            if(guess.equalsIgnoreCase("q")){
                        System.out.println("I knew you didn't have it in you.");
                        System.out.println("Shutting down...");
                        break;
                    }
        
            try {
                if(Integer.parseInt(guess)<0 || Integer.parseInt(guess)>10){
                    System.out.println("Please enter a valid number between 0 and 10.");
                    }else if(Integer.parseInt(guess)==answer){
                        System.out.println("Lucky guess! But can you do it again?");
                        break;
                    }else{
                
                        System.out.println("Swing and a miss! Keep trying...");
                    }
            } catch (NumberFormatException e) {
                System.out.printf(" %s it's  a Letter!\n please enter a valid number between 0 and 10 (or q to quit).\n",guess);
            }
            round++;

        }
           
        if(round==3)
        System.out.println("You ran out of rounds. Better luck next time!");
           
        if(playAgain()){
            playGame();
           
           }else {
            System.out.println("Goodbye, See you Next time...");
 
           }
        }


        public boolean playAgain(){
            System.out.println("Do you want to play again? (y/n)");
            String answer = System.console().readLine();
            return answer.equalsIgnoreCase("y");
        }



    }



