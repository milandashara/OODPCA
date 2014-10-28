package sg.edu.nus.iss.vmcs.store;
/**
 * This object represents the pricing startegy for street
 * @author sakthi
 *
 */
public class StreetStrategy implements PriceStrategy {
	
	public int getPrice(int price)
	{
		return (int) (price * 2.5);

	}

}
