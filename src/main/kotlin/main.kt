 fun main(){
     var width: Int = 12//mutable value(can change)
     val name = "Jennifer"
     val numStuds = 50//immutable values(cant change)
     println(width)
     println(name)
     if(width>10){//if and else statements
         println("long")
     }
     else{
         println("short")
     }
     if(numStuds in 1..100){//range
         println(numStuds)
     }
 }