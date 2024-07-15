package com.example.starlight_innovators;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BannerAdapter extends RecyclerView.Adapter<BannerAdapter.ViewHolder> {
    private String[] tshirtNames = {
            "Yellow Dress","Men Black TShirt", "Gray Gown", "Blue Tshirt", "Gray Full Sleeve",
            "Black Round Neck", "Yellow Half Sleeve", "Green Round Neck"
    };
    private int[] tshirtImages = {
            R.drawable.big_img8,R.drawable.big_img10 ,R.drawable.big_img9, R.drawable.img, R.drawable.big_img12,
            R.drawable.big_img13, R.drawable.big_img14, R.drawable.big_img4
    };
    private String[] tshirtPrices = {
            "₹900.00", "₹1099.00", "₹697.00", "₹399.00",
            "₹599.00", "₹304.00", "₹800.00","₹300.00"
    };
    private String[] tshirtDiscounts = {
            "20% off", "30% off", "20% off", "40% off",
            "20% off", "40% off", "20% off","20% off"
    };
    private String[] tshirtDescriptions = {
            "Description of Yellow Dress","Men Black Solid Round Neck TShirt", "Description of Gray Gown", "Description of Blue Tshirt",
            "Description of Gray Full Sleeve", "Description of Black Round Neck",
            "Description of Yellow Half Sleeve", "Description of Green Round Neck"
    };
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(int position, String name, int image, String price, String discount, String description);
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

        holder.itemView.setOnClickListener(v -> listener.onItemClick(
                position,
                tshirtNames[position],
                tshirtImages[position],
                tshirtPrices[position],
                tshirtDiscounts[position],
                tshirtDescriptions[position]
        ));
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
