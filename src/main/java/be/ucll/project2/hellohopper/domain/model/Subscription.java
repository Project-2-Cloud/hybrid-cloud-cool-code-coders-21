package be.ucll.project2.hellohopper.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Subscription {
    @Id
    @GeneratedValue
    private int id;
    @NotEmpty
    private double price;
    @NotEmpty
    private int frequency;
    @NotEmpty
    private String description;

    public Subscription(int id, @NotEmpty double price, @NotEmpty int frequency, @NotEmpty String description) {
        this.id = id;
        this.price = price;
        this.frequency = frequency;
        this.description = description;
    }

    public Subscription() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "id=" + id +
                ", price=" + price +
                ", frequency=" + frequency +
                ", description='" + description + '\'' +
                '}';
    }
}
