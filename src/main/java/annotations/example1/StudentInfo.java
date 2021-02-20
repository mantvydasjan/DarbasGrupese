package annotations.example1;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Documented //optional
@Retention(RetentionPolicy.RUNTIME) //nurodome kada sita anotacija yra galiojanti
public @interface StudentInfo {
    String studentName();
    String studentAddress();
}