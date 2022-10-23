public class Imagem {
    public static void main(String[] args) {
        imagem();
    }
   public static void imagem(){
        int[][] imagem = new int[40][40];
        for (int i = 0; i < 40; i++){
            for (int j = 0; j < 40; j++) {
                imagem[i][j] = (int) (Math.random() * 256);
                System.out.print(imagem[i][j]+" ");
            }
            System.out.println();
        }
   }
}
