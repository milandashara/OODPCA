package sg.edu.nus.iss.vmcs.store;

/**
 * This object represents the method for choosing the startegy 
 * to calculate the price of Drinks brand
 * @author sakthi
 *
 */

public class PricingStrategyFactory {

	protected PricingStrategyFactory() {

	}

	public static PriceStrategy create(String preset) {
		PriceStrategy strategy = null;

		switch (preset) {
		case PriceStrategy.PLACE_OF_INTEREST:
			strategy = new PlaceOfInterestStrategy();
			break;
		case PriceStrategy.STREET:
			strategy = new StreetStrategy();
			break;
		case PriceStrategy.SCHOOL:
			strategy = new SchoolStrategy();
			break;
		case PriceStrategy.COLLEGE:
			strategy = new CollegeStrategy();
			break;
		}
		return strategy;

	}

}
