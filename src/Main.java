import java.util.*;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("hashset");
        HashSet<String> set1 = new HashSet<String>();
        set1.add("Dzien dobry");
        set1.add("Milo mi cie poznac");
        set1.add("Jak sie nazywasz");

        for (String value : set1)
            System.out.print(value + "   ");

        System.out.println("TREESET\n");
        TreeSet<String> set = new TreeSet<String>();
        set.add("Dzien dobry");
        set.add("Milo mi cie poznac");
        set.add("Jak sie nazywasz");

        Iterator value = set.iterator();

        while (value.hasNext()) {
            System.out.println(value.next());
        }

        TreeMap<Integer, String> tree_map = new TreeMap<>();

        tree_map.put(15, "Kasia");
        tree_map.put(20, "Marek");
        tree_map.put(1, "Michal");
        tree_map.put(2, "Majkel");
        tree_map.put(1, "Kacper");

        System.out.println("TreeMap: " + tree_map);

        System.out.println(tree_map.firstKey());
        System.out.println("TreeMap po firstKey: " + tree_map);


        HashMap<Integer,String > hash_map = new HashMap<>();

        hash_map.put(11,"Maja");
        hash_map.put(1,"Maja");
        hash_map.put(2,"Michal");
        hash_map.put(5,"Igor");
        hash_map.put(12,"Filip");

        System.out.println("HashMap: " + hash_map);
    }
}

//TreeSet nie ma powtarzania elementow
//TreeSet ts = new TreeSet();
//    Set syncSet = Collections.synchronziedSet(ts);
//add(Object o)	This method will add the specified element according to the same sorting order mentioned during the creation of the TreeSet.
// Duplicate entries will not get added.
//clear()	This method will remove all the elements.
// remove(Object o)	This method is used to return a specific element from the set.
//wyswietlanie w petli for (String value : ts)
//
//            // Printing the values inside the object
//            System.out.print(value + ", ");
//
//        System.out.println();
// Creating an iterator
//        Iterator value = set.iterator();
//
//        // Displaying the values after iterating through the set
//        System.out.println("The iterator values are: ");
//        while (value.hasNext()) {
//            System.out.println(value.next());
//        }




//konstruktor wyswietlania treemap
// static void Example1stConstructor()
//    {
//        // Creating an empty TreeMap
//        TreeMap<Integer, String> tree_map
//            = new TreeMap<Integer, String>();
//
//        // Mapping string values to int keys
//        // using put() method
//        tree_map.put(10, "Geeks");
//        tree_map.put(15, "4");
//        tree_map.put(20, "Geeks");
//        tree_map.put(25, "Welcomes");
//        tree_map.put(30, "You");
//
//        // Printing the elements of TreeMap
//        System.out.println("TreeMap: " + tree_map);
//    }
//
//    // Method 2
//    // Main driver method
//    public static void main(String[] args)
//    {
//        System.out.println("TreeMap using "
//                           + "TreeMap() constructor:\n");
//
//        // Calling constructor
//        Example1stConstructor();
//    }