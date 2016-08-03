/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author e0015784
 */
public class unoCard {
    private String cardColor; 
    private String cardType;
    private int cardScore;
    private String cardImage;

    @Override
    public String toString() {
        return "UNOcard:" + "cardColor=" + cardColor + ", cardType=" + cardType + ", cardScore=" + cardScore + ", cardImage=" + cardImage + "\n\t\t\t";
    }

    public String getCardColor() {
        return cardColor;
    }

    public void setCardColor(String cardColor) {
        this.cardColor = cardColor;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public int getCardScore() {
        return cardScore;
    }

    public void setCardScore(int cardScore) {
        this.cardScore = cardScore;
    }

    public String getCardImage() {
        return cardImage;
    }

    public void setCardImage(String cardImage) {
        this.cardImage = cardImage;
    }

    public unoCard(String cardColor, String cardType, int cardScore, String cardImage) {
        this.cardColor = cardColor;
        this.cardType = cardType;
        this.cardScore = cardScore;
        this.cardImage = cardImage;
    }
}
