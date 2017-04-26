/**
 * 
 */
package com.mycompany.ass3.chapter8;

/**
 * @author Sabrina
 *
 */
public class Child extends Parent implements Ask4Money, SpendMoney{

	private String favoriteFood;

	public Child() {
		// NOTE java will automatically add below line here for us
//		super();
	}
	
	public Child(float _debt, String _name, String _lastName, float _wealth, String _favoriteFood) {
		super(_debt, _name, _lastName, _wealth);
		favoriteFood = _favoriteFood;
//		super.wealth += 100;
	}
	
	// Copy constructor
	public Child(Child c) {
		this(c.getDebt(), c.getName(), c.getLastName(), c.wealth, c.favoriteFood);
	}

	
	@Override
	public float investInMe(float _amount2ask) {
		return 0;
	}

	@Override
	public boolean spendMoney(float _money2spend) {
		boolean retVal = false;
		if (_money2spend <= wealth) {
			wealth -= _money2spend;
			retVal = true;
		}
		return retVal;
	}

}
