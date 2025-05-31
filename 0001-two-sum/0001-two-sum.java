class Solution{
    public int [] twoSum(int arr[], int target){
        int ar[]=new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    ar[0]=i;
                    ar[1]=j;
                    break;
                }
            }
        }
        return ar;
    }
}