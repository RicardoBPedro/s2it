public class Exercicio8 {

    public static int calcularC(Integer a, Integer b) {

        char[] listA = a.toString().toCharArray();
        char[] listB = b.toString().toCharArray();
        int maiorIndex = listA.length > listB.length ? listA.length : listB.length;
        String stringC = "";

        for (int x = 0; x < maiorIndex; x++) {
            if (listA.length > x) {
                stringC += String.valueOf(listA[x]);
            }
            if (listB.length > x) {
                stringC += String.valueOf(listB[x]);
            }
        }

        Integer c = Integer.valueOf(stringC);

        return c > 1000000 ? -1 : c;
    }
}
