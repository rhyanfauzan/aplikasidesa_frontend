package com.ryandev.aplikasidesa;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class FragmentHome extends Fragment {

    ImageSlider imageSlider;

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        imageSlider = v.findViewById(R.id.imgSlider);

        List<SlideModel> slideModelList = new ArrayList<>();
        slideModelList.add(new SlideModel("https://images.unsplash.com/photo-1562785333-7cd755716611?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=889&q=80","Kegiatan Masyarakat"));
        slideModelList.add(new SlideModel("https://images.unsplash.com/photo-1543804082-5e00fcfc1e66?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MTF8fGxvdyUyMHJlc3xlbnwwfHwwfA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60","Penyuluhan Dinas Kesehatan"));
        slideModelList.add(new SlideModel("https://images.unsplash.com/photo-1562785329-80a4a586dfcb?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=889&q=80","Memperingati HUT-RI"));
        slideModelList.add(new SlideModel("https://images.unsplash.com/photo-1578238888989-e2ed6f017383?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=667&q=80","Acara Halal bihalal di desa"));
        imageSlider.setImageList(slideModelList, true);

        return v;
    }
}
