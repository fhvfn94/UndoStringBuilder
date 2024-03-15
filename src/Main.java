public class Main {
    StringBuilder text = new StringBuilder();
    StringBuilder snapshot = new StringBuilder();

    public void append(String string) {
        snapshot.append(text);
        text.append(string);
    }

    public void undo() {
        text = new StringBuilder(snapshot);
    }
    public String toString() {
        return text.toString();
    }

    static {
        System.out.println("это статика");
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.append("Hello, ");
        System.out.println(main);
        main.append("world!");
        System.out.println(main);
        main.undo();
        System.out.println(main);
    }
}