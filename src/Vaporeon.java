public class Vaporeon extends Eevee {
    public Vaporeon(String nome, int altura, int HP, double peso) {
        super(nome, altura, HP, peso);
        setTipo("Água");
    }

    public Vaporeon(int altura, int HP, double peso) {
        super("Vaporeon", altura, HP, peso);
        setTipo("Água");
    } 

    @Override
    public String ataque() {
        return "Arma de água";
    }

    @Override
    public String defesa() {
        return "Armadura de ácido";
    }

    @Override
    public String especial() {
        return "Surfe";
    }
}
