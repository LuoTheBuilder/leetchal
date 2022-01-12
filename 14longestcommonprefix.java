lass Solution {
    public String longestCommonPrefix(String[] strs) {
        //cancel if nothing present
        if (strs == null || strs.length == 0) { return "";
        }
        //find the minimum length of the smallest value in the array.
        int minLen = Integer.MAX_VALUE;
        for(String str: strs)
            minLen = Math.min(minLen, str.length());
//        System.out.println(minlen);
        //Implement the binary search
        int low =0;
        int high = minLen;

//        System.out.println(mid);
        while (low<=high){
            int mid =(low+high)/2;
            if (commonPrefix (strs, mid)){
                low=mid+1;
            }else{
                high = mid-1;
            }
        } return strs[0].substring(0, (low+high)/2);
    }

    public static boolean commonPrefix(String[] strs, int mid){
        String str =strs[0].substring(0, mid);
        for (int i=1; i<strs.length; i++){
            if (!strs[i].startsWith(str)){
                return false;
            }
        }return true;
    }

}
