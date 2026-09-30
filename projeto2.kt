fun main(){
    //Coleção para armazenar alunos.
    val alunos = mutableListOf<String>();
    //Coleção para notas.
    val notas = mutableMapOf<String, MutableList<Double>>();
    var opcao = ""

    while (opcao !="6"){
        mostrarMenu()
        opcao = readln()

        when(opcao){
            "1" -> {cadastrarAluno(alunos)}
            "2" -> {listarAlunos(alunos)}
            "3" -> {cadastrarNotas(alunos, notas)}
            "4" -> {}
        }

    }
}
fun mostrarMenu(){
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

}

fun cadastrarAluno(alunos: MutableList<String>) {
    println("Digitar o nome do aluno: ")
    val nomeAluno = readln().trim().uppercase()

    if (nomeAluno.isEmpty()){

    } else if(alunos.contains(nomeAluno)){
        println("Aluno $nomeAluno já está cadastrado.")
    } else {
        alunos.add(nomeAluno)
        println("Aluno cadastrado! ")
    }


    alunos.add(nomeAluno)
    println("Aluno cadastrado. ")
}

fun listarAlunos(alunos: MutableList<String>){
    println()
    println("Alunos cadastrados ")
    if(alunos.isEmpty()){
        println("Nenhum aluno cadastrado. ")
    }else{
        for ((index, alunos) in alunos.withIndex()) {
            println("${index + 1} -- $alunos")
        }
    }
    println("===================")
}

fun cadastrarNotas(
    alunos: MutableList<String>,
    notas: MutableMap<String, MutableList<Double>>){

    println("Digitar o nome do aluno: ");
    val nomeAluno = readln().uppercase()

    if (!alunos.contains(nomeAluno)){
        println("Aluno não encontrado. Cadastre o aluno.")
        return
    }
    val nota1 = lerNota("Digite o primeira nota: ")
    val nota2 = lerNota("Digite o primeira nota: ")
    val nota3 = lerNota("Digite o primeira nota: ")

    notas[notaAluno] = mutableListOf(nota1, nota2, nota3)
    println("Notas cadastradas!")
}{

}
