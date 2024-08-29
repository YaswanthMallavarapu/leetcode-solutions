import java.util.ArrayList;
import java.util.List;

public class LongestUnequalAdjacentGroupsSubSequence2900 {
    

    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String>result=new ArrayList<>();
        int n=words.length;
      if(words.length==1){
        result.add(words[0]);
        return result;
      }  
      int prev=groups[0];
      result.add(words[0]);
      for(int i=1;i<n;i++){
        if(groups[i]!=prev){
            result.add(words[i]);
            prev=groups[i]; 
        }
      }
      return result;
    }
}



    

