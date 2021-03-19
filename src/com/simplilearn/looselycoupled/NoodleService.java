package com.simplilearn.looselycoupled;

public class NoodleService implements FoodService {

	String food = "Noodle";
	
	@Override
	public void serveFood(String message, String customer) {
		System.out.println("Hello, '"+customer +"' you  have selected '" + food +"'  we are '"+ message +"'");
	}
	
}
