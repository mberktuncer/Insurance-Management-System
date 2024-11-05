package insurance;

import java.util.Date;

public class TravelInsurance extends Insurance{
    public TravelInsurance(String name, double price, Date insuranceStartDate, Date insuranceFinishDate) {
        super(name, price, insuranceStartDate, insuranceFinishDate);
    }

    @Override
    public void calculate() {

    }
}
