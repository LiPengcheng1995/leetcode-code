package solution26;

import java.util.ArrayList;
import java.util.List;

/**
 * 速度击败 5.16%
 * 运存击败 11.4%
 *
 * @author lipengcheng3 Created date 2019-03-13 22:26
 */
public class Solution26_1 {
    public int removeDuplicates(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!temp.contains(nums[i])) {
                temp.add(nums[i]);
            }
        }
        for (int i = 0; i < temp.size(); i++) {
            nums[i] = temp.get(i);
        }
        return temp.size();

    }
}
