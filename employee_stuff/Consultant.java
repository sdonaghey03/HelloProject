package employee_stuff;

/**
 * Created by stephendo on 21/06/2016.
 */
public class Consultant implements IPayable {

    private String name;
    private float dailyRate;
    private float daysWorked;

    public Consultant(String name, float dR, float dW) {
        setName(name);
        setDailyRate(dR);
        setDaysWorked(dW);
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

    public float getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(float dailyRate) {
        this.dailyRate = dailyRate;
    }

    public float getDaysWorked() {
        return daysWorked;
    }

    public void setDaysWorked(float daysWorked) {
        this.daysWorked = daysWorked;
    }

    public float calcPay() {
        return daysWorked * dailyRate;
    }
}
