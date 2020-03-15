package co.edu.unab.Hernandez.Yeison.seriesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import co.edu.unab.Hernandez.Yeison.seriesapp.Adapters.SeriesAdapter;

public class ListadoSeriesActivity extends AppCompatActivity {
    private String name;
    private RecyclerView rv_series;
    private ArrayList<Series> series;
    private ArrayList<String> elencoCosmos,elencoRickAndMorty,elencoMRRobot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_series);
        name= getIntent().getStringExtra("NameUser");
        rv_series= findViewById(R.id.myrecycler);
        cargarElencos();
        anadirDatos();

        setTitle(getString(R.string.textLayoutListado)+" - "+name);
        RecyclerView.LayoutManager layoutManager= new GridLayoutManager(getApplication(),2);
        SeriesAdapter adapter= new SeriesAdapter(series,getApplicationContext(),name);
        rv_series.setLayoutManager(layoutManager);
        rv_series.setAdapter(adapter);




    }

    private void anadirDatos() {
        series= new ArrayList<>();
        series.add(new Series("Cosmos","Cosmos: A Spacetime Odyssey (en Hispanoamérica y en España: Cosmos1) es una serie documental para televisión de 2014. Es continuación de Cosmos: un viaje personal (1980), que fuera presentada por Carl Sagan1 y cuya emisión a través de la PBS se considera un hito en la historia de los documentales científicos.","https://www.planetadocumental.com/wp-content/uploads/2017/08/Cosmos-2014-pd-01.jpg","https://vistapointe.net/images/cosmos-a-spacetime-odyssey-wallpaper-11.jpg",elencoCosmos));
        series.add(new Series("Rick and Morty","Después de haber estado desaparecido durante casi 20 años, Rick Sánchez llega de imprevisto a la puerta de la casa de su hija Beth y se va a vivir con ella y su familia utilizando el garaje como su laboratorio personal.","https://i.pinimg.com/originals/c1/5a/fa/c15afae7e603bf4518c791c05d61117f.jpg","https://static.tvmaze.com/uploads/images/medium_portrait/1/3603.jpg",elencoRickAndMorty));
        series.add(new Series("MR.ROBOT","Elliot Alderson, un brillante programador con problemas de ansiedad social, trabaja como ingeniero de ciberseguridad de día y como justiciero de noche. Su vida da un giro cuando unos ciberterroristas lo reclutan.","https://live.mrf.io/statics/i/ps/www.muycomputer.com/wp-content/uploads/2019/09/MrRobot.jpg","https://wallpaperaccess.com/full/893617.png",elencoMRRobot));
        series.add(new Series("Cosmos","Cosmos: A Spacetime Odyssey (en Hispanoamérica y en España: Cosmos1) es una serie documental para televisión de 2014. Es continuación de Cosmos: un viaje personal (1980), que fuera presentada por Carl Sagan1 y cuya emisión a través de la PBS se considera un hito en la historia de los documentales científicos.","https://www.planetadocumental.com/wp-content/uploads/2017/08/Cosmos-2014-pd-01.jpg","https://vistapointe.net/images/cosmos-a-spacetime-odyssey-wallpaper-11.jpg",elencoCosmos));
        series.add(new Series("Rick and Morty","Después de haber estado desaparecido durante casi 20 años, Rick Sánchez llega de imprevisto a la puerta de la casa de su hija Beth y se va a vivir con ella y su familia utilizando el garaje como su laboratorio personal.","https://i.pinimg.com/originals/c1/5a/fa/c15afae7e603bf4518c791c05d61117f.jpg","https://static.tvmaze.com/uploads/images/medium_portrait/1/3603.jpg",elencoRickAndMorty));
        series.add(new Series("MR.ROBOT","Elliot Alderson, un brillante programador con problemas de ansiedad social, trabaja como ingeniero de ciberseguridad de día y como justiciero de noche. Su vida da un giro cuando unos ciberterroristas lo reclutan.","https://live.mrf.io/statics/i/ps/www.muycomputer.com/wp-content/uploads/2019/09/MrRobot.jpg","https://wallpaperaccess.com/full/893617.png",elencoMRRobot));

    }
    private void cargarElencos(){
        elencoCosmos= new ArrayList<>();
        elencoCosmos.add("Carl Sagan");
        elencoCosmos.add("Neil deGrasse Tyson");
        elencoCosmos.add("Ann Druyan");
        elencoCosmos.add("Seth MacFarlane");
        elencoCosmos.add("Patrick Stewart");
        elencoCosmos.add("Brannon Braga");
        elencoCosmos.add("Adrian Malone");
        elencoCosmos.add("Clementine pons");
        elencoRickAndMorty= new ArrayList<>();
        elencoRickAndMorty.add("Rick Sánchez: Justin Roiland");
        elencoRickAndMorty.add("Morty Smith: Justin Roiland");
        elencoRickAndMorty.add("Summer Smith: Spencer Grammer");
        elencoRickAndMorty.add("Beth Smith: Sarah Chalke");
        elencoRickAndMorty.add("Jerry Smith: Chris Parnell");
        elencoMRRobot= new ArrayList<>();
        elencoMRRobot.add("Elliot Alderson: Rami Malek");
        elencoMRRobot.add("Mr. Robot: Christian Slater");
        elencoMRRobot.add("Angela Moss: Portia Doubleday");
        elencoMRRobot.add("Tyrell Wellick: Martin Wallström");
        elencoMRRobot.add("Dominique: Grace Gummer");
        elencoMRRobot.add("WhiteRose: BD Wong");

    }
}
