public class day1 {

    public static int[] twoSum(int[] nums, int target) {
            int[] solutionPositions = new int[2];

            boolean found = false;
            int i = 0;

            while(!found) {
                for (int j = 0; j < nums.length; j++) {
                    // skip same location
                    if (j != i && nums[i] + nums[j] == target) {
                        solutionPositions[0] = i;
                        solutionPositions[1] = j;
                        found = true;
                    }
                }
                i++;
            }
            return solutionPositions;
    }


    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] solutionPositions = twoSum(nums, target);
        for(int i = 0; i <solutionPositions.length; i++){
            System.out.println(solutionPositions[i]);
        }

    }
}
