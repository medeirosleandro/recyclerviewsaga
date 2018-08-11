package br.com.leandro.recyclerviewtutorial;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    List<ListaDeNoticias> list;
    Context context;

    public MyAdapter(List<ListaDeNoticias> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       LayoutInflater inflate = LayoutInflater.from(parent.getContext());
        return new MyViewHolder(inflate.inflate(R.layout.itemrecycler, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        ListaDeNoticias listaDeNoticias = list.get(position);
        holder.bind(listaDeNoticias.getImageItem_id(), listaDeNoticias.getTitulo_id(), listaDeNoticias.getDescription_id());



        //Setando o evento de clique no Item

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context,"Você clicou ",Toast.LENGTH_SHORT).show();



            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageItem_id;
        TextView titulo_id;
        TextView description_id;
        Context context;
        LinearLayout linearLayout;


        //Neste metodo estamos transportando os elemento do XML para código JAVA.

        public MyViewHolder(View itemView) {
            super(itemView);

            context = itemView.getContext();

            this.imageItem_id = itemView.findViewById(R.id.imageItem_id);
            this.titulo_id = itemView.findViewById(R.id.titulo_id);
            this.description_id = itemView.findViewById(R.id.description_id);

            //Chamando layout que sera clicavel, como este comporta o item por completo
            //toda area será clicável

            this.linearLayout = itemView.findViewById(R.id.linearLayoutPrincipal_id);

        }

        public int getImageDrawableResId(String imageId) {
            Resources resources = context.getResources();
            return resources.getIdentifier(imageId, "drawable", context.getPackageName());
        }

        public void bind(String imagem , String titulo, String subtitulo) {

            this.imageItem_id.setImageResource(getImageDrawableResId(imagem));

            this.titulo_id.setText(titulo);

            this.description_id.setText(subtitulo);
        }
    }

}


