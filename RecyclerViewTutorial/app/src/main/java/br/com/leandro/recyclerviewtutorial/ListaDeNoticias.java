package br.com.leandro.recyclerviewtutorial;

import android.support.v7.widget.AppCompatButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ListaDeNoticias {

    String imageItem_id;
    String titulo_id;
    String description_id;
    //public AppCompatButton button_id;

    public ListaDeNoticias(String imageItem_id, String titulo_id, String description_id) {
        this.imageItem_id = imageItem_id;
        this.titulo_id = titulo_id;
        this.description_id = description_id;

    }

    public String getImageItem_id() {
        return imageItem_id;
    }

    public void setImageItem_id(String imageItem_id) {
        this.imageItem_id = imageItem_id;
    }

    public String getTitulo_id() {
        return titulo_id;
    }

    public void setTitulo_id(String titulo_id) {
        this.titulo_id = titulo_id;
    }

    public String getDescription_id() {
        return description_id;
    }

    public void setDescription_id(String description_id) {
        this.description_id = description_id;
    }
}
