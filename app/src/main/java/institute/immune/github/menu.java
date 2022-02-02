package institute.immune.github;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentProviderClient;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void musica(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void videos(View view){
        Intent intent = new Intent(this, VideosActivity.class);
        startActivity(intent);
    }
}