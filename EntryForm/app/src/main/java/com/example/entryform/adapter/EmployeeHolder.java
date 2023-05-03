package com.example.entryform.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.entryform.R;

public class EmployeeHolder extends RecyclerView.ViewHolder {

    TextView name, location, branch;

    public EmployeeHolder(@NonNull View itemView) {
        super(itemView);
        name  = itemView.findViewById(R.id.textView);
        location = itemView.findViewById(R.id.textView2);
        branch = itemView.findViewById(R.id.textView3);

    }

}
