package com.example.meuapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class eu_droid_Activity2 extends AppCompatActivity {

    private Button btn_sair;
    private ImageView bnt_mais_ibm;
    private ImageView bnt_mundo;
    private ImageView bnt_bem_estar;
    private ImageView bnt_jobs;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eu_droid2);

        btn_sair = findViewById(R.id.btn_sair);

        String tv_email = getIntent().getStringExtra("chave_tv_email");
        String tv_senha = getIntent().getStringExtra("chave_tv_senha");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //Mostrar o botão
        getSupportActionBar().setHomeButtonEnabled(true);      //Ativar o botão
        getSupportActionBar().setTitle("Sua IBM");     //Titulo para ser exibido na sua Action Bar em frente à seta

        btn_sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        bnt_mais_ibm = (ImageView) findViewById(R.id.mais_ibm);
        bnt_mais_ibm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ibm.com/br-pt/")));
            }
        });

        bnt_mundo = (ImageView) findViewById(R.id.mundo);
        bnt_mundo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ibm.com/blogs/ibm-comunica/")));
            }
        });

        bnt_bem_estar = (ImageView) findViewById(R.id.bem_estar);
        bnt_bem_estar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ibm.com/industries/br-pt/healthcare/trends-insights.html")));
            }
        });

        bnt_jobs = (ImageView) findViewById(R.id.jobs);
        bnt_jobs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ibm.com/br-pt/employment/index.html")));
            }
        });
    }
        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case android.R.id.home:
                    startActivity(new Intent(this, MainActivity.class));
                    finishAffinity();
                    break;
                default:break;
            }
            return true;
    }
}
