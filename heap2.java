//Kth largest element
import java.util.PriorityQueue;

public class heap2 {
    public static void main(String[] args) {
        int arr[]={7,3,4,10,15,36,11};
        int k=3;
        int n=arr.length;
        System.out.println(findKthLargestElement(arr, k, n));
    }

    private static int findKthLargestElement(int[] arr, int k, int size) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < size; i++) {
          minHeap.add(arr[i]);
          if (minHeap.size() > k) {
            minHeap.poll();
          }
        }
        return minHeap.peek();
     }
}
