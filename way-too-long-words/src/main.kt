fun main(){
    val numberOfWords = readLine()!!.toInt()

    for (num in 1..numberOfWords){
        val word = readLine()!!
        if(word.length > 10){
            println("${word[0]}${word.length-2}${word[word.length-1]}")
        } else {
            println(word)
        }
    }
}