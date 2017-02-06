package kartoh.sudoku.com;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Level extends AppCompatActivity {

    private Activity contexte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        contexte = this;
        Bundle b = this.getIntent().getExtras();

        ListView ListeView = (ListView) findViewById(R.id.liste);
        ArrayList<vGrille> liste = new ArrayList<vGrille>();

        switch (b.getInt("niveau")) {
            case 1:
                for (int i = 0; i < 2; i++) {
                    liste.add(new vGrille(i + 1, i + 1, 80));
                }
                break;
            case 2:
                for (int i = 0; i < 3; i++) {
                    liste.add(new vGrille(i + 1, i + 1, 30));
                }
        }

        MyAdapter myAdapter = new MyAdapter(contexte, liste);
        ListeView.setAdapter(myAdapter);

        ListeView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(contexte, Game.class);
                startActivity(intent);
            }
        });


    }
}