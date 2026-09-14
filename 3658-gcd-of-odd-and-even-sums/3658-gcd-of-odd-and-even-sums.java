class Solution {
    public int gcdOfOddEvenSums(int n) {
        
        int sumodd =0; int count1 =0;

        for(int i =1; count1<n; i+=2){
            sumodd+=i;
            count1++;
        }
        int sumeven=0; int count2=0;
        for(int i =2; count2<n; i+=2){
            sumeven+=i;
            count2++;
        }

        while(sumodd!=0){
            int temp = sumodd;
            sumodd= sumeven%sumodd;
            sumeven = temp;
        }
        return sumeven;
    }
}