package insurance;

import java.util.Date;

public abstract class Insurance {

    private String name;
    private double price;
    private Date insuranceStartDate;
    private Date insuranceFinishDate;

    public Insurance(String name, double price, Date insuranceStartDate, Date insuranceFinishDate) {
        this.name = name;
        this.price = price;
        this.insuranceStartDate = insuranceStartDate;
        this.insuranceFinishDate = insuranceFinishDate;
    }

    public abstract void calculate();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getInsuranceStartDate() {
        return insuranceStartDate;
    }

    public void setInsuranceStartDate(Date insuranceStartDate) {
        this.insuranceStartDate = insuranceStartDate;
    }

    public Date getInsuranceFinishDate() {
        return insuranceFinishDate;
    }

    public void setInsuranceFinishDate(Date insuranceFinishDate) {
        this.insuranceFinishDate = insuranceFinishDate;
    }
}
