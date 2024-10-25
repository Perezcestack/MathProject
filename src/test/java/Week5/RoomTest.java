package Week5;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_rooms_shouldBeDirtyAndOccupied() {
        //arrange
        Room room = new Room(2,50.0, false, false);
        assertFalse(room.isDirty());
        assertFalse(room.isOccupied());
        //act
        room.checkIn();
        //assert
        assertTrue(room.isDirty());
        assertTrue(room.isOccupied());
    }

    @Test
    public void checkOut_rooms_shouldBeOnlyDirty() {
        Room room = new Room(2,50.0, true, true);
        assertTrue(room.isDirty());
        assertTrue(room.isOccupied());
        //act
        room.checkOut();
        //assert
        assertTrue(room.isDirty());
        assertFalse(room.isOccupied());

    }

    @Test
    public void cleanRoom_rooms_shouldBeCleanAndUnoccupied() {
        Room room = new Room(2,50.0, false, true);
        assertTrue(room.isDirty());
        assertFalse(room.isOccupied());
        //act
        room.cleanRoom();
        //assert
        assertFalse(room.isDirty());
        assertFalse(room.isOccupied());
    }
}