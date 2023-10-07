public class PersonajesFactory implements PersonajesMethod{
    /**
     * Esta clase implementa la interfaz PersonajesMethod, aqui se crea un personaje dependiendo de los atributos que se le
     * pasan por parametro, si los atributos cumplen con las condiciones se crea un personaje de una clase concreta, si no
     * se cumplen las condiciones se crea un personaje de la clase Bot
     */
    @Override
    public Personajes createPersonajes(int vida, int ataque, int defensa, int inteligencia) {
        if (vida < 25 && inteligencia > 50 && ataque < 25 && defensa < 25) {
            return new Aprendiz(vida, ataque, defensa, inteligencia);
        } else if (vida > 50 && inteligencia < 25 && ataque > 50 && defensa > 50) {
            return new Heroe(vida, ataque, defensa, inteligencia);
        } else if (vida > 50 && inteligencia < 25 && ataque > 50 && defensa < 25) {
            return new Villano(vida, ataque, defensa, inteligencia);
        } else {
            return new Bot(vida, ataque, defensa, inteligencia);
        }
    }
}
