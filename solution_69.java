/*
    IDEA 1:
    --------------------------------------
    the idea is to loop through integers i smaller than tagert integer x,
    and then compare i square with x,
    next step is to judge if integer i is equal to x; 
    yes --> return i
    no --> increase i
    otherwise end loop --> i square larger than x, so do trucating by decreasing i by 1;
    --------------------------------------
    class Solution{
    public int mySqrt(int x) {
        int i = 0;
        while(i*i <= x){
            if(i*i == x ){
                return i;
            }else{
                i++;
            }
        }
        return i-1;
            

        
    }
}
    --------------------------------------
    it turns out this solution gonna be run  out of the time for large integers --> fail.
  
    IDEA 2:
    --------------------------------------
    the basic idea to solve time limit is using binary search
    
    --
    notes: here we need use long type , otherwise it gonna fail
    
    ---------------------------------------
    3ms solution :
    ---------------
    class Solution {
    public int mySqrt(int x) {
        long start = 0, end = x;
        while(start + 1 < end){
            long mid = start + (end - start) / 2;
            if(mid * mid == x){
                return (int)mid;
            }else if(mid * mid < x){
                start = mid;
            }else{
                end = mid;
            }
        }
        if(end*end <= x){
            return (int)end;
        }else{
            return (int)start;
        }
        
    }
}
  
*/

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
}class Solution{
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
