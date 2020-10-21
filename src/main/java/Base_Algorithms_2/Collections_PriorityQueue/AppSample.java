package Base_Algorithms_2.Collections_PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class AppSample {

    public static void main(String[] args) {

        // primitive types
//        Queue<String> pQueue = new PriorityQueue<>();
//
//        pQueue.add("F");
//        pQueue.add("C");
//        pQueue.add("Z");
//        pQueue.add("A");
//
//        System.out.println(pQueue.remove());
//        System.out.println(pQueue.remove());
//        System.out.println(pQueue.remove());
//        System.out.println(pQueue.remove());

        // custom objects
        Queue<Person> queue = new PriorityQueue<>();
        queue.add(new Person("Nikolay", 55));
        queue.add(new Person("Jury", -1));
        queue.add(new Person("Daniil", 123));
        queue.add(new Person("Albert", 37));

        // O(logN)

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

    }
}
