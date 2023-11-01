package One_Dimensional_Array;
public class Search_Array {

    public static void main(String []args){
        

        // ********************  Insertion in Array ***************************************
        Search_Array iin = new Search_Array(10);
        System.out.println("************* Array Insertion ****************************");
        iin.insert(0,0);
        iin.insert(3,45);
        iin.insert(2,8);
        iin.insert(1,88);
        iin.insert(0,23);
        iin.insert(13,88);
        System.out.println("************* Array Insertion End****************************");


        
        // ********************  Insertion in Array End ***************************************
        
        // ********************  Accessing Element ***************************************
        System.out.println("************* Accessing Element ****************************");
        var firstElement = iin.arr[0];
        System.out.println(firstElement);
        
        var thirdElement = iin.arr[1];
        System.out.println(thirdElement);
        var secondElement = iin.arr[2];
        System.out.println(secondElement);
        
        System.out.println("************* Accessing Element End****************************");
   
        
        // ********************  Accessing Element End***************************************  


        // ************* Array Traversal ****************************

        System.out.println("************* Array Traversal ****************************");
        iin.traverseArray();
        System.out.println("************* Array Traversal End****************************");
     
        // ************* Array Traversal End****************************

        // ************* Array Search Elemnet ***************************

        System.out.println("************* Array Search ****************************");
        iin.SearchInArray(20);
        iin.SearchInArray(8);
        System.out.println("************* Array Search End****************************");



        // ************* Array Search Elemnt  End****************************

    }

    // ********************  Insertion in Array ***************************************
    int arr[] = null;
    public Search_Array(int sizeOfArray){
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
    

    // ************* Array Traversal ****************************
    public void traverseArray(){
        try{
            for (int i=0; i<arr.length; i++)
            {
                System.out.println(arr[i]);
            }
        }
        catch(Exception e)
        {
            System.out.println("Array no longer exists!");
        }
    }
    // ************* Array Traversal End****************************

    // ************* Array Search Elemnet ***************************
    public void SearchInArray(int valueToSearch){
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == valueToSearch){
               System.out.println("Value is found at the index of "+ i);
               return;
            }
        }
         System.out.println(valueToSearch + " is not found in the Array");
    }

    // ************* Array Search Elemnt  End****************************


    
}
