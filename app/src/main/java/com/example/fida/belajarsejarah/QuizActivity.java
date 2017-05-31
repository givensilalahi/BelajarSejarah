package com.example.fida.belajarsejarah;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        checkBox1 = (CheckBox) findViewById(R.id.cb1);
        checkBox2 = (CheckBox) findViewById(R.id.cb2);
        checkBox3 = (CheckBox) findViewById(R.id.cb3);
        checkBox4 = (CheckBox) findViewById(R.id.cb4);
        checkBox5 = (CheckBox) findViewById(R.id.cb5);
    }

    public void onKlik11(View view) {
        checkBox1.setChecked(true);
        Toast.makeText(this, R.string.true_answer, Toast.LENGTH_SHORT).show();
    }

    public void onKlik12(View view) {
        checkBox1.setChecked(false);
        Toast.makeText(this, R.string.false_answer, Toast.LENGTH_SHORT).show();
        final Intent i = new Intent(this, SoekarnoActivity.class);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Apakah anda ingin belajar lagi?");
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            startActivity(i);
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

    public void onKlik13(View view) {
        checkBox1.setChecked(false);
        Toast.makeText(this, R.string.false_answer, Toast.LENGTH_SHORT).show();
        final Intent i = new Intent(this, SoekarnoActivity.class);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Apakah anda ingin belajar lagi?");
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(i);
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

    public void onKlik21(View view) {
        checkBox2.setChecked(false);
        Toast.makeText(this, R.string.false_answer, Toast.LENGTH_SHORT).show();
        final Intent i = new Intent(this, KartiniActivty.class);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Apakah anda ingin belajar lagi?");
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(i);
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

    public void onKlik22(View view) {
        checkBox2.setChecked(true);
        Toast.makeText(this, R.string.true_answer, Toast.LENGTH_SHORT).show();
    }

    public void onKlik23(View view) {
        checkBox2.setChecked(false);
        Toast.makeText(this, R.string.false_answer, Toast.LENGTH_SHORT).show();
        final Intent i = new Intent(this, KartiniActivty.class);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Apakah anda ingin belajar lagi?");
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(i);
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

    public void onKlik31(View view) {
        checkBox3.setChecked(true);
        Toast.makeText(this, R.string.true_answer, Toast.LENGTH_SHORT).show();
    }

    public void onKlik32(View view) {
        checkBox3.setChecked(false);
        Toast.makeText(this, R.string.false_answer, Toast.LENGTH_SHORT).show();
        final Intent i = new Intent(this, KiHajarActivity.class);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Apakah anda ingin belajar lagi?");
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(i);
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

    public void onKlik33(View view) {
        checkBox3.setChecked(false);
        Toast.makeText(this, R.string.false_answer, Toast.LENGTH_SHORT).show();
        final Intent i = new Intent(this, KiHajarActivity.class);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Apakah anda ingin belajar lagi?");
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(i);
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

    public void onKlik41(View view) {
        checkBox4.setChecked(false);
        Toast.makeText(this, R.string.false_answer, Toast.LENGTH_SHORT).show();
        final Intent i = new Intent(this, KartiniActivty.class);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Apakah anda ingin belajar lagi?");
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(i);
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

    public void onKlik42(View view) {
        checkBox4.setChecked(true);
        Toast.makeText(this, R.string.true_answer, Toast.LENGTH_SHORT).show();
    }

    public void onKlik43(View view) {
        checkBox4.setChecked(false);
        Toast.makeText(this, R.string.false_answer, Toast.LENGTH_SHORT).show();
        final Intent i = new Intent(this, KartiniActivty.class);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Apakah anda ingin belajar lagi?");
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(i);
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

    public void onKlik51(View view) {
        checkBox5.setChecked(true);
        Toast.makeText(this, R.string.true_answer, Toast.LENGTH_SHORT).show();
    }

    public void onKlik52(View view) {
        checkBox5.setChecked(false);
        Toast.makeText(this, R.string.false_answer, Toast.LENGTH_SHORT).show();
        final Intent i = new Intent(this, SoekarnoActivity.class);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Apakah anda ingin belajar lagi?");
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(i);
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

    public void onKlik53(View view) {
        checkBox5.setChecked(false);
        Toast.makeText(this, R.string.false_answer, Toast.LENGTH_SHORT).show();
        final Intent i = new Intent(this, SoekarnoActivity.class);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Apakah anda ingin belajar lagi?");
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(i);
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

    public void onKlikDone(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
