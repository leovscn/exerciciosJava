
public class GeradorDeFrases {
    public static void main(String[] args) {
        frasesAleatorias();
    }
    public static  void frasesAleatorias() {
        String[] substantivo = {"canguru","rato","cão","gato","professor", "dragão", "ninja", "pirata"};
        String[] verbo = {"matou","comeu","pegou","bateu","prendeu", "deixou", "levou", "enviou"};
        String[] adjLocal = {"mancando em Rivera.","triste em Livramento.","feliz em São Gabriel.","medroso em Joinville.","temeroso em São Gonçalo.", "molhado no Rio de Janeiro.", "perdido em Londres.", "confiante em Porto Alegre."};
        int subs, verb, adj; // receberá número referente a palavra no array

        for (int i = 0; i < 12; i++) {

             subs = ((int)(Math.random()*7)+1);
             verb = ((int)(Math.random()*7)+1);
             adj = ((int)(Math.random()*7)+1);

             char x = substantivo[subs].charAt(0); // pega a primeira letra

             x = Character.toUpperCase(x);

             substantivo[subs] = substantivo[subs].replace(substantivo[subs].charAt(0),x);// troca a primeira letra por uma maiúscula;

             System.out.println(substantivo[subs]+" "+verbo[verb]+" "+adjLocal[adj]+".");
        }
    }
}
