import org.example.MarsRover;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {
    @Test
    public void should_initialize_mars_rover() {
        MarsRover rover = new MarsRover();
        String actualStatus = rover.showStatus();
        String expectedStatus = "0:0:N";
        assertEquals(expectedStatus, actualStatus);
    }
}
