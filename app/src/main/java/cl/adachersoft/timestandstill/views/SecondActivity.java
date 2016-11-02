package cl.adachersoft.timestandstill.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;


import cl.adachersoft.timestandstill.R;

/**
 * Created by cristian on 27-10-2016.
 */

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        TextView edad = (TextView) findViewById(R.id.Ages);
    }
}
