import java.util.*;

class VectorDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // i) Create vector and add elements
        Vector<Object> v = new Vector<>();

        v.add(10);      // Integer
        v.add(20);      // Integer
        v.add(10.5);    // Double
        v.add(20.5);    // Double
        v.add(5.5f);    // Float

        System.out.println("Initial Vector: " + v);

        // ii) Add string at 3rd position (index 2)
        v.add(2, "Java");
        System.out.println("After inserting at 3rd position: " + v);

        // iii) Remove element specified by user
        System.out.println("Enter element to remove:");
        String ele = sc.next();   // user input as string
        v.remove(ele);
        System.out.println("After removal: " + v);

        // iv) Display all elements
        System.out.println("All elements:");
        for(int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }

        // vi) Display capacity
        System.out.println("Capacity: " + v.capacity());

        // v) Remove all elements
        v.removeAllElements();
        System.out.println("After removing all elements: " + v);
    }
}