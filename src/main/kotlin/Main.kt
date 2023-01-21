



fun main(){


    // Variables

    /*
    val-da yalniz bir defe qiymet vermek olur
    Yeni ikinci defe qiymetini deyismek mumkun deyil
    val yazdiqdan sonra yerindece deyiseni initialize edirsense type yazmaq lazim deyil
    amma qiymeyini sonra initialize edeceksense type mueyyen etmelisen
     */
    val name : String
    name = "Hassan"
    val surname = "Mustafa"
    val average: Int = 12;
    val age = 12;
    val PI = 3.14

    println("name: $name surname: $surname average: $average age: $age")


    /*
    var-da ise val-dan ferqli olaraq deyisenin deyerini istenilen qeder deyismek mumkundur
     */
    var address : String
    address = "Istanbul"
    address = "Izmir"

    var postCode: Int = 34
    var phoneNumber = 12345

    println("address $address   postCode $postCode   phoneNumber $phoneNumber")






    // Functions
    println(sum(2,3))
    println(sum2(7,1))
    write("Alex")
    write2("Alex")




    // Classes and Objects

    var customer = Customer(2.3 , 3.7 , 2)
    println("perimetr : ${customer.perimetr}")
    customer.aa()



    val user = User(2)
    println(user.x)
    println(user.aa())


    // Condition
    println(max(1,2))
    println(max2(1,-1))

    // Loops
    val items = listOf("Messi" , "Neymar" , "Suarez")
    for (item in items){
        println(item)
    }


    var index = 0
    while (index < items.size){
        println(items[index])
        index++
    }

    // when condition  - Javadaki switch-case

    println(whenCondition("a"))
    println(whenCondition(100L))
    println(whenCondition("mskaks"))
    println(whenCondition("Hello"))
    println(whenCondition(1))
    println(whenCondition("else ???"))


    // ranges
    if (5 in 2..6){
        println("True")
    }

    for (x in 2..7){
        println(x)
    }

    for (x in 1..9 step 2){
        println(x)
    }

    for (x in 9 downTo 1 step 4){
        println(x)
    }


    // Collection
    var elements = setOf<String>( "Fenerbahce","Galatasaray","Feynord" ,"Ajax")
    elements
        .filter { it.startsWith("Fe") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach{println(it)}


    // Nullable



}

open class User(val x : Int ){


    fun aa(): Int{
        return x;
    }

}

 class Customer(
    var heigt : Double ,
    var length: Double ,
    var value: Int
) :User(value){
    var perimetr = (heigt + length + x) * 2
}




fun sum (number1: Int , number2: Int) : Int{
    return number1+number2;
}

fun sum2 (number1: Int , number2: Int) = number1 + number2



fun write(name:String):Unit{
    println("My name is "+name)
}

fun write2(name:String){
    println("My name is "+name)
}


fun max (a: Int , b:Int) : Int{
    if(a>b){
        return a;
    }else if(a<b){
        return b;
    }else{
        return 0;
    }
}

fun max2 (a: Int , b: Int): Int = if (a>b) a else if (a<b) b else 0

fun whenCondition(any: Any) : String =
    when(any){
        1 -> "Salam"
        "Hello" -> "Hello World"
        is Long -> "Any Long"
        !is String -> "Is not String variable"
        else -> "Something"
}