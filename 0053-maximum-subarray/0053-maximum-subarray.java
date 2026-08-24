class Solution {
    public int maxSubArray(int[] nums) {
//         int currentSum = nums[0];
//         int maxSum = nums[0];

//         for (int i = 1; i < nums.length; i++) {
//             currentSum = Math.max(nums[i], currentSum + nums[i]);
//             maxSum = Math.max(maxSum, currentSum);
//         }
//         return maxSum;
//     }
// }


//sub array is a continous means each element each next to each other

// jaise ki array = -2 , -5 , 6 , -2 , -3 , 1 , 5 , -6
//aise ho to humlog continous mai hin likh sakte h  aisa ni kar sakte h ki like
// -2 , 6 , -3 we did not write like that we have to write in a continous manner
// ex -> -2 , -3 , 1 iss type mai

// in this question maximum sub array means sum if we summ all the value of the given sub arraythen the sum is 0 but if we sum 4 , -1 , 2 , 1 the sum is 6 so we have to sum like that


// METHOD 1 TO SOLVE A QUESTION --->
// approach 1 to solve the question is -(Brute force)
// just find the all the continous sub array and find the which continous sub array has a maximum sum
// int maxsum = 0;
// for(int st = 0; st<nums.length ; st++){

//     int currentsum =  0;
//     for(int end = st; end<nums.length ; end++){
       
//        currentsum += nums[end]; // isme kya hoga ki jaise -2 ,1 ,-3 , 4 , -1 , -5 , 4 hai isme pehle -2+1 krenge to 1 aayega oye oye currentsum mai tore hoga then we will add -3 in current sum it become -2 because presently current sum value is 1 , then we add +4 it become 2 then we add -1 it become 1 then 2 it become 3 then 1 4 start oha pe rhega and end badhte rhega after all this process the we will get max sub array that is 6 because after completing one loop start increase it goes to index 1 from index 0 after calculation we get our value
//        maxsum = Math.max(currentsum , maxsum);
//     }
// }
// return maxsum;

// }
// }

// the above solution is an brute force approach its time complexity is O(n^2)

// now we solve by optimisal approach->(Kadane's Algorithm)
// kadane algorithm say that if If your current sum becomes negative, it will reduce the future sum. agar kisi chote positive number ka sum add kre kisi se bade negative number se to answer or sum negative hi  aayega isse aacha hai ki hum uss bade negative number ko zero lele.
//if you subarray sum becomme negative Reset it and make it zero and it. it means 
// example = -2+1 = -1 resent the current sum and reset to zero.

// int currsum = nums[0];
// int maxsum = nums[0];
// for(int i = 1; i<nums.length; i++){
//     currsum = Math.max(nums[i], currsum + nums[i]);
//     maxsum = Math.max(currsum , maxsum);

//     if(currsum<0){
//         currsum=0;
//     }
//    }
//    return maxsum;


// This is the best approach its time complexity is 0(n)

// way of solving is let be a currsum = 0
//maxsum = 0
// -2 the currsum become 0 because it is negative so thhe value is resent but the maxsum = -2
// then 1 the currentsum become =1 and the maxsum will comepare betwwen -2 and 1 now the maxsum become 1 then it go to -3 and it sum with current sum and current sum get reset because it will beocme negative and then it compare with max sum but the value did not change and maxsum is still is 1 then the process go again and again;

int currentsum =0; int max = Integer.MIN_VALUE;

for(int i =0; i<nums.length; i++){

    currentsum +=nums[i];
    if(currentsum>max){
        max=currentsum;
    }

    if(currentsum<0){

        currentsum=0;
    }
}
return max;
}
}