



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
