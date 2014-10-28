package sg.edu.nus.iss.vmcs.store;

/**
 * This object represents the pricing startegy for PlaceOfInterest
 * @author sakthi
 *
 */
public class PlaceOfInterestStrategy implements PriceStrategy {
	
	public int getPrice(int price)
	{
		return (int) (price * 3);

	}

}
