import java.util.ArrayList;

public class Runner
{
    public static void main(String args[])
    {

        //--------------------------------
        ArrayList<Integer> numList = new ArrayList<Integer>();
        // numList empty: []

        numList.add(3);      //numList: [3]

        numList.add(0, 6);  //numList: [6, 3]

        numList.add(7); // [6, 7, 3]

        numList.add(2, 8); // [6, 7, 8, 3]

        numList.remove(3);
        numList.add(9); //[6, 7, 8, 3]

        numList.add(1, 2);  //[6, 2, 7, 8, 3]

        numList.add(1, numList.size()); //[6, 5, 2, 7, 8, 3]

        numList.remove(4); //[6, 5, 2, 7, 3]

        numList.set(4, 0);

        System.out.println(numList);



    }
}
