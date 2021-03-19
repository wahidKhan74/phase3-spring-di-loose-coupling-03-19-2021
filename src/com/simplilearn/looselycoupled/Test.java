package com.simplilearn.looselycoupled;

public class Test {

	public static void main(String[] args) {
		
		
		FoodApplication cutomer1 = new FoodApplication(new BurgerService());
		cutomer1.orderFood("Happy to serve !", "John Smith");
		
		FoodApplication cutomer2 = new FoodApplication(new PizzaService());		
		cutomer2.orderFood("thrilled to serve !", "Marry Smith");
		
		FoodApplication cutomer3 = new FoodApplication(new NoodleService());
		cutomer3.orderFood("delighted to serve !", "Venkata ");
	}

}
