public class DrinkBar {
    public static void main(String[] args) {
        Drink drink1 = new Drink();
        drink1.drinkName = "Dead Russian";
        drink1.drinkPrice = 23.14;
        drink1.alcohol = true;
        Components comp1 = new Components();
        comp1.componentAmount = 40;
        comp1.componentName = "Vodka";
        Components comp2 = new Components();
        comp2.componentAmount = 50;
        comp2.componentName = "Whiskey";
        Components comp3 = new Components();
        comp3.componentAmount = 50;
        comp3.componentName = "Orange Juice";

        drink1.vodka = comp1;
        drink1.whiskey = comp2;
        drink1.orangeJuice =comp3;

        System.out.println("Nazwa Drinka: " + drink1.drinkName);
        System.out.println("Składniki: "+ comp1.componentName
                + ", " + comp2.componentName
                + ", " + comp3.componentName);
        System.out.println("ilość składników: "
                + "Vodka: " + comp1.componentAmount +" ml Whiskey: " + comp2.componentAmount
                + " ml Orange Juice: " + comp3.componentAmount +" ml");
        int sum = (comp1.componentAmount + comp2.componentAmount + comp3.componentAmount);
        System.out.println("Drink ml: " + sum);
    }
}
