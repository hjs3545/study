package kr.ac.cnu.computer.dawnnote;

import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class search_00 extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_00);

        Button search_Button = (Button) findViewById(R.id.search_00_search);
        search_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), search_01_pointer.class);
                startActivity(intent);
            }
        });
        Button back = (Button) findViewById(R.id.search_00_back);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), folder_list.class);
                startActivity(intent);
                finish();
            }
        });
    }
}