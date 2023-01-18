fun main(){
    println("Hello World")


    println(Double.MAX_VALUE)
    println(Float.MAX_VALUE)

    val resultadoDaSubtracao=subtracao(10,10)
    mostraResultado(resultadoDaSubtracao)




}

fun subtracao(a: Int, b: Int): Int {
    return a-b
}

fun mostraResultado(value:Int){
    println("Resultado da $value")
}

