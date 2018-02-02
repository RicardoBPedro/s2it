import org.junit.Test;
import static org.junit.Assert.*;

public class Exercicio9Test {

    @Test
    public void test3Nodes() {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.adicionarNo(20);
        binaryTree.adicionarNo(30);
        binaryTree.adicionarNo(20);
        binaryTree.adicionarNo(13);
        binaryTree.adicionarNo(18);
        binaryTree.adicionarNo(55);
        binaryTree.adicionarNo(32);
        binaryTree.adicionarNo(0);
        binaryTree.adicionarNo(2);
        binaryTree.adicionarNo(5);
        binaryTree.adicionarNo(343);

        assertEquals(518, binaryTree.somaNodosSubsequentes(binaryTree.raiz));
    }
}
