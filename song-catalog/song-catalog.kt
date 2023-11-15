class songStructure(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
) {

    fun isPopular() {
        if (playCount < 1000) {
            println("Unpopular")
        } else {
            println("Big hit")
        }
    }

    fun printSongStructure() {
        println("$title, performed by $artist, was released in $yearPublished")
    }
}

fun main() {
    var song = songStructure("Hey, Soul Sister", "Train", 2009, 1000000)
    song.printSongStructure()
    song.isPopular()
    
}