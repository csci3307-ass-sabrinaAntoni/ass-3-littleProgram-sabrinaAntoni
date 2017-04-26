/**
 * 
 */
package com.mycompany.ass3.chapter8;

/**
 * @author Sabrina
 *
 */
public class Exp8_HelloConstructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HasName namedChild = new Child();
		SpendMoney moneySpendingChild = new Child();
		Ask4Money moneyAskingChild = new Child();
		
		Child child1 = new Child(0, "John Jr", "Smith", 1000000, "pizza");
		Child child2a = new Child(0, child1.getName(), child1.getLastName(), 1000000, "pizza");
		//NOTE using copy constructor below is better than above line
		
		Child child2b = new Child(child1);

	}

}
