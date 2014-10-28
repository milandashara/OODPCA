package sg.edu.nus.iss.vmcs.store;


/**
 * This object represents the default pricing startegy 
 * @author sakthi
 *
 */
public class DefaultStrategy implements PriceStrategy {
	
	public int getPrice(int price)
	{
		return (int) (price);

	}

}
