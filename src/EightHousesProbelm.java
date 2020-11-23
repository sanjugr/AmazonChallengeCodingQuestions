import java.util.ArrayList;
import java.util.List;

public class EightHousesProbelm {
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED

    /**
     * There are 8 prison cells in a row, and each cell is either occupied or vacant.
     * Each day, whether the cell is occupied or vacant changes according to the following rules:
     * If a cell has two adjacent neighbors that are both occupied or both vacant, then the cell becomes occupied.
     * Otherwise, it becomes vacant.
     *
     * **/
    public List<Integer> cellCompete(int[] states, int days) {
        int length = states.length;
        int[] oldCell = new int[length];
        int[] newCell = new int [length];

        for (Integer i = 0; i < length ; i++ ){
            newCell[i] = states[i];
            oldCell[i]= states[i];
        }

        for (int d = 0; d < days; d++) {
            for (Integer i = 0; i < length ; i++ ){
                oldCell[i] = newCell[i];
            }
            // checking edge cases
            if (oldCell[1] == 0) {
                newCell[0] = 0;
            } else newCell[0] = 1;
            if (oldCell[6] == 0) {
                newCell[7] = 0;
            } else newCell[7] = 1;

            // checking regular cases
            for (int i = 1; i <= length-2; i++) {
                if (oldCell[i - 1] == oldCell[i + 1]) {
                    newCell[i] = 0;
                } else newCell[i] = 1;

            }
        }
      List currentState = new ArrayList();
        for (int i = 0; i < length; i++) {
            currentState.add(newCell[i]);
        }
        return currentState;
    }

}