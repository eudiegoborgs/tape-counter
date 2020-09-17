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
        return this.fileSizes;
    }

    @Override
    public int getTapeSize() {
        return this.tapeSize;
    }
}
