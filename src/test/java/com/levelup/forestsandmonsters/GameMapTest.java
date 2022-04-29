package com.levelup.forestsandmonsters;

import org.junit.Test;

import io.cucumber.java.Before;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.Point;

public class GameMapTest {

    GameMap gameMap = new GameMap();
    
  //  @Test
    public void success_isValidPositionTest() {
        Point position = new Point(3,5);
        assertTrue(gameMap.isValidPosition(position));
    }

  //  @Test
    public void fail_isValidPositionTest() {
        Point position = new Point(3,11);
        assertFalse(gameMap.isValidPosition(position));
        
    }
}
