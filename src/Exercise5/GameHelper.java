package Exercise5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GameHelper {
    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");

        try{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));

            inputLine = is.readLine();

            if(inputLine.length() == 0) {
                return null;
            }
        } catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
        }

        return inputLine;
    }
}
