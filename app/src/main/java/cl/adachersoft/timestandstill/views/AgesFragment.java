package cl.adachersoft.timestandstill.views;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import cl.adachersoft.timestandstill.R;
import cl.adachersoft.timestandstill.data.AgesResult;

public class AgesFragment extends Fragment {

    private TextInputEditText ages1, ages2;
    private Button button;


    public static AgesFragment newInstance() {
        return new AgesFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ages, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ages1 = (TextInputEditText) view.findViewById(R.id.Agess1);
        ages2 = (TextInputEditText) view.findViewById(R.id.Agess2);


        button = (Button) view.findViewById(R.id.calcuBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String n1 = (ages1.getText().toString());
                String n2 = (ages2.getText().toString());

                AgesResult agesResult = new AgesResult(n1, n2);
                AlertDialog.Builder dialog = new AlertDialog.Builder(getContext());
                dialog.setMessage(AgesResult.result());
                dialog.show();
            }
        });
    }
}
