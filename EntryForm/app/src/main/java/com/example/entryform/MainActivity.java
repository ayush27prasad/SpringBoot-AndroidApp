package com.example.entryform;

import static android.R.id.content;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.entryform.model.Employee;
import com.example.entryform.retrofit.EmployeeApi;
import com.example.entryform.retrofit.RetrofitService;
import com.google.android.material.snackbar.Snackbar;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initializeComponents();

    }

    private void initializeComponents() {
        EditText name = findViewById(R.id.name);
        EditText branch = findViewById(R.id.branch);
        EditText location = findViewById(R.id.location);
        Button saveButton = findViewById(R.id.saveButton);

        RetrofitService retrofitService = new RetrofitService();
        EmployeeApi employeeApi = retrofitService.getRetrofit().create(EmployeeApi.class);

        saveButton.setOnClickListener(view -> {
            Employee employee = new Employee();
            employee.setEmployeeName(String.valueOf(name.getText()));
            employee.setEmployeeBranch(String.valueOf(branch.getText()));
            employee.setEmployeeLocation(String.valueOf(location.getText()));
            employeeApi.save(employee)
                    .enqueue(new Callback<Employee>() {
                        @Override
                        public void onResponse(Call<Employee> call, Response<Employee> response) {
                            Snackbar.make(findViewById(content), "Saved Successfully!", Snackbar.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onFailure(Call<Employee> call, Throwable t) {
                            Snackbar.make(findViewById(content), "Couldn't save, try agin!", Snackbar.LENGTH_SHORT).show();
                        }
                    });
        });
    }
}