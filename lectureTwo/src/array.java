public class array {
    public static void main(String[] args)  {
      System.out.println("Demo arrays with different data types.");


      //declare a 1d array with int, double, and string types (array capacity 5)

      String strings[] = new String [5];            //String is a reference type becauses its referencing the object 
      strings[0] = "name";                         //assigning the value of index 0 in the strings array to string "name" 
      
      for(int i =0; i < strings.length; i++) {          //goes through each index of a 1D array

        System.out.println(strings[i]);

      }

      //default value for a string array: null
      //default value for a double array: 0.0
      //default value for a boolean array: false
      //default value for int array: 0
      
//____________________________________________________________________________________________________________________________

      //declare a 2d array with int and string types (3 rows and 5 columns)
      String twoD [][] = new String [4][2];  // [number of rows] [number of columns]

      int arr [][] = { {1,2}, {3,4}, {5,6}, {7,8}}; // every {_,_,_} are number of columns and number of {} are numbers of rows

      //sequentially access a 2D array row to column

      for(int row = 0; row < arr.length; row++)
        for (int column = 0; column < arr[row].length; column++) 
            System.out.println(arr[row][column]);



      //sequentially access a 2D array column to row

      for(int column = 0; column < arr[0].length; column++)
        for (int row = 0; row < arr.length; row++) 
            System.out.println(arr[row][column]);

      //declare a 2d array with int and string types (3 rows and 5 columns)

      



        
    }
}
