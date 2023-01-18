fun main(){
    println("Hello World")


    println(Double.MAX_VALUE)
    println(Float.MAX_VALUE)

    val resultadoDaSoma=soma(10,10)
    teste(resultadoDaSoma)



}
fun teste(value:Int){
    println("Resultado da $value")
}

fun soma(a:Int,b:Int):Int{
    return a+b

}