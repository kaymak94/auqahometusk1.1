package ru.netology.service;


import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void cashbackHackServicePositiveTest() {
        int amount = 1000;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void cashbackHackServiceNegativeTest() {
        int amount = 2000;
        int expected = 2000;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}