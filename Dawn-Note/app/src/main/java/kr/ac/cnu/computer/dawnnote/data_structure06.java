package kr.ac.cnu.computer.dawnnote;

import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class data_structure06 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_structure06);

        ImageButton back = findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), ds_list.class);
                startActivity(intent);
                finish();
            }
        });
    }
}