class Solution {
    public boolean isPalindrome(int x) {
if (x<0 || (x%10 == 0 && x !=0)){
            return false;
        }
        int i=0;
        while (x>i){
            i=i*10+x%10;
            x/=10;
            System.out.println(i+ " "+x);
        }
        if (x==i || x==i/10){
            return true;
        }else return false;
    }
}
