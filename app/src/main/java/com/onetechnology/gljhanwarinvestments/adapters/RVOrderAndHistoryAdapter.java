package com.onetechnology.gljhanwarinvestments.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.onetechnology.gljhanwarinvestments.R;

public class RVOrderAndHistoryAdapter extends RecyclerView.Adapter<RVOrderAndHistoryAdapter.ViewHolder> {
    Context context;

    public RVOrderAndHistoryAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public RVOrderAndHistoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.show_order_and_history_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RVOrderAndHistoryAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
