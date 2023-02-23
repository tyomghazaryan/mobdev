class HanoiTowerProblem {
    fun hanoiTower(n: Int, from: Char, to: Char, aux: Char) {
        if (n == 1) {
            println("Move disk 1 from $from to $to")
            return
        }
        hanoiTower(n - 1, from, aux, to)
        println("Move disk $n from $from to $to")
        hanoiTower(n - 1, aux, to, from)
    }

    fun main() {
        val numDisks = 3
        hanoiTower(numDisks, 'A', 'C', 'B')
    }
}