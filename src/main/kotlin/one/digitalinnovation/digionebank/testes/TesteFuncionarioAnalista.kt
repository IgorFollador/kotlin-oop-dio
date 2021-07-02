package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {
    val vitor = Analista("Vitor Sirotenco", "123.456.789-10", 2000.0)
    ImprimeRelatorioFuncionario.imprime(vitor)
}
