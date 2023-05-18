package ru.netology.mvnCsv.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class metodTest {

    @ParameterizedTest
    //@CsvSource({
    //      "10000,3000,0,3",
    //    "60000,5000,0,7"})
    @CsvFileSource(files = "src/test/resources/dannue2.csv")
    public void numberOfMonthSatLowCost(int income, int expense, int threshold, int expected) {
        metod service = new metod();
        // переменные подставили в public void
        // подготавливаем данные:
        //int income = 10_000;
        //int expense = 3_000;
        //int threshold = 0;
        //int expected = 3;

        // вызываем целевой метод:
        int actual = service.calc(income, expense, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    // @CsvSource({
    //   "100000,60000,0,2",
    //   "90000,20000,0,3" })
    //указываем ссылку на данные в файле
    @CsvFileSource(files = "src/test/resources/dannue.csv")
    public void numberOfMonthsAtHighCost(int income, int expense, int threshold, int expected) {
        metod2 service = new metod2();

        //int income = 100_000;
        //int expense = 60_000;
        // int threshold = 0;
        // int expected = 2;

        // вызываем целевой метод:

        int actual = service.calc(income, expense, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}