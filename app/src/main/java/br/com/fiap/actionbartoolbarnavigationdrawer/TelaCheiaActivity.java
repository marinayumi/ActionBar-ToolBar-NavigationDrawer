package br.com.fiap.actionbartoolbarnavigationdrawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class TelaCheiaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cheia);

        Toolbar toolBar = (Toolbar)findViewById(R.id.toolBar);
        setSupportActionBar(toolBar);
        toolBar.setLogo(R.drawable.ic_do_not_disturb_alt_black_24dp);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }
}
