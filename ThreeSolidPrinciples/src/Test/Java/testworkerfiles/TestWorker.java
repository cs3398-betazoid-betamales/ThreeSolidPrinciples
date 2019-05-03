package threesolid;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestWorker {
 private Worker w = new Worker();
 
 @Test
 @DisplayName("Work Method Test")
 public void testWorkMethod() {

  ByteArrayOutputStream baos = new ByteArrayOutputStream();
  PrintStream ps = new PrintStream(baos);
  PrintStream old = System.out;
  System.setOut(ps);
  w.work();
  System.out.flush();
  System.setOut(old);
  assertEquals(baos.toString(),"I likuh do da chacha\n");
 }

 
}