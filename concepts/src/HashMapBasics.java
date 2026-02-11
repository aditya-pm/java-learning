import java.util.HashMap;

public class HashMapBasics {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();

        // Add key and value
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);

        // access
        System.out.println(capitalCities.get("India"));

        // delete
        System.out.println(capitalCities.remove("England"));
        System.out.println(capitalCities);

        // size
        System.out.println(capitalCities.size());

        System.out.println();

        // loop through keys
        System.out.println("Loop through keys:");
        for (String keys : capitalCities.keySet()) {
            System.out.println(keys);
        }

        System.out.println();

        // loop through values
        System.out.println("Loop through values:");
        for (String values : capitalCities.values()) {
            System.out.println(values);
        }

        System.out.println();

        // getting key and value
        System.out.println("Loop through keys and values:");
        for (String key : capitalCities.keySet()) {
            System.out.println("City: " + key + ", Capital: " + capitalCities.get(key));
        }

        System.out.println();

        // HashMap uses objects as keys and values, to use primitive types use their wrappers instead
        HashMap<String, Integer> people = new HashMap<>();

        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String name : people.keySet()) {
            System.out.println("Name: " + name + ", age: " + people.get(name));
        }
    }
}
