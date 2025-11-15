package FinalProject;

public class SortSearch {
    // Insertion Sort Method
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Binary Search Method
    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] distances = {45, 10, 25, 60, 30};
        System.out.println("Original Distances:");
        for (int d : distances) {
            System.out.print(d + " ");
        }

        // Sorting distances
        insertionSort(distances);
        System.out.println("\n\nSorted Distances (Ascending):");
        for (int d : distances) {
            System.out.print(d + " ");
        }

        // Searching for a specific port distance
        int port = 30;
        int index = binarySearch(distances, port);

        System.out.println("\n\nSearching for port distance " + port + "...");
        if (index != -1)
            System.out.println("Port distance " + port + " found at index: " + index);
        else
            System.out.println("Port distance not found!");
    }
}
