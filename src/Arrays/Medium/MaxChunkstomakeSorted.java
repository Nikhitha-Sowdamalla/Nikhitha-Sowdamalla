package Arrays.Medium;

public class MaxChunkstomakeSorted {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int max_seen = 0;
        int count = 0;

        for(int i=0;i<n;i++)
        {
            max_seen = Math.max(max_seen, arr[i]);
            if (max_seen == i) {
                count++;
            }
        }

        return count;
    }

}
