package com.clickmarket.app;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ActivityPage2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        // Créez une liste d'articles fictive pour l'exemple
        List<Article> articles;
        articles = new ArrayList<>();
        articles.add(new Article("Article 1", 21.00, R.drawable.image1));
        articles.add(new Article("Article 2", 22.00, R.drawable.image1));
        articles.add(new Article("Article 3", 23.00, R.drawable.image1));
        articles.add(new Article("Article 4", 24.00, R.drawable.image1));
        articles.add(new Article("Article 5", 21.00, R.drawable.image1));
        articles.add(new Article("Article 6", 22.00, R.drawable.image1));
        articles.add(new Article("Article 7", 23.00, R.drawable.image1));
        articles.add(new Article("Article 8", 24.00, R.drawable.image1));
        articles.add(new Article("Article 9", 21.00, R.drawable.image1));
        articles.add(new Article("Article 10", 22.00, R.drawable.image1));
        articles.add(new Article("Article 11", 23.00, R.drawable.image1));
        articles.add(new Article("Article 12", 24.00, R.drawable.image1));
        articles.add(new Article("Article 13", 21.00, R.drawable.image1));
        articles.add(new Article("Article 14", 22.00, R.drawable.image1));
        articles.add(new Article("Article 15", 23.00, R.drawable.image1));
        // Ajoutez d'autres articles à la liste

        // Associez l'adaptateur personnalisé à la liste
        ListView listView = findViewById(R.id.listView);
        ArticleAdapter adapter = new ArticleAdapter(this, articles);
        listView.setAdapter((ListAdapter) adapter);
    }
}
