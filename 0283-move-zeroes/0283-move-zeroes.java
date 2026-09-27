class Solution {
    public void moveZeroes(int[] nums) {
// brute force  TC = O(2N) AND SC = O(N)
// int n = nums.length;

// int temp[] = new int[n];

// int idx =0;
// for(int i =0; i<n ; i++){

// if(nums[i]!=0){

//     temp[idx] = nums[i];

//     idx++;

// }
// }
// for(int i = 0; i<n ; i++){

//     nums[i] =  temp[i];
// }

// best approach TC = O(N) AND SC = O(1)

// int j =0;
// for(int i =0; i<nums.length; i++){

//     if(nums[i] != 0) {
//                 int temp = nums[i];
//                 nums[i] = nums[j];
//                 nums[j] = temp;

//                 j++;

//     }
// }

int n = nums.length;
int temp[]=new int[n];

int j =0;
for(int i =0; i<n; i++){

    if(nums[i]!=0){ temp[j] = nums[i];
    j++;
    }
}
  for(int i =0; i<temp.length;i++){
    nums[i] = temp[i];
  }
  for(int i =temp.length; i<n; i++){
    nums[i]=0;
  }
        
    }
}




