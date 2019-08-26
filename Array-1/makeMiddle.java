'''

Given an array of ints of even length, return a new array length 2 containing the middle two elements 
from the original array. The original array will be length 2 or more.


makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2]

'''

public int[] makeMiddle(int[] nums) {
  int[] newarr = new int[2];
  int len = nums.length;
  if (len == 2){
    newarr = nums;
  } else {
    newarr[0] = nums[len/2-1];
    newarr[1] = nums[len/2];
  }
  return newarr;
  
  //or return new int[] {nums[nums.length / 2 - 1], nums[nums.length / 2]};

}
