package kr.ac.cnu.computer.dawnnote;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.animation.ObjectAnimator;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class folder_list extends AppCompatActivity{
    // 플로팅버튼 상태
    private boolean fabMain_status = false;

    private FloatingActionButton fabMain;
    private FloatingActionButton fabnote;
    private FloatingActionButton fabfloder;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.folder_list);

        fabMain = findViewById(R.id.imageButton2);
        fabnote = findViewById(R.id.note);
        fabfloder = findViewById(R.id.folder);

        Button tag_switch = (Button) findViewById(R.id.folder_list_switch);
        tag_switch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), tag_list.class);
                startActivity(intent);
                overridePendingTransition(0,0);
                finish();
            }
        });

        ImageButton probability_folder = findViewById(R.id.probability_folder);
        probability_folder.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), probability_list.class);
                startActivity(intent);
            }
        });

        ImageButton c_folder = findViewById(R.id.c_folder);
        c_folder.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), c_list.class);
                startActivity(intent);
            }
        });

        ImageButton ds_folder = findViewById(R.id.ds_folder);
        ds_folder.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), ds_list.class);
                startActivity(intent);
            }
        });

        ImageButton search = findViewById(R.id.floder_list_search);
        search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), search_00.class);
                startActivity(intent);
            }
        });

        // 플러스 플로팅 버튼 클릭
        fabMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleFab();

            }
        });
        // 노트 플로팅 버튼 클릭
        fabnote.setOnClickListener(new View.OnClickListener() {
            popup noteDialog;
            @Override
            public void onClick(View v) {
                noteDialog = new popup(folder_list.this);
                noteDialog.setContentView(R.layout.set_note);
                noteDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                noteDialog.show();
                showSetup(noteDialog);
            }
        });

        // 폴더 플로팅 버튼 클릭
        fabfloder.setOnClickListener(new View.OnClickListener() {
            popup folderDialog;
            @Override
            public void onClick(View v) {
                folderDialog = new popup(folder_list.this);
                folderDialog.setContentView(R.layout.set_folder);
                folderDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                close(folderDialog);
            }
        });
    }

    // 플로팅 액션 버튼 클릭시 애니메이션 효과
    public void toggleFab() {
        if(fabMain_status) {
            // 플로팅 액션 버튼 닫기
            ObjectAnimator fc_animation = ObjectAnimator.ofFloat(fabnote, "translationY", 0f);
            fc_animation.start();
            ObjectAnimator fe_animation = ObjectAnimator.ofFloat(fabfloder, "translationY", 0f);
            fe_animation.start();

        }else {
            // 플로팅 액션 버튼 열기
            ObjectAnimator fc_animation = ObjectAnimator.ofFloat(fabnote, "translationY", -100f);
            fc_animation.start();
            ObjectAnimator fe_animation = ObjectAnimator.ofFloat(fabfloder, "translationY", -200f);
            fe_animation.start();
        }
        // 플로팅 버튼 상태 변경
        fabMain_status = !fabMain_status;
    }
    public void showSetup(popup Dialog){
        Button confirm = Dialog.findViewById(R.id.note_confirm);
        confirm.setOnClickListener(new View.OnClickListener() {
            popup setupDialog;
            @Override
            public void onClick(View v) {
                Dialog.dismiss();
                setupDialog = new popup(folder_list.this);
                setupDialog.setContentView(R.layout.set_popup);
                setupDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                setupDialog.show();
            }
        });
    }
    public void close(popup Dialog){
        Dialog.show();
        Button confirm = Dialog.findViewById(R.id.folder_confirm);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog.dismiss();
            }
        });
    }


    private long backBtnTime = 0;


    @Override
    public void onBackPressed() {
        long curTime = System.currentTimeMillis();
        long gapTime = curTime - backBtnTime;

        if (0 <= gapTime && 2000 >= gapTime) {
            super.onBackPressed();
        } else {
            backBtnTime = curTime;
            Toast.makeText(this, "한번 더 누르면 종료됩니다.", Toast.LENGTH_SHORT).show();
        }


    }
}
