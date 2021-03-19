package com.simplilearn.smi.looselycoupled;


public class Test {

	public static void main(String[] args) {
		
		FoodAplication app = new FoodAplication(new FoodService());
		app.orderFood("We serve burger !", "John Smith");
	}

}
