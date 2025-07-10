package controle.desafios;

import java.util.Arrays;

public class TwoSum_ON2 {

	public static void main(String[] args) {

		int[] nums = { 2, 7, 11, 15 };
		int[] nums2 = { 3, 2, 4 };
		int[] nums3 = { 3, 3 };
		int[] nums4 = { -11, 7, 3, 2, 1, 7, -10, 11, 21, 3 };

		System.out.println(Arrays.toString(twoSum(nums, 9)));
		System.out.println(Arrays.toString(twoSum(nums2, 6)));
		System.out.println(Arrays.toString(twoSum(nums3, 6)));

	}

	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] {};
	}

}
