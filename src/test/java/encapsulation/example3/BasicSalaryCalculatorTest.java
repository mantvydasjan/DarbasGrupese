package encapsulation.example3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicSalaryCalculatorTest {

    private BasicSalaryCalculator basicSalaryCalculator;

    @BeforeEach
    void setUpBeforeEach() {
        basicSalaryCalculator = new BasicSalaryCalculator();
    }

    @Test
    void testBasicSalaryCalculatorWithValidSalary() {
        //given
        double basicSalary = 4000;
        basicSalaryCalculator.setBasicSalary(basicSalary);
        double expectedSocialInsurance = basicSalary * 0.25;

        //when
        double actualSocialInsurance = basicSalaryCalculator.getSocialInsurance();

        //then
        assertEquals(expectedSocialInsurance, actualSocialInsurance);
    }

    @Test
    void testAdditionalBonusCalculation() {
        //given
        double basicSalary = 2000;

        basicSalaryCalculator.setBasicSalary(basicSalary);

        double expectedAdditionalBonus = 200;


        //when
        double actualAdditionalBonus = basicSalaryCalculator.getAdditionalBonus();

        //then

        assertEquals(expectedAdditionalBonus, actualAdditionalBonus);
    }
    @Test
    void testGrossSalaryColculation(){
        //given
        double basicSalary = 6000;
        basicSalaryCalculator.setBasicSalary(basicSalary);
        double expectedGrossSalary = 8100;

        //when
        double actualGrossSalary = basicSalaryCalculator.getGrossSalary();

        //then
        assertEquals(expectedGrossSalary,actualGrossSalary);
    }

    @Test
    @DisplayName("Should throw an exeption when salary is below 0")
    void testBasicInvalidSalary() {
        double basicSalary = -1000;
        assertThrows(IllegalArgumentException.class, () -> basicSalaryCalculator.setBasicSalary(basicSalary));
    }

}