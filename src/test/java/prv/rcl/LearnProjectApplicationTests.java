package prv.rcl;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
class LearnProjectApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void test(){
        long node1 = System.nanoTime();
        int[] ints = IntStream.range(0, 1_000_000).filter(i -> i % 2 == 0).toArray();
        long node2 = System.nanoTime();
        int[] ints1 = IntStream.range(0, 1_000_000).parallel().filter(i -> i % 2 == 0).toArray();
        long node3 = System.nanoTime();


        System.out.printf("serial: %.2fs, parallel %.2fs%n", (node2 - node1) * 1e-9, (node3 - node2) * 1e-9);
    }

    @Test
    public void test1(){
        
    }

}
