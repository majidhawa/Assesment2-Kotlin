fun main() {

   numbers(arrayOf(1,2,3))
   println (volumeOfSphere(3.14159))
 println   (isPalindrome("kayak"))
}



fun numbers(array: Array<Int>):Any{


    return array.sum()
    return array.count()
    return array.average()

}

fun volumeOfSphere(pie:Double): Double {

    var num1 = 4 / 3
    var radius = 7 * 7 * 7
    var volume = num1 * radius * pie
    return volume
}

fun isPalindrome( word:String):Boolean {
    var newWord= word.reversed()

    if  (newWord==word){
        return true }
        else {
            return false
        }

}
