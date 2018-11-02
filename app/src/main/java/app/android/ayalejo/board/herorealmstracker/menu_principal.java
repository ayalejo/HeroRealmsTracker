package app.android.ayalejo.board.herorealmstracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class menu_principal extends AppCompatActivity {
    ImageButton btn_one_p;
    ImageButton btn_two_p;
    menu_principal este;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        este = this;

        btn_one_p = findViewById(R.id.btn_one_player);
        btn_two_p = findViewById(R.id.btn_two_players);

        btn_one_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(este, chose_class_screen.class);
                startActivity(intent);
            }
        });

        btn_two_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(este, chose_class_screen.class);
                startActivity(intent);
            }
        });
    }
}