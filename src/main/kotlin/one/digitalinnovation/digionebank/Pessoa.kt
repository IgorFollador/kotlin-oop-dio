package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Igor"

    var cpf: String = "123.456.789-10"
    private set
}

fun main() {
    val igor = Pessoa()
    println(igor.nome)
    println(igor.cpf)
}