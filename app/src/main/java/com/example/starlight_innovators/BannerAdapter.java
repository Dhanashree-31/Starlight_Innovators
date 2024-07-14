package com.example.starlight_innovators;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BannerAdapter extends RecyclerView.Adapter<BannerAdapter.ViewHolder> {
    private String[] tshirtNames = {"Gray Full Sleeve", "Black Round Neck", "Yellow Half Sleeve", "Green Round Neck"};
    private int[] tshirtImages = {R.drawable.big_img1, R.drawable.big_img2, R.drawable.big_img3, R.drawable.big_img4};
    private String[] tshirtPrices = {"₹499.00", "₹499.00", "₹499.00", "₹499.00"};
    private String[] tshirtDiscounts = {"40% off", "20% off", "40% off", "20% off"};
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public BannerAdapter(OnItemClickListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bannernext_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(tshirtImages[position]);
        holder.nameTextView.setText(tshirtNames[position]);
        holder.priceTextView.setText(tshirtPrices[position]);
        holder.discountTextView.setText(tshirtDiscounts[position]);

        holder.itemView.setOnClickListener(v -> listener.onItemClick(position));
    }

    @Override
    public int getItemCount() {
        return tshirtNames.length;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView nameTextView;
        TextView priceTextView;
        TextView discountTextView;

        ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.tshirt_image);
            nameTextView = itemView.findViewById(R.id.tshirt_name);
            priceTextView = itemView.findViewById(R.id.tshirt_price);
            discountTextView = itemView.findViewById(R.id.tshirt_discount);
        }
    }
}
