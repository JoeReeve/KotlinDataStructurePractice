fun main() {
    //Arrays
    val myStringArray = arrayOf("Joe", "Abby", "Susan", "Kea")
    //Lists
    val myStringList = listOf("Joe", "Abby", "Ziron", "Joe")
    //Sets
    val myStringSet = setOf("Joe", "Abby", "Ziron", "Joe")

    println("The length of my array is ${myStringArray.size} ")
    println("The length of my list is ${myStringList.size}")
    println("The length of my set is ${myStringSet.size}")

    //Maps
    val userMap = mapOf("user-001" to "John", Pair("user-002",
    "Marcus"))
    println(userMap.entries)
    println("${userMap["user-001"]}")

    //Data Classes
    val personMap = mapOf("Marcus" to Person("Marcus", "Johnson", listOf("Marky", "Johnny")))
    println(personMap.entries)
    personMap["Marcus"]?.nicknames
}

data class Person(val firstName: String, val lastName: String,
    val nicknames: List<String>)