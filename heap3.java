//sort a k-sorted array
import java.util.ArrayList;
import java.util.PriorityQueue;

public class heap3 {
    public static void main(String[] args) {
        int arr[]={7,6,5,3,2,8,10,9,7};
        int n=arr.length;
        int k=5;
        System.out.println(nearlySorted(arr, n, k));
    }

    //Function to return the sorted array.
    static ArrayList <Integer> nearlySorted(int arr[], int n, int k)
    {
        PriorityQueue <Integer> minHeap = new PriorityQueue<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            minHeap.add(arr[i]);
            
            if(minHeap.size()>k){
                ans.add(minHeap.peek());
                minHeap.poll();
            }
        }
        
        for(int i=0;i<k;i++){
            ans.add(minHeap.peek());
            minHeap.poll();
        }
        
        return ans;
    }
}
