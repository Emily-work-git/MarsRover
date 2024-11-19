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
//    Test setDirection
    @Test
    public void should_face_north_when_setDirection_to_north(){
        MarsRover rover = new MarsRover();
        rover.setDirection('N');
        String actualStatus = rover.showStatus();
        String expectedStatus = "0:0:N";
        assertEquals(expectedStatus, actualStatus);
    }
    @Test
    public void should_face_east_when_setDirection_to_east(){
        MarsRover rover = new MarsRover();
        rover.setDirection('E');
        String actualStatus = rover.showStatus();
        String expectedStatus = "0:0:E";
        assertEquals(expectedStatus, actualStatus);
    }
    @Test
    public void should_face_south_when_setDirection_to_south(){
        MarsRover rover = new MarsRover();
        rover.setDirection('S');
        String actualStatus = rover.showStatus();
        String expectedStatus = "0:0:S";
        assertEquals(expectedStatus, actualStatus);
    }
    @Test
    public void should_face_west_when_setDirection_to_west(){
        MarsRover rover = new MarsRover();
        rover.setDirection('W');
        String actualStatus = rover.showStatus();
        String expectedStatus = "0:0:W";
        assertEquals(expectedStatus, actualStatus);
    }
}
