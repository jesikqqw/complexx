package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexServiceTest {

    @Test
    void add() {
        ComplexService complexService = new ComplexService();
        Complex add = complexService.add(new Complex(17, 17),new Complex(17, 17));
        assertEquals(add.toString(), add.toString(), "Сумма : ");
    }

    @Test
    void sub() {
        ComplexService complexService = new ComplexService();
        Complex sub = complexService.sub(new Complex(17, 17),new Complex(17, 17));
        assertEquals(sub.toString(), sub.toString(), "Разность : ");
    }

    @Test
    void mul() {
        ComplexService complexService = new ComplexService();
        Complex mul = complexService.sub(new Complex(17, 17),new Complex(17, 17));
        assertEquals(mul.toString(), mul.toString(), "Произведение:");
    }

    @Test
    void div() {
        ComplexService complexService = new ComplexService();
        Complex div = complexService.div(new Complex(17, 17),new Complex(17, 17));
        assertEquals(div.toString(), div.toString(), "Частное:");
    }

    @Test
    void getModulus() {
        ComplexService complexService = new ComplexService();
        double mod = complexService.getModulus(new Complex(17, 17));
        assertEquals(mod, mod, "Модуль:");
    }

    @Test
    void isEqual() {
        ComplexService complexService = new ComplexService();
        boolean equal = complexService.isEqual(new Complex(17, 17),new Complex(17, 17));
        assertEquals(equal, equal, "Равны:");
    }
}