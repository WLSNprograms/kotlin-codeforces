fun main(){
    val weight = readLine()!!.split(' ').first().toInt()

    if(1 <= weight && weight <= 100){
        if(weight == 1){
            print("NO")
        }
        for (num in 1 .. weight/2){
            if(num % 2 == 0 && (weight - num) % 2 == 0){
                print("YES")
                break
            }

            if(num >= weight/2){
                print("NO")
                break
            }
        }
    }
}