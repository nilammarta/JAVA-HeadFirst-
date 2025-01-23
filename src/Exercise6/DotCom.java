package Exercise6;

import java.util.ArrayList;

// Improve the SimpleDotCom class (using ArrayList)
public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public void setLocationCells(ArrayList<String> locs){
        locationCells = locs;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";

        int index = locationCells.indexOf(stringGuess);

        if (index >= 0){
            locationCells.remove(index);

            if (locationCells.isEmpty()){
                result = "kill";
            } else {
                result = "hit";
            }
        }

        System.out.println(result);
        return result;
    }
}
