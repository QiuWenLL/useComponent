package com.qiu.paymodule.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qiu.paymodule.R;
import com.xiaojinzi.component.anno.RouterAnno;
import com.xiaojinzi.component.impl.Router;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Pay_info_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */

@RouterAnno(
        host = "paymodule",
        path="paymodule/fragment_info"
)
public class Pay_info_Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Pay_info_Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Pay_info_Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Pay_info_Fragment newInstance(String param1, String param2) {
        Pay_info_Fragment fragment = new Pay_info_Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pay_info_, container, false);
    }


    /**
     *
     * 跳转到 app  main activity
     *
     * @param view
     */
    public void GoMain(View view){
        Router.with(this)
                .host("app")
                .path("app/main")
                .navigate();
    }

}