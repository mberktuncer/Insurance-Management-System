package insurance;

import java.util.Date;

public class ResidenceInsurance extends Insurance{
    public ResidenceInsurance(String name, double price, Date insuranceStartDate, Date insuranceFinishDate) {
        super(name, price, insuranceStartDate, insuranceFinishDate);
    }

    @Override
    public void calculate() {

    }
}
