import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question4Test {

    String[] tags = {"host:a,role:web,availability-zone:us-east-1a",
            "host:b,role:web,availability-zone:us-east-1b",
            "host:a,role:web,availability-zone:us-east-1a",
            "host:c,role:db,db_role:master,availability-zone:us-east-1e",
            "host:d,role:db,db_role:replica,availability-zone:us-east-1a",
            "host:e,role:intake,availability-zone:us-east-1a",
            "host:e,role:intake,availability-zone:us-east-1a",
            "host:f,role:kafka,availability-zone:us-east-1a"};

    @org.junit.jupiter.api.Test
    void Input_Tags_Return_True(){
        String expected =
                "'availability-zone:us-east-1a': 6,"
                +"'db_role:master': 1,"
                +"'availability-zone:us-east-1b': 1,"
                +"'host:d': 1,"
                +"'role:db': 2,"
                +"'host:b': 1,"
                +"'host:c': 1,"
                +"'host:a': 2,"
                +"'role:web': 3,"
                +"'host:f': 1,"
                +"'role:kafka': 1,"
                + "'host:e': 2,"
                +"'availability-zone:us-east-1e': 1,"
                + "'db_role:replica': 1,"
                + "'role:intake': 2";
        expected = Stream.of(expected.split(",")).sorted((a,b)-> a.compareTo(b)).collect(Collectors.joining(",","{","}"));
        String actual = Question4.SimplifiedTagsCounts(tags);
        assertEquals(expected, actual);
    }
}