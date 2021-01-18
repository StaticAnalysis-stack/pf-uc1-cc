package net.javaguides.springboot.annotations;
import java.lang.reflect.Method;
public class GetTestCaseAnnotations {
	public void getValue(Object obj, String method)
	{
		try {
		Class c = obj.getClass();
		
	    Method m;
		m = c.getMethod(method);
        TestCaseId annotation = m.getAnnotation(TestCaseId.class);
		System.out.println(annotation.value());
		}
		catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
}
}
