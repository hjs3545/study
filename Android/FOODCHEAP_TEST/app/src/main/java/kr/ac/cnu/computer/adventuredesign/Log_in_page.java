package kr.ac.cnu.computer.adventuredesign;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Log_in_page extends AppCompatActivity {

    Button login;
    EditText getUserEmail;
    EditText getUserPassword;
    TextView sign;

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.log_in_page);

        //로그인 버튼
        login = findViewById(R.id.login);

        //로그인 버튼 클릭시, Home_page.xml로 이동
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Home_page.class);
                startActivity(intent);
            }
        });

        //회원가입 버튼
        sign = findViewById(R.id.signin);

        //회원가입 버튼 클릭시, 회원가입 페이지로 이동
        sign.setOnClickListener(v -> {
            Intent intent = new Intent(this, Signup_page.class);
            startActivity(intent);
        });
    }
}
