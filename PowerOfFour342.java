class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0){
            return false;
        }
        if(n==1){
            return true;
        }
        /*
        int left=1;
        int right=n;
        while(left<=right){
          int mid=left+((right-left)/2);
          int pow=(int)Math.pow(4,mid);
          if(pow==n){
            return true;
          }
          else if(pow<n){
            left=mid+1;
          }
          else{
            right=mid-1;
          }
        }
        return false;*/
        while(n%4==0){
            n/=4;
        }
        return n==1;
    }
}