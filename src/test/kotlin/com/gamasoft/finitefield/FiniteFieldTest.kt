package com.gamasoft.finitefield

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FiniteFieldTest {

    @Test
    fun sumNumbers(){

        val f = FiniteField(11).apply{

            assertEquals(9, 5.toNum() + 4.toNum())
            assertEquals(2, 1.toNum() + 1.toNum())
            assertEquals(0, 15.toNum() + 18.toNum())
            assertEquals(1, 6.toNum() + 6.toNum())
        }
    }


    @Test
    fun multiplyNumbers(){

        val f = FiniteField(11).apply{

            assertEquals(1, 1.toNum() * 1.toNum())
            assertEquals(4, 1.toNum() * 4.toNum())
            assertEquals(1, 3.toNum() * 4.toNum())
            assertEquals(5, 4.toNum() * 4.toNum())
            assertEquals(9, 5.toNum() * 4.toNum())
            assertEquals(2, 6.toNum() * 4.toNum())
            assertEquals(6, 15.toNum() * 18.toNum())
            assertEquals(3, 6.toNum() * 6.toNum())
        }
    }

    @Test
    fun divideNumbers(){

        val f = FiniteField(11).apply{

            assertEquals(1, 1.toNum() / 1.toNum())
            assertEquals(4, 4.toNum() / 1.toNum())
            assertEquals(3, 1.toNum() / 4.toNum())
            assertEquals(4, 1.toNum() / 3.toNum())
            assertEquals(9, 3.toNum() / 4.toNum())
            assertEquals(1, 4.toNum() / 4.toNum())
            assertEquals(4, 5.toNum() / 4.toNum())
            assertEquals(7, 6.toNum() / 4.toNum())
            assertEquals(10, 15.toNum() / 18.toNum())
            assertEquals(1, 6.toNum() / 6.toNum())
        }
    }



    @Test
    fun cyclicMultiplication(){

    }
}