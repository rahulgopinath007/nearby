package com.example.navigation;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
public class servicesAdapter extends ArrayAdapter<coursemodel> {
    public servicesAdapter(@NonNull Context context, ArrayList<coursemodel> coursemodelArrayList){
        super(context,0,coursemodelArrayList);

    }
@NonNull
@Override
public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
    View listitemView = convertView;
    if (listitemView == null) {

        listitemView = LayoutInflater.from(getContext()).inflate(R.layout.grid_view_items, parent, false);
    }
    coursemodel courseModel = getItem(position);
    TextView courseTV = listitemView.findViewById(R.id.tv1);
    ImageView courseIV = listitemView.findViewById(R.id.imageView1);
    courseTV.setText(courseModel.getCourse_name());
    courseIV.setImageResource(courseModel.getImgid());
    return listitemView;
}
}

