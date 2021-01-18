package net.javaguides.springboot;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import net.javaguides.springboot.annotations.GetTestCaseAnnotations;
import net.javaguides.springboot.annotations.TestCaseId;

import static org.junit.Assert.fail;
@SpringBootTest
public class ControllerTest {
	@Test
	@TestCaseId("TC-101")
	public void test(){
	    ControllerTest ob = new ControllerTest();
	    GetTestCaseAnnotations anno=new GetTestCaseAnnotations();
        anno.getValue(ob, "test");
		fail("Not yet implemented");
	  }
}
