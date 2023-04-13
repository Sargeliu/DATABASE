package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import Data.DatabaseHandler;
import Model.Car;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler databaseHandler = new DatabaseHandler(this);

        databaseHandler.addCar(new Car("Toyota", "30 000$"));
        databaseHandler.addCar(new Car("Opel", "19 000$"));
        databaseHandler.addCar(new Car("Mercedes", "45 000$"));
        databaseHandler.addCar(new Car("kia", "25 000$"));

        List<Car> carList = databaseHandler.getAllCars();


        for (Car car : carList) {
            Log.d("Car Info: ", "ID " + car.getId() + ", name " + car.getName() + ", price " + car.getPrice());
        }
    }
}