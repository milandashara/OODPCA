package sg.edu.nus.iss.vmcs.store;

/**
 * This object represents the method for calculating the price of Drinks brand
 * @author sakthi
 *
 */

public interface PriceStrategy {
	
	public String PLACE_OF_INTEREST= "placeofinterest";
	public String STREET= "street";
	public String SCHOOL = "school";
	public String COLLEGE = "college";
	
	public int getPrice(int price, String name);

}
