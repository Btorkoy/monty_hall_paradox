package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int counter1 = 0;
        int counter2 = 0;
        Game game = new Game();
        for(int i = 0; i < 1000000; i++){
            game.init();
            int room = new Random().nextInt(3);
            game.chooseRoom(room);
            int emptyRoom = game.openEmptyDoor();
            int lastRoom = 3 - room - emptyRoom;

            if(game.checkNum()) counter1 ++;

            game.chooseRoom(lastRoom);
            if(game.checkNum()) counter2 ++;
        }
        System.out.println("Номер комнаты не был изменен. Кол-во попаданий: " + counter1);
        System.out.println("Номер комнаты был изменен. Кол-во попаданий: " + counter2);
    }
}
