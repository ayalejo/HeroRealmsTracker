package app.android.ayalejo.board.herorealmstracker;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.List;

public class class_grid_view_adapter extends ArrayAdapter<Integer> {
    List<Integer> lista;
    Context context;

    public class_grid_view_adapter(@NonNull Context context, int resource, @NonNull List<Integer> objects) {
        super(context, resource, objects);
        lista = objects;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(this.context);

        final View item =  inflater.inflate(R.layout.btn_class , null);

        ImageView imagen = item.findViewById(R.id.btn_img_class);
        imagen.setImageResource(lista.get(position));

        return item;
    }
}
