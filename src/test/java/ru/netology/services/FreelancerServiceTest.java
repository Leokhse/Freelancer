package ru.netology.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FreelancerServiceTest {
    private final FreelancerService service = new FreelancerService();

    @Test
    public void shouldCalculateVacationMonths() {
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expected = 3;

        int actual = service.calculateVacationMonths(income, expenses, threshold);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateVacationMonthsWhenNoVacationPossible() {
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expected = 2;

        int actual = service.calculateVacationMonths(income, expenses, threshold);

        assertEquals(expected, actual);
    }
}