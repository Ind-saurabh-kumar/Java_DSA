public class sum_of_digits {
    public static void main(String []args)
    {
        sum_of_digits recursion = new sum_of_digits();

        var rec = recursion.sod(99);
        System.out.println(rec);

    }

    public int sod(int n){
        if(n<0 || n==0 ){
            return 0;
        }

        return n%10 + sod(n/10);
    }
    
}
