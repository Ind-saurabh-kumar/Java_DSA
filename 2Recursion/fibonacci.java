public class fibonacci {
    public static void main(String []args){

        fibonacci recursion = new fibonacci();

        var rec = recursion.fibo(4);
        System.out.println(rec);

    }

    public int fibo(int n){
         if(n<0)
        {
            return -1;
        }
        if(n==0 || n==1)
        {
            return n;
        }
       
        return fibo(n-1) + fibo(n-2);
    }
    
}
