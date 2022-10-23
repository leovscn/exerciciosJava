package ExerArrays2;

public class TesteArrays2 {
    public static void main(String[] args) { // CONTADOR
        int[] array1 = MeusArrays.randomInt(10);
        int[] array2 = MeusArrays.randomInt(1000);

        for (int j : array1) {
            System.out.print(j + "\t");
        }

        System.out.println();

        for (int j : array2) {
            System.out.print(j + "\t");
        }
        System.out.println();

        System.out.println();

        MeusArrays.acharElemento( array1, array2, 1);

        System.out.println();

        int[] array3 = MeusArrays.randomInt(5);
        for (int i: array3) {
            System.out.println(i);
        }
    }
}
