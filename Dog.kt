

class Dog1(var _name:String,var _color:String) {
    var name  = "Неизвестно"
    var poroda="порода"
    var height=60.0
    var color="Неизвестно"
    var weight=25.0
    var haracter="Добрая"
    var proporc=2.0
    var boyc=false
init {
    name=_name
    color=_color
}
fun Input(Dog:Dog1){

    try {

        println("Введите породу")
        Dog.poroda= readLine()!!.toString()
        print("Введите рост по холке: ")
        Dog.height= readLine()!!.toDouble()

        println("Введите вес собаки")
        Dog.weight= readLine()!!.toDouble()
        println("Введите характер собаки")
        Dog.haracter= readLine()!!.toString()



    }
    catch (e:Exception)
    {
        println("Ошибка")
    }

}
    fun Output ()
    {
        println("Кличка: ${name}\nПорода: ${poroda}\nРост по холке: ${height}\nОкрас: ${color}\nВес: ${weight}\nХарактер: ${haracter}\nСоотношение роста к весу: ${proporc}\n")

    }

    fun Output2(){
        println("Рост или Вес не могут быть <= 0")
    }

    fun RostnaVes(){
        proporc=height/weight
    }

    fun IsBoyc(){
        if (poroda.lowercase()=="питбуль"||poroda.lowercase()=="ротвейлер"||poroda.lowercase()=="алабай")
        {
            boyc=true
        }
        else {boyc=false}
    }
    fun Output3 ()
    {
        println("Кличка: ${name}\nПорода: ${poroda}\nРост по холке: ${height}\nОкрас: ${color}\nВес: ${weight}\nХарактер: ${haracter}\nСоотношение роста к весу: ${proporc}\nБойцовская: ${boyc}")

    }

}