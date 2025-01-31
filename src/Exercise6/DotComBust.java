package Exercise6;

import java.util.ArrayList;

public class DotComBust{
    private GameHelper2 helper = new GameHelper2();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    // Create setUpGame method (hal 146 atau 180)
    private void setUpGame(){
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");

        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        System.out.println("You goal to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them allin the fewest number of guesses");

        for (DotCom dotComToSet : dotComList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    // Create startPlaying method
    private void startPlying(){
        while(!dotComList.isEmpty()){
            String userGuess = helper.getUserInput("Enter your guess: ");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    // Create the checkUserGuess method
    private void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result = "miss";

        for (DotCom dotComToTest : dotComList){
            result = dotComToTest.checkYourself(userGuess);

            if(result.equals("hit")){
                break;
            }

            if(result.equals("kill")){
                dotComList.remove(dotComToTest);
                break;
            }
        }

        System.out.println(result);
    }

    // Create finishGame method
    private void finishGame(){
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");

        if(numOfGuesses <= 18){
            System.out.println("It only took you " + numOfGuesses + " guesses!");
            System.out.println("You got out before your options sank.");
        }else{
            System.out.println("Took you long enough. " + numOfGuesses + " guesses!");
            System.out.println("Fish are dancing with your options");
        }
    }

    // Create the main method to run the programs
    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlying();
    }


}
