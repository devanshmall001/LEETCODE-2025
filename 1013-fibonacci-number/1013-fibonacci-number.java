class Solution{
    public int fib(int num){
        if(num==0){
            return 0;
        }
        else if(num==1){
            return 1;
        }
        int first_term=0;
        int second_term=1;
        for(int i=1;i<=num;i++){
            int third_term=first_term+second_term;
            first_term=second_term;
            second_term=third_term;
        }
        return first_term;
    }
}