class Solution{
    public int hammingWeight(int n){
        int count=0;
        int mask=1;
        for(int i=0;i<32;i++){
            if((n&mask)!=0){
                count+=1;
            }
            mask<<=1;
        }
        return count;
    }
}