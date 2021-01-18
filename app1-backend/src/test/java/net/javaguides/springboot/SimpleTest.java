package net.javaguides.springboot;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.fail;
import net.javaguides.springboot.annotations.GetTestCaseAnnotations;
import net.javaguides.springboot.annotations.TestCaseId;
@SpringBootTest
public class SimpleTest {
	@Test
        @TestCaseId("TC-102")
        public void test(){
            SimpleTest ob = new SimpleTest();
	    GetTestCaseAnnotations anno=new GetTestCaseAnnotations();
            anno.getValue(ob, "test");
            fail("Failing for experimentation");
        }
}
