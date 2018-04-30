package sk.akademiasovy.projectunittest;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyClassTest {
    MyClass myclass = new MyClass();
    @Test
    public void max() {

        assertEquals(myclass.max(6, 4, 2), 6);
        assertEquals(myclass.max(5, 5, 5), 5);
        assertEquals(myclass.max(4, 8, 2), 8);
        assertEquals(myclass.max(4, 5, 9), 9);
        assertEquals(myclass.max(0, 0, 0), 0);
        assertEquals(myclass.max(10, 11, 12), 12);
        assertEquals(myclass.max(99, 100, 500), 500);
        assertEquals(myclass.max(9999999, 999999, 99999999), 99999999);
                        }
        @Test
        public void reverse () throws Exception
        {
            assertEquals(myclass.Reverse("abba"),"abba");
            assertEquals(myclass.Reverse("Abba"),"Abba");



        }

    @Test
    public void testIpAddress()
    {

        assertEquals(myclass.ipAddress("192.168.1.1"), true);
        assertEquals(myclass.ipAddress("192.168.1.1.2"), false);

    }

}