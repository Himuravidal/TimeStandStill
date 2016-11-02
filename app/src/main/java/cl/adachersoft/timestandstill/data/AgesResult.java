package cl.adachersoft.timestandstill.data;

import static android.support.v7.widget.AppCompatDrawableManager.get;

/**
 * Created by cristian on 27-10-2016.
 */

public class AgesResult extends AgesAnswer {

    public AgesResult(String n1, String n2) {
        super(n1, n2);

    }


    public static String result() {

        return "Tu edad es  " + String.valueOf(calculation());

    }

    private static int calculation() {

        int nn1 = Integer.parseInt(getN1());
        int nn2 = Integer.parseInt(getN2());
        return nn2 - nn1;
    }


}
