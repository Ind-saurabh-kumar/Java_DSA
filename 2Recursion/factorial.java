public class factorial{
    public static void main(String args[]){
        // Instance of factorial class or Main class
        factorial recursion = new factorial();
        var rec = recursion.fact(5);
        System.out.println(rec);
    }

    // function for factorial 
    public int fact(int n){
        // uninitial cask check 
        if(n<1){
           return 1;
        }
        // Base case check
        if(n==0 || n==1){
            return 1;
        }
        // find factorila recursion
        return n*fact(n-1);
    }
}