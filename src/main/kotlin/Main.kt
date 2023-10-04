import java.util.*

//HELLO WORD
fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
   // println("Program arguments: ${args.joinToString()}")

    // Will assign kotlin.Unit
    val isUnit = println("This is an expression")
    println(isUnit)

    //déterminons la température
    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)

    val message = "The water temperature is ${if (temperature > 50)" too warm" else "OK"}"
    println(message)
    feedTheFish()
    swim()

    println(decorations.filter { it[0] == 'p' })

    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    //creer une nouvelle liste
    val eager = decorations.filter { it[0] == 'p' }
    println("eager: $eager")
    //evaluation du filtre
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: =filtered")
    //forcer evaluation de liste
    val newList = filtered.toList()
    println("new list: $newList")
    //utilisation de lazyMap
    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }
    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")



}

//creation de la fonction feedTheFish
fun randomDay() : String {
    val week = arrayOf ("Monday" , "Tuesday" , "Wednesday" , "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]

}

//utilisation de when

fun fishFood(day: String) : String {
    return when (day){
        "Monday" -> "flakes"
        "wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")
}

fun swim(speed: String = "fast"){
    println("swimming $speed")
}
fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean{
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
       // temperature > 30 -> true
       // dirty > 30 -> true
      //  day == "Sunday" -> true
        else -> false

    }

}


fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"

val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")