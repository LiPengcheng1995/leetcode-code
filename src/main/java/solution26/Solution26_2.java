package solution26;

import java.util.ArrayList;
import java.util.List;

/**
 * 相差太多，我们不妨猜测相同的数字是连着的
 * <p>
 * 速度击败 74.29%
 * 运存击败 16.77%
 *
 * @author lipengcheng3 Created date 2019-03-13 22:11
 */
public class Solution26_2 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return nums.length;
        List<Integer> temp = new ArrayList<>();
        temp.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                temp.add(nums[i]);
            }
        }
        for (int i = 0; i < temp.size(); i++) {
            nums[i] = temp.get(i);
        }
        return temp.size();
    }

}
