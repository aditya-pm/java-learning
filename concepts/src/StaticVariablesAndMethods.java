class Mobile {

    // instance variables (belong to objects)
    String brand;
    int price;

    // static variables (belong to class)
    static String category = "Smartphone";
    static int phoneCount = 0;

    public Mobile(String brand, int price) {
        this.brand = brand;
        this.price = price;
        phoneCount++;
    }

    // instance method
    public void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
        System.out.println();
    }

    // static method
    public static void showPhoneCount() {
        System.out.println("Total phones created: " + phoneCount);

        // NOT ALLOWED:
        // System.out.println(brand);  // ERROR
        // static methods cannot access instance variables
    }

    // static method modifying static variable
    public static void changeCategory(String newCategory) {
        category = newCategory;
    }
}

public class StaticVariablesAndMethods {

    public static void main(String[] args) {

        Mobile obj1 = new Mobile("Apple", 1500);
        Mobile obj2 = new Mobile("Samsung", 1700);

        System.out.println("--- Initial State ---");
        obj1.show();
        obj2.show();

        // call static method via class (recommended)
        Mobile.showPhoneCount();
        System.out.println();

        // call static method via object (allowed but not recommended)
        obj1.showPhoneCount();
        System.out.println();

        // change static variable via class
        Mobile.changeCategory("Premium Phone");

        System.out.println("--- After Changing Category via Class ---");
        obj1.show();
        obj2.show();

        // access static variable via object (allowed but misleading)
        obj1.category = "Budget Phone";

        System.out.println("--- After Changing via Object ---");
        obj1.show();
        obj2.show();

        System.out.println("Access static via object: " + obj2.category);
        System.out.println("Access static via class: " + Mobile.category);
    }
}
