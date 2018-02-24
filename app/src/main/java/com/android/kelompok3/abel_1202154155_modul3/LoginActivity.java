package com.android.kelompok3.abel_1202154155_modul3;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button a;
    private EditText c,d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        a = (Button) findViewById(R.id.login);
        c = (EditText) findViewById(R.id.username);
        d = (EditText) findViewById(R.id.password);

    }

    public void oke (View view) {
        final String user = c.getText().toString();
        String pass = d.getText().toString();

        if ((user.equals("EAD") && pass.equals("MOBILE")) ||(user.equals("AJUNANDO") && pass.equals("AJUNANDO"))){
            Toast.makeText(this,"Anda berhasil login",Toast.LENGTH_LONG).show();
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("Alert Message");
            alert.setMessage("Login Success")
                    .setCancelable(false)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent d = new Intent(LoginActivity.this,MainActivity.class);
                            d.putExtra("username",user);
                            startActivity(d);
                        }
                    });
            AlertDialog alertDialog = alert.create();
            alertDialog.show();



        }

    }
}

