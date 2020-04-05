package com.udgs123.demo3gs.ui.trangchu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.udgs123.demo3gs.R;

public class TrangchuFragment extends Fragment {

    View v;
    GridView gridView;
    String letterList[] = {"Jin", "RM", "Suga", "JHope", "Jimin", "V","Jungkook"};
    int lettersIcon[] = {R.drawable.avt1, R.drawable.avt2,
    R.drawable.avt3, R.drawable.avt4, R.drawable.avt5,
    R.drawable.avt6, R.drawable.avt7};



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_trangchu,container,false);

        gridView = (GridView) v.findViewById(R.id.gridView);
        GridAdater adater = new GridAdater(getActivity(),lettersIcon,letterList);
        gridView.setAdapter(adater);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "Clicked letter:"+letterList[position], Toast.LENGTH_SHORT).show();
            }
        });



        return v;
    }


}