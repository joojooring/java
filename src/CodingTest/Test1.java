package CodingTest;

import java.util.Arrays;

public class Test1 {
    public static int sumLessThan(int [] nums, int input){
        int sum =0;
        for(int num : nums){
            if(num < input){
                sum +=num;
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        int [] nums1 = {2,5,8,3,7};

        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
        System.out.println(sumLessThan(nums1, 8 ));
    }
}
