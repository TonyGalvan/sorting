package uaslp.enginering.labs;

public class IntegerDescendantComparator implements Comparator{

    @Override
    public int compare(Object left, Object right){
        Integer integerLeft = (Integer)left;
        Integer integerRight = (Integer)right;

        return  integerLeft - integerRight;
    }

}
