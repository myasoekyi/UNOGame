/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unoapp;

import java.util.ArrayList;
import model.unoDeck;
import model.unoGame;
import model.unoPlayer;

/**
 *
 * @author e0015784
 */
public class UNOApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        unoDeck uDeck = new unoDeck();
        unoGame uGame;
        
        unoPlayer p1 = new unoPlayer("A001", "January");
        unoPlayer p2 = new unoPlayer("A002", "Febuary");
        unoPlayer p3 = new unoPlayer("A003", "March");
        unoPlayer p4 = new unoPlayer("A004", "Aprial");
        unoPlayer p5 = new unoPlayer("A005", "May");
        
        ArrayList<unoPlayer> playerList = new ArrayList<unoPlayer>();
        playerList.add(p1);
        playerList.add(p2);
        playerList.add(p3);
        playerList.add(p4);
        playerList.add(p5);
        
        String gameID = "g001";
        String gameStatus = "Waiting";
        
        uGame = new unoGame(gameID, playerList, gameStatus, uDeck);
        
        uGame.startPlay();     
        System.out.println(uGame); 
    }
    
}
