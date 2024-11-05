package insurance;

import java.util.Date;

public class HealthInsurance extends Insurance{
    public HealthInsurance(String name, double price, Date insuranceStartDate, Date insuranceFinishDate) {
        super(name, price, insuranceStartDate, insuranceFinishDate);
    }

    @Override
    public void calculate() {

    }
}
