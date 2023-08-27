//sort frequency of int array
import java.util.*;
public class heap6 {
    public static void main(String[] args) {
        int nums[]={1,1,1,3,4,5,2,2,2,2,2,2,2};
        System.out.println(frequencySort(nums));
    }
        public static int[] frequencySort(int[] nums) {
    int res[] = new int[nums.length];
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; ++i) {
        map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);     
    }
    
    PriorityQueue<int[]> pq = new PriorityQueue((a, b) -> (((int[])b)[1] - ((int[])a)[1] == 0) ? ((int[])b)[0] - ((int[])a)[0] : ((int[])a)[1] - ((int[])b)[1]);
    
    for (Map.Entry<Integer, Integer> arr : map.entrySet()) {
        pq.add(new int[] {arr.getKey(), arr.getValue()});
    }
    
    int counter = 0;
    while (!pq.isEmpty()) {
        int[] c = pq.poll();
        for (int i = 0; i < c[1]; ++i) {
            res[counter++] = c[0];
        }
    }
    
    return res;

}
}
