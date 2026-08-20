class Solution {
    public int findMinFibonacciNumbers(int k) {
     List<Integer> fibo = new ArrayList<>();
     fibo.add(1);
     fibo.add(1);

     while(true){
        int c = fibo.get(fibo.size()-1)+fibo.get(fibo.size()-2);
        if(c>k){
            break;
        }
        
            fibo.add(c) ;
        }
        int index = fibo.size() - 1 ;
        int count = 0 ;
        while(k>0){
            if(fibo.get(index) <= k){
                k = k-fibo.get(index);
                count++ ;
            }
            index--;
        }
        return count ;
     
    } 
}  
    
