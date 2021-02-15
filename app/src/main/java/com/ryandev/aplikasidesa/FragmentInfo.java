package com.ryandev.aplikasidesa;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentInfo extends Fragment {
    View btnDetail, btnDetail2, btnDetail3;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_info, container, false);
        btnDetail = v.findViewById(R.id.bantuan1);
        btnDetail2 = v.findViewById(R.id.bantuan2);
        btnDetail3 = v.findViewById(R.id.bantuan3);

        btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), InfoBantuanDetail.class));
            }
        });
        btnDetail2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), InfoBantuanDetail.class));
            }
        });
        btnDetail3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), InfoBantuanDetail.class));
            }
        });
        return v;
    }



}
