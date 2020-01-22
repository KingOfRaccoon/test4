 fun main () {
     var A = readLine()!!.toInt()
     var B = readLine()!!.toInt()
     var C = readLine()!!.toInt()
     when (C) {
         1 -> C = A + B;
         2 -> C = A - B;
         3 -> C = A * B;
         4 -> C = A / B;
     }
       println(C)
 }
