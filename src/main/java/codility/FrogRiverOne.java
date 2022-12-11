package codility;

import java.util.Set;

import static java.util.stream.Collectors.toSet;
import static java.util.stream.IntStream.rangeClosed;

public class FrogRiverOne {
    public int solution(int destination, int[] theLeaves) {
        var theRiver = rangeClosed(1, destination).boxed().collect(toSet());
        for (var theMoment = 0; theMoment < theLeaves.length; theMoment++) {
            var theLeaf = theLeaves[theMoment];
            markTheLeafHasFallen(theRiver, theLeaf);
            if (areSufficientLeavesToStartToCount(destination, theMoment)
                    && isRiverFullOfLeaves(theRiver)) {
                return theMoment;
            }
        }

        return -1;
    }

    private static void markTheLeafHasFallen(Set<Integer> theRiver, int leaf) {
        theRiver.remove(leaf);
    }

    private static boolean areSufficientLeavesToStartToCount(int destination, int theMoment) {
        return theMoment + 1 >= destination;
    }

    private static boolean isRiverFullOfLeaves(Set<Integer> theRiver) {
        return theRiver.isEmpty();
    }
}
