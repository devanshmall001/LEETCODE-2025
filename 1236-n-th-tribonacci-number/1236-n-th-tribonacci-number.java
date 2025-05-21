class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1 || n==2){
            return 1;
        }
        else{
            int first_element=0;
            int second_element=1;
            int third_element=1;
            int fourth_element=0;
            for(int i=3;i<=n;i++){
                fourth_element=first_element+second_element+third_element;
                first_element=second_element;
                second_element=third_element;
                third_element=fourth_element;

            }
            return fourth_element;
        }
    }
}