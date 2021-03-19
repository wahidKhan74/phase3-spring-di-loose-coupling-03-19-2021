package com.simplilearn.smi.looselycoupled;

public class FoodAplication {

	private FoodService foodService = null;

	public FoodAplication(FoodService foodService) {
		this.foodService = foodService;
	}

	// order food
	public void orderFood(String message, String customer) {
		// logic
		this.foodService.serverFood(message, customer);
	}

}
