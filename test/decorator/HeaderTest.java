package decorator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HeaderTest {

    @Test
    public void whenTextComponentGetContentReturnsNormalString() {
        TextComponent textComponent = mock(TextComponent.class);

        when(textComponent.getContent()).thenReturn("body");

        assertThat(
                new Header(textComponent).getContent(),
                is("Header" + System.getProperty("line.separator") + "body")
        );
    }
}