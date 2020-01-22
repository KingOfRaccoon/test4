import java.lang.Math.pow
import kotlin.math.sqrt
import kotlin.random.Random
import kotlin.random.nextInt

class Figure(iu :Int){
    var vectors : Array<VectorND> = Array(3, {VectorND(iu)} )
    var line : Array<Double> = Array(3, {0.0})
    fun square(){
        for (i in 0..vectors.size - 2){

         line[i]= sqrt(((vectors[i].coords[i] - vectors[i + 1].coords[i])
                 * (vectors[i].coords[i]-vectors[i + 1].coords[i])  + (vectors[i].coords[i+1] - vectors[i + 1].coords[i+1])
                 * (vectors[i].coords[i+1] - vectors[i + 1].coords[i+1])).toDouble())
        }
    }
    fun display1(){
        vectors.forEach { it.display() }
    }
}

class VectorND(size : Int){
     var coords : Array<Int> = arrayOf(Random.nextInt(100), Random.nextInt(100))
     var sum = 0.0
     fun multi(){
         for (i in 0.. coords.size - 1)
             sum += coords[i] * coords[i]
         sum = sqrt(sum)
     }
    fun  display(){
        coords.forEach { println(it) }
    }
 }

fun main(){
    var NNN = VectorND(2)
    var NNN1 = VectorND(2)
    var NNN2 = VectorND(2)
    var Fi = Figure(2)
   // Fi.vectors.
   // Fi.square()
    Fi.display1()
}

