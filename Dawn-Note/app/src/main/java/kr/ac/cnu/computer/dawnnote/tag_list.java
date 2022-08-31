package kr.ac.cnu.computer.dawnnote;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class tag_list extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tag_list);

        Button folder_switch = (Button) findViewById(R.id.tag_list_switch);
        folder_switch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), folder_list.class);
                startActivity(intent);
                overridePendingTransition(0,0);
                finish();
            }
        });

        Button tag_c_01 = (Button) findViewById(R.id.tag_c_01);
        tag_c_01.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), c_tagnote_1.class);
                startActivity(intent);
            }
        });

        Button tag_c_02 = (Button) findViewById(R.id.tag_c_02);
        tag_c_02.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), c_tagnote_2.class);
                startActivity(intent);
            }
        });

        Button tag_c_03 = (Button) findViewById(R.id.tag_c_03);
        tag_c_03.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), c_tagnote_3.class);
                startActivity(intent);
            }
        });

        Button tag_probability_01 = (Button) findViewById(R.id.tag_probability_01);
        tag_probability_01.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), probability_tagnote_1.class);
                startActivity(intent);
            }
        });

        Button tag_probability_02 = (Button) findViewById(R.id.tag_probability_02);
        tag_probability_02.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), probability_tagnote_2.class);
                startActivity(intent);
            }
        });

        Button tag_probability_03 = (Button) findViewById(R.id.tag_probability_03);
        tag_probability_03.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), probability_tagnote_3.class);
                startActivity(intent);
            }
        });

        Button tag_ds_04 = (Button) findViewById(R.id.tag_ds_04);
        tag_ds_04.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), ds_tagnote_4.class);
                startActivity(intent);
            }
        });

        Button tag_ds_05 = (Button) findViewById(R.id.tag_ds_05);
        tag_ds_05.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), ds_tagnote_56.class);
                startActivity(intent);
            }
        });

        Button tag_ds_07 = (Button) findViewById(R.id.tag_ds_07);
        tag_ds_07.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), ds_tagnote_78.class);
                startActivity(intent);
            }
        });

        ImageButton search = findViewById(R.id.tag_list_search);
        search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), search_00.class);
                startActivity(intent);
            }
        });
    }
}