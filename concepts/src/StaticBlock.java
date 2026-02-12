class MobileStaticBlock {

    static String category;
    static int phoneCount;

    // static block: runs once when the class is first loaded by the JVM
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

        // access static variable BEFORE creating object
        System.out.println("Category is: " + MobileStaticBlock.category);
        // if above line is commented out, then class will be loaded when
        // new MobileStaticBlock(...) is called.

        MobileStaticBlock obj1 = new MobileStaticBlock("Apple", 1500);
        MobileStaticBlock obj2 = new MobileStaticBlock("Samsung", 1700);

        obj1.show();
        obj2.show();

        System.out.println("Total phones: " + MobileStaticBlock.phoneCount);
    }
}
