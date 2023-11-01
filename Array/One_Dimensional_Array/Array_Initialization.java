package One_Dimensional_Array;
import java.util.Arrays;
class Array_Initialization{
    public static void main(String[] args){
        // Array Decleartion
        int[] intArray;
        // Array instantiating
        intArray = new int[5];

        intArray[0]=1;
        intArray[1]=2;
        intArray[2]=3;
        intArray[3]=4;
        intArray[4]=5;
        System.out.println(Arrays.toString(intArray));  
    }
}