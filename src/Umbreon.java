public class Umbreon extends Eevee {
    public Umbreon(String nome, int altura, int HP, double peso) {
        super(nome, altura, HP, peso);
        setTipo("Sombrio");
    }

    public Umbreon(int altura, int HP, double peso) {
        super("Umbreon", altura, HP, peso);
        setTipo("Sombrio");
    } 

    @Override
    public String ataque() {
        return "Pulso sombrio";
    }

    @Override
    public String defesa() {
        return "Luar";
    }

    @Override
    public String especial() {
        return "Jogo sujo";
    }
}
