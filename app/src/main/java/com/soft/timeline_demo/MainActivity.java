package com.soft.timeline_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.soft.timeline_demo.adapter.ActivityAdapter;
import com.soft.timeline_demo.lib_recyclerViewHeader.DividerDecoration;
import com.soft.timeline_demo.lib_recyclerViewHeader.StickyHeaderDecoration;
import com.soft.timeline_demo.model.OrderStatus;
import com.soft.timeline_demo.model.TimeLineModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findView();
    }


    private void findView() {

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        RecyclerView.ItemAnimator animator = mRecyclerView.getItemAnimator();
        if (animator instanceof DefaultItemAnimator) {
            ((DefaultItemAnimator) animator).setSupportsChangeAnimations(false);
        }
        mRecyclerView.setLayoutManager(layoutManager);

        final DividerDecoration divider = new DividerDecoration.Builder(getApplicationContext())
                .setHeight(R.dimen.default_divider_height)
                .setPadding(R.dimen.default_divider_padding)
                .setColorResource(R.color.grayBg)
                .build();

        //mRecyclerView.addItemDecoration(divider);
        ActivityAdapter mActivityAdapter = new ActivityAdapter(getApplicationContext(), setDataListItems(new ArrayList<TimeLineModel>()));
        StickyHeaderDecoration stickyHeaderDecoration = new StickyHeaderDecoration(mActivityAdapter);
        mRecyclerView.setAdapter(mActivityAdapter);
        mRecyclerView.addItemDecoration(stickyHeaderDecoration);
        //mRecyclerView.addItemDecoration(stickyHeaderDecoration, 1);

    }

    private List<TimeLineModel> setDataListItems(List<TimeLineModel> mDataList) {
        mDataList.add(new TimeLineModel("Lavern C Ensley: added a target", "2017-02-12 07:00", OrderStatus.ACTIVE1, "May 19"));
        mDataList.add(new TimeLineModel("Lavern C Ensley: added a target", "2017-02-12 07:00", OrderStatus.ACTIVE1, "May 19"));
        mDataList.add(new TimeLineModel("Lavern C Ensley: added a target", "2017-02-12 07:00", OrderStatus.ACTIVE1, "May 19"));
        mDataList.add(new TimeLineModel("Lavern C Ensley: added a target", "2017-02-12 07:00", OrderStatus.ACTIVE1, "May 19"));
        mDataList.add(new TimeLineModel("Lavern C Ensley: added a target", "2017-02-12 07:00", OrderStatus.ACTIVE1, "May 19"));
        mDataList.add(new TimeLineModel("Lavern C Ensley: added a target", "2017-02-12 07:00", OrderStatus.ACTIVE1, "May 19"));
        mDataList.add(new TimeLineModel("Lavern C Ensley: added a target", "2017-02-12 07:00", OrderStatus.ACTIVE1, "May 19"));
        mDataList.add(new TimeLineModel("Lavern C Ensley: added a target", "2017-02-12 07:00", OrderStatus.ACTIVE1, "May 19"));
        mDataList.add(new TimeLineModel("Lavern C Ensley: added a target", "2017-02-12 07:00", OrderStatus.ACTIVE1, "May 19"));
        mDataList.add(new TimeLineModel("Lavern C Ensley: added a target", "2017-02-12 07:00", OrderStatus.ACTIVE1, "May 19"));
        mDataList.add(new TimeLineModel("Lavern C Ensley: added a target", "2017-02-12 07:00", OrderStatus.ACTIVE1, "May 19"));
        mDataList.add(new TimeLineModel("Lavern C Ensley: added a target", "2017-02-12 07:00", OrderStatus.ACTIVE1, "May 19"));
        mDataList.add(new TimeLineModel("Lavern C Ensley: added a target", "2017-02-12 07:00", OrderStatus.ACTIVE1, "May 19"));

        mDataList.add(new TimeLineModel("Lavern C Ensley: added a target", "2017-02-12 08:00", OrderStatus.ACTIVE2, "May 20"));
        mDataList.add(new TimeLineModel("Lavern C Ensley: added a target", "2017-02-11 21:00", OrderStatus.ACTIVE3, "May 20"));
        mDataList.add(new TimeLineModel("Lavern C Ensley: added a target", "2017-02-11 18:00", OrderStatus.ACTIVE4, "May 20"));
        mDataList.add(new TimeLineModel("Lavern C Ensley: added a target", "2017-02-11 09:30", OrderStatus.ACTIVE5, "May 20"));
        mDataList.add(new TimeLineModel("Lavern C Ensley: added a target", "2017-02-11 08:00", OrderStatus.ACTIVE1, "May 20"));
        mDataList.add(new TimeLineModel("Lavern C Ensley: added a target", "2017-02-10 15:00", OrderStatus.ACTIVE2, "May 20"));
        mDataList.add(new TimeLineModel("Lavern C Ensley: added a target", "2017-02-10 14:30", OrderStatus.ACTIVE3, "May 20"));
        mDataList.add(new TimeLineModel("Lavern C Ensley: added a target", "2017-02-10 14:00", OrderStatus.ACTIVE4, "May 20"));

        mDataList.add(new TimeLineModel("Lavern C Ensley: added a target", "2017-02-12 07:00", OrderStatus.ACTIVE1, "May 21"));
        mDataList.add(new TimeLineModel("Lavern C Ensley: added a target", "2017-02-12 08:00", OrderStatus.ACTIVE2, "May 21"));
        mDataList.add(new TimeLineModel("Lavern C Ensley: added a target", "2017-02-11 21:00", OrderStatus.ACTIVE3, "May 21"));
        mDataList.add(new TimeLineModel("Lavern C Ensley: added a target", "2017-02-11 18:00", OrderStatus.ACTIVE4, "May 21"));
        mDataList.add(new TimeLineModel("Lavern C Ensley: added a target", "2017-02-11 09:30", OrderStatus.ACTIVE5, "May 21"));
        mDataList.add(new TimeLineModel("Lavern C Ensley: added a target", "2017-02-11 08:00", OrderStatus.ACTIVE1, "May 21"));
        mDataList.add(new TimeLineModel("Lavern C Ensley: added a target", "2017-02-10 15:00", OrderStatus.ACTIVE2, "May 21"));
        mDataList.add(new TimeLineModel("Lavern C Ensley: added a target", "2017-02-10 14:30", OrderStatus.ACTIVE3, "May 21"));
        mDataList.add(new TimeLineModel("Lavern C Ensley: added a target", "2017-02-10 14:00", OrderStatus.ACTIVE4, "May 21"));


        return mDataList;
    }
}
