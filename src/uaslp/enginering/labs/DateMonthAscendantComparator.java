package uaslp.enginering.labs;

public class DateMonthAscendantComparator implements Comparator {
    @Override
    public int compare(Object left, Object right) {
        Alumno monthLeft = (Alumno) left;
        Alumno monthRight = (Alumno)right;

        return  monthRight.getBirthday().getMonth().compareTo(monthLeft.getBirthday().getMonth());
    }
}
