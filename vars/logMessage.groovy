import java.text.SimpleDateFormat

def call (String message) {
    def date = new Date()
    def sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss")
    println (sdf.format(date) + " : ${message}")
}