package solution26;

/**
 * ac了，我们乘胜追击
 * <p>
 * 速度击败 99.88%
 * 运存击败 37.81%
 *
 * @author lipengcheng3 Created date 2019-03-13 22:11
 */
public class Solution26_3 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return nums.length;
        int i = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j - 1] != nums[j]) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }

}
