class songStructure(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
) {

    fun isPopular() {
        if (playCount < 100000) {
            println("Well known")
        } else {
            println("Big hit")
        }
    }

    fun printSongStructure() {
        println("$title, performed by $artist, was released in $yearPublished")
    }
}

fun main() {
    var song = songStructure("Bloodstream", "The Chainsmokers", 2017, 19000000)
    song.printSongStructure()
    song.isPopular()

    song = songStructure("Take Me Away", "Neb", 2020, 65000)
    song.printSongStructure()
    song.isPopular()
}