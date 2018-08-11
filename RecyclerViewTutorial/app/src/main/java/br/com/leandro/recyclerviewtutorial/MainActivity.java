package br.com.leandro.recyclerviewtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    MyAdapter myAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Chamando o recycler criado no XML da MainAcitivty

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);

        //Criando o conteudo da sua lista

        ListaDeNoticias noticia1 = new ListaDeNoticias("@drawable/kaio","Síndrome do RecyclerView","Efeitos da Programação a longo prazo");
        ListaDeNoticias noticia2 = new ListaDeNoticias("@drawable/fafa","Não se engane!","Ela pode te matar");
        ListaDeNoticias noticia3 = new ListaDeNoticias("@drawable/victorestilo","Estilo em pessoa","Estilista e programador, Victor Caldas fala sobre sua vida");
        ListaDeNoticias noticia4 = new ListaDeNoticias("@drawable/indiadno","Indianos na Programação","Como é a vida dos indianos no Brasil?");
        ListaDeNoticias noticia5 = new ListaDeNoticias("@drawable/robot","Mr Robot da vida real!","Hackers indianos invadindo sistemas");
        ListaDeNoticias noticia6 = new ListaDeNoticias("@drawable/noia","Victor Caldas, o Terror da Lapa","Programador responsável por amendrontar turistas no Rio de Janeiro");


        //Inserindo os itens criados acima na sua listagem

        List<ListaDeNoticias> listaDeNoticias = new ArrayList<>();

        listaDeNoticias.add(noticia1);
        listaDeNoticias.add(noticia2);
        listaDeNoticias.add(noticia3);
        listaDeNoticias.add(noticia4);
        listaDeNoticias.add(noticia5);
        listaDeNoticias.add(noticia6);

       MyAdapter myAdapter = new MyAdapter(listaDeNoticias, this);
       recyclerView.setLayoutManager(new LinearLayoutManager(this));
       recyclerView.setAdapter(myAdapter);

    }
}
