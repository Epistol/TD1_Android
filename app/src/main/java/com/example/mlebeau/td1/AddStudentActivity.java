package com.example.mlebeau.td1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AddStudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
    }

    private void newUser(){

        // Ajout user

       BDD.getBase(this).ajouterObjet(JE NE SAIS PAS QUOI METTRE ICI);
        // Fin de l'activité
        finish();

        Intent intent = new Intent(this,MainActivity.class);
        startActivityForResult(intent, 100);
    }


}
