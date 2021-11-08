package functionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDbConnectionUrl());
        System.out.println(getDBConnectionUrlSupplier.get());
        System.out.println(getDBConnectionUrlSupplierList.get().get(1));
    }

    static String getDbConnectionUrl(){
        return "jdbc://localhost:3306/root";
    }

    static Supplier<String> getDBConnectionUrlSupplier = () ->
            "jdbc://localhost:3306/root";

    static Supplier<List<String>> getDBConnectionUrlSupplierList = () ->
          List.of("jdbc://localhost:3306/root","jdbc://localhost:3306/customer");
}
