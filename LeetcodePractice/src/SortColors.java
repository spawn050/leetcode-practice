public class SortColors {
    public static void sortColors(int[] nums){
        int headPointer = nums.length - 1;
        int tailPointer = 0;

        while(headPointer > tailPointer && headPointer != tailPointer){
            if(nums[tailPointer] == 0){
                tailPointer++;
            }else if(nums[headPointer] == 0){
                swapValues(nums, headPointer, tailPointer);
                headPointer--;
                tailPointer++;
            }else{
                headPointer--;
            }
        }

        while(headPointer < nums.length && tailPointer < nums.length){
            if(nums[tailPointer] == 0){
                tailPointer++;
            }else if(nums[tailPointer] == 1){
                tailPointer++;
            }else if(headPointer < tailPointer){
                headPointer = tailPointer + 1;
            }else if(nums[headPointer] == 1){
                swapValues(nums, headPointer, tailPointer);
                headPointer++;
                tailPointer++;
            }else{
                headPointer++;
            }
        }
    }

    public static void swapValues(int[] tempNums,int firstIndex, int secondIndex){
        int temporaryNum = tempNums[firstIndex];
        tempNums[firstIndex] = tempNums[secondIndex];
        tempNums[secondIndex] = temporaryNum;
    }
}
