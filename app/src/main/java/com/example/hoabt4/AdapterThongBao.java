package com.example.hoabt4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class AdapterThongBao extends ArrayAdapter<ThongBao> {
    Context context;
    int res;
    ArrayList<ThongBao> thongBaos;
    public AdapterThongBao(@NonNull Context context, int resource, @NonNull ArrayList<ThongBao> objects) {
        super(context, resource, objects);
        this.context = context;
        this.res = resource;
        this.thongBaos = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null)
            convertView = LayoutInflater.from(context).inflate(R.layout.item_thong_bao, parent, false);
        TextView ngay = convertView.findViewById(R.id.ngay);
        TextView tieude = convertView.findViewById(R.id.tieude);
        ImageButton logothongbao = convertView.findViewById(R.id.hinhanhthongbao);
        ThongBao tb = thongBaos.get(position);
        String ngays = tb.getNgay();
        ngay.setText(ngays);
        String tieudes = tb.getTieude();
        tieude.setText(tieudes);
        int hinhanhs = tb.getHinhanhthongbao();
        logothongbao.setImageResource(hinhanhs);
        return convertView;
    }
}
