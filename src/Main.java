public class Main {

    static String x = "";

    public static void main(String[] args) {

        executeAction(new Float(0));
        executeAction(new Double(0));
        executeAction(new String("c"));
        executeAction(new Float(0));
        System.out.println(x);
    }

    static void executeAction(Integer ... var){ x += "a"; }

    static void executeAction(Integer var){ x += "b"; }

    static void executeAction(Object var){ x += "c"; }

    static void executeAction(Short var){ x += "d"; }

    static void executeAction(Float var){ x += "e"; }

    static void executeAction(Double var){ x += "f"; }

}
