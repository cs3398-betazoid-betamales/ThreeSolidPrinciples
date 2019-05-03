package threesolid;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestWorker {
 private Worker w = new Worker();

 @Test
 @DisplayName("Eat Method Test")
 public void newtestCWWorkerPass() {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	PrintStream ps = new PrintStream(baos);
	PrintStream old = System.out;
	System.setOut(ps);
	w.eat();
	System.out.flush();
    System.setOut(old);
    assertNotEquals(baos.toString(), "Yum yum!");
 }

 @Test
 @DisplayName("Test Sick Method")
 public void newTestCWWorkerFail() {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	PrintStream ps = new PrintStream(baos);
	PrintStream old = System.out;
	System.setOut(ps);
	w.eat();
	System.out.flush();
    System.setOut(old);
    assertEquals(baos.toString(), "I'm sick!!!");
 }
}