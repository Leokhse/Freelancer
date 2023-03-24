package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FreelancerServiceTest {
    private final FreelancerService service = new FreelancerService();

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Freelancer.csv")
    public void shouldCalculateVacationMonths(int income, int expenses, int threshold, int expected) {
//        int income = 10000;
//        int expenses = 3000;
//        int threshold = 20000;
//        int expected = 3;

        int actual = service.calculateVacationMonths(income, expenses, threshold);

        assertEquals(expected, actual);
    }

//    @Test
//    public void shouldCalculateVacationMonthsWhenNoVacationPossible() {
//        int income = 100000;
//        int expenses = 60000;
//        int threshold = 150000;
//        int expected = 2;
//
//        int actual = service.calculateVacationMonths(income, expenses, threshold);
//
//        assertEquals(expected, actual);

}