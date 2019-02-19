package decorator;

public class Header extends TextDecorator {

    public Header(TextComponent component) {
        super(component);
    }

    @Override
    public String getContent() {
        return "Header"
                + System.getProperty("line.separator")
                + this.component.getContent();
    }
}

