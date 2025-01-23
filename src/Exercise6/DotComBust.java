package Exercise6;

import Exercise5.GameHelper;

import java.util.ArrayList;

public class DotComBust{
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuess = 0;

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

        System.out.println("Yoput goal to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them allin the fewest number of guesses");

        for (DotCom dotCom : dotComList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotCom.setLocationCells(newLocation);
        }
    }
}
