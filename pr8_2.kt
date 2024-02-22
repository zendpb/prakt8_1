fun main(){

    var Cinema=Cinema1(_name = "веном",_seans = "дневной")
    Cinema.Input(Cinema)

        Cinema.Skidka()

    Cinema.Zarab()
    if (Cinema.price==0.0)
    {
        Cinema.Output2()
    }
    else Cinema.Output()
}