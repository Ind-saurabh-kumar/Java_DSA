public class GCD_Gratest_Common_Divisor {
    public static void main(String []args){

        GCD_Gratest_Common_Divisor recursion = new GCD_Gratest_Common_Divisor();
        var rec =recursion.GCD(10,20);
        System.out.println(rec);

    }
     

    public int GCD(int first, int second){
         if(second==0){
            return first;
        }
        if(first==0 || second==0)
        {
            return -1;
        }
       
        return GCD(second, first%second);
    }

    
}
