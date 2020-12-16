package com.example.xiaoshixun_play_33;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.yc.video.player.VideoPlayer;
import com.yc.video.ui.view.BasisVideoController;

public class MainActivity extends AppCompatActivity {

    private VideoPlayer video_play;
    private static final String uri = "http://vfx.mtime.cn/Video/2019/02/04/mp4/190204084208765161.mp4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        video_play = (VideoPlayer) findViewById(R.id.video_play);
        BasisVideoController controller = new BasisVideoController(this);
        video_play.setController(controller);
        video_play.setUrl(uri);
        video_play.start();
    }
}
