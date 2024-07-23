public class AparelhoDeSom {
    public static void main(String[] args) throws Exception {

        AcoesDoSom AcoesDoSom = new AcoesDoSom();

        System.out.println("Bem vindo ao SOM Sound!");

        AcoesDoSom.aumentarSom();
        AcoesDoSom.aumentarSom();
        AcoesDoSom.aumentarSom();
        System.out.print("Aumentando o volume: " +AcoesDoSom.volume);
    }
}
