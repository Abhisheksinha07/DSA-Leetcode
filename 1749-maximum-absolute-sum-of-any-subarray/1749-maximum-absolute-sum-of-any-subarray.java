class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int currentmaxsum =0; int maxsubarray = Integer.MIN_VALUE; int currentminsum =0; int minsubarray = Integer.MAX_VALUE;

        for(int i =0; i<nums.length; i++){

            currentmaxsum +=nums[i];

            if(currentmaxsum>maxsubarray){

                maxsubarray = currentmaxsum;
            }

            if(currentmaxsum<0) currentmaxsum=0;
        }
        
for(int i =0; i<nums.length;i++){

    currentminsum +=nums[i];

    if(currentminsum<minsubarray){
        minsubarray = currentminsum;
    }

    if(currentminsum>0)currentminsum =0;
}
        return  Math.max(Math.abs(maxsubarray),Math.abs(minsubarray));
    }
}