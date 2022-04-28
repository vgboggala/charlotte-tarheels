package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.awt.Point;

import javax.swing.text.Position;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

import org.junit.Test;

public class GameControllerTest {
    @Test
    public void InitializationCreatesResults(){
        GameController testObj = new GameController();
        assertNotNull(testObj.status);
    }

    @Test
    public void givenCurrentPositionIs4and3_whenPlayerMovesNorth_NewPositionIs4and4(){
        GameControllerSpy controller = new GameControllerSpy();
        controller.setCurrentPosition(4, 3);

        controller.move(DIRECTION.NORTH);

        assertEquals(4, controller.getCurrentPosition().y);
        assertNotNull(controller.status);
    }

    @Test
    public void givenCurrentPositionIs4and4_whenPlayerMovesSouth_NewPositionIs4and3(){
        GameControllerSpy controller = new GameControllerSpy();
        controller.setCurrentPosition(4, 4);
        
        controller.move(DIRECTION.SOUTH);

        assertEquals(3,controller.getCurrentPosition().y);
        assertNotNull(controller.status);
    }

    @Test
    public void givenCurrentPositionIs4and3_whenPlayerMovesWest_NewPositionIs3and3(){
        GameControllerSpy controller = new GameControllerSpy();
        controller.setCurrentPosition(4, 3);
        
        controller.move(DIRECTION.WEST);

        assertEquals(3,controller.getCurrentPosition().x);
        //assertNotNull(controller.status);
    }
}
