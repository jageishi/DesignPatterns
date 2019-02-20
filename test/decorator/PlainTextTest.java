package decorator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PlainTextTest {

    @Test
    public void whenPassToNormalStringToConstructorGetContentReturnsIt() {
        TextComponent component = new PlainText("test");

        assertThat(component.getContent(), is("test"));
    }
}