package cn.edu.bit.codesky.chapter6classwork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cn.edu.bit.codesky.chapter6classwork.videolist.VideoListActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnVideoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnVideoList = findViewById(R.id.btn_video_list);

        btnVideoList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, VideoListActivity.class));
            }
        });
    }
}
