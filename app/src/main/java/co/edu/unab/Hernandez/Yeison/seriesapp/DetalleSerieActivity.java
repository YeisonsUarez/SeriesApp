package co.edu.unab.Hernandez.Yeison.seriesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import co.edu.unab.Hernandez.Yeison.seriesapp.Adapters.ElencoAdapter;

public class DetalleSerieActivity extends AppCompatActivity {
    private TextView name, detalle;
    private ImageView imageView;
    private Series series;
    private ListView listElenco;
    private String nombreUsuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_serie);
        name= findViewById(R.id.name);
        detalle= findViewById(R.id.detalle);
        imageView= findViewById(R.id.foto);
        listElenco= findViewById(R.id.listaElenco);
        series= (Series)getIntent().getSerializableExtra("Series");
        nombreUsuario = getIntent().getStringExtra("NAME");
        name.setText(series.getNombre());
        detalle.setText(series.getDescripcion());
        Picasso.get().load(series.getImagedetalle()).into(imageView);
        setTitle(series.getNombre()+" - "+nombreUsuario);
        ArrayList<String> elenco= series.getElenco();
      ElencoAdapter adapter= new ElencoAdapter(getApplicationContext(),elenco);
        listElenco.setAdapter(adapter);


    }
}
