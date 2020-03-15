package co.edu.unab.Hernandez.Yeison.seriesapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import co.edu.unab.Hernandez.Yeison.seriesapp.R;

public class ElencoAdapter extends BaseAdapter {
    private Context context;

    private ArrayList<String> elencos;

    public ElencoAdapter(Context context, ArrayList<String> elencos) {
        this.context = context;
        this.elencos = elencos;
    }

    @Override
    public int getCount() {
        return elencos.size();
    }

    @Override
    public Object getItem(int i) {
        return elencos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;

        //Inflamos la vista con nuestro propio layout
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);

        v= layoutInflater.inflate(R.layout.itemelenco, null);
        // Valor actual según la posición

        String currentName  = elencos.get(i);

        // Referenciamos el elemento a modificar y lo rellenamos
        TextView textView = (TextView) v.findViewById(R.id.textelenco);
        textView.setText(currentName);
        //Devolvemos la vista inflada
        return v;
    }
}
