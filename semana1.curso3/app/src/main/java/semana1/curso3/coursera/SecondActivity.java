package semana1.curso3.coursera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import semana1.curso3.coursera.adapter.PetAdapter;
import semana1.curso3.coursera.pojo.Pet;

public class SecondActivity extends AppCompatActivity {

    private RecyclerView rv_pet;

    private ArrayList<Pet> pets;
    private PetAdapter petAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar actionbar = (Toolbar) findViewById(R.id.actionbar);
        setSupportActionBar(actionbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        rv_pet = (RecyclerView) findViewById(R.id.rv_pet);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(SecondActivity.this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rv_pet.setLayoutManager(linearLayoutManager);
        pets = new ArrayList<Pet>();
        pets.add(new Pet(R.drawable.pet_four, "Lazy", 5));
        pets.add(new Pet(R.drawable.pet_five, "Nino", 4));
        pets.add(new Pet(R.drawable.pet_six, "Cobo", 2));
        pets.add(new Pet(R.drawable.pet_seven, "Dino", 2));
        pets.add(new Pet(R.drawable.pet_eight, "Chumi", 1));
        petAdapter = new PetAdapter(SecondActivity.this, pets);
        rv_pet.setAdapter(petAdapter);
    }

}