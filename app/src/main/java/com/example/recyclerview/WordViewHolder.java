package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

public class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private Context context;
    private ImageView imageView;
    private TextView blogTitle; //title
    private TextView blogDescription;
    private final WordListAdapterMain mAdapter;
    String titleTxt = "";
    int resourceImg = 0;
    String descriptionBlog = "";
    String descriptionBlogFull = "";
    public WordViewHolder(Context context, View itemView, WordListAdapterMain adapter) {
        super(itemView);
        blogTitle = itemView.findViewById(R.id.word);
        imageView = itemView.findViewById(R.id.imageViewSrc);
        blogDescription = itemView.findViewById(R.id.description);
        this.mAdapter = adapter;
        this.context = context;
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(context, ViewDetailActivity.class);
        intent.putExtra("imageSrc", resourceImg);
        intent.putExtra("title", titleTxt);
        intent.putExtra("description", descriptionBlogFull);
        context.startActivity(intent);
    }

    public void setData(int resource, String title, String description, String descriptionFull) {
        imageView.setImageResource(resource);
        blogTitle.setText(title);
        blogDescription.setText(description);
        titleTxt = title;
        resourceImg = resource;
        descriptionBlog = description;
        descriptionBlogFull = descriptionFull;
    }



}
