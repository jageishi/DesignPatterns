package decorator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PlainTextTest {

    @Test
    public void getContent_returns_normal_string() {
        TextComponent component = new PlainText("test");

        assertThat(component.getContent(), is("test"));
    }
}