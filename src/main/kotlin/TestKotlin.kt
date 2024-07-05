fun main() {
    println(strProblem("vkjebvebvjevjvjevjevjevjebvjbvjbvjbjbjbjbjrbrjbjrbjrbjrbjrjbrjAMANjenvjenvjenvjenvjenv","AMAN"))
}
fun strProblem(problemString: String, name: String): String?{
//    var strPart = problemString.substringBefore(name)
    var nameArray = name.toCharArray()
    var pointer: Int  =0
    var resultStr = ""
    var checkStr = ""
    for (ch in problemString) {
        if (ch.equals(nameArray.get(pointer))) {
            checkStr = checkStr+nameArray.get(pointer)
            if(checkStr.equals(name)) return resultStr
            pointer++
        } else {
            resultStr = resultStr+ch.toString()
        }
    }

    return null
}