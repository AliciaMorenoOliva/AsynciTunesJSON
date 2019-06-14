package edu.cftic.asyncitunesjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

public class ItunesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itunes);

        new QueryItunes(this).execute("enrique");
    }

    public void actualizarLista (ResultadoCanciones rc)
    {
        Log.d("MIAPP", "Ocultando");
        ProgressBar pb = findViewById(R.id.progressBar);
        pb.setVisibility(View.GONE);
    }
}

