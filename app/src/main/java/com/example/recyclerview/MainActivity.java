package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    private WordListAdapterMain mAdapter;
    private WordViewHolder mViewHolder;
    private LinkedList<Blog> mBlogList = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBlogList.add(new Blog(R.drawable.mark, "Facebook bankcrupted", "Facebook bankcrupted this morning", "Facebook bankcrupted this morning. Now Mark is facing the lawsuit of the century"));
        mBlogList.add(new Blog(R.drawable.amazonimg, "Amazon fired", "Amazon fired 250000 employees this year", "Amazon fired 250000 employees this year. This created a wave of outrage"));
        mBlogList.add(new Blog(R.drawable.alibaba, "Alibaba expand export", "Alibaba set goals to export their products to 100 countries this year", "Alibaba set goals to export their products to 100 countries this year. This year is expected to be the year of Alibaba"));
        mBlogList.add(new Blog(R.drawable.starbuck, "Starbuck loss", "This month, Starbuck've lost 25000$", "This month, Starbuck've lost 25000$. Many Starbuck's stores in the US are closed"));
        mBlogList.add(new Blog(R.drawable.mark, "Facebook bankcrupted", "Facebook bankcrupted this morning", "Facebook bankcrupted this morning. Now Mark is facing the lawsuit of the century"));
        mBlogList.add(new Blog(R.drawable.amazonimg, "Amazon fired", "Amazon fired 250000 employees this year", "Amazon fired 250000 employees this year. This created a wave of outrage"));
        mBlogList.add(new Blog(R.drawable.alibaba, "Alibaba expand export", "Alibaba set goals to export their products to 100 countries this year", "Alibaba set goals to export their products to 100 countries this year. This year is expected to be the year of Alibaba"));
        mBlogList.add(new Blog(R.drawable.starbuck, "Starbuck loss", "This month, Starbuck've lost 25000$", "This month, Starbuck've lost 25000$. Many Starbuck's stores in the US are closed"));
        mRecyclerView = findViewById(R.id.recyclerview);
        mAdapter = new WordListAdapterMain(this, mBlogList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

}