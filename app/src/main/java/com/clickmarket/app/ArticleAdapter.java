package com.clickmarket.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.clickmarket.app.Article;
import com.clickmarket.app.R;

import java.util.List;

public class ArticleAdapter extends BaseAdapter {
    private Context context;
    private List<Article> articles;

    public ArticleAdapter(Context context, List<Article> articles) {
        this.context = context;
        this.articles = articles;
    }

    @Override
    public int getCount() {
        return articles.size();
    }

    @Override
    public Object getItem(int position) {
        return articles.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }

        Article article = articles.get(position);

        ImageView imageView = convertView.findViewById(R.id.itemImage);
        TextView nameTextView = convertView.findViewById(R.id.itemName);
        TextView priceTextView = convertView.findViewById(R.id.itemPrice);

        imageView.setImageResource(article.getImageResourceId());
        nameTextView.setText(article.getName());
        priceTextView.setText(String.format("%.2f €", article.getPrice()));

        return convertView;
    }
}
