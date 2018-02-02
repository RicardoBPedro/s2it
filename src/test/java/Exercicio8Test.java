import org.junit.Test;
import static org.junit.Assert.*;

public class Exercicio8Test {

    @Test
    public void testCalculoAMaiorQueB() {
        int c = Exercicio8.calcularC(102, 52);
        assertEquals(15022, c);
    }

    @Test
    public void testCalculoAMenorQueB() {
        int c = Exercicio8.calcularC(52, 102);
        assertEquals(51202, c);
    }

    @Test
    public void testCalculoAMesmoTamanhoB() {
        int c = Exercicio8.calcularC(33, 22);
        assertEquals(3232, c);
    }

    @Test
    public void testCalculoResultadoMaiorQue1000000() {
        int c = Exercicio8.calcularC(10256, 512);
        assertEquals(-1, c);
    }
}
