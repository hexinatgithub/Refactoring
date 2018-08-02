import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

    private FileReader _input;

    @Before
    public void setUp() throws Exception {
        try {
            _input = new FileReader("Chapter4/data.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException("unable to open test file");
        }
    }

    @After
    public void tearDown() throws Exception {
        try {
            _input.close();
        } catch (IOException e) {
            throw new RuntimeException("error on closing test file");
        }
    }

    @Test
    public void testRead() throws IOException {
        char ch = '&';
        for (int i = 0; i < 4; i++) {
            ch = (char) _input.read();
        }
        assert('d' == ch);
    }

}