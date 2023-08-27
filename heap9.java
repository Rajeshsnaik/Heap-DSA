import java.util.PriorityQueue;

public class heap9 {
    public static void main(String[] args) {
        long[] arr={20, 8, 22, 4, 12, 10, 14};
        long n=3;
        long k=6;
        System.out.println(sumBetweenTwoKth(arr, n, k, k));
    }
//         static int kthSmallest(int a[],int n, int k) {
//             //code here
//             PriorityQueue<Integer> minHeap = new PriorityQueue<>();
//             for(int i=0;i<n;i++){
//                 minHeap.add((int) a[i]);
//                 if(minHeap.size()>k)
//                 minHeap.poll();
                
//             }
//             return minHeap.peek();
            
//         }
//         int sumBetweenTwoKth(int a[], int n, int k1, int k2)
//         {
//             // Your code goes here
//             int  ax=kthSmallest(a,n,k1);
//             int  by=kthSmallest(a,n,k2);
//             int  ans=0;
//             for(int i=0;i<n;i++)
//             {
//                 if(a[i]>ax && a[i]<by)
//                 ans+=a[i];
//             }
//             return ans;
//         }
// }


    // private static char[] sumBetweenTwoKth(long[] arr, long n, long k) {
    //     return null;
    // }

    static long sumBetweenTwoKth( long A[], long N, long K1, long K2)
    {
        // Your code goes here
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        long ans = 0;
        for(int i = 0;i<N;i++){
            minHeap.add((int) A[i]);
            if(minHeap.size()>K2){
                minHeap.poll();
            }
        }
        minHeap.poll();
        while(minHeap.size()>K1){
            ans+=minHeap.peek();
            minHeap.poll();
        }
        return ans;
    }
}
