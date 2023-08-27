//Kth Smallest Element
import java.util.PriorityQueue;

public class heap1 {
// In Java, by default, it is a min-heap.
// Min Heap:
// PriorityQueue<Integer> minHeap = new PriorityQueue<>();
// Max Heap: Using comparator to make it a max heap.
// PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
public static void main(String[] args) {
    int arr[]={7,3,4,10,15,36};
    int k=1;
    int n=arr.length;
    System.out.println(findKthSmallestElement(arr, k, n));
}

//Updated Java code: 
private static int findKthSmallestElement(int[] arr, int k, int size) {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
    for (int i = 0; i < size; i++) {
      maxHeap.add(arr[i]);
      if (maxHeap.size() > k) {
        maxHeap.poll();
      }
    }
    return maxHeap.peek();
 }
}
