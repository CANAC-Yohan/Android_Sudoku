package kartoh.sudoku.com;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnFacile;
    Button btnMoyen;
    Button btnDifficile;
    Activity lecontext;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        lecontext = this;

        btnFacile = (Button) findViewById(R.id.btnFacile);
        btnMoyen = (Button) findViewById(R.id.btnMoyen);
        btnDifficile = (Button) findViewById(R.id.btnDifficile);

        btnFacile.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lecontext, Level.class);
                startActivity(intent);
            }
        });

        btnMoyen.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lecontext, Level.class);
                startActivity(intent);
            }
        });

        btnDifficile.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lecontext, Level.class);
                startActivity(intent);
            }
        });

        /*ImageView logo = (ImageView) findViewById(R.id);
        ImageView.setImageRessource(R.drawable.[nom du logo]*/
    }
}