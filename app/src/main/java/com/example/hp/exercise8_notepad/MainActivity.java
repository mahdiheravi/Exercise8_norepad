package com.example.hp.exercise8_notepad;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    View mydlg;
    AlertDialog diolog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);

        Button btndialog = (Button) findViewById(R.id.btndialog);
        btndialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();
                mydlg = inflater.inflate(R.layout.mydialog, null ,false);
                Button btnset = (Button) mydlg.findViewById(R.id.btnset);
                Button btncancel = (Button) mydlg.findViewById(R.id.btncancel);

                diolog = builder.setView(mydlg).create();
                diolog.show();

                btnset.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        diolog.dismiss();
                    }
                });
                btncancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        diolog.dismiss();
                    }
                });




            }
        });
    }
}
