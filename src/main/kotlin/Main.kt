fun main() {
    ageClassifier(5)
    ageClassifier(14)
    ageClassifier(23)

    get(1)
    get(4)
    get(17)
    get(40)

    getAge(1)
    getAge(4)
    getAge(17)
    getAge(40)

    nationality("Rwanda")
    nationality("Ghana")
    nationality("Portugal")
    nationality("Wales")
    nationality("Kenyan")

//LOOPS
    val languages= arrayOf("Kiswahili","English","French","Spanish")
    for (lang in languages){
        println("I speak $lang")
    }

    val myArr = intArrayOf(11, 12, 13, 14, 15, 16)
    numbers(myArr)

}
fun ageClassifier(age:Int){
    if (age in 13..19){
        println("You are a teenager")
    }
     else{
         println("You are not  a teenager")
    }
}
//if else statement
//baby 1, toddler 2-5, child 5>...17,adult
fun get(age: Int) {
     if (age in 0..1){
         println("you are a baby")
     }
else if(age in 3..5){
    println("You are a toddler")

     }
    else if(age in 6..17){
        println("You are a child")
    }
    else{
        println("You are an adult")
     }
}

//Method 2 using when
fun getAge(age: Int) {
    when(age){
        in 0..1 -> println("baby")
        in 2..5 -> println("toddler")
        in 6..17 -> println("child")
      else -> println("adult")

    }
}
//Write a function that takes in a country name and prints out the corresponding nationality fo the following countries
//Rwanda,Ghana,Portugal,Wales
fun nationality(country: String) {
    when (country) {
        "Rwanda" -> println("Rwandan")
        "Ghana" -> println("Ghanaian")
        "Portugal" -> println("Portuguese")
        "Wales" -> println("Welsh")
        else -> println("The nationality for $country  is not found.")
    }
}
//Loops
//Write a function that takes in an array of a random integer and prints out whether odd or even

fun numbers(arr: IntArray) {
    for (num in arr) {
        val result = if (num % 2 == 0) "even" else "odd"
        println(result)
    }
}

//Write a function that takes in an array of mixed types and returns the sum of the decimal elements only

