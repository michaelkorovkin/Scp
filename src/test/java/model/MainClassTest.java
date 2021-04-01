package model;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainClassTest {
    private List incoming = new ArrayList();
    private MainClass mainClass = new MainClass();
    @Before
    public void prepare (){
        for (int i = 0; i < 100; i++){
            Random rnd = new Random();
            incoming.add(rnd.nextInt(20)+1);
        }
    }

    @Test
    public void execute() {
        mainClass.execute(incoming);
        mainClass.getResult().toString();

    }
}
