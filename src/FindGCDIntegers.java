public class FindGCDIntegers {


    public  int getGCD(int x, int y){
        if(x==0) return y;
        return getGCD(y%x , x);
    }

    public int generalizedGCD(int num, int[] arr)
    {
       int res = arr[0];
       for(int i =0; i< num;i++){
           res = getGCD(arr[i], res);
       }
       if(res ==1){
           return 1;
       }
       return res;
       }
    }
