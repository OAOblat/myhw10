package ru.netology.stats;

import javax.swing.*;

public class StatsService {
    public int salesAmount(int[] sales) {  //сумма всех продаж
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int averageSalesAmount(int[] sales) {  //средняя сумма продаж в месяц
        int averageAmount = 0;
        int sum = salesAmount(sales);
        averageAmount = sum / sales.length;
        return averageAmount;
    }

    public int maxSales(int[] sales) { //номер месяца, в котором был пик продаж
        int maxMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж обльше
                maxMonth = i; // запомним его как максимальный
            }
        }
        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(int[] sales) { //номер месяца, в котором был минимум продаж
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int numberMonthsSalesBelowAverage(int[] sales) {  //количество месяцев, в которых продажи были ниже среднего
        int averageAmount = averageSalesAmount(sales);
        int numberMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageAmount)
                numberMonth++;
        }
        return numberMonth;
    }

    public int numberMonthsSalesAboveAverage(int[] sales) {  //количество месяцев, в которых продажи были выше среднего
        int averageAmount = averageSalesAmount(sales);
        int numberMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageAmount)
                numberMonth++;
        }
        return numberMonth;
    }
}
