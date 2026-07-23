class Solution {

    public boolean isvowel(char ch){

        return ch == 'a'||ch=='e'|ch=='i'|| ch=='o'|| ch =='u';
    }
    public int beautifulSubstrings(String s, int k) {

        int n = s.length();
int count =0;
       
for(int i = 0 ; i<n; i++){

    int vowel = 0;
int conso = 0;
    for(int j =i ; j<n ; j++){
if(isvowel(s.charAt(j))) vowel++;

else{
    conso++;
}

if(vowel==conso && (vowel*conso)%k==0){

count++;
}
    }
}
return count;
        
    }
}