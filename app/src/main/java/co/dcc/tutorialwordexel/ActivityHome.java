package co.dcc.tutorialwordexel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityHome extends AppCompatActivity {
public static String materi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViewById(R.id.card_word).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                materi = "word";
                startActivity(new Intent(getApplicationContext(),MenuActivity.class));
            }
        });
        findViewById(R.id.card_excel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                materi = "excel";
                startActivity(new Intent(getApplicationContext(),MenuActivity.class));
            }
        });
    }
}