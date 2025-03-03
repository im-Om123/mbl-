package com.mblprg.api.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mblprg.api.R;
import com.mblprg.api.model.MyData;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private Activity context;
    private ArrayList<MyData> data;

    public RecyclerViewAdapter(Activity context, ArrayList<MyData> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View listItem = inflater.inflate(R.layout.activity_recycler_view_items, parent, false);
        return new ViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MyData current = data.get(position);
        holder.txtId.setText(String.valueOf(current.getId())); // Convert int to String
        holder.txtName.setText(current.getName());
        holder.txtAddress.setText(current.getAddress());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtId, txtName, txtAddress;

        public ViewHolder(View itemView) {
            super(itemView);
            txtId = itemView.findViewById(R.id.idTv);
            txtName = itemView.findViewById(R.id.titleTv);
            txtAddress = itemView.findViewById(R.id.descTv);
        }
    }
}
