class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] resultArray = new int[2];
        int sum = 0;
        
        for(int i = 0; i < nums.length - 1; i++){
            
            for(int j = i + 1 ; j <nums.length; j++){
                sum = nums[i] + nums[j];
                   
                 if(sum == target){
                    resultArray[0] = i;
                    resultArray[1] = j;
                    break;
                 }
            }
            
            if(sum == target){
                break;
            }
            
            sum = 0;
        }
        return resultArray;
    }
}


class improveSolution {
    public int[] twoSum(int[] nums, int target) {
        int[] resultArray = new int[2];
        int sum = 0;
        
        for(int i = 0; i < nums.length - 1; i++){
            
            for(int j = i + 1 ; j <nums.length; j++){
                sum = nums[i] + nums[j];
                   
                 if(sum == target){
                    resultArray[0] = i;
                    resultArray[1] = j;
                    return resultArray;
                 }
            }
            
            sum = 0;
        }
        return null;
    }
}