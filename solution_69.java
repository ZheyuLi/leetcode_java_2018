class Solution{
    public int mySqrt(int x) {
        int low = 0;
        int high = x;
        long ans = 0L;
        while(low <= high ){
            long mid = low + (high -low )/2;
            long  prod = mid *mid ;
            
            if (prod > x ){
                high = (int) mid -1;
            }else{
                low = (int) (mid +1) ;
                ans = mid ;
            }
            
        
        }
        return (int) ans;
            

        
    }
}
