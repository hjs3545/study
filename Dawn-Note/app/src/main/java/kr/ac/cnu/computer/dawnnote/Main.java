package kr.ac.cnu.computer.dawnnote;

import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Main extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Loadingstart();
    }

    public void Loadingstart(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            public void run (){
                Intent intent = new Intent(getApplicationContext(), folder_list.class);
                startActivity(intent);
                finish();
            }
        },2000);

    }
}




