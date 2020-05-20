package com.yangdxg.ganjetpack;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

/**
 * 作者：yangdxg
 * 日期：2020-05-19
 * 描述：
 */
public class HomeFragment extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, null);
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        final NavController controller = Navigation.findNavController(getView());
        getView().findViewById(R.id.btn_to_mine).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("from", "home_page");
                controller.navigate(R.id.action_homeFragment_to_mineFragment, bundle);
            }
        });
        getView().findViewById(R.id.btn_to_category).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeFragmentDirections.ActionHomeFragmentToCategoryFragment action = HomeFragmentDirections.actionHomeFragmentToCategoryFragment()
                        .setFrom("home_page");
                controller.navigate(action);
            }
        });
    }
}
