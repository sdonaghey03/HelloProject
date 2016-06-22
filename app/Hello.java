package app;
import employee_stuff.*;

import java.util.ArrayList;

/**
 * Created by stephendo on 20/06/2016.
 */
public class Hello {

    public static void main(String args[]) {

        Employee a = new Employee(1, 50000, "A. Smith");
        Employee b = new Employee(2, 50000, "B. Jones");
        Employee c = new Employee(3, 50000, "C. Doe");
        Employee d = new Employee(4, 50000, "D. Wong");

        String s = "Hello World";
        ArrayList<Employee> emps = new ArrayList<Employee>();
        emps.add(a);
        emps.add(b);
        emps.add(c);
        emps.add(d);

        for(Object x : emps) {
            Employee e = (Employee) x;
            System.out.println(e.getName() + " earns " + e.calcPay());
        }
    }
}
