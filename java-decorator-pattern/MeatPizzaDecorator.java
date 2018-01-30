public class MeatPizzaDecorator extends PizzaDecorator {

	private final Double PRICE = 50.99;
	private final String DESC = "+ Мясная добавка (" + PRICE + ")\n";
	
	public MeatPizzaDecorator(Pizza decoratedPizza) {
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
