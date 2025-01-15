package Strings.Medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersbyFrequency {
    public String frequencySort(String s) {
        // Step 1: Create a hashmap to store frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Use a max heap (priority queue) to store characters based on frequency
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue() // Compare based on frequency (descending)
        );
        
        // Push all entries (character and frequency) into the max heap
        maxHeap.addAll(frequencyMap.entrySet());

        // Step 3: Build the result string by popping from the heap
        StringBuilder result = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            char c = entry.getKey();
            int frequency = entry.getValue();
            result.append(String.valueOf(c).repeat(frequency)); // Append character 'frequency' times
        }

        return result.toString();
    }

}
