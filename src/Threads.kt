import java.lang.Thread.*

fun main (args:Array<String>){
var t1 = Threads()
    t1.start()
    println("Thread is running ")

}

class Threads():Thread(){

    override fun run() {
        var count =0
        while (count<10){
            println("Count: $count")
            count ++
        }

        try {
            Thread.sleep(1000)
        }catch (ex:Exception){
            println(ex.message)
        }
    }

}