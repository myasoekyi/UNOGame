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
public class unoDeck {
    private final int numOfCard = 108;
    private ArrayList<unoCard> deck = new ArrayList<unoCard>();

    public unoDeck() {
    }
    
     public ArrayList<unoCard> getDeck() {
        return deck;
    }
    
    public void setDeck(ArrayList<unoCard> deck) {
        this.deck = deck;
    }
    
    public void setCardToDeck(unoCard und){
        this.getDeck().add(und);
    }
    
    public unoCard getCardFromDeck(){
        return this.getDeck().remove(0);
    }
    
   public unoDeck addDeck(){
        String color[] = {"Red", "Yellow", "Green", "Blue", "RYGB"};
        String type[] = {"Normal","Skip","Reverse","Draw2","Wild", "WildDrawFour"};
        
        unoCard ucard;
        unoDeck udeck = new unoDeck();
        
        for(int c=0; c< color.length; c++){
            int typeIndex = 0;
            
            for(int num=0; num <=12; num++){
                int value = num;
                
                if(num >9){
                    typeIndex++;
                    value=20;
                }
                
                if(c !=4){
                    ucard = new unoCard(color[c], type[typeIndex], value, color[c]+type[0]+value);
                    udeck.setCardToDeck(ucard);
                    
                    if(num !=0)
                        udeck.setCardToDeck(ucard);
                    
                }
            }
            
            if(c ==4){
                int count = 1;
                while(count <=4){
                    
                    for(int x=4; x < type.length; x++){
                        ucard = new unoCard(color[c], type[x], 50, color[c]+type[x]+50);
                        udeck.setCardToDeck(ucard);
                    }
                    
                    count++;
                }
            }
        }
        
        return udeck;
    }  

   
    @Override
    public String toString() {
        return "UnoCard on Deck: " + getDeck().size()+"\n"+deck;
    }

  
}
