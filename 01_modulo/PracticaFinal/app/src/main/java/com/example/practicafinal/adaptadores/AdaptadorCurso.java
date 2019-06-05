package com.example.practicafinal.adaptadores;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.practicafinal.R;
import com.example.practicafinal.listeners.OnItemListenerProyecto;
import com.example.practicafinal.modelo.Cursos;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class AdaptadorCurso extends RecyclerView.Adapter<AdaptadorCurso.ViewHolderCursos> implements OnItemListenerProyecto{
    private final Context context;
    private List<Cursos> lista;

    public AdaptadorCurso(Context context, List<Cursos> a){
        this.context=context;
        this.lista=a;
    }

    @NonNull
    @Override
    public ViewHolderCursos onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_curso,viewGroup, false);
        return new ViewHolderCursos(vista, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderCursos viewHolderCursos, int i) {
        Cursos curso=lista.get(i);
        viewHolderCursos.txtNombreCurso.setText(curso.getNombre());
        viewHolderCursos.txtProcentajeCurso.setText("Asistencia: "+curso.getPorcentaje());
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    @Override
    public void onItemClick(View v, int posicion) {
        Log.e("POSICION",""+posicion);
    }


    public static class ViewHolderCursos extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView txtNombreCurso;
        TextView txtProcentajeCurso;
        CircleImageView img;

        OnItemListenerProyecto listener;


        public ViewHolderCursos(@NonNull View itemView, OnItemListenerProyecto listener) {
            super(itemView);
            this.listener=listener;
            txtNombreCurso=(TextView)itemView.findViewById(R.id.txtNombreCurso);
            txtProcentajeCurso=(TextView)itemView.findViewById(R.id.txtPorcentajeCurso);
            img=(CircleImageView)itemView.findViewById(R.id.img);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            listener.onItemClick(v, getAdapterPosition());
        }
    }
}
