package Lista.Estudiantes.com.co.Exception;

public class ExceptionsExistingStudent extends RuntimeException{

    public static final long serialVersionUID = 2134564329876491763L;

    public ExceptionsExistingStudent(String message, Throwable cause){
        super(message, cause);
    }

    public ExceptionsExistingStudent(String message){
        super(message);
    }

}
