object Square {
    var id: String? = null
    var x: Int? = null 
    var y: Int? = null
    var size: Int? = null
    
    // x, y = positive only
    // id is unique

    fun getTappedSquare(x: Int, y: Int, square: Square): Boolean {
        val x = 4
        val y = 4
        val size = 2
        
        // Square Coordinates (2,2) (2,6) (6,2) (6,6)
    
            val id = if (size <= 2 && x >= 2 && y >=2 || x <= 6 && y >=6) {
                    id = "In Square or on Edge"
                    } else if (size > 2 && x < 2 || x > 6) {
                    id = "Out of Square"
                    } else if (size <= 0 && x <= 0 || y <= 0) {
                    id = "Negative or Dot or Origin"
                    } else {
                    id = "It's off the charts"
            }
            println("The Square id is $id") 
            return true
        }  
}
