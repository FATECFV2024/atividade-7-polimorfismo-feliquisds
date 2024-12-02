public class Leafeon extends Eevee {
    public Leafeon(String nome, int altura, int HP, double peso) {
        super(nome, altura, HP, peso);
        setTipo("Grama");
    }

    public Leafeon(int altura, int HP, double peso) {
        super("Leafeon", altura, HP, peso);
        setTipo("Grama");
    } 

    @Override
    public String ataque() {
        return "Lâmina foliar";
    }

    @Override
    public String defesa() {
        return "Dia ensolarado";
    }

    @Override
    public String especial() {
        return "Campeão aéreo";
    }
}
