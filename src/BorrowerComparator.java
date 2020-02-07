import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;


public class BorrowerComparator implements Comparator<Borrowers> {
    @Override
    public int compare(Borrowers borrowers, Borrowers borrowers2) {
        if(borrowers.getLevel() > borrowers2.getLevel()){
            return 1;
        }
        else if(borrowers.getLevel() < borrowers2.getLevel()){
            return -1;
        }
        return 0;
    }
}
