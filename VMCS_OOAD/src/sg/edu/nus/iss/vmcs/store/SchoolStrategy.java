package sg.edu.nus.iss.vmcs.store;

/**
 * This object represents the pricing startegy for School
 * @author sakthi
 *
 */
public class SchoolStrategy implements PriceStrategy {
	
	public int getPrice(int price, String name)
	{
		return (int) (price * 1.3);

	}

}
