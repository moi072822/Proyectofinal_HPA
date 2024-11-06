package com.example.proyectosemestralhpa;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        // Obtener referencias a los elementos del layout activity_main
        Button buttonIniciarSesion = findViewById(R.id.button);
        Button buttonRegistrarse = findViewById(R.id.button2);
        EditText editTextUsuario = findViewById(R.id.editTextText);
        EditText editTextPassword = findViewById(R.id.editTextText2);
        ImageView imageViewLogo = findViewById(R.id.imageView);
        TextView textViewTitulo = findViewById(R.id.titulo);
        TextView textViewRegistro = findViewById(R.id.textView);
        TextView textViewRegistrate = findViewById(R.id.textView2);
        TextView textViewInicioSesion = findViewById(R.id.iniciosesion);
        });
    }
}