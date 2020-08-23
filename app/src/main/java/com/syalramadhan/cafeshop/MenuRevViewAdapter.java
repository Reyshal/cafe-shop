package com.syalramadhan.cafeshop;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

public class MenuRevViewAdapter extends RecyclerView.Adapter<MenuRevViewAdapter.ViewHolder> {
    private ArrayList<Coffee> coffees = new ArrayList<>();

    public MenuRevViewAdapter() {

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.coffee_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.txtName.setText(coffees.get(position).getName());
        holder.txtPrice.setText(coffees.get(position).getPrice());
        holder.image.setImageResource(coffees.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return coffees.size();
    }

    public void setCoffees(ArrayList<Coffee> coffees) {
        this.coffees = coffees;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txtName, txtPrice;
        private MaterialCardView parent;
        private ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtCoffeeName);
            parent = itemView.findViewById(R.id.parent);
            txtPrice = itemView.findViewById(R.id.txtCoffeePrice);
            image = itemView.findViewById(R.id.imgCoffee);
        }
    }
}
