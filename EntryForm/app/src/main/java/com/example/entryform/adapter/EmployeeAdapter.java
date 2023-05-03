package com.example.entryform.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.entryform.R;
import com.example.entryform.model.Employee;

import java.util.List;

public class EmployeeAdapter extends RecyclerView.Adapter {

    private List<Employee> employeeList;

    public EmployeeAdapter(List<Employee> employeeList){
        this.employeeList = employeeList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.employee_item,parent,false);
        return new EmployeeHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Employee employee = employeeList.get(position);
        ((EmployeeHolder) holder).name.setText(employee.getEmployeeName());
        ((EmployeeHolder) holder).location.setText(employee.getEmployeeLocation());
        ((EmployeeHolder) holder).branch.setText(employee.getEmployeeBranch());
    }


    @Override
    public int getItemCount() {
        return employeeList.size();
    }
}
