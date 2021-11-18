package co.dcc.tutorialwordexel;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Switch;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pdftron.pdf.controls.DocumentActivity;

import java.util.ArrayList;

import co.dcc.tutorialwordexel.Adapter.RecyclerAdapterMateri;

public class ActivityRecyclerViewMateri extends AppCompatActivity implements RecyclerAdapterMateri.ItemClickListener {
    RecyclerAdapterMateri adapter;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_materi_word);

//                progressDialog = new ProgressDialog(getApplicationContext());
//                progressDialog.setMessage("Tunggu...");
//                progressDialog.show();
                // data to populate the RecyclerView with
        ArrayList<String> materi = new ArrayList<>();
        materi.add("Materi 1");
        materi.add("Materi 2");
        materi.add("Materi 3");
        materi.add("Materi 4");
        if (ActivityHome.materi.equals("excel"))
        {
            materi.add("Materi 5");
            materi.add("Materi 6");
            materi.add("Materi 7");
        }

        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.rv_materi);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerAdapterMateri(this, materi);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
//        startActivity(new Intent(getApplicationContext(),MainActivity.class));
        Toast.makeText(this,  adapter.getItem(position) +" "+ ActivityHome.materi, Toast.LENGTH_SHORT).show();
        switch (position)
        {
             case 0 :
                if (ActivityHome.materi.equals("word"))
                openPdfWithPDFTron(DataMateriVidio.word[0]);
                else
                    openPdfWithPDFTron(DataMateriVidio.excel[0]);
                break;
             case 1 :
                if (ActivityHome.materi.equals("word"))
                    openPdfWithPDFTron(DataMateriVidio.word[1]);
                else
                    openPdfWithPDFTron(DataMateriVidio.excel[1]);
                break;
             case 2 :
                if (ActivityHome.materi.equals("word"))
                    openPdfWithPDFTron(DataMateriVidio.word[2]);
                else
                    openPdfWithPDFTron(DataMateriVidio.excel[2]);
                break;
             case 3 :
                if (ActivityHome.materi.equals("word"))
                    openPdfWithPDFTron(DataMateriVidio.word[3]);
                else
                    openPdfWithPDFTron(DataMateriVidio.excel[3]);
                break;
             case 4 :
                openPdfWithPDFTron(DataMateriVidio.excel[4]);
                break;
             case 5 :
                openPdfWithPDFTron(DataMateriVidio.excel[5]);
                break;
             case 6 :
                openPdfWithPDFTron(DataMateriVidio.excel[6]);
                break;
        }
    }
      void openPdfWithPDFTron( int i) {
            DocumentActivity.openDocument(this, i);
}       }
