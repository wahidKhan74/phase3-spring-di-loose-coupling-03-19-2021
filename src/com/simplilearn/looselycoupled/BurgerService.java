package com.simplilearn.looselycoupled;

public class BurgerService implements FoodService {

	String food = "Burger";
	
	@Override
	public void serveFood(String message, String customer) {
		System.out.println("Hello, '"+customer +"' you  have selected '" + food +"'  we are '"+ message +"'");
	}
	
}
