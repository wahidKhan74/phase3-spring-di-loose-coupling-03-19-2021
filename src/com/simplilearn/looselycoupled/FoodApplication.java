package com.simplilearn.looselycoupled;

public class FoodApplication {
	
	private FoodService foodService ;
	
	// dependency injection
	FoodApplication(FoodService foodService){
		this.foodService = foodService;
	}
	
	// order food
	public void orderFood(String message, String customer) {
		this.foodService.serveFood(message, customer);
	}

}
