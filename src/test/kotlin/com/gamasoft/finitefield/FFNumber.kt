package com.gamasoft.finitefield

data class FFNumber(val num: Int, val modulo: Int){
    operator fun plus(other: FFNumber) = (num + other.num) % modulo
    operator fun minus(other: FFNumber) = (num - other.num) % modulo
    operator fun times(other: FFNumber) = (num * other.num) % modulo
    operator fun div(other: FFNumber) = (num / other.num) % modulo
}

