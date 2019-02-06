import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(value= RetentionPolicy.RUNTIME)
@Target(value=ElementType.TYPE)

public @interface SaveTo {
	String path();
}
