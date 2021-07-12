package com.ds;

import java.lang.reflect.Array;
            //class created
public class DeckCards {

	 public static void createDeck(String[][] deck,String[] suit, String[] rank){
        for(int i=0;i<4;i++){
            for (int j=0;j<13;j++){
                deck[i][j] = suit[i] +" "+ rank[j];

            }
        }

    }

}
