package ExerContagem;

public class TesteContagem {
    public static void main(String[] args) {
        Contagem.contar();
        System.out.println("\n-------------------------");
        Contagem.contar(4);
        System.out.println("\n-------------------------");
        Contagem.contar(5,10);
        System.out.println("\n-------------------------");
        System.out.println("|||| Pausa em Segundos: 1s");
        Contagem.contar(1, 5, 1); // PAUSA EM SEGUNDOS TimeUnit.SECONDS
    }
}
