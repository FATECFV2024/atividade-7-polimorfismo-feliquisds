public class Sylveon extends Eevee {
    public Sylveon(String nome, int altura, int HP, double peso) {
        super(nome, altura, HP, peso);
        setTipo("Fada");
    }

    public Sylveon(int altura, int HP, double peso) {
        super("Sylveon", altura, HP, peso);
        setTipo("Fada");
    } 

    @Override
    public String ataque() {
        return "Beijo drenante";
    }

    @Override
    public String defesa() {
        return "Tela de luz";
    }

    @Override
    public String especial() {
        return "Bola de sombra";
    }
}
