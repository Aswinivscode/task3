fun main(args: Array<String>) {
    print("Enter the string : ")
    var n = readLine()
    var c = 0
    if (n != null) {
        n=n.uppercase()
        var i=0
        for(i in 0..n.length-1) {
            val s=n[i]
            if (s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U') {
                c++
            }
        }
    }
    print("Number of vowels present : $c")
}
