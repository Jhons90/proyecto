package model;

import java.awt.*;

public class Card implements UnoCard{

    @Override
    public String getValue() {
        String res;
        int reversa=10;
        int cambiaColor=12;
        int masDos=13;
        for (int pos=0;pos < 13;pos++){
            int actual=pos;
            if (actual==0){
                res="0"; 
            }else{
                if (actual==1){
                    res="1";
                }else{
                    if(actual==2){
                        res="2";
                    }else{
                        if(actual==3){
                            res="3";
                        }else{
                            if(actual==4){
                                res="4";
                            }else{
                                if(actual==5){
                                    res="5";
                                }else{
                                    if(actual==6){
                                        res="6";
                                    }else{
                                        if(actual==7){
                                            res="7";
                                        }else{
                                            if(actual==8){
                                                res="8";
                                            }else{
                                                if(actual==9){
                                                    res="9";
                                                }else{
                                                    if(actual==10){
                                                        res="R";                                         
                                                    }else{
                                                        if( actual==11){
                                                            res="c";
                                                        }else{

                                                            res="+2";

                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                        }
                    }

                }
            }
        }
         return res;
    }

    @Override
    public Color getColor() {
        Color res;
        Color rojo=Color.RED;
        Color verde=Color.GREEN;
        Color azul=Color.BLUE;
        Color Amarillo=Color.YELLOW;
        res= Color;
        return res;
    }

}
