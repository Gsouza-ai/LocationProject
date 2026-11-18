package com.example.locationproject;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.core.app.ActivityCompat;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;

public class GetRouteActivity extends Activity {
    private static final int REQUEST_LOCATION_UPDATES = 1;

    // Objetos da API de localização
    private FusedLocationProviderClient mFusedLocationProviderClient;
    private LocationRequest mLocationRequest;
    private LocationCallback mLocationCallback;

    // Banco de dados
    TrilhasDB trilhadb;

    int waypoint_counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_route);

        Button startButton = (Button) findViewById(R.id.Startbutton);
        Button stopButton = (Button) findViewById(R.id.Stopbutton);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Instancia/abre o banco de dados
                trilhadb = new TrilhasDB(GetRouteActivity.this);
                trilhadb.apagarTrilha();
                startLocationUpdates();
            }

            private void startLocationUpdates() {
                // 2. Verifica a permissão para a obtenção da localização
                if (ActivityCompat.checkSelfPermission(this,
                        android.Manifest.permission.ACCESS_FINE_LOCATION) ==
                        PackageManager.PERMISSION_GRANTED) {

                }
            }
        });
    }
}
