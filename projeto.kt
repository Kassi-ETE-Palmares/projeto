fun main() {
    //Coleção para armazenar alunos.
    val alunos = mutableListOf<String>();
    //Coleção para notas.
    val notas = mutableMapOf<String, MutableList<Double>>();
    var opcao = ""

    while (opcao != "6") {
        println("==================")
        println("SISTEMA ACADÊMICO ")
        println("==================")
        println("1- Cadastrar aluno")
        println("3- Cadastrar notas")
        println("2- Listar aluno")
        println("4- Consultar aluno")
        println("5- Ver Média")
        println("6- Ver situação")
        println("7- Deletar aluno")
        println("8- Sair")

        println("Escolha uma opção ")
        opcao = readln()

        when (opcao) {
            "1" -> {
                println("Digitar o nome do aluno: ")
                val nomeAluno = readln()

                alunos.add(opcao)
                println("Aluno cadastrado. ")
            }

            "2" -> {
                println("Alunos cadastrados")
                for (a in alunos) {
                    println(a)
                }
                println("===================")
            }

            "3" -> {

                println("Digite a primeira nota: ")
                val nomeAluno = readln().toString()
                println("Digite a primeira nota: ")
                val nota1 = readln().toDouble()
                println("Digite a segunda nota: ")
                val nota2 = readln().toDouble()
                println("Digite a terceira nota: ")
                val nota3 = readln().toDouble()

                notas[nomeAluno] = mutableListOf(nota1, nota2, nota3)
            }
            "4" -> {
                println("Digite a primeira nota: ")
                val nomeAluno = readln()

               val contain = alunos.contains(nomeAluno)

                if (contain){
                    println("Aluno $nomeAluno encontrado");
                }else{
                    println("Aluno $nomeAluno não encontrado");
                }
            }

            "5" -> {
                println("Digite o nome aluno: ");
                val nomeAluno = readln()

                val lista = notas[nomeAluno]
                val media = (lista!![0] + lista[1] + lista[2]) / 3
                println("A média do aluno é: $media")
            }

            "6" -> {

                print("Digite o nome do aluno: ");
                val nomeAluno = readln()

                val lista = notas[nomeAluno]
                val media = (lista!![0] + lista[1] + lista[2]) / 3

                if (media >= 6) {
                    println("média: $media")
                    println("Aprovado!")
                } else if (media >= 5) {
                    println("média: $media")
                    println("Recuperação!")
                } else {
                    println("média: $media")
                    println("Reprovado!")
                }
            }

            "7" -> {
                println("Digite o nome aluno: ");
                val nomeAluno = readln()

                notas.remove(nomeAluno)
                alunos.remove(nomeAluno)
            }

            "8" -> {
                println("Sistema encerrado!")
                break
            }

            else -> {
                println("opição invalida - ")
            }
        }
    }
}
