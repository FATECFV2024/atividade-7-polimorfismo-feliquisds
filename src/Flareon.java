public class Flareon extends Eevee {
    public Flareon(String nome, int altura, int HP, double peso) {
        super(nome, altura, HP, peso);
        setTipo("Fogo");
    }

    public Flareon(int altura, int HP, double peso) {
        super("Flareon", altura, HP, peso);
        setTipo("Fogo");
    } 

    @Override
    public String ataque() {
        return "Presa de fogo";
    }

    @Override
    public String defesa() {
        return "Cara assustadora";
    }

    @Override
    public String especial() {
        return "Chute duplo";
    }
}
