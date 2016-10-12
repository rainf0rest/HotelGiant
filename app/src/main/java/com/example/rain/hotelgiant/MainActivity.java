package com.example.rain.hotelgiant;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AlertDialog.Builder builder;
    int score = 0;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.testbtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // showWinDia();
            }
        });

    }

    private void showWinDia() {
        builder = new AlertDialog.Builder(MainActivity.this);
        builder.setIcon(R.drawable.win);
        builder.setTitle(R.string.dia_game_win_title);
        builder.setMessage(R.string.dia_game_win_content + score);

        builder.setPositiveButton(R.string.dia_game_win_posbtn, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"pos",Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton(R.string.dia_game_win_negbtn, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"neg",Toast.LENGTH_SHORT).show();
            }
        });

        builder.setCancelable(true);
        AlertDialog dialog=builder.create();
        dialog.show();

    }
}
