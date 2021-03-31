package info.tim;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<String> fotoTimf1 = new ArrayList<>();
    private ArrayList<String> namaTimf1 = new ArrayList<>();
    private ArrayList<String> infoTimf1 = new ArrayList<>();
    private ArrayList<String> fotoPembalapf1 = new ArrayList<>();
    private ArrayList<String> infoTimf2 = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<String> fotoTimf1, ArrayList<String> namaTimf1, ArrayList<String> infoTimf1, ArrayList<String> fotoPembalapf1, ArrayList<String> infoTimf2, Context context) {
        this.fotoTimf1 = fotoTimf1;
        this.namaTimf1 = namaTimf1;
        this.infoTimf1 = infoTimf1;
        this.fotoPembalapf1 = fotoPembalapf1;
        this.infoTimf2 = infoTimf2;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_adapter,parent,false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Glide.with(context).asBitmap().load(fotoTimf1.get(position)).into(holder.imageViewFotoTimf1);

        holder.textViewNamaTimf1.setText(namaTimf1.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(context, namaTimf1.get(position), Toast.LENGTH_LONG).show();

                Intent intent = new Intent(context, DetailActivity.class);

                intent.putExtra("foto_timf1", fotoTimf1.get(position));
                intent.putExtra("nama_timf1", namaTimf1.get(position));
                intent.putExtra("info_timf1", infoTimf1.get(position));
                intent.putExtra("foto_pembalapf1", fotoPembalapf1.get(position));
                intent.putExtra("info_timf2", infoTimf2.get(position));


                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return namaTimf1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView imageViewFotoTimf1;
        TextView textViewNamaTimf1;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewFotoTimf1 = itemView.findViewById(R.id.imageViewFotoTimf1);
            textViewNamaTimf1 = itemView.findViewById(R.id.textViewNamaTimf1);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);

        }

    }
}
