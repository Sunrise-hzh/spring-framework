package com.sunrise.sf.core;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class TestDemo {
    public static void main(String[] args) {
        Long size = 11469L;
        String format = String.format("%.2f", size * 1.0 / 1024);
        System.out.println(format);
    }


}
