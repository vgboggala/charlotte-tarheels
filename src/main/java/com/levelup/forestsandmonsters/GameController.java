package com.levelup.forestsandmonsters;

import java.awt.Point;

public class GameController {
    static final String DEFAULT_PLAYER_NAME = "Player";
    public class GameStatus {
        //TODO: Add status data
        public String playerName = "";
    }

    GameStatus status;

    public GameController() {
        status = new GameStatus();
    }

    public enum DIRECTION { 
        NORTH, SOUTH, EAST, WEST
    }

    public void createPlayer(String playerName) {
        if(playerName != null && !playerName.equals("")){
            status.playerName = playerName;
        }
        else {
            status.playerName = DEFAULT_PLAYER_NAME;
        }
    }

    public GameStatus getStatus() {
        return this.status;
    }

    public Point move(DIRECTION directionToMove) {
        //TODO: Implement move
        return null;
    }

}
