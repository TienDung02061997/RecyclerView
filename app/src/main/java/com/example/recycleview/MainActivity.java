package com.example.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.LinearLayout;

import java.sql.DriverPropertyInfo;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniview();
    }

    private void iniview() {
        recyclerView= (RecyclerView) findViewById(R.id.recycle);
        //dieu chinh kich thuong cua cac item trong recycleview vua man hinh
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this ,LinearLayoutManager.VERTICAL,false);
        // set chieu item theo layoutManager
        DividerItemDecoration itemDecoration =new DividerItemDecoration(this,layoutManager.getOrientation());
        recyclerView.addItemDecoration(itemDecoration);

        recyclerView.setLayoutManager(layoutManager);

        ArrayList<Datashop> datashops=new ArrayList<>();

        datashops.add(new Datashop(R.drawable.images_1,"Pokemon 1"));
        datashops.add(new Datashop(R.drawable.images_2,"Pokemon 2"));
        datashops.add(new Datashop(R.drawable.images_3,"Pokemon 3"));
        datashops.add(new Datashop(R.drawable.images_4,"Pokemon 4"));
        datashops.add(new Datashop(R.drawable.images_5,"Pokemon 5"));
        datashops.add(new Datashop(R.drawable.images_6,"Pokemon 6"));

        ShopAdapter shopAdapter=new ShopAdapter(datashops,getApplicationContext());
        recyclerView.setAdapter(shopAdapter);
    }
}
