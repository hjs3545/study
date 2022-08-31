package kr.ac.cnu.computer.dawnnote;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class search_01_pointer extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_01_pointer);

        Button back = (Button) findViewById(R.id.search_01_back);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), search_00.class);
                startActivity(intent);
                finish();
            }
        });

        Button note_c_01 = (Button) findViewById(R.id.note_c_01);
        note_c_01.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), c_note01.class);
                startActivity(intent);
                finish();
            }
        });

        Button note_c_02 = (Button) findViewById(R.id.note_c_02);
        note_c_02.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), c_note02.class);
                startActivity(intent);
                finish();
            }
        });

        Button note_c_03 = (Button) findViewById(R.id.note_c_03);
        note_c_03.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), c_note03.class);
                startActivity(intent);
                finish();
            }
        });

        Button tag_c_01 = (Button) findViewById(R.id.tag_c_01);
        tag_c_01.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), c_tagnote_1.class);
                startActivity(intent);
                finish();
            }
        });

        Button tag_c_02 = (Button) findViewById(R.id.tag_c_02);
        tag_c_02.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), c_tagnote_2.class);
                startActivity(intent);
                finish();
            }
        });

        Button tag_c_03 = (Button) findViewById(R.id.tag_c_03);
        tag_c_03.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), c_tagnote_3.class);
                startActivity(intent);
                finish();
            }
        });
    }
}