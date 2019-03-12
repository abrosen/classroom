import java.util.Collections;
import java.util.List;

public class ArrayListInClass {


    // [A,A,B]
    // [A,A,B]
    public static <E> boolean isPermutation(List<E> A, List<E> B) {
        if(A.size() != B.size()) {
            return false;
        }
        for(E item :  A) {
            int countA = 0;
            int countB = 0;

            for (int i = 0; i < A.size(); i++) {
                if(A.get(i).equals(item)){ countA++; }
            }

            for (int i = 0; i < B.size(); i++) {
                if(B.get(i).equals(item)) { countB++; }
            }
            if (countA != countB) { return false; }

        }
        return true;
    }
}

