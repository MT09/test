package edu.huflit.lab04;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button mbtnshow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbtnshow=(Button) findViewById(R.id.btnshow);
        registerForContextMenu(mbtnshow);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_xemdssv:
                Toast.makeText(this,"Chọn xem danh sách sinh viên",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_K41cntta:
                Toast.makeText(this,"Chọn lớp a",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_K41cnttb:
                Toast.makeText(this,"Chọn lớp b",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_K41cnttc:
                Toast.makeText(this,"Chọn lớp c",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }



    public void btnshow_onClick(View view) {
        PopupMenu popupMenu=new PopupMenu(MainActivity.this,view);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.item_movie:
                        Toast.makeText(MainActivity.this,"Movies",Toast.LENGTH_SHORT).show();
                    case R.id.item_music:
                        Toast.makeText(MainActivity.this,"Music",Toast.LENGTH_SHORT).show();
                    case R.id.item_comedy:
                        Toast.makeText(MainActivity.this,"Music",Toast.LENGTH_SHORT).show();
                        return true    ;
                }
                return false;
            }
        });
        popupMenu.inflate(R.menu.my_popup_menu);
        popupMenu.show();
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.my_context_menu,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_red:
                mbtnshow.setBackgroundColor(getResources().getColor(R.color.red));
                break;
            case R.id.item_green:
                mbtnshow.setBackgroundColor(getResources().getColor(R.color.green));
                break;
            case R.id.item_blue:
                mbtnshow.setBackgroundColor(getResources().getColor(R.color.blue));
                break;

        }
        return super.onContextItemSelected(item);
    }
}