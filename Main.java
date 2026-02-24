//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Drink[] drinks = new Drink[3];
    drinks[0] = new Coffee(1, "Bac  siu", 30000, true);
    drinks[1] = new FruitJuice(2, "Nuoc cam", 40000, 10);
    drinks[2] = null;

    for (int i = 0 ; i < drinks.length ; i++){
        if(drinks[i] == null)  continue;
        drinks[i].displayInfo();
        System.out.println(drinks[i].calculatePrice());
        if(drinks[i] instanceof FruitJuice){
            ((FruitJuice) drinks[i]).mix();
        }
    }

    }
}