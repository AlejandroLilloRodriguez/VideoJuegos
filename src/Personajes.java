public abstract class  Personajes {
   /**
   Esta clase es la clase padre de la cual heredan las clases Bot, Heroe y Villano,es la clase que se encarga de crear
    los personajes con los atributos que se le pasan por parametro.Tambien creamos el metodo clone , usando el patron de
    diseño Prototype, para poder clonar los personajes y no tener que crearlos de nuevo. La creacion de los personajes
    se basa en el patron de diseño Factory Method, ya que se crea un personaje dependiendo de los atributos que se le pasan
    por parametro.Y estos heredan de la clase abstracta Personajes.
    */
    private int vida;
    private int ataque;
    private int defensa;
    private int inteligencia;
    public Personajes(int vida, int ataque, int defensa, int inteligencia){
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.inteligencia = inteligencia;
    }
    public int getVida(){
        return vida;
    }
    public int getAtaque(){
        return ataque;
    }
    public int getDefensa(){
        return defensa;
    }
    public int getInteligencia(){
        return inteligencia;
    }
    public void setVida(int vida){
        this.vida = vida;
    }
    public void setAtaque(int ataque){
        this.ataque = ataque;
    }
    public void setDefensa(int defensa){
        this.defensa = defensa;
    }
    public void setInteligencia(int inteligencia){
        this.inteligencia = inteligencia;
    }
    public abstract String getDescripcion();
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
