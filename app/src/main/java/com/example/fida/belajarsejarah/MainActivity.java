package com.example.fida.belajarsejarah;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void klikSoekarno (View view){
        Intent a = new Intent(this, SoekarnoActivity.class);
        startActivity(a);
    }
    public void klikKartini (View view){
        Intent b = new Intent(this, KartiniActivty.class);
        startActivity(b);
    }
    public void klikKiHajar (View view){
        Intent c = new Intent(this, KiHajarActivity.class);
        startActivity(c);
    }
    public void klikQuiz (View view){
        Intent d = new Intent(this, QuizActivity.class);
        startActivity(d);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        switch (item.getItemId()){
            case R.id.quit:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Apakah anda ingin keluar ?");
                builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                AlertDialog quit = builder.create();
                quit.show();

                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onBackPressed(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Apakah anda ingin keluar?");
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog quit = builder.create();
        quit.show();
    }
}
