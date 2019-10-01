object Square {
    var id: String? = null
    var x: Int? = null 
    var y: Int? = null
    var size: Int? = null

    fun getTappedSquare(x: Int, y: Int, square: Square): Boolean {
        val x = 4
        val y = 4
        val size = 2
    
            val id = if (size <= 2) {
            if (size > 2)
                id = "Out of Square"
            else 
                id = "In Square"
          } else { 
            if (size < 0)
                id = "Negative"
            else 
                id = "Dot"
        }
            println("The Square id is $id") 
            return true
        }  
}
