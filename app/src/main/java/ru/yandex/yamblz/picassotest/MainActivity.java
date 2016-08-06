package ru.yandex.yamblz.picassotest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Singer> singers = new SingersAssetsProvider(this).getSingers();
        RecyclerView rv = (RecyclerView)findViewById(R.id.singers_list);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new SingersAdapter(singers));
    }
}
