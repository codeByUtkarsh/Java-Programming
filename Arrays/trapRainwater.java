public class trapRainwater {
    public static int trappingRainwater(int height[]){
        //calculate leftmax boundary
        int n= height.length;
        int leftmax[]= new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        //calculate Rightmax boundary
        int rightmax[]= new int[n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2 ; i>=0 ;i--){
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }
        
        //loop

        //waterlevel = min(leftmax boundary[],rightmax boundary[])
        //trappedwater = waterlevel - height[i]

        int trapped_water =0;
        for(int i=0 ; i<n ;i++){
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
            trapped_water += waterlevel- height[i];
        }
        return trapped_water;

    }
    public static void main(String args[]){
        int height[] ={4,2,0,6,3,2,5};
        System.out.println("The Amount of water which is going to be tapped in rain is "+ trappingRainwater(height));
    }
}
