package semana1.curso3.coursera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import semana1.curso3.coursera.adapter.PetAdapter;
import semana1.curso3.coursera.pojo.Pet;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_pet;

    private ArrayList<Pet> pets;
    private PetAdapter petAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar actionbar = (Toolbar) findViewById(R.id.actionbar);
        setSupportActionBar(actionbar);
        rv_pet = (RecyclerView) findViewById(R.id.rv_pet);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rv_pet.setLayoutManager(linearLayoutManager);
        pets = new ArrayList<Pet>();
        pets.add(new Pet(R.drawable.pet_one, "Ruffo", 0));
        pets.add(new Pet(R.drawable.pet_two, "Noli", 0));
        pets.add(new Pet(R.drawable.pet_three, "Roy", 0));
        pets.add(new Pet(R.drawable.pet_four, "Lazy", 0));
        pets.add(new Pet(R.drawable.pet_five, "Nino", 0));
        pets.add(new Pet(R.drawable.pet_six, "Cobo", 0));
        pets.add(new Pet(R.drawable.pet_seven, "Dino", 0));
        pets.add(new Pet(R.drawable.pet_eight, "Chumi", 0));
        petAdapter = new PetAdapter(MainActivity.this, pets);
        rv_pet.setAdapter(petAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mi_star:
                Intent secondActivity = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(secondActivity);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}