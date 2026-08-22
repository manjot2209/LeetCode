class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n ;
        int digitSum = 0 ;
        int digitProduct = 1 ;

        while(temp>0){
            int digit = temp%10 ;
            digitSum += digit ;
            digitProduct *= digit ;
            temp = temp/10 ;
        }

        if((n%(digitSum + digitProduct)) == 0 ){
            return true ;
        }else{
            return false ;
        }
    }
}