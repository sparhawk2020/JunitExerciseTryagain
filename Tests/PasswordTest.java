import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {


    Password pass;
    int y;


    @BeforeEach
    public void initEach(){

        //   ByteArrayInputStream in = new ByteArrayInputStream("John\n35".getBytes());
        // System.setIn(in);
        pass = new Password();




    }

    @Test
    void upper() {

        y = pass.upper("Hello");
        assertEquals(1, y);

    }


    void testUpper() {
    }

    @Test
    void lower() {

        y = pass.lower("Hello");
        assertEquals(4, y);

    }



    @Test
    void digit() {

        y = pass.digit("Hello1");
        assertEquals(1, y);

    }


    @Test
    void checkpassinvalid() throws UnsupportedEncodingException {



        PrintStream standardOut = System.out;
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        boolean t = pass.checkpass("HelKRl1!");

        Assert.assertTrue(new String(outputStreamCaptor.toByteArray(), "UTF-8").contains("Invalid password"));

        System.setOut(standardOut);


        assertEquals(t, false);

    }


    @Test
    void checkpassvalid() throws UnsupportedEncodingException {



        PrintStream standardOut = System.out;
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        boolean t = pass.checkpass("HelKRlo1!");

        Assert.assertTrue(new String(outputStreamCaptor.toByteArray(), "UTF-8").contains("Valid password"));

        System.setOut(standardOut);


        assertEquals(t, true);

    }


    @Test
    void le() {

        y = pass.lengthof("Hello1");
        assertEquals(6, y);

    }


    @Test
    void sp() {

        boolean r = pass.sc("Hello1!");
        assertEquals(true, r);

    }
}

