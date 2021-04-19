fun main() {
    var sum:Int=0
    print("숫자 개수 : ")
    var num:Int = readLine()!!.trim().toInt()
    println("${num}개의 숫자를 입력 받습니다")
    for(i in 1..num){
        print("${i}번째 숫자 : ")
        sum += readLine()!!.trim().toInt()

    }
    print("입력하신 숫자의 총합은 ${sum}입니다")

}