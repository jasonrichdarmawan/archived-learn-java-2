package learn_stringBuilder;

public class Main {
    public static void main (String[] args) {
        StringBuilder builder = new StringBuilder("hello");

        printData(builder);

        System.out.println();

        // append did not use different memory address.
        System.out.println(".append()");
        builder.append(" everyone everyone everyone everyone");

        printData(builder);

        System.out.println();

        // concat use different memory address.
        System.out.println(".concat()");
        String javaString = "hello";
        int addressString = System.identityHashCode(javaString);
        System.out.println("address before .concat() = " + Integer.toHexString(addressString));
        javaString = javaString.concat(" everyone");
        addressString = System.identityHashCode(javaString);
        System.out.println("address after .concat() = " + Integer.toHexString(addressString));

        System.out.println();

        // insert
        System.out.println(".insert()");
        builder.insert(15, "google ");
        printData(builder);

        System.out.println();

        // delete
        System.out.println(".delete()");
        builder.delete(15, 22);
        printData(builder);

        System.out.println();

        // .setCharAt()
        System.out.println(".setCharAt()");
        builder.setCharAt(6, 'E');
        printData(builder);

        System.out.println();

        // replace
        System.out.println("replace()");
        builder.replace(6, 14, "hello");
        printData(builder);

        System.out.println();

        // casting to String
        System.out.println("toString()");
        String toString = builder.toString();
        addressString = System.identityHashCode(toString);
        System.out.println("address = " + Integer.toHexString(addressString));

    }

    private static void printData(StringBuilder dataBuilder) {
        System.out.println("data = " + dataBuilder);
        System.out.println("length = " + dataBuilder.length());
        System.out.println("capacity = " + dataBuilder.capacity());

        int addressBuilder = System.identityHashCode(dataBuilder);
        System.out.println("address = " + Integer.toHexString(addressBuilder));

    }
}