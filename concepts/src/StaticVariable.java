class Mobile {
    String brand;
    int price;

    static String category;     // shared variable
    static int phoneCount = 0;  // shared counter

    public Mobile() {
        phoneCount++;
    }

    public void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
        System.out.println();
    }

    public static void showPhoneCount() {
        System.out.println("Total phones created: " + phoneCount);
    }
}

public class StaticVariable {

    public static void main(String[] args) {

        Mobile.category = "Smartphone";  // initialize static variable

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;

        System.out.println("--- Initial State ---");
        obj1.show();
        obj2.show();

        Mobile.showPhoneCount();
        System.out.println();

        // Recommended way
        Mobile.category = "Premium Phone";

        System.out.println("--- After Changing via Class ---");
        obj1.show();
        obj2.show();

        // Allowed but not recommended
        obj1.category = "Budget Phone";

        System.out.println("--- After Changing via Object ---");
        obj1.show();
        obj2.show();

        System.out.println("Access via object (not recommended): " + obj2.category);
        System.out.println("Access via class (recommended): " + Mobile.category);
    }
}
