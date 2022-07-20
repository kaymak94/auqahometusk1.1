package ru.netology.service;


import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void cashbackHackServicePositiveTest() {
        int amount = 800;
        int expected = 200;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void cashbackHackServiceNegativeTest() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}