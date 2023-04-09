fun main() {
    person("Purity", 20, "+254 70676 1072")
    var person = details("Purity")
    println("Hello $person!")

    var getit = calculate(11, 2)
    println(getit)

    var addition = summation(
        arrayOf(20,10,40))
    println(addition)

    var purity= fanFact("I am an animal behaviourist "+30+" years down the line")
    println(purity)
}
//Variables and data types
//Create and invoke a function that takes in a name and prints out “Hello ${name}”
fun person(names:String,age:Int,tel:String){
//    var names = "Purity"
//    var age = 20
//    var tel = "+254 70676 1072"

    println("I am $names, turning $age years old this year. My phone is $tel")
}
//operators and functions
//Create and invoke a function that given 2 numbers returns the remainder of their
//division
fun details(name:String):String{
    return name
}
fun calculate(num1:Int,num2:Int):Int{
    var get = num1%num2
return (get)
}

//Create and invoke function that returns the sum of any given 4 numbers
fun summation (nums:Array<Int>):Int{
    var sum = nums.sum()
    return sum

}
//Create and invoke a function that prints out an interesting fact about yourself
fun fanFact(dets:Any?):Any?{
    return dets
}