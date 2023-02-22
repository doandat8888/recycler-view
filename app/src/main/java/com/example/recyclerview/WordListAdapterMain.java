package com.example.recyclerview;
import androidx.recyclerview.widget.RecyclerView;
import androidx.annotation.NonNull;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.LinkedList;

public class WordListAdapterMain extends RecyclerView.Adapter<WordViewHolder> {
    private Context context;
    private LinkedList<Blog> blogList = new LinkedList<Blog>();


    public WordListAdapterMain(Context context, LinkedList<Blog> blogList) {
        this.blogList = blogList;
        this.context = context;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlayout, parent, false);
        return new WordViewHolder(context, mItemView, this);
    }


    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        int resource = blogList.get(position).getImageViewSrc();
        String title = blogList.get(position).getTitle();
        String description = blogList.get(position).getDescription();
        String descriptionFull = blogList.get(position).getDescriptionFull();
        holder.setData(resource, title, description, descriptionFull);
    }




    @Override
    public int getItemCount() {
        return blogList.size();
    }
}
