package com.example.myapplicationspinner;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edtId,edtName;
    RadioButton radMale,radFemale;
    Spinner spProgram;
    TextView txtResult;
    Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        edtId=findViewById(R.id.edtId);
        edtName=findViewById(R.id.edtName);
        radMale=findViewById(R.id.radMale);
        radFemale=findViewById(R.id.radFemale);
        spProgram=findViewById(R.id.spProgram);
        btnSubmit=findViewById(R.id.btnSubmit);
        txtResult=findViewById(R.id.txtResult);
        String []programs={"a","b","c"};
//        for(String program:programs)
//        {
//            spProgram.append;
//        }
        spProgram.setOnItemSelectedListener(null);
        spProgram.setSelection(0);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String id=edtId.getText().toString();
                String name=edtName.getText().toString();
                String gender="";
                if(radMale.isChecked())
                    gender="Male";
                else
                    gender="Female";


//            if(spProgram.getCount()==0){
//                txtResult.setText("no data");
//                return;
//            }

                String program=programs[spProgram.getSelectedItemPosition()];
                txtResult.setText("Student ID="+id+"\n"+"Student Name="+name+"\n"+"Gender="+gender+"\n"+"Program="+program);

            }
        });
    }
}