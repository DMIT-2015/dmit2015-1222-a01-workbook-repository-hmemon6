package dmit2015.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BMITest {

    @Test
    void bmi_underweight_CorrectResult() {
        BMI bmi1 = new BMI();
        bmi1.setWeight(100);
        bmi1.setHeight(66);
        assertEquals(16.1, bmi1.bmi(), 0.05);
        bmi1.bmi();
        assertTrue("underweight" == bmi1.bmiCategory());
    }
    @Test
    void bmi_normal_CorrectResult() {
        BMI bmi1 = new BMI();
        bmi1.setWeight(140);
        bmi1.setHeight(66);
        assertEquals(22.6, bmi1.bmi(), 0.05);
        bmi1.bmi();
        assertTrue("normal" == bmi1.bmiCategory());
    }

    @Test
    void bmi_overweight_CorrectResult() {
        BMI bmi1 = new BMI();
        bmi1.setWeight(175);
        bmi1.setHeight(66);
        assertEquals(28.2, bmi1.bmi(), 0.05);
        bmi1.bmi();
        assertTrue("overweight" == bmi1.bmiCategory());
    }

    @Test
    void bmi_obese_CorrectResult() {
        BMI bmi1 = new BMI();
        bmi1.setWeight(200);
        bmi1.setHeight(66);
        assertEquals(32.3, bmi1.bmi(), 0.05);
        bmi1.bmi();
        assertTrue("obese" == bmi1.bmiCategory());
    }
    @Test
    void bmi_myWeight_CorrectResult() {
        BMI bmi1 = new BMI();
        bmi1.setWeight(187);
        bmi1.setHeight(74);
        assertEquals(24, bmi1.bmi(), 0.05);
        bmi1.bmi();
        assertTrue("normal" == bmi1.bmiCategory());
    }
    //    @ParameterizedTest(name = "BMI: {0} height: {2}")
    //    @CsvSource({
    //            "16.1, 100, 66",
    //    })
    @ParameterizedTest(name = "BMI: {0}, BMI Category : {3}")
    @CsvSource({
            "16.1, 100, 66,underweight",
            "22.6, 140, 66, normal",
            "28.2, 175, 66,overweight",
            "32.3, 200, 66,obese",
            "24.0, 187, 74,normal",
    })

    void bmi_DifferentWeightAndHeight_ReturnsCorrectResults(double expectedBMI, int weight, int height, String bmiCategory) {
// Arrange
        BMI bmi1 = new BMI();
// Act
        bmi1.setWeight(weight);
        bmi1.setHeight(height);
// Assert
        assertEquals(expectedBMI, bmi1.bmi(), 0.05);
    }




}