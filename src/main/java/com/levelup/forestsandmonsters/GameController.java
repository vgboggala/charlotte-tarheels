package com.levelup.forestsandmonsters;

import java.awt.Point;

public class GameController {
    static final String DEFAULT_PLAYER_NAME = "Player";
    public class GameStatus {
        //TODO: Add status data
        public String playerName = "";
        public Point position = new Point(0, 0);
    }

    GameStatus status;

    public Point currentPosition;

    public GameController() {
        status = new GameStatus();
    }

    public void setCurrentPosition(int x, int y) {
        this.currentPosition = new Point(x,y);
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
        if (directionToMove == DIRECTION.NORTH)
            currentPosition.y  = currentPosition.y + 1 ;     
        if (directionToMove == DIRECTION.SOUTH)
            currentPosition.y = currentPosition.y - 1 ;
        if (directionToMove == DIRECTION.WEST)
            currentPosition.x = currentPosition.x - 1 ;
        return currentPosition;
    }

}
