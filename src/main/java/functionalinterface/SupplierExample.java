package functionalinterface;

import java.util.function.Supplier;

public class SupplierExample {

    private static String getDBConnectionUrl() {
        return "jdbc:postgresql://localhost:6632/db";
    }

    private static final Supplier<String> dbConnectionUrlSupplier =
            () -> "jdbc:postgresql://localhost:6632/db";

    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(dbConnectionUrlSupplier.get());
    }

}
