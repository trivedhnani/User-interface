package com.example.hp.userinterface;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView t1,t2,t3,t4,t5;
SeekBar s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView)findViewById(R.id.txt1);
        t2=(TextView)findViewById(R.id.txt2);
        t3=(TextView)findViewById(R.id.txt3);
        t4=(TextView)findViewById(R.id.txt4);
        t5=(TextView)findViewById(R.id.txt5);
        s=(SeekBar)findViewById(R.id.sbar);
        s.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float[] hsvColor = {1, 1, 1};
                float[] hsvColor2 = {0, 1, 1};
                float[] hsvColor3 = {0, 1, 3};
                float[] hsvColor4 = {0, 56, 1};
                hsvColor[0] = 360f * progress /255;
                hsvColor2[0] = 360f * progress /200;
                hsvColor3[0] = 360f * progress /150;
                hsvColor4[0] = 360f * progress /205;
                t1.setBackgroundColor(Color.HSVToColor(hsvColor));
                t2.setBackgroundColor(Color.HSVToColor(hsvColor2));
                t3.setBackgroundColor(Color.HSVToColor(hsvColor3));
                t4.setBackgroundColor(Color.HSVToColor(hsvColor4));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {


            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            default:
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("inspired " +
                        "by " +
                        "the " +
                        "works " +
                        "of " +
                        "Modern " +
                        "Art " +
                        "masters  " +
                        "such " +
                        "as\n" +
                        "Piet " +
                        "Mondrian " +
                        "and " +
                        "Ben " +
                        "Nicholson.\n"+"           Click below to learn more")
                        .setPositiveButton("Visit MOMA", new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog,int which){
                                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                                startActivity(i);
                            }
                        }).setNegativeButton("Not Now",null);
                AlertDialog alert=builder.create();
                alert.show();

    }
    return super.onOptionsItemSelected(item);
}
}

