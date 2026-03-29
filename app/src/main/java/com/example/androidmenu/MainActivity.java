package com.example.androidmenu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int MENU_NEW = 1;
    int MENU_OPEN = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Create "File" menu
        Menu fileMenu = menu.addSubMenu("File");

        // Add menu items
        fileMenu.add(0, MENU_NEW, 0, "New");
        fileMenu.add(0, MENU_OPEN, 1, "Open");

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == MENU_NEW) {
            Toast.makeText(this, "New clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (item.getItemId() == MENU_OPEN) {
            Toast.makeText(this, "Open clicked", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}