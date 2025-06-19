class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high;
        int max=piles[0];
        for(int i=1;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        high=max;
        long ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            long hr=0;
            for(int i=0;i<piles.length;i++){
                hr=hr+(int)Math.ceil(piles[i]*1.0/mid);
            }
            if(hr<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return (int)ans;
    }
}