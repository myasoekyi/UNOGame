/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author e0015784
 */
public class unoPlayer {
    private String id;
    private String name;
 
    private ArrayList<unoCard> cardHold = new ArrayList<unoCard>();

    public unoPlayer(){
        
    }
    
    public unoPlayer(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    

   
      /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    
    
    
    /**
     * @return the cardHold
     */
    public ArrayList<unoCard> getCardHold() {
        return cardHold;
    }

    /**
     * @param cardHold the cardHold to set
     */
    public void setCardHold(ArrayList<unoCard> cardHold) {
        this.cardHold = cardHold;
    }

    public void setCardToHand(unoCard udC){
        this.cardHold.add(udC);
    }  
   
      
  public void getCardFromHand(int i){
      this.cardHold.remove(i);
  }

    @Override
    public String toString() {
        return "Player:" + "id=" + id + ", name=" + name + ", \n\t\tCards in hand:\n\t\t\t" + cardHold + "\n\t" ;
    }
}
