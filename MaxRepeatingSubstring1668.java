public class MaxRepeatingSubstring1668 {
    
        public int maxRepeating(String sequence, String word) {
            int count=0;
            StringBuilder str = new StringBuilder();
    
            str.append(word);
            while(sequence.contains(str)){
                count++;
                str.append(word);
            }
    
            return count;
        }
    }

