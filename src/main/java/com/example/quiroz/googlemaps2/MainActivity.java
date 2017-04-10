package com.example.quiroz.googlemaps2;



import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;



import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends ActionBarActivity {

    private final LatLng centro = new LatLng(-23.193163, -45.878246);
    private GoogleMap googlemap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_principal);

    }

    public void animateCamera(View view) {
        if (googlemap.getMyLocation() != null)
            googlemap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(googlemap.getMyLocation().getLatitude(), googlemap.getMyLocation().getLongitude()), 15));
    }


    public void buttonMapa (View view) {
        setContentView(R.layout.activity_main);

        googlemap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
        googlemap.setMapType((GoogleMap.MAP_TYPE_NORMAL));
        googlemap.moveCamera(CameraUpdateFactory.newLatLngZoom(centro, 15));


        googlemap.setMyLocationEnabled(true);
        googlemap.getUiSettings().setZoomControlsEnabled(true);
        googlemap.getUiSettings().setMyLocationButtonEnabled(true);
        googlemap.getUiSettings().setCompassEnabled(true);
        googlemap.getUiSettings().setRotateGesturesEnabled(true);
        googlemap.getUiSettings().setZoomGesturesEnabled(true);


        googlemap.addMarker(new MarkerOptions().position(new LatLng(-23.203980, -45.893965)).title("Banca Clara").snippet("Avenida Heitor Villa Lobos,nº 1384 - Vila Ema"));
        googlemap.addMarker(new MarkerOptions().position(new LatLng(-23.182589, -45.887407)).title("Banca do Ari").snippet("Praça Cônego Lima, nº 16 - Centro"));
        googlemap.addMarker(new MarkerOptions().position(new LatLng(-23.188381, -45.873278)).title("JK Utilidades").snippet("Avenida Presidente Juscelino Kubitschek, nº 4624 - Jardim Paulista"));
        googlemap.addMarker(new MarkerOptions().position(new LatLng(-23.193163, -45.878246)).title("Rodoviária Nova - Box 24/25").snippet("Rua Itororo, nº 221 - Box 18 - Vila Piratininga"));
        googlemap.addMarker(new MarkerOptions().position(new LatLng(-23.172917, -45.814329)).title("Bazar e Papelaria Sagrada Família").snippet("Avenida Ilidio Meinberg Porto, nº 337 - Jardim São Vicente"));
        googlemap.addMarker(new MarkerOptions().position(new LatLng(-23.215970, -45.809158)).title("Casinha Mágica").snippet("Praça Assis Chateaubriand, nº 152 - Vila Tesouro"));
        googlemap.addMarker(new MarkerOptions().position(new LatLng(-23.173970, -45.852060)).title("Depósito Central").snippet("Avenida Antônio da Costa Nunes, nº 781 - Campos de São José"));
        googlemap.addMarker(new MarkerOptions().position(new LatLng(-23.209325, -45.808045)).title("Padaria 4 Queijos").snippet("Avenida Barbacena, nº 226 - Jardim Ismênia"));
        googlemap.addMarker(new MarkerOptions().position(new LatLng(-23.174358, -45.794121)).title("Padaria Vovó Mariana").snippet("Rua Fátima Regina da Silva, nº 33 - Jardim Mariana"));
        googlemap.addMarker(new MarkerOptions().position(new LatLng(-23.136314, -45.773375)).title("Sacolão Pague Menos").snippet("Rua Lázaro Floriano Barbosa, nº 271 - Jardim Santa Inês"));
        googlemap.addMarker(new MarkerOptions().position(new LatLng(-23.151867, -45.902365)).title("Mercadinho Alto da Ponte").snippet("Rua Audemo Veneziani, nº 276 - Alto da Ponte"));
        googlemap.addMarker(new MarkerOptions().position(new LatLng(-23.162409, -45.910528)).title("Padaria Ipanema").snippet("Avenida Pico das Agulhas Negras, nº 1 - Jardim Altos de Santana"));
        googlemap.addMarker(new MarkerOptions().position(new LatLng(-23.246687, -45.829523)).title("InovaFarma").snippet("Avenida João Rodolfo Castelli, nº 1670 - Putim "));
        googlemap.addMarker(new MarkerOptions().position(new LatLng(-23.253090, -45.827329)).title("Supermercado do Max Vale").snippet("Rua Anesia Pedrosa Púpio, nº 20 - Residencial Jatobá"));
        googlemap.addMarker(new MarkerOptions().position(new LatLng(-23.205347, -45.856978)).title("Vem Que Tem - Casa de Ferragens").snippet("Rua Capricórnio, nº 260 - Jardim da Granja"));
        googlemap.addMarker(new MarkerOptions().position(new LatLng(-23.248385, -45.899542)).title("Comercial Valuti").snippet("Avenida Eliane Maria Barbiere Soares, nº 513 - Cidade Morumbi"));
        googlemap.addMarker(new MarkerOptions().position(new LatLng(-23.277857, -45.898784)).title("Padaria Brasil Novo").snippet("Praça Francisco Lopes de Azevedo, nº 14 - Jardim Imperial"));
        googlemap.addMarker(new MarkerOptions().position(new LatLng(-23.278106, -45.891246)).title("Padaria Dom Pedro").snippet("Rua Edilson Sabino dos Santos, nº 531 - Conjunto Residencial Dom Pedro"));
        googlemap.addMarker(new MarkerOptions().position(new LatLng(-23.263812, -45.897783)).title("Valuti Calçados").snippet("Travessa Capitingal, nº 223 - Jardim Capitingal"));
        googlemap.addMarker(new MarkerOptions().position(new LatLng(-23.252909, -45.906815)).title("Valuti Calçados").snippet("Rua José Brás da Silva, nº 156 - Cidade Morumbi"));
        googlemap.addMarker(new MarkerOptions().position(new LatLng(-23.226665, -45.885022)).title("Valuti Calçados").snippet("Avenida Andrômeda, nº 1586 - Jardim Satélite"));
    }



}


