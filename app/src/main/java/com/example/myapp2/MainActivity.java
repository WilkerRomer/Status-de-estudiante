package com.example.myapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText ET1;
    private EditText ET2;
    private EditText ET3;
    private TextView TV1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ET1 = (EditText)findViewById(R.id.numero_1);
        ET2 = (EditText)findViewById(R.id.numero_2);
        ET3 = (EditText)findViewById(R.id.numero_3);
        TV1 = (TextView)findViewById(R.id.Resultado);
    }

    public void estatus(View view) {
        String Matematicas_String = ET1.getText().toString();
        String Fisica_String = ET2.getText().toString();
        String Quimica_String = ET3.getText().toString();

        int Matematicas_int = Integer.parseInt(Matematicas_String);
        int Fisicas_int = Integer.parseInt(Fisica_String);
        int Quimica_int = Integer.parseInt(Quimica_String);

        int promedio = (Matematicas_int + Fisicas_int + Quimica_int) / 3;

        if(promedio >=6 ) {
            TV1.setText("Estatus Aprobado con" + promedio);
        }else if (promedio <=5) {
            TV1.setText("Estatus Reprobado con" + promedio);
        }
    }
}