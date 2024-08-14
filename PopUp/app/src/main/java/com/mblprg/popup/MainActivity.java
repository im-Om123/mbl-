package com.mblprg.popup;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {  // Added interface implementation

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnclick = findViewById(R.id.dialogBtn);
        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showdialog();
            }
        });

        Button showMenuBtn = findViewById(R.id.pbtn);  // Ensure this button exists in your layout
        showMenuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMenu(v);
            }
        });
    }

    public void showMenu(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);  // Set the listener
        popup.inflate(R.menu.my_menu);
        popup.show();

    }

    public void showdialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Exit App");
        builder.setMessage("Do you want to exit?");
        builder.setCancelable(true);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // handle the positive button click
                finish();  // This will close the activity
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // handle the negative button click
                dialog.dismiss();  // Close the dialog
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return handleMenuItemClick(item);
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        return handleMenuItemClick(item);
    }

    private boolean handleMenuItemClick(MenuItem item) {
        TextView title = findViewById(R.id.titleTxt);

        switch (item.getItemId()) {
            case R.id.item1:
                title.setText("Setting");
                Log.d("TAG", "Item 1 Selected: ");
                return true;
            case R.id.item2:
                title.setText("Privacy Policy");
                Log.d("TAG", "Item 2 Selected: ");
                return true;
            case R.id.item3:
                title.setText("Change Theme");
                Log.d("TAG", "Item 3 Selected: ");
                return true;
            case R.id.item4:
                title.setText("Logout");
                Log.d("TAG", "Item 4 Selected: ");
                return true;
            default:
                return false;
        }
    }
}
