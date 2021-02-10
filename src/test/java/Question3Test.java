import static org.junit.jupiter.api.Assertions.*;

class Question3Test {

    int[] array1 = {1, 1, 1, 1, 5, 2, 2, 2, 3, 3, 1};

    @org.junit.jupiter.api.Test
    void Input_Array1_Return_True(){
        int[] expected = {4, 1, 1, 5, 3, 2, 2, 3, 1, 1};
        int[] actual = Question3.lengthEncoding(array1);

        assertArrayEquals(expected, actual);
    }

}