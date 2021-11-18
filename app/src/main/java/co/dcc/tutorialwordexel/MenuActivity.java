package co.dcc.tutorialwordexel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {
TextView tittle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        tittle = findViewById(R.id.textTitleMenu);
        if(ActivityHome.materi.equals("word"))
        {
            tittle.setText("Menu Word");
        }
        else if (ActivityHome.materi.equals("excel"))
        {
            tittle.setText("Menu Excel");
        }
        findViewById(R.id.card_materi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ActivityRecyclerViewMateri.class));
            }
        });
    }
}