public class SortColors {
    public static void sortColors(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return;
        }

        int[] counter = {0,0,0};
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                counter[0]++;
            }else if(nums[i] == 1){
                counter[1]++;
            }else{
                counter[2]++;
            }
        }

        for(int i = 0; i < nums.length;){
            while(counter[0] != 0){
                nums[i] = 0;
                counter[0]--;
                i++;
            }
            while(counter[1] != 0){
                nums[i] = 1;
                counter[1]--;
                i++;
            }
            while(counter[2] != 0){
                nums[i] = 2;
                counter[2]--;
                i++;
            }
        }
        printElements(nums);
    }

    private static void printElements(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+",");
        }
    }
}
