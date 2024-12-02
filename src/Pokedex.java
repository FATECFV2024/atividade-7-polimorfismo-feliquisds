public class Pokedex {
    public static void main(String[] args) throws Exception {
        Eevee ee = new Eevee(30, 55, 6.5);
        Vaporeon va = new Vaporeon(100, 130, 29);
        Jolteon jo = new Jolteon(80, 65, 24.5);
        Flareon fl = new Flareon(90, 65, 25);
        Espeon es = new Espeon(90, 65, 26.5);
        Umbreon um = new Umbreon(100, 95, 27);
        Leafeon le = new Leafeon(100, 65, 25.5);
        Glaceon gl = new Glaceon(80, 65, 25.9);
        Sylveon sy = new Sylveon(100, 95, 23.5);



        ee.printInfo();
        va.printInfo();
        jo.printInfo();
        fl.printInfo();
        es.printInfo();
        um.printInfo();
        le.printInfo();
        gl.printInfo();
        sy.printInfo();
    }    
}
