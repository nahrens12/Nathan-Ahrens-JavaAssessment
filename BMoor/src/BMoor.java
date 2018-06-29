import java.util.ArrayList;
import java.util.Scanner;

public class BMoor {

   static ArrayList<Compass> Di;

    public static void main(String[] args) {



        // ArrayList Storing the meters being walked
        //wasn't able to print information within the array
        // so I done it manually using the system.output
        // didn't know how exactly I did after deleting my main class.
        Di = new ArrayList<>();
        Di.add(new North(5, "N"));
        Di.add(new North(4.472, "N"));
        Di.add(new East(5, "E"));

        Scanner sc = new Scanner(System.in);
     //Type in look to see whats outside
      Scanner my = new Scanner(System.in);
      String input = my.nextLine();
        System.out.println ("Grey foggy clouds float oppressively close to you" +
        "reflected in the murky grey water which reaches up your shins" +
        "Some black plants barely poke out of the shallow water.");


        System.out.println("Try north, south, east ,or west");
      //  Scanner mySc = new Scanner(System.in);
        String direction = sc.nextLine();
        System.out.println("try another position");

       String meters;



// insert direction to get compass first instructions
// only takes the first position and loops, doesn't move to the next position
        for (int i = 0; i<100; i++) {


            System.out.println("North:" + 80/2 + "m");
            meters = sc.nextLine();

            if ( meters == "Direction") {

                System.out.println("\"North:\" + 4.472 + \"m\"");

            }

                if(meters == "Direction"){

                    System.out.println("Direction" + Di.get(i).getClass().getSimpleName());

                }

                if(meters == "north")
                {
                    System.out.println("Direction" + Di.get(i).getClass().getSimpleName());
                }


        }
    }



// this linked to the array, but wasnt printing out the right value
//    public int compassDir() {
//        float result = result - 0.3;
//        for (int i = 0; i < Di.size(); i++) {
//            if (Di.get(i).getClass().getSimpleName() == "North") {
//                return result;
//            }
//            if (Di.get(i).getClass().getSimpleName() == "North") {
//                return result;
//            }
//            if (Di.get(i).getClass().getSimpleName() == "North") {
//                return result;
//            } else {
//                System.out.println("YOUR LOST");
//            }
//
//
//        }
//
//        return 0;
//    }
//


}