package com.company;

import java.util.Random;

/**
 * @author Bers Torkoy on 7/31/2020
 */

public class Game {
    private int WIN_DOOR_NUM;
    private int CHOSEN_DOOR_NUM;

    public void init(){
        WIN_DOOR_NUM = new Random().nextInt(3);
    }

    public void chooseRoom(int doorNum){
        CHOSEN_DOOR_NUM = doorNum;
    }

    public boolean checkNum () {
        return WIN_DOOR_NUM == CHOSEN_DOOR_NUM;
    }

    public int openEmptyDoor(){
        if(WIN_DOOR_NUM == CHOSEN_DOOR_NUM)
            return (WIN_DOOR_NUM + 1) % 3;
        return 3 - WIN_DOOR_NUM - CHOSEN_DOOR_NUM;
    }
}
