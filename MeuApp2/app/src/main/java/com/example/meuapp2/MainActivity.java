package com.example.meuapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnEntrar;
    private EditText tv_email, tv_senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_email = findViewById(R.id.editTextTextEmailAddress);
        tv_senha = findViewById(R.id.editTextNumberPassword);

        btnEntrar = findViewById(R.id.button);
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String variavelEmail = tv_email.getText().toString();
                String variavelSenha = tv_senha.getText().toString();

                if (variavelEmail.equals("rogerio@ibm.com") && variavelSenha.equals("123")) {
                    Intent intent = new Intent(MainActivity.this, eu_droid_Activity2.class);
                    intent.putExtra("chave_tv_email", variavelEmail);
                    intent.putExtra("chave_tv_senha", variavelSenha);
                    startActivity(intent);
                } else {

                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Confirmação")
                            .setMessage("A sua senha está correta?")
                            .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    Toast.makeText(getApplicationContext(),
                                            "Sim",
                                            Toast.LENGTH_LONG).show();
                                }
                            })

                            .setNegativeButton("Não", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    Toast.makeText(getApplicationContext(),
                                            "Não",
                                            Toast.LENGTH_LONG).show();
                                }
                            })
                            .setIcon(android.R.drawable.ic_delete)
                            .show();
                }

            }
        });
    }
}
