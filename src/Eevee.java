public class Eevee {
    private String nome = "Eevee";
    private String tipo = "Normal";
    private int altura, HP;
    private double peso;



    public Eevee(String nome, int altura, int HP, double peso) {
        this.nome = nome;
        this.altura = altura;
        this.HP = HP;
        this.peso = peso;
    }

    public Eevee(int altura, int HP, double peso) {
        this.altura = altura;
        this.HP = HP;
        this.peso = peso;
    }    



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    


    public String getTipo() {
        return tipo;
    }

    protected void setTipo(String tipo) {
        this.tipo = tipo;
    }



    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }



    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }



    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }



    public String ataque() {
        return "Ataque rápido";
    }

    public String defesa() {
        return "Imitador";
    }

    public String especial() {
        return "Fugir";
    }

    public void printInfo() {
        System.out.println("Eu sou: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println(HP + " HP, " + peso + "Kg, " + altura + "cm");
        System.out.println("Ataque: " + ataque());
        System.out.println("Defesa: " + defesa());
        System.out.println("Especial: " + especial());
        System.out.println("");
    }
}