package com.example.entryform.retrofit;

import com.example.entryform.model.Employee;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface EmployeeApi {

    @GET("/employees/get-all")
    Call<List<Employee>> getAllEmployees();

    @POST("/employees/save")
    Call<Employee> save(@Body Employee employee);

}
