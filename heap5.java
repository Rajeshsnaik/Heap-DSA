//top k frequent element
import java.util.*;
public class heap5 {
    public static void main(String[] args) {
        int nums[]={1,1,1,1,4,3,2,2};
        System.out.println(topKFrequent(nums, 1));
    }
        public static int[] topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> counter = new HashMap<>();
            for (int num : nums) {
                counter.put(num, counter.getOrDefault(num, 0) + 1);
            }
            
            PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> counter.get(b) - counter.get(a));
            for (int num : counter.keySet()) {
                heap.offer(num);
            }
            
            int[] result = new int[k];
            for (int i = 0; i < k; i++) {
                result[i] = heap.poll();
            }
            
            return result;
        }
    }

