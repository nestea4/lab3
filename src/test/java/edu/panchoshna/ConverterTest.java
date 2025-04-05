package edu.panchoshna;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
    @author User
    @project lab3
    @class ConverterTest
    @version 1.0.0
    @since 05.04.2025 - 20.55 
*/class ConverterTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void whenArabic_3_ThenRoman_III() {
        Assertions.assertEquals("III", Converter.convertToRoman(3));
    }

    @Test
    void whenArabic_5_ThenRoman_V() {
        Assertions.assertEquals("V", Converter.convertToRoman(5));
    }

    @Test
    void whenArabic_4_ThenRoman_IV() {
        Assertions.assertEquals("IV", Converter.convertToRoman(4));
    }

    @Test
    void whenArabic_8_ThenRoman_VIII() {
        Assertions.assertEquals("VIII", Converter.convertToRoman(8));
    }

    @Test
    void whenArabic_10_ThenRoman_X() {
        Assertions.assertEquals("X", Converter.convertToRoman(10));
    }

    @Test
    void whenArabic_18_ThenRoman_XVIII() {
        Assertions.assertEquals("XVIII", Converter.convertToRoman(18));
    }

    @Test
    void whenArabic_20_ThenRoman_XX() {
        Assertions.assertEquals("XX", Converter.convertToRoman(20));
    }

    @Test
    void whenArabic_28_ThenRoman_XXVIII() {
        Assertions.assertEquals("XXVIII", Converter.convertToRoman(28));
    }

    @Test
    void whenArabic_38_ThenRoman_XXXVIII() {
        Assertions.assertEquals("XXXVIII", Converter.convertToRoman(38));
    }

    @Test
    void whenArabic_48_ThenRoman_XLVIII() {
        Assertions.assertEquals("XLVIII", Converter.convertToRoman(48));
    }

    @Test
    void whenArabic_50_ThenRoman_L() {
        Assertions.assertEquals("L", Converter.convertToRoman(50));
    }

    @Test
    void whenArabic_58_ThenRoman_LVIII() {
        Assertions.assertEquals("LVIII", Converter.convertToRoman(58));
    }

    @Test
    void whenArabic_60_ThenRoman_LX() {
        Assertions.assertEquals("LX", Converter.convertToRoman(60));
    }

    @Test
    void whenArabic_68_ThenRoman_LXVIII() {
        Assertions.assertEquals("LXVIII", Converter.convertToRoman(68));
    }

    @Test
    void whenArabic_70_ThenRoman_LXX() {
        Assertions.assertEquals("LXX", Converter.convertToRoman(70));
    }

    @Test
    void whenArabic_78_ThenRoman_LXXVIII() {
        Assertions.assertEquals("LXXVIII", Converter.convertToRoman(78));
    }

    @Test
    void whenArabic_80_ThenRoman_LXXX() {
        Assertions.assertEquals("LXXX", Converter.convertToRoman(80));
    }

    @Test
    void whenArabic_88_ThenRoman_LXXXVIII() {
        Assertions.assertEquals("LXXXVIII", Converter.convertToRoman(88));
    }

    @Test
    void whenArabic_90_ThenRoman_XC() {
        Assertions.assertEquals("XC", Converter.convertToRoman(90));
    }

    @Test
    void whenArabic_100_ThenRoman_C() {
        Assertions.assertEquals("C", Converter.convertToRoman(100));
    }

    @Test
    void whenArabic_108_ThenRoman_CVIII() {
        Assertions.assertEquals("CVIII", Converter.convertToRoman(108));
    }

    @Test
    void whenArabic_500_ThenRoman_D() {
        Assertions.assertEquals("D", Converter.convertToRoman(500));
    }

    @Test
    void whenArabic_508_ThenRoman_DVIII() {
        Assertions.assertEquals("DVIII", Converter.convertToRoman(508));
    }

    @Test
    void whenArabic_900_ThenRoman_CM() {
        Assertions.assertEquals("CM", Converter.convertToRoman(900));
    }

    @Test
    void whenArabic_1000_ThenRoman_M() {
        Assertions.assertEquals("M", Converter.convertToRoman(1000));
    }
}