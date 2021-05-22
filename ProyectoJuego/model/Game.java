package model;

import java.awt.*;
import java.util.ArrayList;

public class Game implements UnoGame {
    private Player jugadores[];
    private ArrayList<UnoCard> getCardsCurrentPlayer;
    private  boolean Encendido;
    private ArrayList<Player> getPlayers;
    private int NumCartas;
    private int CantidadCartas;
    

    public Game(){
        jugadores = new Player [4];
        getCardsCurrentPlayer = new ArrayList<UnoCard>(7);
        Encendido = false;
        getPlayers = new ArrayList<Player>(4);
        CantidadCartas=108;
        NumCartas=13;
        
        

    }

    public String  encender(){
        String res;
        if (Encendido ==  true){
            res ="El juego empezo";
        }else{
            res = "Error en comenzar el juego";
        }
        return res;
    }

    @Override
    public Player whoWin() {

        for(int i =0;i<jugadores.length;i++){
            int actual=jugadores [i];
            if(actual== 0){
               actual=Player;
                          
            }else{
                Player = null;
            }
        }
        return Player;
    }

    @Override
    public ArrayList<UnoCard>getCardsCurrentPlayer() {       
        getCardsCurrentPlayer.add(NumCartas);

      
        return Numcartas;
    }

    @Override
    public ArrayList<Player> getPlayers(String player) {
        getPlayers.add("juagador 1");
        getPlayers.add("juagador 2");
        getPlayers.add("juagador 3");
        getPlayers.add("juagador 4");
        if (encender == true){

        }
        return getPlayers;
    }

    @Override
    public UnoCard getCurrentCard() {
        for(int pos =0;pos<cantidadCartas;pos++){
            return null;
        }
    }

    @Override
    public Player getCurrentTurn() {
        for(int pos=0;pos<Player;pos++){
            pos = unoCard;
            Player=pos;
        }
        return PLayer;
    }

    @Override
    public boolean dropCard(UnoCard card) {
        boolean res;
        if (card == getColor&&card == getValue ){
            res=true;
        }else{
            res = false;
            return res;
        }
    }

    @Override
    public void loadCard() {
        int carta=(int)Math.random()+1;

    }

    @Override
    public boolean nextTurn() {
        if (carta+1){
            res=true;
        }else{
            res=false; 
        }
        return res;
    }


    @Override
    public int sizeDeck() {
        int res;
        res=CantidadCartas-28;

        return res;
    }

    /*
     * 0 -> Izquierda
     * 1 -> Derecha
     */
    @Override
    public int getDirection() {
        int res;
        int izquierdo=0;
        int derecho =1;
        if (izquierdo==0){ 
            res=izquierdo;
        }else{
            res=derecho;

        }
        return res;
    }

    @Override
    public void shuffle() {
       
    }

    public void sinCartas(){
        int sinCartas = 0;

    }

}
