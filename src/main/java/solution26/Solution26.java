package solution26;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 速度击败 5.16%
 * 运存击败 99.18%
 *
 * @author lipengcheng3 Created date 2019-03-13 22:11
 */
public class Solution26 {
    public int removeDuplicates(int[] nums) {
        List<Integer> result = Arrays.stream(nums).distinct()
                .boxed()
                .collect(Collectors.toList());
        for (int i = 0; i < result.size(); i++) {
            nums[i] = result.get(i);
        }
        return result.size();
    }

    public static void main(String[] args) {
        int[] x = new int[]{1, 1, 2};
        int y = new Solution26().removeDuplicates(x);
        System.out.println();
    }
}
