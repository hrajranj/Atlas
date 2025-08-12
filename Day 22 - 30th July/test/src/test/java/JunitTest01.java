import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
public class JunitTest01 {
   String message = "hello All How are you";
   @Test
   void testMsg() {
       System.out.println("asserting the Test case ");
   	assertEquals("hello All How are you", message);
   }
}
