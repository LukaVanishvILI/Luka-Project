fun main() {

    val a=point()
    a.x=2
    a.y=2
    println(a.toString())
    println(a.x==a.y)
    println(a.sim(a.x,a.y))



}

class point {
    var x:Int=0
    var y:Int=0
    override fun toString(): String {
        return "$x;$y"


    }

    override fun equals(other: Any?): Boolean {
        if (other is point) {
            if (x==other.y){
                return true
            }
        }
        return false

    }
    fun sim(x:Int,y:Int):String {
        return "${this.x}; ${this.y-2*this.y}"
    }
}






