package sealedEx

sealed class Expression // Herite que dans le même fichier d'implementation

data class Sum(val e1: Expression, val e2: Expression): Expression(){
    override fun toString(): String{
        return " $e1 + $e2 "
    }
}

object NotANumber : Expression(){
    override fun toString(): String{
        return "NaN"
    }
}