package decorator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LineNumberTest {

    @Test
    public void textComponent_getContent_returns_a_line() {
        TextComponent textComponent = mock(TextComponent.class);

        when(textComponent.getContent()).thenReturn("body1");

        assertThat(
                new LineNumber(textComponent).getContent(),
                is("1:body1")
        );
    }

    @Test
    public void textComponent_getContent_returns_two_lines() {
        TextComponent textComponent = mock(TextComponent.class);

        when(textComponent.getContent()).thenReturn(
                "body1" + System.getProperty("line.separator") + "body2"
        );

        assertThat(
                new LineNumber(textComponent).getContent(),
                is("1:body1" + System.getProperty("line.separator") + "2:body2")
        );
    }
}