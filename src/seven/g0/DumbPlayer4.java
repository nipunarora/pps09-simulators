package seven.g0;

import java.util.ArrayList;
import java.util.Random;
import seven.ui.Letter;
import seven.ui.Player;
import seven.ui.PlayerBids;
import seven.ui.SecretState;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Satyajeet
 */
public class DumbPlayer4 implements Player{

    public void Register() {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public int Bid(Letter bidLetter, ArrayList<PlayerBids> PlayerBidList, int total_rounds,ArrayList<String> PlayerList, SecretState secretstate,int playerID) {
        //throw new UnsupportedOperationException("Not supported yet.");
//        Random rand = new Random();
//        int val = rand.nextInt(10);
//        return val;
        return 10;
    }

    public String returnWord() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return "p4";
    }



}
