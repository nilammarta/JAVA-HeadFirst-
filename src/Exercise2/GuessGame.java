package Exercise2;

public class GuessGame {
    // menambahkan attribut
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
        // membuat object player
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        // mendeklarasikan variable yang dijawab oleh player nantinya
        int guessP1 = 0;
        int guessP2 = 0;
        int guessP3 = 0;

        // mendeklarasikan variable untuk memegang apakah
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true){
            System.out.println("Number to guess is: " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessP1 = p1.number;
            System.out.println("Player one guessed " + guessP1);

            guessP2 = p2.number;
            System.out.println("Player two guessed " + guessP2);

            guessP3 = p3.number;
            System.out.println("Player three guessed " + guessP3);

            if(guessP1 == targetNumber){
                p1isRight = true;
            }
            if(guessP2 == targetNumber){
                p2isRight = true;
            }
            if(guessP3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight){
                System.out.println("We have a winner!");
                System.out.println("Player one is got it right? " + p1isRight);
                System.out.println("Player two is got it right? " + p2isRight);
                System.out.println("Player three is got it right? " + p3isRight);
                System.out.println("Game is over");
                break;
            }else{
                System.out.println("Players will have to try again");
            }
        }
    }
}
