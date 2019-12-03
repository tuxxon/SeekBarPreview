package com.example.seekbarpreview;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.example.seekbarpreview.components.SeekBarPreview;

public class MainActivity extends AppCompatActivity {

    private SeekBarPreview seekBarPreviewSDCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBarPreviewSDCard = findViewById(R.id.seekBarPreviewSDCard);

        String path = "android.resource://" + getPackageName() + "/" + R.raw.bunny;
        //seekBarPreviewSDCard.setUri(Uri.parse(path));
        seekBarPreviewSDCard.setUrl("https://storage.googleapis.com/exoplayer-test-media-1/mkv/android-screens-lavf-56.36.100-aac-avc-main-1280x720.mkv");

        seekBarPreviewSDCard.initialize();
    }
}
