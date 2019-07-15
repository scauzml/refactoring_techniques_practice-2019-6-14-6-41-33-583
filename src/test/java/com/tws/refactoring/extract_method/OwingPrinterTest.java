package com.tws.refactoring.extract_method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void printOwing() {
//        System.out.print("hello");
//        assertEquals("hello", outContent.toString());
        //given
        Order order = new Order(1.0);
        Order order1 = new Order(2.0);
        Order order2 = new Order(3.0);
        List<Order> orderArrayList = new ArrayList<>();
        OwingPrinter owingPrinter = new OwingPrinter();

        //when
        owingPrinter.printOwing("a",orderArrayList);
        //then
    }
}