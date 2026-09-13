class Solution {
    public int trailingZeroes(int n) {

        // problem hai ki agar factorial bada aaya to value int ya long ni sambhal pa rha hai to iska ek logic se solve hoga logic shi hai leken bada factorial number nhi sambhal pa rha hai
//          long fact =1; int count =0;
//         while(n>0){
//             fact = fact*n;
//             n--;
//         }
//             while(fact%10==0){
//                 count++;
// fact=fact/10;
//     }     
//         return count;


        int count =0;

        while(n>=5){
            n= n/5;
            count = count+n;
        }
        return count;
    }
}