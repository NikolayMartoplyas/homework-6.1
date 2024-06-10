package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void salesAmount() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.salesAmount(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void averageAmount() {
        StatsService service = new StatsService();

        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.averageAmount(sale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthWithMaximumSales() {
        StatsService service = new StatsService();

        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxSales(sale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthWithMinimumSales() {
        StatsService service = new StatsService();

        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberOfHundredMonthsWithSalesBelowAverage() {
        StatsService service = new StatsService();

        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.salesBelowAverage(sale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberOfHundredMonthsWithAboveAverageSales() {
        StatsService service = new StatsService();

        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.aboveAverageSales(sale);

        Assertions.assertEquals(expected, actual);
    }
}

