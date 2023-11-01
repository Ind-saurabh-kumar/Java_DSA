public class Decimal_to_Binary {
    public static void main(String []args){

        Decimal_to_Binary recursion = new Decimal_to_Binary();
        var result = recursion.dtb(23);
        System.out.println(result);

        

    }
    

    public int dtb(int n){

        if(n<0)
        {
            return -1;  // error condition, not a valid decimal number
        }
        if(n==0)
        {
            return 0;
        }
        return n%2+ 10*dtb(n/2);
    }
}
