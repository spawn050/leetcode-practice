public class SortColors {
    public static void sortColors(int[] nums){
        int tailPointer = 0;
        int headPointer = 1;

        while(headPointer < nums.length){
            int temporary;

            if(nums[headPointer] == 0 && nums[tailPointer] == 0){
                headPointer++;
            }else if(nums[tailPointer] == 0){
                tailPointer = headPointer;
                headPointer++;
            }else if(nums[headPointer] == 0){
                temporary = nums[tailPointer];
                nums[tailPointer] = nums[headPointer];
                nums[headPointer] = temporary;
                tailPointer++;
                headPointer++;
            }else{
                headPointer++;
            }
        }

        headPointer = headPointer - 1;

        while(tailPointer < headPointer){
            int temporary;

            if(nums[headPointer] == 2){
                headPointer--;
            }else if(nums[tailPointer] == 2){
                temporary = nums[tailPointer];
                nums[tailPointer] = nums[headPointer];
                nums[headPointer] = temporary;
                tailPointer++;
                headPointer--;
            }else{
                tailPointer++;
            }
        }



    }
}
