package ru.netology.service;

import junit.framework.TestCase;
import org.junit.Test;

public class CashbackHackServiceTest extends TestCase {
        CashbackHackService service = new CashbackHackService();

        @Test
        public void testRemain_minus1() {
            int expected = 1000;
            int actual = service.remain(-1);

            assertEquals(expected, actual);

        }

        @Test
        public void testRemain_0() {
            int expected = 1000;
            int actual = service.remain(0);

            assertEquals(expected, actual);

        }

        @Test
        public void testRemain_1() {
            int expected = 999;
            int actual = service.remain(1);

            assertEquals(expected, actual);

        }

        @Test
        public void testRemain_523() {
            int expected = 477;
            int actual = service.remain(523);

            assertEquals(expected, actual);

        }

        @Test
        public void testRemain_999() {
            int expected = 1;
            int actual = service.remain(999);

            assertEquals(expected, actual);

        }

        @Test
        public void testRemain_1000() {
            int expected = 0;
            int actual = service.remain(1000);

            assertEquals(expected, actual);

        }

        @Test
        public void testRemain_1001() {
            int expected = 0;
            int actual = service.remain(1001);

            assertEquals(expected, actual);

        }

        @Test
        public void testRemain_1_000_000() {
            int expected = 0;
            int actual = service.remain(1_000_000);

            assertEquals(expected, actual);

        }
    }