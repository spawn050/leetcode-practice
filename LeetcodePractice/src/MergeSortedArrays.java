public class MergeSortedArrays {
//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0)
//            return;
//
//        int x = 0, y = 0;
//        while (x < m && y < n) {
//            if (nums1[x] > nums2[y]) {
//                shiftAndInsert(nums1, nums2[y], x);
//            }
//            ++x;
//            ++y;
//        }
//
//
//    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0 || n == 0) {
            return;
        }

        int nums1Pointer = 0;
        int nums2Pointer = 0;

        while (nums2Pointer < nums2.length) {
            if (nums1Pointer == m) {
                for (int i = nums2Pointer; i < nums2.length; i++) {
                    nums1[nums1Pointer] = nums2[i];
                    nums1Pointer++;
                    nums2Pointer++;
                }
            } else if (nums1[nums1Pointer] > nums2[nums2Pointer]) {
                insertElement(nums2[nums2Pointer], nums1Pointer, nums1, m);
                nums1Pointer++;
                nums2Pointer++;
                m++;
            } else {
                nums1Pointer++;
            }
        }

        printElements(nums1);
    }

    // x 1 2 3 4 5
    public static void insertElement(int number, int position, int[] tempNums1, int nums1Length) {
        nums1Length = nums1Length + 1;
        while (nums1Length > position) {
            tempNums1[nums1Length] = tempNums1[nums1Length - 1];
            nums1Length--;
        }
        tempNums1[position] = number;
    }

    public static void printElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
}
