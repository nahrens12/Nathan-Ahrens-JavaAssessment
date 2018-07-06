import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OfflineExercisesTest {


    @Test
    @Ignore
    public void  testDoubleChar()

    {
        //string a = "the"
        String s1 = "The";
        //add one to each character

       // print out each character twice
//        assertEquals(r);


    }
@Test
    public void testSandwich()
{
    String input = "";
    input.split("");
    assertEquals("", input.substring(4,6));


}

@Test
public void testSpaced()
{
    OfflineExcersises offlineExercises = new OfflineExcersises();

    {

        assertEquals(true, offlineExercises.evenlySpaced(2,4,6));
        assertEquals(true, offlineExercises.evenlySpaced(4,6,2));
        assertEquals(false, offlineExercises.evenlySpaced(4,6,3));

    }

}

    @Test
    public void testNTwice()
    {
        OfflineExcersises offlineExercises = new OfflineExcersises();

        {

//            assertEquals(true, offlineExercises.evenlySpaced(ly));


        }

    }
    @Test
    public void testEndsly()
    {
        OfflineExcersises offlineExercises = new OfflineExcersises();

        {

            String input = "oddly";
            if(input.contains("ly"));
            assertEquals(false, offlineExercises.endslyMethod("oddly"));


        }

    }


    public void testStringClean()
    {
        OfflineExcersises offlineExercises = new OfflineExcersises();

        {

            String input = "";
//            input.matches("");
//            input.contains(s);



        }

    }



}
