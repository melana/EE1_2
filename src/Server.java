import java.lang.reflect.Method;
import java.lang.annotation.*;

public class Server {
	public static void main(String[] args) {
	
	try {
		
		TextContainer txtC = new  TextContainer();
		
		Class<?> t = txtC.getClass();
		
		SaveTo t1 = t.getAnnotation(SaveTo.class);

		Method[] methods = t.getDeclaredMethods();

		for (Method m : methods) {

			if (m.isAnnotationPresent(Saver.class)) {
	
				m.invoke(txtC, t1.path());
	
			}
		}
		
	} catch (Exception ex) {
		
		ex.printStackTrace();

	}
	}
	
}
