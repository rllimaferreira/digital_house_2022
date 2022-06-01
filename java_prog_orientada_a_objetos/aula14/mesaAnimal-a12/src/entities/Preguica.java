package entities;

public class Preguica extends Animal {

    public Preguica(int id, String nome, int idade) {
        super(id, nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A preguiça está dormindo!");
    }

   /* @Override
    public void correr() {
        System.out.println("ERRO: Retornar uma EXCEPTION"); // Assunto da semana que vem... Por enquanto, a gente resolve isso com if, porque não existe herança com nada, ou herda tudo ou nada.
    }*/

    public void subirArvore() {
        System.out.println("A preguiça está subindo a árvore...");
    }

    @Override
    public String toString() {
        return "Preguiça {" + super.toString() + "}";
    }


}
