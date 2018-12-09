import com.gamasoft.finitefield.FiniteField

fun main(args: Array<String>){

    (5 .. 100).filter { isPrime(it) }.forEach {
        FiniteField(it).apply {

            (1..(modulo - 1)).forEach {
                var tot = 0
                val base = it.toNum()
                var curr = it.toNum()

                do {
                    curr = (curr * base).toNum()
                    tot++
                } while (curr != base)

                println("cyclic of $it is $tot for module ${this.modulo}")
            }

        }
    }
}

fun isPrime(num: Int): Boolean {
    for (i in 2..num / 2) {
        // condition for nonprime number
        if (num % i == 0) {
            return false
        }
    }
    return true
}
