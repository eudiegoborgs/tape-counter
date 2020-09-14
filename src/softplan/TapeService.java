package softplan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TapeService {
    private static final List<List<Integer>> tapeList = new ArrayList<>();

    private static List<List<Integer>> separateFilesOnTapes(List<Integer> sizesList, int max) throws Exception {
        List<Integer> tape = new ArrayList<>();
        if (sizesList.get(sizesList.size() - 1) > max) {
            throw new Exception("There is a file is bigger than disc.");
        }
        tape.add(sizesList.get(sizesList.size() - 1));
        sizesList.remove(sizesList.size() - 1);
        if (sizesList.size() > 0) {
            for (int i = 0; i < sizesList.size() && tape.size() < 2; i++) {
                if (tape.get(0) + sizesList.get(i) <= max) {
                    tape.add(sizesList.get(i));
                    sizesList.remove(i);
                }
            }
        }
        tapeList.add(tape);
        if (sizesList.size() > 0) {
            return separateFilesOnTapes(sizesList, max);
        }
        return tapeList;
    }

    public static int getMinimumTapeCount(final Batch batch) throws Exception {
        List<Integer> sizesList = Arrays.stream(batch.getFileSizes()).sorted().boxed().collect(Collectors.toList());
        separateFilesOnTapes(sizesList, batch.getTapeSize());
        return tapeList.size();
    }
}
