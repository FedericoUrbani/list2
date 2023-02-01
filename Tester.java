import java.sql.Array;
import java.util.*;

public class Tester {

    public static void main(String[] args) {

        List<Integer> divisorsOf52 = new ArrayList(); //generate and fill divisorsof52

        for (int i = 1; i <= 52; i++) {
            if (52 % i == 0) {
                divisorsOf52.add(i);
            }
        }
        List<Integer> randomNumbers = new ArrayList();//generate and fill the array randomnumbers
        randomNumbers.add(1);
        randomNumbers.add(60);
        randomNumbers.add(13);
        randomNumbers.add(12);
        randomNumbers.addAll(divisorsOf52); //append at the end of list
        System.out.println("Elements inside randomNumbers:"+randomNumbers+" - number of elements: "+randomNumbers.size()+"\n----------------------------------------");

        ListIterator <Integer> iterator= randomNumbers.listIterator();
        while (iterator.hasNext()){
            int index= iterator.nextIndex();
            int value= iterator.next();
            for (int i=0; i<index; i++ ){
                if (value == randomNumbers.get(i)){
                    iterator.remove();
                }
            }
        }
        //HashSet hashSetList= new HashSet<>(randomNumbers); // removing duplicates with cast
       System.out.println("Elements inside after removing duplicates:"+randomNumbers+" - size of the list: "+randomNumbers.size()+"\n----------------------------------------");
       Collections.sort(randomNumbers); //sorting
       System.out.println("Elements sorted:"+randomNumbers+"\n----------------------------------------");
    }
}
/**
 * define a testing class with a main() method where you:
 * define a List of integers called divisorsOf52 that contains all the divisors of 52
 * define a List of integers called randomNumbers that contains the following numbers: 1, 60, 13, 12
 * use a specific method of List for appending all the elements of divisorsOf52 at the bottom of randomNumbers
 * print the elements of randomNumbers and the number of items inside randomNumbers
 * find the positions of the duplicates and remove them, leaving just 1 occurrence of a specific integer
 * print again the elements of randomNumbers and the number of items inside randomNumbers
 * sort randomNumbers in descending order using Collections.sort()
 * print again the elements of randomNumbers
 */
