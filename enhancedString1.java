package algorithms;


import java.util.*;

public class enhancedString1 {
    public static void main(String[] args) {

        // This algorithm return a string as how many character there is.

        String value = "aaabbbbbccdeeefff";    // Simple string to "3a5b2c1d3e3f"

        String key = shortCut(value);
        System.out.println(key);

    }

    public static String shortCut(String value) {

        char[] list = new char[value.length()];                 // for string's characters given by
        ArrayList<String> strings = new ArrayList<String>();    // for adding enhanced object
        int counter = 1;                                        // for counting characters


        for (int i = 0; i < value.length(); i++) {

            list[i] = value.charAt(i);                          // adding string's character in a char array.

        }

        Arrays.sort(list);                                      // if there is mixed chars, then short it!


        for (int i = 0, j = 1; i < list.length; i++, j++) {             // looping 2 elements as i and j, because one is need to go 1 step ahead

            if (i == list.length - 1) {                                 // this condition for last loop, because j will ArrayIndexOutOfBoundsException in else-if.

                strings.add(Integer.toString(counter) + list[i]);
                break;

            } else if (list[i] == list[j]) {                            // if index i equals to index j,

                counter++;                                              // then incrase the counter.

            } else {

                strings.add(Integer.toString(counter) + list[i]);       // return integer counter to string then add it with index i inside to ArrayList.
                counter = 1;

            }
        }

        String key = "";                                  // last process for returning Arraylist to string.

        for (int i = 0; i < strings.size(); i++) {

            key += strings.get(i);

        }
        return key;                                       // return enhanced string.
    }
}
