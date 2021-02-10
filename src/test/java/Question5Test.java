import static org.junit.jupiter.api.Assertions.*;

class Question5Test {

    Question5.Job[] jobs =
            {
            new Question5.Job(1, 30, new int[]{2, 4}),
                    new Question5.Job(2, 10, new int[]{3}),
                    new Question5.Job(4, 60, new int[]{}),
                    new Question5.Job(3, 20, new int[]{})
            };

    @org.junit.jupiter.api.Test
    void Input_jobIds_1_Return_120(){

        int expected = 120;
        assertEquals(expected, Question5.findTotalJobTime(1,jobs));

    }

    @org.junit.jupiter.api.Test
    void Input_jobIds_2_Return_30(){

        int expected = 30;
        assertEquals(expected, Question5.findTotalJobTime(2,jobs));

    }

    @org.junit.jupiter.api.Test
    void Input_jobIds_4_Return_60(){

        int expected = 60;
        assertEquals(expected, Question5.findTotalJobTime(4,jobs));

    }


}