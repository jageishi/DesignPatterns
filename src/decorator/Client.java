package decorator;

public class Client {

    public static void main(String[] args) {
        TextComponent component = getComponent();
        System.out.println(component.getContent());
    }

    public static TextComponent getComponent() {
        return new LineNumber(new Header(new Footer(new PlainText("Body"))));
    }
}
