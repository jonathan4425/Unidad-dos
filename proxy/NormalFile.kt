package proxy

class NormalFile : File {
    override fun read(name: String) = println("Reading file: $name")
}