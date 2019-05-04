package threesolid;//testworkerfiles;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.*;
public class TestWorker {
 private Worker w = new Worker();
 private SuperWorker sw = new SuperWorker();
 private TempWorker tw = new TempWorker();
 @Test
 @DisplayName("Work Method Test")
 public void testWorkMethod()
 {
	ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
	PrintStream ps1 = new PrintStream(baos1);
	PrintStream old1 = System.out;
	System.setOut(ps1);
	w.work();
	System.out.flush();
	System.setOut(old1);
 	assertEquals(baos1.toString(),"I likuh do da chacha\n","Mismatch between test text and method text");
 }
 @Test
 @DisplayName("newTestT_CWorkerPass")
 public void newTestT_CWorkerPass()
 {
	ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
	PrintStream ps2 = new PrintStream(baos2);
	PrintStream old2 = System.out;
	System.setOut(ps2);
	sw.work();
	System.out.flush();
	System.setOut(old2);
 	assertEquals(baos2.toString(),"TEST\n","Mismatch between test text and method text");

 	ByteArrayOutputStream baos3 = new ByteArrayOutputStream();
	PrintStream ps3 = new PrintStream(baos3);
	PrintStream old3 = System.out;
	System.setOut(ps3);
	tw.work();
	System.out.flush();
	System.setOut(old3);
 	assertEquals(baos3.toString(),baos2.toString(),"Mismatch between test text and method text");
 	
 	assertNotSame(sw, tw);
 	
 	assertTrue(sw instanceof SuperWorker);
 }
}