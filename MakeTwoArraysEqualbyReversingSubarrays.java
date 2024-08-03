import java.util.Arrays;

public class MakeTwoArraysEqualbyReversingSubarrays {
    public static void main(String[] args) {
        //code
        //leetcode 1460
    }
    
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=target[i])
                return false;
        }
        return true;
    }
    
}
