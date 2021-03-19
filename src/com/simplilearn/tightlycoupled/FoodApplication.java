package com.simplilearn.tightlycoupled;

public class FoodApplication {
	
	// This leads to hard-coded dependency
	private static BurgerService foodService = new BurgerService();
	
	// order food
	public static void orderFood(String message,String customer) {
		// logic 
		foodService.serverFood(message, customer);
	}
	
	public static void main(String[] args) {
		
		orderFood("We serve only Bugger. ","John Smith");
	}
}
