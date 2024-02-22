class Cinema1 (var _name:String,var _seans:String){
    var name= "Неизвестно"
    var seans="Неизветсно"
    var price=350.0
    var zal=3
    var viewersCount=90
    var zarabotok=0.0

init {
    name=_name
    seans=_seans
}

fun Input(Cinema:Cinema1){

    try {

        print("Введите стоимость билета ")
        Cinema.price= readLine()!!.toDouble()

        println("Введите номер зала")
        Cinema.zal= readLine()!!.toInt()
        println("Введите кол-во зрителей")
        Cinema.viewersCount= readLine()!!.toInt()


    }
    catch (e:Exception)
    {
        println("Ошибка")
    }
}
    fun Output ()
    {
        println("название кинофильма: ${name}\nсеанс: ${seans}\nстоимость со скидкой: ${price}\nномер зала: ${zal}\nкол-во зрителей: ${viewersCount}\nЦена всех билетов: ${zarabotok}")

    }

    fun Output2 ()
    {
        println("название кинофильма: ${name}\nсеанс: ${seans}\nстоимость: Бесплатно\nномер зала: ${zal}\nкол-во зрителей: ${viewersCount}")

    }

fun Zarab()
{
    zarabotok=viewersCount*price

}
fun Skidka(){
    price-=price*0.15
}







}