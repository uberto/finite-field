package com.gamasoft.finitefield

class FiniteField(val modulo: Int) {

    fun Int.toNum(): FFNumber = FFNumber(this, modulo)


}