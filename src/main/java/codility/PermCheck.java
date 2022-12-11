package codility;

import static java.util.Arrays.sort;

public class PermCheck {
    public boolean solution(int[] input) {
        sort(input);

        for (var index = 0; index < input.length; index++) {
            var element = index + 1;

            if (element != input[index]) {
                return false;
            }
        }
        return true;
    }
}
