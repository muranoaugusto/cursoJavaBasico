package projects.e125;

import java.text.ParseException;
import projects.e125.application125.Execution125;

public class E125 {

    public void exe125(){
    Execution125 exe125 = new Execution125();
    try {
        exe125.execution125();
    } catch (ParseException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
    }

}