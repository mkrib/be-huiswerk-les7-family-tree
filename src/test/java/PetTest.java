import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PetTest {
    @Test
    public void getNameTest() {
//        Arrange
        Pet dog = new Pet("Lennie", 1, "dog");
//        Act
        String name = dog.getName();
//        Assert
        assertEquals("Lennie", name);
    }
}