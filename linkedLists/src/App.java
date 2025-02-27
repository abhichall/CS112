import java.util.Iterator;
import java.util.LinkedList;

public class App {

    public static void main (String[] args) {   //public means its accessible, void means it doesnt return anything and its just where the code starts

        LinkedList linky = new LinkedList<>();   //this is how you initialize a basic linked list


        //to initialize a linked list to a specific data type, use this format
            // LinkedList<String> linky = new LinkedList<String>();
                //cant put primative types in <> -- so instead of int, put Integer

        //if you want to add to the linked list
        //prints in top to bottom order
        linky.add(2);
        linky.add(3);
        linky.add(88);
        linky.add(23);

        //if you want to remove a value
        linky.remove(); //removes from the front of the list

        linky.clear(); //removes all values from the list

        //many possibly things to be done - just do linky.______ they will show up in dropdown

        System.out.println(linky); //printing values of list

        //when there are millions of items in a list, and we need to find one specific value; we have to use an iterator

        Iterator it = linky.iterator();  //initializes the iterator and uses the linkedlist specific one

        // to use an interator, we usually have to throw in a while loop so

        while (it.hasNext()) {  //this is saying, while the iterator has a value after the current value in the list
            if((int) it.next() == 88) {
                System.out.println("We found 88");
                
            }
        }
        
        
        



    }

}
