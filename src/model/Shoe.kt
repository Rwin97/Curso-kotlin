package model

class Shoe(name: String, description: String, sku: Int, var brand: String): Product(name,  description, sku), ICrudActions {

    override fun create(): String{
        saludar("hola mundo desde create")
        return "Create shoe"
    }

    override fun read(): String {
        return "Read shoe"
    }

    override fun update(): String {
        return "Update shoe"
    }

    override fun delete(): String {
        return "Delete shoe"
    }

    override fun toString(): String {
        return super.toString()+"SKU ID: $sku \nMarca: $brand \nModelo: $model \n Size: $size \nColor: $color"
    }

   init {
       println("SKU ID: $sku")
       println("Marca: $brand")

   }
    var size: Int = 34 //Minimo sea 34
        set(value) {
        if (value>=34)
            field = value
        else
            field = 34
        }
        get() = field
    var color: String = "blue" //good
    var model: String = "Boots" // nose pueda poner tenis
        set(value) {
            if (value.equals("Tenis"))
                field = "Boots"
            else
                field = value
        }
        get() = field
}