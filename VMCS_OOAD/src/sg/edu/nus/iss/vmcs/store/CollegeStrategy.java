package sg.edu.nus.iss.vmcs.store;

/**
 * This object represents the pricing startegy for colleges
 * @author sakthi
 *
 */
public class CollegeStrategy implements PriceStrategy {
	
	public int getPrice(int price, String name)
	{
		return (int) (price * 1.5);

	}

}
