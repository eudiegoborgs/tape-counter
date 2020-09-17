package softplan;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

class TapeServiceTest {
    TapeService service;

    @Test
    public void case1() throws Exception {
        int[] fileSizes = new int[]{8, 8, 2, 8, 2, 8, 8};
        int tapeSize = 10;
        Batch batch = new BatchImplementation(fileSizes, tapeSize);
        int result = TapeService.getMinimumTapeCount(batch);
        assertEquals(result, 5);
    }

    public void case2() throws Exception {
        int[] fileSizes = new int[]{20, 30, 50, 10, 15};
        int tapeSize = 100;
        Batch batch = new BatchImplementation(fileSizes, tapeSize);
        int result = TapeService.getMinimumTapeCount(batch);
        assertEquals(result, 2);
    }
}
