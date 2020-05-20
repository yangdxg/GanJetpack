package com.yangdxg.ganjetpack;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


/**
 * 作者：yangdxg
 * 日期：2020-05-19
 * 描述：
 */
public class CategoryFragment extends BaseFragment {

    private TextView mTvCategory;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_category, null);
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mTvCategory = getView().findViewById(R.id.tv_category);
        mTvCategory.setText("来自---"+CategoryFragmentArgs.fromBundle(getArguments()).getFrom());
    }
}
