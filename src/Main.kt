fun main() {
    print(validTime("13:58"))
}

fun validTime(time: String): Boolean=time.slice(0..1).toInt()>=0 && time.slice(0..1).toInt()<24 && time.slice(3..4).toInt()>=0 && time.slice(3..4).toInt()<=59
