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
        public Point position = new Point(1,1);
    }

    GameStatus status;
    GameCharacter character;
       

    public GameController() {
        status = new GameStatus();
       
    }

    public Point getStartPosition() {
        return status.position;
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
        character = new GameCharacter();
        character.setPosition(status.position);
    }

    public GameStatus getStatus() {
        return this.status;
    }


    public void move(DIRECTION directionToMove) {
       character.move(directionToMove);
       status.position = character.currentPosition;
       
    }

}
