package ru.netology.stats;

public class StatsService {
    public long salesAmount(long[] sales) {
        long salesAmount = 0;
        for (long sum : sales) {
            salesAmount += sum;
        }
        return salesAmount;
    }

    public long averageAmount(long[] sales) {
        long salesAmount = 0;
        long averageAmount = 0;
        for (long sum : sales) {
            salesAmount += sum;
            averageAmount = salesAmount / 12;
        }
        return averageAmount;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int salesBelowAverage(long[] sales) {
        int count = 0;
        long avarage = averageAmount(sales);
        for (long sale : sales) {
            if (sale < avarage) {
                count++;
            }
        }
        return count;
    }

    public int aboveAverageSales(long[] sales) {
        int count = 0;
        long avarage = averageAmount(sales);
        for (long sale : sales) {
            if (sale > avarage) {
                count++;
            }
        }
        return count;
    }

}

