package com.onetechnology.gljhanwarinvestments.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.onetechnology.gljhanwarinvestments.R;
import com.onetechnology.gljhanwarinvestments.drawerPages.OrderAndHistoryActivity;

public class RVMyAssetsAdapter extends RecyclerView.Adapter<RVMyAssetsAdapter.ViewHolder> {
    Context context;

    public RVMyAssetsAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public RVMyAssetsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.show_myassets_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RVMyAssetsAdapter.ViewHolder holder, int position) {

        holder.ll_myAssets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, OrderAndHistoryActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayoutCompat ll_myAssets;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ll_myAssets = itemView.findViewById(R.id.ll_myAssets);
        }
    }
}
