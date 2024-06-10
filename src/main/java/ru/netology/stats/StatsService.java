package ru.netology.stats;

public class StatsService {
    public int salesAmount(int[] sales) {
        int salesAmount = 0;
        for (int sum : sales) {
            salesAmount += sum;
        }
        return salesAmount;
    }

    public int averageAmount(int[] sales) {
        int salesAmount = 0;
        int averageAmount = 0;
        for (int sum : sales) {
            salesAmount += sum;
            averageAmount = salesAmount / 12;
        }
        return averageAmount;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int salesBelowAverage(int[] sales) {
        int count = 0;
        int avarage = averageAmount(sales);
        for (int sale : sales) {
            if (sale < avarage) {
                count++;
            }
        }
        return count;
    }

    public int aboveAverageSales(int[] sales) {
        int count = 0;
        int avarage = averageAmount(sales);
        for (int sale : sales) {
            if (sale > avarage) {
                count++;
            }
        }
        return count;
    }

}

