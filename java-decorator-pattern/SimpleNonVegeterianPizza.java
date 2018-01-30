public class SimpleNonVegeterianPizza implements Pizza {
	
	private final Double PRICE = 730.00;
	private final String DESC = "Простая невегетарианская пицца\n";
	
	@Override
	public String getDescription() {
		return DESC;
	}
	
	@Override
	public Double getPrice() {
		return PRICE;
	}
}
