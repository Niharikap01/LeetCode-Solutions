class Solution {
    public int maxVowels(String s, int k) {
       int count=0;
       for(int i=0;i<k;i++){
      char ch=s.charAt(i);
      if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
        count++;
      }
       }
       int maxcount=count;
       for(int i=k;i<s.length();i++){
        char entering=s.charAt(i);
        char leaving=s.charAt(i-k);
        if(entering=='a'||entering=='e'||entering=='i'||entering=='o'||entering=='u'){
            count++;
        }
        if(leaving=='a'||leaving=='e'||leaving=='i'||leaving=='o'||leaving=='u'){
            count--;
        }
        maxcount=Math.max(maxcount,count);
       }
       return maxcount;
    }
}