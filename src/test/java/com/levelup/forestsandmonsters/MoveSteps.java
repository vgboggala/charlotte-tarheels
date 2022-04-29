package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.awt.Point;

public class MoveSteps {
    GameController gc;    
    Point position;
    
    @Given("direction and current position")
    public void direction_and_current_position() {
        gc = new GameController();
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    
    @When("player is at {int}, {int} and move direction is {string}")
    public void player_is_at_and_move_direction_is(Integer int1, Integer int2, String string) {
        gc.setCurrentPosition(int1, int2);
        gc.move(GameController.DIRECTION.valueOf(string));
        
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }


    @Then("the Game sets the player's position to {string}")
    public void the_game_sets_the_player_s_position_to(String string) {
        Point position = gc.currentPosition; 
        String output = ((int)position.getX())+","+((int)position.getY());
        assertEquals(string, output);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

    }
}