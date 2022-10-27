import static java.lang.Character.toUpperCase;

public class GeradorDeFrases {
    public static void main(String[] args) {
        frasesAleatorias();
    }
    public static  void frasesAleatorias() {
        String[] substantivo = {"canguru","rato","cão","gato","professor", "dragão", "ninja", "pirata"};
        String[] verbo = {"matou","comeu","pegou","bateu","prendeu", "deixou", "levou", "enviou"};
        String[] adjLocal = {"mancando em Rivera.","triste em Livramento.","feliz em São Gabriel.","medroso em Joinville.","temeroso em São Gonçalo.", "molhado no Rio de Janeiro.", "perdido em Londres.", "confiante em Porto Alegre."};
        int nSubs, verb, adj; // receberá número referente a palavra no array

        for (int i = 1; i < 12; i++) {

             nSubs = ((int)(Math.random()*7)+1);
             verb = ((int)(Math.random()*7)+1);
             adj = ((int)(Math.random()*7)+1);
             char x = substantivo[nSubs].charAt(0); // pega a primeira letra
                  x = toUpperCase(x);

             StringBuilder subs = new StringBuilder(substantivo[nSubs]); // transforma o substantivo em StringBuilder, para trocar a primeira letra;
             subs.setCharAt(0, x);

            System.out.println(subs+" "+verbo[verb]+" "+adjLocal[adj]+".");
        }
    }
}
