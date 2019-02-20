package decorator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FooterTest {

    @Test
    public void textComponent_getContent_returns_normal_string() {
        TextComponent textComponent = mock(TextComponent.class);

        when(textComponent.getContent()).thenReturn("body");

        assertThat(
                new Footer(textComponent).getContent(),
                is("body" + System.getProperty("line.separator") + "Footer")
        );
    }
}