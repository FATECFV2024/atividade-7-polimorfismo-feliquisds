public class Glaceon extends Eevee {
    public Glaceon(String nome, int altura, int HP, double peso) {
        super(nome, altura, HP, peso);
        setTipo("Gelo");
    }

    public Glaceon(int altura, int HP, double peso) {
        super("Glaceon", altura, HP, peso);
        setTipo("Gelo");
    } 

    @Override
    public String ataque() {
        return "Nevasca";
    }

    @Override
    public String defesa() {
        return "Paisagem nevada";
    }

    @Override
    public String especial() {
        return "Feixe de gelo";
    }
}
