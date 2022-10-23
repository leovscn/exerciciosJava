package ExerArrays2;

public class MeusArrays {

  public static void acharElemento(int[] array1, int[] array2, int n) {

    boolean valueA = false;
    boolean valueB = false;

    for (int j : array1) {
      if (j == n) {
        valueA = true;
        break;
      }

    }
    for (int j : array2) {
      if (j == n) {
        valueB = true;
        break;
      }
    }
    if (valueA && valueB){
        System.out.println("2");
    } else if (valueA || valueB) {
        System.out.println("1");
    }  else {
        System.out.println("0");
    }

    } // procura N nos arrays;
  public static int[] randomInt(int n) { // gera N valores aleatórios de 0 a 1000;
    int[] array = new int[n];
    for (int i = 0; i < array.length;i++) {
      array[i] = (int) (Math.random() * 1001);
    }
    return array;
  }
}