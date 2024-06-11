package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void salesAmount() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.salesAmount(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void averageAmount() {
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = service.averageAmount(sale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthWithMaximumSales() {
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;
        long actual = service.maxSales(sale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthWithMinimumSales() {
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(sale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberOfHundredMonthsWithSalesBelowAverage() {
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.salesBelowAverage(sale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberOfHundredMonthsWithAboveAverageSales() {
        StatsService service = new StatsService();

        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.aboveAverageSales(sale);

        Assertions.assertEquals(expected, actual);
    }
}

