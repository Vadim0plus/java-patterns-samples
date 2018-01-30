public class DecoratorPatternDemo {

   public static void main(String[] args) {

      Pizza simple = new SimpleNonVegeterianPizza();
      
      Pizza meatPizza = new MeatPizzaDecorator(simple);
      
      Pizza hamPizza = new HamPizzaDecorator(meatPizza);

      System.out.println(getDescPizza(simple));
      System.out.println(getDescPizza(meatPizza));
      System.out.println(getDescPizza(hamPizza));
   }
   
   public static String getDescPizza(Pizza pizza) {
      return ("Описание:" + pizza.getDescription() + "Стоимость:" + pizza.getPrice() + "\n");
   }
   
}
