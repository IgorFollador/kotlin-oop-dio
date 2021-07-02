package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val luan = Gerente("Luan Balestrin", "987.654.321-01", 5000.0)
    ImprimeRelatorioFuncionario.imprime(luan)
}