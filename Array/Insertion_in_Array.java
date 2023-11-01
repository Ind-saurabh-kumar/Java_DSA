public class Insertion_in_Array {
    public static void main(String []args){

        Insertion_in_Array iin = new Insertion_in_Array(10);

        iin.insert(0,0);
        iin.insert(3,45);
        iin.insert(2,8);
        iin.insert(1,88);
        iin.insert(0,23);
        iin.insert(13,88);
        iin.insert(4,65);
        
        
        


    }
    int arr[] = null;
    public Insertion_in_Array(int sizeOfArray){
        arr = new int[sizeOfArray];
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToBeInserted){
        try
        {
            if(arr[location] == Integer.MIN_VALUE)
            {
                arr[location] = valueToBeInserted;
                System.out.println("successfully inserted");
            }
            else
            {
                System.out.println("This cell is already occupied");
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid index to access array!");
        }
    }
}
