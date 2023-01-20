package dmit2015.model;

import lombok.Data;
@Data
public class BMI {

    private int weight;

    private int height;

    public void setHeight(int height) {
        if (height <= 0) {
            throw new RuntimeException("height must be a positive non-zero number");
        }
        this.height = height;
    }
    public void setWeight(int weight) {
        if (weight <= 0) {
            throw new RuntimeException("weight must be a positive non-zero number");
        }
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public BMI() {
        setHeight(1);
        setWeight(1);
    }
    public BMI(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }
    public double bmi()
    {
        return (703 * weight)/Math.pow(height, 2);
    }

    public String bmiCategory()
    {
        if(bmi() < 18.5)
        {
            return "underweight";
        }
        if(bmi() < 25)
        {
            return "normal";
        }
        if(bmi() < 30)
        {
            return "overweight";
        }
        if(bmi() >=30)
        {
            return "obese";
        }
        return "range invalid";
    }

}
