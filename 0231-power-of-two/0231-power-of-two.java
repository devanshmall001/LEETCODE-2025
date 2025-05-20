class Solution{
    public boolean isPowerOfTwo(int num){
        if(num<1){
            return false;
        }
        else if(num==1){
            return true;
        }
        else{
                while(num%2==0){
                    num=num/2;
                }
                if(num==1){
                    return true;
                }
                else{
                    return false;
                }
        }
    }
}