package institute.immune.github;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageButton imageButton;
    private MediaPlayer mediaPlayer;
    /**
     * APP DE PRUEBA PARA GITHUB
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton = findViewById(R.id.imageButton3);
        mediaPlayer = MediaPlayer.create(this ,R.raw.song);

    }

    public void onClick(View view){
        Toast toast1 = Toast.makeText(getApplicationContext(),
                        "Play", Toast.LENGTH_SHORT);
        toast1.show();

        mediaPlayer.start(); // no need to call prepare(); create() does that for you

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
        mediaPlayer = MediaPlayer.create(this ,R.raw.song);

        mediaPlayer.stop(); // no need to call prepare(); create() does that for you

    }
}
