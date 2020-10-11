public class Aula12 {
    public static void main(String[] args){
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro ca = new Cachorro();

        ca.reagir("s");
        ca.reagir(18,00);
        c.locomover();
        m.emitirSom();
        r.emitirSom();
        p.emitirSom();
        a.emitirSom();
    }

}
