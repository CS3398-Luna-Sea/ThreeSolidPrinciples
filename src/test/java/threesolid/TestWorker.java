package threesolid;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {
	private Worker w = new Worker();
	@Test
	@DisplayName("Work Method Test")
	public void testWorkMethod()
	{
		assertEquals("I'm working already!", w.workString(), "Mismatch between test text and method text");
	}


	@Test
	@DisplayName("Stop Working Method Test")
	public void newtestZSWorkerPass() {
		assertEquals("I am no longer working. Whew.", w.stopWorking(), "Worker should stop working.");
	}
	@Test
	@DisplayName("Keep Working Method Test")
	public void newtestZSWorkerFail() {
	       assertEquals("I'm still working...", w.keepWorking(), "Worker should keep working.");
	}


	@Test
	@DisplayName("Stop Working Method Test assertNotEquals")
	public void newtestMAWorkerPass() {
		assertNotEquals("Hey, hey ,hey!", w.stopWorking(), "Worker should return differently.");
	}

	@Test
	@DisplayName("Keep Working Method Test assertNotEquals")
	public void newtestMAWorkerFail() {
		assertNotEquals("I don't want to! I quit!", w.keepWorking(), "Worker should return differently.");
	}
}
