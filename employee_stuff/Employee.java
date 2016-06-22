package employee_stuff;

/**
 * Created by stephendo on 20/06/2016.
 */
public class Employee implements IPayable {

    // Private instance variables
    private int number;
    private float salary;
    private String name;
    private float bonus;

    // Static variables
    private final float MIN_SALARY = 7000;

    /**
     * Default Class Constructor
     */
    public Employee() {
        bonus = 250f;
    }

    /**
     * Class Constructor to set the Employee Number
     * @param newNumber Employee Number as an int
     */
    public Employee(int newNumber) {
        this();
        setNumber(newNumber);
    }

    /**
     * Class Constructor to set the Employee Name and Number
     * @param newNumber Employee Number as an int
     * @param newName Employee Name as a String
     */
    public Employee(int newNumber, String newName) {
        this(newNumber);
        setName(newName);
    }

    public Employee(int newNumber, int newSalary, String newName) {
        this(newNumber);
        setName(newName);
        setSalary(newSalary);
    }

    /**
     * This method is used to calculate the Employee Salary
     * @return the Employee Salary as a float
     */
    public float calcPay() {
        return salary / 12;
    }

    public int getNumber() {
        return number;
    }

    public boolean setNumber(int n) {
        if(n > 0) {
            number = n;
            return true;
        }
        return false;
    }

    public boolean setNumber(String thisNumber) throws BadNumber {
        try {
            int i = Integer.parseInt(thisNumber);
            return setNumber(i);
        } catch(NumberFormatException e) {
            throw new BadNumber(e);
        }
    }

    public float getSalary() {
        return salary;
    }

    public boolean setSalary(float s) {
        if(s >= 7000) {
            salary = s;
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public boolean setName(String newName) {
        if(!newName.isEmpty() && !newName.equals(null)) {
            name = newName;
            return true;
        }
        return false;
    }
}
