package FinalProject;

import java.util.PriorityQueue;

public class HeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> routePriority = new PriorityQueue<>();

        // Routes: smaller value means more critical
        routePriority.add(2);  //critical route
        routePriority.add(5);  //moderate route
        routePriority.add(8);  //less critical

        System.out.println("Allocating ships to critical routes based on priority:");
        while (!routePriority.isEmpty()) {
            int route = routePriority.poll();
            System.out.println("Ship assigned to route with priority level: " + route);
        }
    }
}




