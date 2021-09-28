package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MyCustomStringTest {

    private MyCustomStringInterface mycustomstring;

    @Before
    public void setUp() {
        mycustomstring = new MyCustomString();
    }

    @After
    public void tearDown() {
        mycustomstring = null;
    }

    //testCountNumbers
    
    @Test
    public void testCountNumbers1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals(7, mycustomstring.countNumbers());
    }

    @Test (expected = NullPointerException.class)
    public void testCountNumbers2() {
        mycustomstring.setString(null);
        mycustomstring.countNumbers();
    }

    @Test
    public void testCountNumbers3() {
        mycustomstring.setString("There is 1 apple and two bananas on the table.");
        assertEquals(1, mycustomstring.countNumbers());
    }

    @Test
    public void testCountNumbers4() {
        mycustomstring.setString("Today is Sept 27th and Torrow is 28th");
        assertEquals(2, mycustomstring.countNumbers());
    }

    @Test
    public void testCountNumbers5() {
        mycustomstring.setString("Today is rain.");
        assertEquals(0, mycustomstring.countNumbers());
    }

    @Test
    public void testCountNumbers6() {
        mycustomstring.setString("test: 0 1 2 3");
        assertEquals(4, mycustomstring.countNumbers());
    }

    //testGetEveryNthCharacterFromBeginningOrEnd
    
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("d33p md1  i51,it", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd2() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("'bt t0 6snh r6rh", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }

    @Test(expected = NullPointerException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd3() {
    	mycustomstring.setString(null);
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3,true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd4() {
    	mycustomstring.setString("HELLO");
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(-1, true);
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd5() {
    	mycustomstring.setString("GOOD LUCK FOR YOU");
        assertEquals("OLKOY", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd6() {
    	mycustomstring.setString("GOOD LUCK FOR ME");
        assertEquals("OUO", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(5, true));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd7() {
    	mycustomstring.setString("GOOD LUCK FOR EVERYONE");
        assertEquals("GOOD LUCK FOR EVERYONE", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, true));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd8() {
    	mycustomstring.setString("GOOD LUCK FOR EVERYONE");
        assertEquals("GOOD LUCK FOR EVERYONE", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd9() {
    	mycustomstring.setString("1234567890");
        assertEquals("369", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd10() {
    	mycustomstring.setString("1234567890");
        assertEquals("258", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd11() {
    	mycustomstring.setString("1/2/3/4");
        assertEquals("////", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, true));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd12() {
    	mycustomstring.setString("1/2/3/4");
        assertEquals("////", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd13() {
    	mycustomstring.setString("2021/09/27");
        assertEquals("/7", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(5, true));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd14() {
    	mycustomstring.setString("2021/09/27");
        assertEquals("20", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(5, false));
    }

    //testConverDigitsToNamesInSubstring
    
    @Test
    public void testConvertDigitsToNamesInSubstring1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(17, 23);
        assertEquals("I'd b3tt3r put sZerome dOneSix1ts in this 5tr1n6, right?", mycustomstring.getString());
    }

    @Test (expected = NullPointerException.class)
    public void testConvertDigitsToNamesInSubstring2() {
    	mycustomstring.setString(null);
    	mycustomstring.convertDigitsToNamesInSubstring(1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertDigitsToNamesInSubstring3() {
    	mycustomstring.setString("IllegealArgumentException");
    	mycustomstring.convertDigitsToNamesInSubstring(2, 1);
    }

    @Test(expected = MyIndexOutOfBoundsException.class)
    public void testConvertDigitsToNamesInSubstring4() {
    	mycustomstring.setString("IllegealArgumentException");
    	mycustomstring.convertDigitsToNamesInSubstring(99, 100);;
    }

    @Test 
    public void testConvertDigitsToNamesInSubstring5() {
        mycustomstring.setString("1234");
        mycustomstring.convertDigitsToNamesInSubstring(1, 4);
        assertEquals("OneTwoThreeFour", mycustomstring.getString());;
    }

    @Test
    public void testConvertDigitsToNamesInSubstring6() {
        mycustomstring.setString("GOOD LUCK");
        mycustomstring.convertDigitsToNamesInSubstring(1, 9);
        assertEquals("GOOD LUCK", mycustomstring.getString());;
    }

    @Test
    public void testConvertDigitsToNamesInSubstring7() {
        mycustomstring.setString("Today is 09/27/2021");
        mycustomstring.convertDigitsToNamesInSubstring(10, 11);
        assertEquals("Today is ZeroNine/27/2021", mycustomstring.getString());;
    }

    @Test
    public void testConvertDigitsToNamesInSubstring8() {
        mycustomstring.setString("123456789");
        mycustomstring.convertDigitsToNamesInSubstring(3, 5);
        assertEquals("12Three4Five6789", mycustomstring.getString());;
    }

}
