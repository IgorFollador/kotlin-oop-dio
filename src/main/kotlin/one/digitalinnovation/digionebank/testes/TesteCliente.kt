package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val igor = Cliente(
        nome = "Igor Follador",
        cpf = "111.222.333-44",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(igor)

    TesteAutenticacao().autentica(igor)
}