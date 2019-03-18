package com.example.recycleview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.ViewHoder>{
    ArrayList<Datashop> shopArr;
    Context context;

    public ShopAdapter(ArrayList<Datashop> shopArr, Context context) {
        this.shopArr = shopArr;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHoder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater  layoutInflater=LayoutInflater.from(viewGroup.getContext());
        View itemView=layoutInflater.inflate(R.layout.item_row,viewGroup,false);

        return new ViewHoder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoder viewHoder, int i) {
        viewHoder.txtName.setText(shopArr.get(i).getTen());
        viewHoder.imgHinh.setImageResource(shopArr.get(i).getHinhanh());

    }

    @Override
    public int getItemCount() {
        return shopArr.size();
    }

    public class ViewHoder extends RecyclerView.ViewHolder{
        TextView txtName;
        ImageView imgHinh;

        public ViewHoder(@NonNull View itemView) {
            super(itemView);
            imgHinh=(ImageView)itemView.findViewById(R.id.imgHinh);
            txtName= (TextView) itemView.findViewById(R.id.txtName);

        }
    }

}
