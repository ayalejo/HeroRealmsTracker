package app.android.ayalejo.board.herorealmstracker;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class chose_class_screen extends AppCompatActivity {
    GridView gridView;
    List<Integer> lista;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class_chose_screen);

        gridView = findViewById(R.id.grid_class);

        lista = new ArrayList<Integer>();

        lista.add(R.drawable.cleric);
        lista.add(R.drawable.ranger);
        lista.add(R.drawable.thief);
        lista.add(R.drawable.warrior);
        lista.add(R.drawable.wizard);

        class_grid_view_adapter adapter = new class_grid_view_adapter(this,0, lista);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                view.setSelected(!view.isSelected());
            }
        });
}
}