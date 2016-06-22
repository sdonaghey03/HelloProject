package employee_stuff;

/**
 * Created by stephendo on 21/06/2016.
 */
public class BadNumber extends Exception {
    public BadNumber() {

    }

    public BadNumber(String message) {
        super(message);
    }

    public BadNumber(Throwable cause) {
        super(cause);
    }

    public BadNumber(String message, Throwable cause) {
        super(message, cause);
    }
}
