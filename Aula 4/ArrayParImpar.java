public class ArrayParImpar {
    public static void main(String[] args) {
        int[] par = new int[10];
        int[] impar = new int[10];

        arrays(par, impar);

    }
    public static void arrays(int[] par, int[] impar){
        for (int i = 0; i < 10 ; i++) {
            int n;
            n = (int) (Math.random()*20)+1;
            if (n % 2 == 0)
                par[i] = n;
            else
                impar[i] = n;
        }
            System.out.println("Par" +"\t"+"Impar");
        for (int i = 0; i < 10 ; i++) {
            if(par[i] != 0)
            System.out.print(par[i]);
            else
                System.out.print("-");
            if(impar[i] != 0)
                System.out.print("\t"+impar[i]);
            else
                System.out.print("\t-");
            System.out.println();
        }
    }
}
