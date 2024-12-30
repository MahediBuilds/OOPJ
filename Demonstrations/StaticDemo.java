class Main {
    static String msg = "Static Message";

    static void printMsg() {
        System.out.println("Static Method Message");
    }

    public static void main(String[] args) {
        System.out.println(Main.msg);
        Main.printMsg();
    }
}
