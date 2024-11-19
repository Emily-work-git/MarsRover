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
    @Test
    public void should_face_north_when_setDirection_to_north(){
        MarsRover rover = new MarsRover();
        rover.setDirection('N');
        String actualStatus = rover.showStatus();
        String expectedStatus = "0:0:N";
        assertEquals(expectedStatus, actualStatus);
    }
}
