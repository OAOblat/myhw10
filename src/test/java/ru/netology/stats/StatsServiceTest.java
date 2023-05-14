package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
public class StatsServiceTest {

    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMinMonth = 9;
        int actualMinMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMaxMonth = 8;
        int actualMaxMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void shouldFindSalesAmount() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedSalesAmount = 180;
        int actualSalesAmount = service.salesAmount(sales);

        Assertions.assertEquals(expectedSalesAmount, actualSalesAmount);
    }

    @Test
    public void shouldFindAverageSalesAmount() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedAverageSalesAmount = 15;
        int actualAverageSalesAmount = service.averageSalesAmount(sales);

        Assertions.assertEquals(expectedAverageSalesAmount, actualAverageSalesAmount);
    }

    @Test
    public void shouldFindNumberMonthsSalesBelowAverage() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedNumberMonth = 5;
        int actualNumberMonth = service.numberMonthsSalesBelowAverage(sales);

        Assertions.assertEquals(expectedNumberMonth, actualNumberMonth);
    }

    @Test
    public void shouldFindNumberMonthsSalesAboveAverage() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedNumberMonth = 5;
        int actualNumberMonth = service.numberMonthsSalesAboveAverage(sales);

        Assertions.assertEquals(expectedNumberMonth, actualNumberMonth);
    }

}
