package com.example.hoabt4;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Main1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ListView listthongbao;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        listthongbao=findViewById(R.id.list_thong_bao);
        ArrayList<ThongBao> thongbaoss =new ArrayList<>();
        ThongBao thongbao1 = new ThongBao(R.drawable.img,"23/05/2022","Solar Boat Challege 2022 - Khơi dậy niềm đam mê khoa học kỹ thuật");
        thongbaoss.add(thongbao1);
        ThongBao thongbao2 = new ThongBao(R.drawable.img,"23/05/2022","Solar Boat Challege 2022 - Khơi dậy niềm đam mê khoa học kỹ thuật");
        thongbaoss.add(thongbao2);
        ThongBao thongbao3 = new ThongBao(R.drawable.img,"23/05/2022","Solar Boat Challege 2022 - Khơi dậy niềm đam mê khoa học kỹ thuật");
        thongbaoss.add(thongbao3);
        AdapterThongBao adapterThongBao=new AdapterThongBao(Main1Activity.this,R.layout.item_thong_bao,thongbaoss);
        listthongbao.setAdapter(adapterThongBao);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("THÔNG BÁO");
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:break;
        }
        return super.onOptionsItemSelected(item);
    }
}
