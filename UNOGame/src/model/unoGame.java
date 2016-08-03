/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author e0015784
 */
public class unoGame {
    private String gameID;
    private ArrayList<unoPlayer> playerList ;
    private String gameStatus; 
    private unoDeck unodeck;   
    private unoCard disPile;

    public unoGame(String gameID, ArrayList<unoPlayer> playerList, String gameStatus, unoDeck unodeck) {
        this.gameID = gameID;
        this.playerList = playerList;
        this.gameStatus = gameStatus;
        this.unodeck = unodeck;
    }
    
    /**
     * @return the gameID
     */
    public String getGameID() {
        return gameID;
    }

    /**
     * @param gameID the gameID to set
     */
    public void setGameID(String gameID) {
        this.gameID = gameID;
    }

    /**
     * @return the playerList
     */
    public ArrayList<unoPlayer> getPlayerList() {
        return playerList;
    }

    /**
     * @param playerList the playerList to set
     */
    public void setPlayerList(ArrayList<unoPlayer> playerList) {
        this.playerList = playerList;
    }

    /**
     * @return the gameStatus
     */
    public String getGameStatus() {
        return gameStatus;
    }

       /**
     * @return the unoDeck
     */
    public unoDeck getUnoDeck() {
        return unodeck;
    }

    /**
     * @param unoDeck the unoDeck to set
     */
    public void setUnoDeck(unoDeck unoDeck) {
        this.unodeck = unoDeck;
    }
    
    /**
     * @param gameStatus the gameStatus to set
     */
    public void setGameStatus(String gameStatus) {
        this.gameStatus = gameStatus;
    }

   
    
    public void setPlayer(unoPlayer player){
        this.playerList.add(player);
    }
    
    public void getPlayer(){
        
    }

      /**
     * @return the disPile
     */
    public unoCard getDisPile() {
        return disPile;
    }

    /**
     * @param disPile the disPile to set
     */
    public void setDisPile(unoCard disPile) {
        this.disPile = disPile;
    }
     
    
     public unoDeck ShuffleDeck(unoDeck udDeck)
     {
         Collections.shuffle(udDeck.getDeck());
         return udDeck;
     }
 
     public void startPlay(){
         unodeck = this.ShuffleDeck(unodeck.addDeck());
         
         int count = 1; 
         while(count <=7){
             for(unoPlayer player : playerList){
                 unoCard handCard = unodeck.getCardFromDeck();
                 player.setCardToHand(handCard);
             }
             
             count++;
         }
         disPile = unodeck.getCardFromDeck();
     }   
    
    @Override
    public String toString() {
        return "Game ID=" + gameID + "\nDiscard Card=" + disPile + "\nGameStatus=" + gameStatus + "\n" + unodeck + "\n\t" + playerList;
    }

 
}
