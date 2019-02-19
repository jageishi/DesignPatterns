package decorator;

public class Footer extends TextDecorator {

    public Footer(TextComponent component) {
        super(component);
    }

    @Override
    public String getContent() {
        return this.component.getContent()
                + System.getProperty("line.separator")
                + "Footer";
    }
}
