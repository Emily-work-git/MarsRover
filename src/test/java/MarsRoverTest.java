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
//  Test executeCommand
    //Turn Left
    //Given Position = (0,0,N), Command = L When execute marsRoverController Then Position = (0,0,W)
    //Given Position = (0,0,S), Command = L When execute marsRoverController Then Position = (0,0,E)
    //Given Position = (0,0,E), Command = L When execute marsRoverController Then Position = (0,0,N)
    //Given Position = (0,0,W), Command = L When execute marsRoverController Then Position = (0,0,S)
    @Test
    public void should_face_west_when_orient_north_and_turn_left() {
        MarsRover rover = new MarsRover();
        rover.setDirection('N');
        String actualStatus = rover.executeCommand("L");
        String expectedStatus = "0:0:W";
        assertEquals(expectedStatus, actualStatus);
    }


}
