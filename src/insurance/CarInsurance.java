package insurance;

import java.util.Date;

public class CarInsurance extends Insurance{
    public CarInsurance(String name, double price, Date insuranceStartDate, Date insuranceFinishDate) {
        super(name, price, insuranceStartDate, insuranceFinishDate);
    }

    @Override
    public void calculate() {

    }
}
