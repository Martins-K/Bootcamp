import java.util.*;

public class Solution {
    //1) You have 3 arrays of random numbers. Create a program,
    // using any of the programming languages. This program should
    // compare 3 arrays and create a new array, which will contain
    // common elements from these 3 arrays.

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        int b[] = {3, 4, 5, 6, 7, 8};
        int c[] = {1, 2, 6, 8, 9, 0};

        List<Integer> array1 = new LinkedList<Integer>();
        Set<Integer> set1 = new HashSet<Integer>();
        for (int ele : a) {
            set1.add(ele);
        }

        for (int ele : b) {
            if (set1.contains(ele)) {
                array1.add(ele);
            }
        }

        int[] arr = new int[array1.size()];
        for (int i = 0; i < array1.size(); i++) {
            arr[i] = array1.get(i);
        }
        List<Integer> array2 = new LinkedList<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        for (int ele : arr) {
            set2.add(ele);
        }

        for (int ele : c) {
            if (set2.contains(ele)) {
                array2.add(ele);
            }
        }

        int[] arr2 = new int[array2.size()];
        for (int i = 0; i < array2.size(); i++) {
            arr2[i] = array2.get(i);
        }
        System.out.println(Arrays.toString(arr2));
    }
}
