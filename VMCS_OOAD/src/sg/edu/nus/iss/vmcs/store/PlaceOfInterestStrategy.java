package sg.edu.nus.iss.vmcs.store;

/**
 * This object represents the pricing startegy for PlaceOfInterest
 * @author sakthi
 *
 */
public class PlaceOfInterestStrategy implements PriceStrategy {
	
	public int getPrice(int price, String name)
	{
		return (int) (price * 3);

	}

}
