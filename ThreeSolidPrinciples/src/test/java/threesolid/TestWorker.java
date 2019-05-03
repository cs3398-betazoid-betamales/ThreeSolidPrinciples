
package threesolid;//testworkerfiles;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.*;
public class TestWorker {
 private Worker w = new Worker();
 private Robot r = new Robot();
 private Manager m = new Manager();

 @Test
 @DisplayName("Null Manager")
 public void testManagerNull()
 {
	assertNull(m);

  }

  @Test
  @DisplayName("Robot Workin ")
  public void testRobot()
  {
 	ByteArrayOutputStream baos = new ByteArrayOutputStream();
 	PrintStream ps = new PrintStream(baos);
 	PrintStream old = System.out;
 	System.setOut(ps);
 	r.reboot();
 	System.out.flush();
 	System.setOut(old);
    System.out.println(baos.toString());
  	assertEquals(baos.toString(),"Beep Boop Bup\n");
  }

}
