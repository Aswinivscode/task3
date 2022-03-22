fun main(args: Array<String>) {
    print("Enter the string : ")
    val n = readLine()
    var c = 0
    if (n != null) {
        for(i in 0..n.length-1) {
            val s=n[i]
            if (s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U' ||
                s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u') {
                c++
            }
        }
    }
    print("Number of vowels present : $c")
}


