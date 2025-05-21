class Solution{
    public int fib(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
           int first_element=0;
            int second_element=1;
            for(int i=1;i<=n;i++){
                int third_element=first_element+second_element;
                first_element=second_element;
                second_element=third_element;
            }
            return first_element;
        }
    }
}