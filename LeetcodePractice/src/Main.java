public class Main {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,0,0,0};
        int[] array2 = {2,5,6};
        int m = 2;
        int n = 3;

        MergeSortedArrays.merge(array1, 3, array2, n);
    }
}