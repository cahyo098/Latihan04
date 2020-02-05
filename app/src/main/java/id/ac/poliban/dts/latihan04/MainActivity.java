package id.ac.poliban.dts.latihan04;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.miFile :
                Toast.makeText(this, "Ini File", Toast.LENGTH_SHORT).show();
                break;
            case R.id.miEdit:
                Toast.makeText(this, "Ini Edit", Toast.LENGTH_SHORT).show();
                break;
            case R.id.miSave:
                Toast.makeText(this, "Ini save", Toast.LENGTH_SHORT).show();
                break;

            case R.id.miExit:
                finish();//aplikasi ditutup dan akan dihancurkan dari memori
                break;
        }
        return true;
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
