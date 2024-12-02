public class Espeon extends Eevee {
    public Espeon(String nome, int altura, int HP, double peso) {
        super(nome, altura, HP, peso);
        setTipo("Psíquico");
    }

    public Espeon(int altura, int HP, double peso) {
        super("Espeon", altura, HP, peso);
        setTipo("Psíquico");
    } 

    @Override
    public String ataque() {
        return "Confusão";
    }

    @Override
    public String defesa() {
        return "Troca de poder";
    }

    @Override
    public String especial() {
        return "Mente calma";
    }
}
