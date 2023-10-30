public class power {
    public static void main(String []args){
        power recursion = new power();
        var rec = recursion.pow(4,2);
        System.out.println(rec);


    }

    public int pow(int base, int exp){
        if(exp<0){
            return -1;
        }
        if(exp==0 || exp==1){
            return base;
        }

        return base*pow(base,exp-1);
    }
    
}
