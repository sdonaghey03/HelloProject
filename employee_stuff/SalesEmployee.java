package employee_stuff;

/**
 * Created by stephendo on 20/06/2016.
 */
public class SalesEmployee extends Employee {

    private float commissionRate;
    private float salesTotal;

    public SalesEmployee() { super(); }

    public SalesEmployee(int newNumber) {
        super(newNumber);
    }

    public SalesEmployee(int newNumber, String newName) {
        super(newNumber, newName);
    }

    public SalesEmployee(int newNumber, String newName, float newCR) {
        super(newNumber, newName);
        setCommissionRate(newCR);
    }

    public float getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(float commissionRate) {
        this.commissionRate = commissionRate;
    }

    public float getSalesTotal() {
        return salesTotal;
    }

    public void setSalesTotal(float salesTotal) {
        this.salesTotal = salesTotal;
    }

    @Override
    public float calcPay() {
        return super.calcPay() + (commissionRate * salesTotal);
    }
}
