package decorator;

public class PlainText implements TextComponent {

    private String text;

    public PlainText(String text) {
        this.text = text;
    }

    @Override
    public String getContent() {
        return text;
    }
}
