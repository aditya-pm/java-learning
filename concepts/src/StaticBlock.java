class MobileStaticBlock {

    static String category;
    static int phoneCount;

    // static block
    static {
        System.out.println("Static block executed.");
        category = "Smartphone";
        phoneCount = 0;
    }

    String brand;
    int price;

    public MobileStaticBlock(String brand, int price) {
        this.brand = brand;
        this.price = price;
        phoneCount++;
    }

    public void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Category: " + category);
        System.out.println();
    }
}

public class StaticBlock {

    public static void main(String[] args) {

        System.out.println("Inside main");

        MobileStaticBlock obj1 = new MobileStaticBlock("Apple", 1500);
        MobileStaticBlock obj2 = new MobileStaticBlock("Samsung", 1700);

        obj1.show();
        obj2.show();

        System.out.println("Total phones: " + Mobile.phoneCount);
    }
}
