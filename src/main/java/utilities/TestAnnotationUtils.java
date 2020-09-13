package utilities;

import static java.lang.annotation.ElementType.METHOD;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Optional;

public final class TestAnnotationUtils {

    private TestAnnotationUtils () throws InvocationTargetException{
        throw new InvocationTargetException(new Throwable());
    }

    @Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @Target(METHOD)
    public @interface TestAnnotation {
        String value();
    }
    public static String getTestName (Method method){
        return Optional.of(method).map(m -> m.getDeclaredAnnotation(TestAnnotation.class)).map(TestAnnotation::value).orElse(method.getName());
    }


}
