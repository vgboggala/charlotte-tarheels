package com.levelup.forestsandmonsters;

import java.awt.Point;

/**
 * GameController - External API
 * @author - Tarheels Development
 * @Date - 04/28/2022
 */
public class GameController {
    static final String DEFAULT_PLAYER_NAME = "Player";
    public class GameStatus {
        public String playerName = "";
    }

    GameStatus status;

    GameMap gameMap;

    public Point currentPosition;

    public GameController() {
        status = new GameStatus();
        gameMap = new GameMap();
    }

    public void setCurrentPosition(int x, int y) {
        this.currentPosition = new Point(x,y);
    }

    public enum DIRECTION { 
        NORTH, SOUTH, EAST, WEST
    }

    public void createPlayer(String playerName) {
        //TODO - test case need to be written
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


    public void move(DIRECTION directionToMove) {
        Point tempPosition = new Point(currentPosition.x, currentPosition.y);
        switch(directionToMove) {
            case NORTH : tempPosition.y++;
                            break;
            case SOUTH : tempPosition.y--;
                         break;
            case EAST : tempPosition.x++;
                          break;
            case WEST : tempPosition.x--;
                         break;
        }
        if(gameMap.isValidPosition(tempPosition)) {
            setCurrentPosition(tempPosition.x, tempPosition.y);
        }
    }

}
