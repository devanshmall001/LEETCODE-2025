class Solution{
    public int tribonacci(int num){
        if(num==0){
            return 0;
        }
        else if(num==1 || num==2){
            return 1;
        }
        else{
            int first_number=0;
            int second_number=1;
            int third_number=1;
            int fourth_number=0;
            for(int i=3;i<=num;i++){
                fourth_number=first_number+second_number+third_number;
                first_number=second_number;
                second_number=third_number;
                third_number=fourth_number;
            }
            return fourth_number;
        }
    }
}