package com.crud.edwar.micrudandroidstudio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.crud.edwar.micrudandroidstudio.R.id.consult_usuarios_listView;
import static com.crud.edwar.micrudandroidstudio.R.id.registrar_usuario;

public class MainActivity extends AppCompatActivity {
    Button reg_usu, consult_usu, consult_usu_spinner, consult_usu_listView;
    Button btn_prueba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        conectionSQLiteHelper conn = new conectionSQLiteHelper(this, "bd_usuarios", null, 1);

        reg_usu = (Button) findViewById(R.id.registrar_usuario);
        consult_usu = (Button) findViewById(R.id.consultar_usuarios);
        consult_usu_spinner = (Button) findViewById(R.id.consult_usuarios_spinner);
        consult_usu_listView = (Button) findViewById(R.id.consult_usuarios_listView);



        reg_usu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.registrar_datos);
            }
        });

        consult_usu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.consultar_usuarios);
            }
        });

        consult_usu_spinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.consult_usuario_spinner);
            }
        });

        consult_usu_listView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.consult_usuario_listview);
            }
        });
    }


}
