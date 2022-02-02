package institute.immune.github;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.VideoView;

import java.util.ArrayList;

public class VideosActivity extends AppCompatActivity {

    private ArrayList <Integer> list;
    private MediaPlayer mediaPlayer;
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.videos);

        list = new ArrayList<Integer>();

        videoView = findViewById(R.id.videoView);
    }

    public void onClick(View view){


        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.messi);
        Toast toast1 = Toast.makeText(getApplicationContext(),
                "Play", Toast.LENGTH_SHORT);
        toast1.show();

        videoView.start(); // no need to call prepare(); create() does that for you
    }

    public void onClickStop(View view){
        Toast toast1 = Toast.makeText(getApplicationContext(),
                "stop", Toast.LENGTH_SHORT);
        toast1.show();
        mediaPlayer.pause(); // no need to call prepare(); create() does that for you
    }

    public void onClickreset(View view){
        Toast toast1 = Toast.makeText(getApplicationContext(),
                "reset", Toast.LENGTH_SHORT);
        toast1.show();
        mediaPlayer.stop(); // no need to call prepare(); create() does that for you
    }
}