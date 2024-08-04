public class prefixSum303 {

    class NumArray {
        int nums2[];
        int prefixSum[];
       public NumArray(int[] nums) {
           nums2=new int[nums.length];
           prefixSum=new int[nums.length];
           
           for(int i=0;i<nums.length;i++){
               nums2[i]=nums[i];
               prefixSum[i]=(i>0)?prefixSum[i-1]+nums[i]:nums[i];
           }
       }
       
       public int sumRange(int left, int right) {
           if(left==0)
           return prefixSum[right];
           return prefixSum[right]-prefixSum[left-1];
       }
   }

    
    public static void main(String[] args) {
        //code
    }
}
