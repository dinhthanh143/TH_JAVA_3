abstract class Drink {
    private  int id;
    private String name;
    private double price;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Drink(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    abstract double calculatePrice();
    void displayInfo(){
        System.out.println("===Thong tin Do uong===");
        System.out.println("ID: " + id);
        System.out.println("Ten: " + name);
        System.out.println("Gia: " + price + "VND");
    }
}

class Coffee extends Drink{
    private boolean hasMilk;
    public Coffee(int id, String name, double price, boolean hasMilk) {
        super(id, name, price);
        this.hasMilk = hasMilk;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        if(hasMilk){
            System.out.println("Co sua");
        }else{
            System.out.println("Den da");
        }
    }

    @Override
    double calculatePrice() {
        if(hasMilk){
            return super.getPrice() + 5000;
        }else{
            return super.getPrice();
        }
    }
}

class FruitJuice  extends Drink implements IMixable{
    private int discountPercent;
    public FruitJuice (int id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    public void mix() {
        System.out.println("Dang ep trai cay tuoi...");
    }

    @Override
    double calculatePrice() {
      return super.getPrice() - ( super.getPrice()*discountPercent/100);
    }
}



