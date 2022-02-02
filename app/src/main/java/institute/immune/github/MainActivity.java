package institute.immune.github;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private ImageButton imageButton;
    private MediaPlayer mediaPlayer;
    private Button button;

    private ArrayList <Integer> list;

    /**
     * APP DE PRUEBA PARA GITHUB
     * @param savedInstanceState
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        list = new ArrayList<Integer>();
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        imageButton = findViewById(R.id.imageButton3);
        button = findViewById(R.id.button);
        addtolist();
    }

    public void onClick(View view){

        int cancion1 = list.get(0);

        Toast toast1 = Toast.makeText(getApplicationContext(),
                        "Play", Toast.LENGTH_SHORT);
        toast1.show();
        mediaPlayer = MediaPlayer.create(this ,cancion1);

        imageView.setImageResource(R.drawable.cr7);


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
        mediaPlayer.stop(); // no need to call prepare(); create() does that for you
    }

    public void onClickButton(View view){
        mediaPlayer.stop();
        Toast toast1 = Toast.makeText(getApplicationContext(),
                "cambia", Toast.LENGTH_SHORT);
        toast1.show();
        Random rand = new Random();
        int randomElement = list.get(rand.nextInt(list.size()));
        int randomIMG = list.get(5);
        mediaPlayer = MediaPlayer.create(this ,randomElement);
        mediaPlayer.start(); // no need to call prepare(); create() does that for you

        imageView.setImageResource(R.drawable.messi);
    }


    public void addtolist(){
        list.add(R.raw.song);
        list.add(R.raw.ankaramessi);
        list.add(R.raw.airforcenegras);

        list.add(R.drawable.izan);
        list.add(R.drawable.cr7);
        list.add(R.drawable.messi);

    }
}