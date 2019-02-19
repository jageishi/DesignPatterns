package decorator;

public class LineNumber extends TextDecorator {

    public LineNumber(TextComponent component) {
        super(component);
    }

    @Override
    public String getContent() {
        String systemLineSeparator = System.getProperty("line.separator");
        String[] lines = this.component.getContent().split(systemLineSeparator);
        for (int i = 0; i < lines.length; i++) {
            lines[i] = (i + 1) + ":" + lines[i];
        }
        return String.join(systemLineSeparator, lines);
    }
}
