package uaslp.enginering.labs;

public class AlumnoAscendantCompare implements Comparator {

    @Override
    public int compare(Object left, Object right){
        String stringLeft = (String)left;
        String stringRight = (String)right;

        return stringRight.compareTo(stringLeft);
    }
}
