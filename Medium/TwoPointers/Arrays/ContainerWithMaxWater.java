package Medium.Arrays;

public class ContainerWithMaxWater {
    public static int maxArea(int[] heights){

        int left = 0, right = heights.length-1, maxWater = 0;

        while(left < right){
            int h = Math.min(heights[left], heights[right]);
            int width = right - left;
            int area = h * width;
            maxWater = Math.max(maxWater, area);
            if(heights[left] < heights[right]) left++;
            else right--;
        }
 
        return maxWater;
    }

    public static void main(String[] args){
        int[] heights = {1,3,2,6,8,5};
        System.out.println(maxArea(heights));
    }
}
