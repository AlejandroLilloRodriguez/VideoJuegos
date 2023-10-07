public  class Heroe extends Personajes{
    /**
    Esta es una clase concreta que hereda de la clase abstracta Personajes, esta hereda el metodo getDescripcion y
    el constructor de la clase padre
     */

    public Heroe(int vida, int ataque, int defensa, int inteligencia) {
        super(vida, ataque, defensa, inteligencia);
    }
    public String getDescripcion(){
        return "Heroe: Yo te salvare";
    }
}
