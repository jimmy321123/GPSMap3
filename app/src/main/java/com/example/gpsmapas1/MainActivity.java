package com.example.gpsmapas1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener, GoogleMap.OnMapLongClickListener {

    EditText txtLatitud, txtLongitud;
    private Button VideoPromo;
    GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLatitud = findViewById(R.id.txt_Latitud);
        txtLongitud = findViewById(R.id.txt_Longitud);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.maps);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        this.mMap.setOnMapClickListener(this);
        this.mMap.setOnMapLongClickListener(this);


        LatLng Iquique = new LatLng(-20.23962, -70.14494);
        mMap.addMarker(new MarkerOptions().position(Iquique).title("STomas Iquique"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Iquique));

        LatLng Arica = new LatLng(-18.48305, -70.31047);
        mMap.addMarker(new MarkerOptions().position(Arica).title("STomas Arica"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Arica));

        LatLng Antofagasta = new LatLng(-23.27036, -70.51512);
        mMap.addMarker(new MarkerOptions().position(Antofagasta).title("STomas Antofagasta"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Antofagasta));

        LatLng La_Serena = new LatLng(-29.90830, -71.25730);
        mMap.addMarker(new MarkerOptions().position(La_Serena).title("STomas La Serena"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(La_Serena));

        LatLng Viña_Mar = new LatLng(-33.03618, -71.52266);
        mMap.addMarker(new MarkerOptions().position(Viña_Mar).title("STomas Viña del Mar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Viña_Mar));

        LatLng Santiago = new LatLng(-33.48847, -70.61268);
        mMap.addMarker(new MarkerOptions().position(Santiago).title("STomas Santiago"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Santiago));

        LatLng Talca = new LatLng(-35.42556, -71.67484);
        mMap.addMarker(new MarkerOptions().position(Talca).title("STomas Talca"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Talca));

        LatLng Concepcion = new LatLng(-36.82529, -73.06132);
        mMap.addMarker(new MarkerOptions().position(Concepcion).title("STomas Concepción"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Concepcion));

        LatLng Los_Angeles = new LatLng(-37.47114, -72.35382);
        mMap.addMarker(new MarkerOptions().position(Los_Angeles).title("STomas Los Angeles"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Los_Angeles));

        LatLng Temuco = new LatLng(-38.73208, -72.60166);
        mMap.addMarker(new MarkerOptions().position(Temuco).title("STomas Temuco"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Temuco));

        LatLng Valdivia = new LatLng(-39.81692, -73.23330);
        mMap.addMarker(new MarkerOptions().position(Valdivia).title("STomas Valdivia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Valdivia));

        LatLng Osorno = new LatLng(-40.57133, -73.13780);
        mMap.addMarker(new MarkerOptions().position(Osorno).title("STomas Osorno"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Osorno));

        LatLng PuertoMontt = new LatLng(-41.47223, -72.92909);
        mMap.addMarker(new MarkerOptions().position(PuertoMontt).title("STomas Puerto Montt"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(PuertoMontt));

        Button mostrarVideo = findViewById(R.id.mostrar_video);
        mostrarVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, institucional.class);
                startActivity(intent);
            }
        });






    }




    @Override
    public void onMapClick(@NonNull LatLng latLng) {
        txtLatitud.setText(""+latLng.latitude);
        txtLongitud.setText(""+latLng.longitude);
    }

    @Override
    public void onMapLongClick(@NonNull LatLng latLng) {
        txtLatitud.setText(""+latLng.latitude);
        txtLongitud.setText(""+latLng.longitude);



    }
}