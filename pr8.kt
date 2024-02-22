fun main(){
    var Dog=Dog1(_name = "Бобик",_color = "Белый")
    Dog.Input(Dog)
    Dog.RostnaVes()
    Dog.IsBoyc()

    if (Dog.weight<=0 || Dog.height<=0)
    {
        Dog.Output2()
    }
    else {


        if (Dog.boyc==false)
        {
            Dog.Output()
        }
        else  Dog.Output3()
    }

    }