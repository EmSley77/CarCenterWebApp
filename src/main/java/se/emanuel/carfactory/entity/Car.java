package se.emanuel.carfactory.entity;
//Emanuel sleyman
//2024-03-19
import jakarta.persistence.*;

@Entity
public class Car {
    @Id
    @Column(name = "reg", nullable = false, length = 45)
    private String reg;
    @Basic
    @Column(name = "brand", nullable = false, length = 45)
    private String brand;
    @Basic
    @Column(name = "model", nullable = false, length = 45)
    private String model;
    @Basic
    @Column(name = "color", nullable = false, length = 45)
    private String color;
    @Basic
    @Column(name = "year", nullable = false)
    private Integer year;
    @Basic
    @Column(name = "cost", nullable = false)
    private int cost;


    public Car(String reg, String brand, String model, String color, Integer year, int cost) {
        this.reg = reg;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.cost = cost;
    }

    public Car() {
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (reg != null ? !reg.equals(car.reg) : car.reg != null) return false;
        if (brand != null ? !brand.equals(car.brand) : car.brand != null) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        if (year != null ? !year.equals(car.year) : car.year != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = reg != null ? reg.hashCode() : 0;
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        return result;
    }*/
}
