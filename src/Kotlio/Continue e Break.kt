fun main() {
    var i = 0
    while (i <=10){
        if (i == 5){
            print("break")
            break
        }
        print("${i} ")
        i++
    }

    print("\n")
    var txt = "ejemplo"
    var j = 0
    while (j < txt.length) {
        if (txt[j] == 'p') {
            break
        }
        print("${txt[j]} ")
        j++
    }

   for(i in 0..txt.length -1){
       if (txt[i] == 'j'){
           continue
       }
            print("${txt[i]}")
   }

}