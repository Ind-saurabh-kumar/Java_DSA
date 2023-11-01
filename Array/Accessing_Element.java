public class Accessing_Element {
    
    public static void main(String []args){
        

        // ********************  Insertion in Array ***************************************
        Accessing_Element iin = new Accessing_Element(10);

        iin.insert(0,0);
        iin.insert(3,45);
        iin.insert(2,8);
        iin.insert(1,88);
        iin.insert(0,23);
        iin.insert(13,88);
        // ********************  Insertion in Array End ***************************************
        
        // ********************  Accessing Element ***************************************
        
        var firstElement = iin.arr[0];
        System.out.println(firstElement);
        var thirdElement = iin.arr[1];
        System.out.println(thirdElement);
        

        // ********************  Accessing Element End***************************************  


    }

    // ********************  Insertion in Array ***************************************
    int arr[] = null;
    public Accessing_Element(int sizeOfArray){
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
    // ******************** Insertion in Array End ***********************************8
    
}
