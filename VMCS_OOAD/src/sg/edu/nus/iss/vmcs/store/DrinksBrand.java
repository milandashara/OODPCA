/*
 * Copyright 2003 ISS.
 * The contents contained in this document may not be reproduced in any
 * form or by any means, without the written permission of ISS, other
 * than for the purpose for which it has been supplied.
 *
 */
package sg.edu.nus.iss.vmcs.store;

/**
 * This entity object stores the name of the drink brand and its price&#46;
 * There can be as many drink brands as desire, for a particular
 * configuration&#46;
 * 
 * @see CashStore
 * @see CashStoreItem
 * @see Coin
 * @see DrinksStore
 * @see DrinksStoreItem
 * @see Store
 * @see StoreController
 * @see StoreItem
 * @see StoreObject
 * 
 * @version 3.0 5/07/2003
 * @author Olivo Miotto, Pang Ping Li
 */
public class DrinksBrand extends StoreObject {
	private int price;
	private static PriceStrategy strategy;

	/**
	 * This constructor creates an instance of DrinksBrand object.
	 */
	public DrinksBrand() {
	}

	
	/**
	 * This method creates an instance of PricingStrategyFactory object 
	 * and used to create the strategy based on the properties value.
	 */
	public PriceStrategy setStartegy(String strategy) {
		PricingStrategyFactory PricingStrategy = new PricingStrategyFactory();
		chooseStrategy(PricingStrategy.create(strategy));
		return getStrategy();
	}

	/**
	 * This Constructor creates an instance of the DrinksBrand object&#46;
	 * 
	 * @param name
	 *            the name of the drinks brand&#46;
	 * @param price
	 *            the price of the drinks brand&#46;
	 */
	public DrinksBrand(String name, int price) {
		this.price = price;
		this.name = name;
	}

	/**
	 * This method sets the price of the DrinksBrand.
	 * 
	 * @param p
	 *            the price of the drinks brand.
	 */
	public void setPrice(int p) {
		price = p;
	}

	/**
	 * This method returns the price of the DrinksBrand.
	 * 
	 * @return the price of the drinks brand.
	 */
	public int getPrice() {
		return (price);
	}
	
	/**
	 * This method returns the price of the DrinksBrand based on the strategy. 
	 * 
	 * @return the price of the drinks brand.
	 */

	public int getSellingPrice() {

		if (getStrategy() == null) {
			return this.price;
		} else {
			return getStrategy().getPrice(this.price, this.name);
		}

	}
	
	/**
	 * This method returns the strategy. 
	 * 
	 * @return the type of strategy.
	 */

	public static PriceStrategy getStrategy() {
		return strategy;
	}
	
	/**
	 * This method set the value of strategy. 
	 * 	
	 */

	public static void chooseStrategy(PriceStrategy strategy) {
		DrinksBrand.strategy = strategy;
	}
}// End of class DrinksBrand