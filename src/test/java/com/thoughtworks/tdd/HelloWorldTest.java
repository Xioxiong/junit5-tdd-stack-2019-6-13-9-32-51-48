package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    @Test
    public void should_match_1_fizzbuzz_1() {
    	Game game = new Game();
    	String result = game.fizzBuzz(1);
    	Assertions.assertEquals("1",result);
    }
    @Test
    public void should_match_3_fizzbuzz_Fizz() {
    	Game game = new Game();
    	String result = game.fizzBuzz(3);
    	Assertions.assertEquals("Fizz",result);
    }
    
    @Test
    public void should_match_5_fizzbuzz_Buzz() {
    	Game game = new Game();
    	String result = game.fizzBuzz(5);
    	Assertions.assertEquals("Buzz",result);
    }
    @Test
    public void should_match_7_fizzbuzz_Whizz() {
    	Game game = new Game();
    	String result = game.fizzBuzz(7);
    	Assertions.assertEquals("Whizz",result);
    }
    @Test
    public void should_match_15_fizzbuzz_FizzBuzz() {
    	Game game = new Game();
    	String result = game.fizzBuzz(15);
    	Assertions.assertEquals("FizzBuzz",result);
    }
    @Test
    public void should_match_21_fizzbuzz_FizzWhizz() {
    	Game game = new Game();
    	String result = game.fizzBuzz(21);
    	Assertions.assertEquals("FizzWhizz",result);
    }
    @Test
    public void should_match_35_fizzbuzz_BuzzWhizz() {
    	Game game = new Game();
    	String result = game.fizzBuzz(35);
    	Assertions.assertEquals("BuzzWhizz",result);
    }
    @Test
    public void should_match_105_fizzbuzz_FizzBuzzWhizz() {
    	Game game = new Game();
    	String result = game.fizzBuzz(105);
    	Assertions.assertEquals("FizzBuzzWhizz",result);
    }
}
