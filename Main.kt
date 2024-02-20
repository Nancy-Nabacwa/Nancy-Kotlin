fun main() {
    println((greetings("Nancy Nabacwa")))
    println((modulus(3.0,3)))
    println((add(3.2, 3, 2.5, 10)))
    println((interestingFactAboutMe("My Name is Nancy Nabacwa","I Love watching Anime")))

}

fun greetings(name:String): String{
    val sentence="Hello ${name}"
    return sentence
}
fun modulus(value1:Double,value2:Int):Double{
    var remainder=value1%value2
    return remainder
}
fun add(value1:Double, value2:Int, value3:Double, value4:Int):Double{
    var a=value1+value2
    var b=value3+value4
    var totalSum=a+b
    return totalSum
}
fun interestingFactAboutMe(name:String, fact:String):String{
    var funFact=(name+" "+fact)
    return funFact
}
