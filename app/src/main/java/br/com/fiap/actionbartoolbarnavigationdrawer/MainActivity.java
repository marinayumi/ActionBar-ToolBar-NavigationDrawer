package br.com.fiap.actionbartoolbarnavigationdrawer;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Exemplo");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //
        //INFLA O MENU COM ITENS DO XML
        //
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //
        //VERIFICA QUAL ITEM FOI CLICADO NA ACTIONBAR E REALIZA UMA AÇÃO
        //
        if(item.getItemId() == R.id.mnSobre){
            Intent it = new Intent(this, SobreActivity.class);
            startActivity(it);
        }
        
        return super.onOptionsItemSelected(item);
    }


    public void abrirTelaCheia(View view) {
        Intent it = new Intent(this, TelaCheiaActivity.class);
        startActivity(it);
    }

    public void abrirNavigationDrawer(View view) {
        Intent it = new Intent(this, ExemploNavigationActivity.class);
        startActivity(it);
    }
}
