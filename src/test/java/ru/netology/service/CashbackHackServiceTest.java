package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void calculateCashback() {
        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void downСalculateCashback() {
        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void upCalculateCashback() {
        int amount = 1001;

        int expected = 999;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void upCalculateCashback0() {
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}