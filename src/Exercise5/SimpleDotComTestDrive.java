package Exercise5;

public class SimpleDotComTestDrive {
//    public static void main(String[] args) {
//        // head first halaman 103
//        SimpleDotCom dot = new SimpleDotCom();
//
//        int[] locations = {2, 3,4};
//        dot.setLocationCells(locations);
//
//        String userGuess = "2";
//        String result = dot.checkYourself(userGuess);
//
//        String testResult = "failed";
//        if (result.equals("hit")){
//            testResult = "passsed";
//        }
//
//        System.out.println(testResult);
//    }

    public static void main(String[] args) {
        int numOfGuess = 0;
        GameHelper helper  = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);

        int [] locations = {randomNum, randomNum+1, randomNum+2};
        theDotCom.setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive == true) {
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuess++;

            if (result.equals("kill")){
                isAlive = false;
                System.out.println("You took " + numOfGuess + " guesses");
            }
        }
    }
}
