package com.thoughtworks.tdd;

public class Game {
	private static final  String FIZZ = "Fizz";
	private static final  String BUZZ = "Buzz";
	private static final  String WHIZZ = "Whizz";
	public String fizzBuzz(int i) {
		if(i<1 || i > 120) {
			return "valid";
		}
		String result = "";
		if(i % 3 == 0) {
			 result += FIZZ;
		}
		if(i % 5 == 0) {
			 result += BUZZ;
		}
		if(i % 7 == 0) {
			 result += WHIZZ;
		}
		if(result.equals("")) {
			return String.valueOf(i);
		}
		
		return result;
	}
}
