package softplan;

public class BatchImplementation implements Batch {
    private int[] fileSizes;
    private int tapeSize;

    public BatchImplementation(int[] fileSizes, int tapeSize){
        this.fileSizes = fileSizes;
        this.tapeSize = tapeSize;
    }

    @Override
    public int[] getFileSizes() {
        return new int[0];
    }

    @Override
    public int getTapeSize() {
        return 0;
    }
}
