package co.edu.unab.Hernandez.Yeison.seriesapp.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import co.edu.unab.Hernandez.Yeison.seriesapp.DetalleSerieActivity;
import co.edu.unab.Hernandez.Yeison.seriesapp.R;
import co.edu.unab.Hernandez.Yeison.seriesapp.Series;

public class SeriesAdapter extends RecyclerView.Adapter {
    ArrayList<Series> listSeries;
    Context context;
    String nombreUsuario;
    public SeriesAdapter(ArrayList<Series> listSeries,Context context, String nombreUsuario) {
        this.listSeries = listSeries;
        this.context = context;
        this.nombreUsuario= nombreUsuario;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View holder= LayoutInflater.from(parent.getContext()).inflate(R.layout.itemseries,parent,false);
        return new ViewHolder(holder);
    }
    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageSerie;
        CardView cardView;
        TextView detalle;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageSerie= itemView.findViewById(R.id.imageSeries);
            detalle= itemView.findViewById(R.id.textDetalle);
            cardView= itemView.findViewById(R.id.cardSerie);

        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ViewHolder viewHolder= (ViewHolder) holder;
        final Series series= listSeries.get(position);
        viewHolder.detalle.setText(series.getNombre());
        Picasso.get().load(series.getImagepreview()).into(viewHolder.imageSerie);

        viewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent intent = new Intent(context, DetalleSerieActivity.class);
                intent.putExtra("Series",listSeries.get(position));
                intent.putExtra("NAME",nombreUsuario);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return listSeries.size();
    }
}
