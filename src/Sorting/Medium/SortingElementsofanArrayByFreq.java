package Sorting.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SortingElementsofanArrayByFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            HashMap<Integer, Integer> hp = new HashMap<>();

            // Reading the array and counting frequencies
            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
                hp.put(arr[j], hp.getOrDefault(arr[j], 0) + 1);
            }

            // Convert the array to a list for sorting
            List<Integer> list = new ArrayList<>();
            for (int num : arr) {
                list.add(num);
            }

            // Sort the list based on frequency and then by value
            list.sort((a, b) -> {
                int freqA = hp.get(a);
                int freqB = hp.get(b);
                if (freqA != freqB) {
                    return freqB - freqA; // Higher frequency comes first
                } else {
                    return a - b; // If frequencies are the same, smaller number comes first
                }
            });

            // Print the sorted list
            for (int num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
