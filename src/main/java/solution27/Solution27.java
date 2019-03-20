package solution27;

/**
 * 边界问题很重要，处处是坑
 *
 * 速度击败 100%
 * 运存击败 64.93%
 */
public class Solution27 {
    public int removeElement(int[] nums, int val) {
        int i=0;
        for (int j=nums.length-1;i<=j;i++){
            if (nums[i] == val){
                while (nums[j] == val){
                    if (--j<i){
                        return i;
                    }
                }
                nums[i] = nums[j--];
            }
        }
        return i;
    }

    public static void main(String[] args){
        new Solution27().removeElement(new int[]{1},1);
    }
}
