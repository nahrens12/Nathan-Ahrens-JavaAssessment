import java.util.ArrayList;

public class OfflineExcersises {



    // Given a string, return a string where
    // for every char in the original,
    // there are two chars.
    // doubleChar("The") → "TThhee"
    // doubleChar("AAbb") → "AAAAbbbb"
    // doubleChar("Hi-There") → "HHii--TThheerree"
    public String doubleChar(String input)
        {
            String s1 = " abbacdcc";

            ArrayList<String> s = new ArrayList< String>();
            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < s1.length(); j++) {
                    if (s1.charAt(i) == s1.charAt(j)) {
                        s.add(s1.charAt(i) + ""); }
                }
            }
            for (int j = 0; j < s.size(); j++) {
                for (int i = 0; i < s.size(); i++) {
                    if (i != j) {
                        if (s.get(i).matches(s.get(j))) {
                            s.remove(i);
                            i += 1;
                        }
                    }
                }
            }
            System.out.println(s);
            return "";
        }
        // A sandwich is two pieces of bread with something in between. Return the
        // string that is between the first and last appearance of "bread" in the
        // given string, or return the empty string "" if there are not two pieces
        // of bread.

        // getSandwich("breadjambread") → "jam"
        // getSandwich("xxbreadjambreadyy") → "jam"
        // getSandwich("xxbreadyy") → ""
        // getSandwich("xxbreadhoneybreadyy") → "honey"

        public String getSandwich(String input) {

            System.out.println(input.split("d"));
            System.out.println(input.split("m"));
            System.out.println("=======");
            for(String s:input.split(""))
            {
                System.out.println(s.substring(4,7));
            }


            return "";
        }

        // Given three ints, a b c, one of them is small, one is medium and one is
        // large. Return true if the three values are evenly spaced, so the
        // difference between small and medium is the same as the difference between
        // medium and large.

        // evenlySpaced(2, 4, 6) → true
        // evenlySpaced(4, 6, 2) → true
        // evenlySpaced(4, 6, 3) → false

        public boolean evenlySpaced(int a, int b, int c) {

            if (a == b && b == c) {
                return false;
            }
            if (a == b) {
                return true;
            }
            if (b == c) {
                return false;
            }
            if (a == c) {
                return false;
            }

            return false;
        }

        // Given a string and an int n, return a string made of the first and last n
        // chars from the string. The string length will be at least n.

        // nTwice("Hello", 2) → "Helo"
        // nTwice("Chocolate", 3) → "Choate"
        // nTwice("Chocolate", 1) → "Ce"

        public String nTwice(String input, int a) {
            return "";
        }

        // Given a string, return true if it ends in "ly".

        // endsLy("oddly") → true
        // endsLy("y") → false
        // endsLy("oddy") → false
        // endsLy("l") → false

        public boolean endslyMethod(String input) {


            if (input.contains("ly")) {

                System.out.println("ly");

            }

        return false;
        }

        // Given a string, return recursively a "cleaned" string where adjacent
        // chars that are the same have been reduced to a single char. So "yyzzza"
        // yields "yza".

        // stringClean("yyzzza") → "yza"
        // stringClean("abbbcdd") → "abcd"
        // stringClean("Hello") → "Helo"
        public String stringClean(String input) {

            {
                String s2 = " ";
                ArrayList<String> a = new ArrayList<String>();
                for (int i = 0; i < s2.length(); i++) {
                    for (int j = 0; j < s2.length(); j++) {
                        if (s2.charAt(i) == s2.charAt(j)) {
                            a.add(s2.charAt(i) + "");
                        }
                    }
                }
                for (int j = 0; j < a.size(); j++) {
                    for (int i = 0; i < a.size(); i++) {
                        if (i != j) {
                            if (a.get(i).matches(a.get(j))) {
                                a.remove(i);
                                i -= 1;
                            }
                        }
                    }
                }
                System.out.println(a);
                return "";
            }
            }
        // The fibonacci sequence is a famous bit of mathematics, and it happens to
        // have a recursive definition. The first two values in the sequence are 0
        // and 1 (essentially 2 base cases). Each subsequent value is the sum of the
        // previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13,
        // 21 and so on. Define a recursive fibonacci(n) method that returns the nth
        // fibonacci number, with n=0 representing the start of the sequence.

        // fibonacci(0) → 0
        // fibonacci(1) → 1
        // fibonacci(2) → 1
        // fibonacci(3) → 2
        // fibonacci(4) → 3
        // fibonacci(5) → 5
        // fibonacci(6) → 8
        // fibonacci(25) → 75025

        public int fibonacci(int input)
        {




            return -1;
        }

        // We have a number of bunnies and each bunny has two big floppy ears. We
        // want to compute the total number of ears across all the bunnies
        // recursively (without loops or multiplication).

        // bunnyEars(0) → 0
        // bunnyEars(1) → 2
        // bunnyEars(2) → 4
        // bunnyEars(4) → 8
        // bunnyEars(16) → 32

        public int bunnyEars(int input) {
            return -1;
        }

        // Given a string, return the length of the largest "block" in the string.
        // A block is a run of adjacent chars that are the same.

        // superBlock("jeffbert") → 2
        // superBlock("abbCCCddBBBxx") → 3
        // superBlock("") → 0

        public int superBlock(String str) {
            return -1;

        }

    }










