import static org.junit.jupiter.api.Assertions.*;

class Question1Test {

    static String str1 = "Warning: load is high on (host.ip)";
    static String str2 = "((hello)(world))";
    static String str3 = "my (monitor))(message";
    static String str4 = "abc";

    @org.junit.jupiter.api.Test
    void Input_str1_Return_true() {
        assertTrue(Question1.isBalance(str1));
    }

    @org.junit.jupiter.api.Test
    void Input_str2_Return_true(){
        assertTrue(Question1.isBalance(str2));
    }

    @org.junit.jupiter.api.Test
    void Input_str3_Return_False(){
        assertFalse(Question1.isBalance(str3));
    }

    @org.junit.jupiter.api.Test
    void Input_empty_Return_False(){
        assertFalse(Question1.isBalance(""));
    }

    @org.junit.jupiter.api.Test
    void Input_str4_Return_False(){
        assertFalse(Question1.isBalance(str4));
    }
}