public class HamPizzaDecorator extends PizzaDecorator {

	private final Double PRICE = 45.90;
	private final String DESC = "+ Ветчина (" + PRICE + ")\n";
	
	public HamPizzaDecorator(Pizza decoratedPizza) {
		super(decoratedPizza);
	}
	
	@Override
	public String getDescription() {
		return (super.getDescription() + DESC);
	}
	
	@Override
	public Double getPrice() {
		return (super.getPrice() + PRICE);
	}
	
}
