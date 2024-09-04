class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int max_area=0;
        int left=0;
        int right=n-1;
        while(left<right){
            int w=right-left;
            int h=Math.min(height[left],height[right]);
            int area=w*h;
            max_area=Math.max(area,max_area);
            if(height[left]<height[right]){
                left+=1;
            }
            else{
                right-=1;
            }
        }
        return max_area;
    }
}
