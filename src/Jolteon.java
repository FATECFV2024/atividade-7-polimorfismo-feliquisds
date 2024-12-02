public class Jolteon extends Eevee {
    public Jolteon(String nome, int altura, int HP, double peso) {
        super(nome, altura, HP, peso);
        setTipo("Elétrico");
    }

    public Jolteon(int altura, int HP, double peso) {
        super(altura, HP, peso);
        setNome("Jolteon");
        setTipo("Elétrico");
    }    

    @Override
    public String ataque() {
        return "Trovoada";
    }

    @Override
    public String defesa() {
        return "Carga";
    }

    @Override
    public String especial() {
        return "Raio";
    }
}
