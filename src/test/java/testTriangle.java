import hello.codeTriangle;
import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;


public class testTriangle {
    @Test
    public void testIsTriangle(){
        assertEquals(false,new codeTriangle().isTriangle(1,2,3));
        assertEquals(true,new codeTriangle().isTriangle(1,2,2));
        assertEquals(true,new codeTriangle().isTriangle(3,4,5));
        assertEquals(false,new codeTriangle().isTriangle(0,1,9));
    }

    @Test
    public void testIsAT(){
        assertEquals(false,new codeTriangle().isAT(1,2,3));
        assertEquals(false,new codeTriangle().isAT(1,0,3));
        assertEquals(true,new codeTriangle().isAT(4,5,3));
        assertEquals(true,new codeTriangle().isAT(5,12,13));
    }
}