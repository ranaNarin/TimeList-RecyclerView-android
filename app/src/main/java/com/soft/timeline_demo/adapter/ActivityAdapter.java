package com.soft.timeline_demo.adapter;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.vipulasri.timelineview.TimelineView;
import com.soft.timeline_demo.R;
import com.soft.timeline_demo.lib_recyclerViewHeader.StickyHeaderAdapter;
import com.soft.timeline_demo.model.OrderStatus;
import com.soft.timeline_demo.model.TimeLineModel;
import com.soft.timeline_demo.timeLine.DateTimeUtils;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by narinder.rana on 12/8/2017.
 */

public class ActivityAdapter extends RecyclerView.Adapter<ActivityAdapter.ActivityViewHolder> implements
        StickyHeaderAdapter<ActivityAdapter.HeaderHolder> {

    private final Context context;
    private List<TimeLineModel> mFeedList;
    private Context mContext;

    private LayoutInflater mLayoutInflater;


    public ActivityAdapter(Context context, List<TimeLineModel> feedList) {
        this.context = context;
        mFeedList = feedList;


    }


    @Override
    public ActivityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        mContext = parent.getContext();
        mLayoutInflater = LayoutInflater.from(mContext);
        View view = mLayoutInflater.inflate(R.layout.item_timeline, parent, false);

        return new ActivityViewHolder(view, viewType);
    }

    @Override
    public void onBindViewHolder(ActivityViewHolder holder, int position) {


        TimeLineModel timeLineModel = mFeedList.get(position);

        if (timeLineModel.getStatus() == OrderStatus.ACTIVE1) {
            holder.mTimelineView.setMarker(mContext.getResources().getDrawable(R.drawable.icon1));
            // holder.mTimelineView.setMarker(VectorDrawableUtils.getDrawable(mContext, R.drawable.icon1, android.R.color.darker_gray));
        } else if (timeLineModel.getStatus() == OrderStatus.ACTIVE2) {
            holder.mTimelineView.setMarker(mContext.getResources().getDrawable(R.drawable.icon2));
            //holder.mTimelineView.setMarker(VectorDrawableUtils.getDrawable(mContext, R.drawable.icon2, R.color.colorPrimary));
        } else if (timeLineModel.getStatus() == OrderStatus.ACTIVE3) {
            holder.mTimelineView.setMarker(mContext.getResources().getDrawable(R.drawable.icon3));
            //holder.mTimelineView.setMarker(VectorDrawableUtils.getDrawable(mContext, R.drawable.icon3, R.color.colorPrimary));
        } else if (timeLineModel.getStatus() == OrderStatus.ACTIVE4) {
            holder.mTimelineView.setMarker(mContext.getResources().getDrawable(R.drawable.icon4));
            //holder.mTimelineView.setMarker(VectorDrawableUtils.getDrawable(mContext,R.drawable.icon4, R.color.colorPrimary));
        } else if (timeLineModel.getStatus() == OrderStatus.ACTIVE5) {
            holder.mTimelineView.setMarker(mContext.getResources().getDrawable(R.drawable.icon5));
            //holder.mTimelineView.setMarker(VectorDrawableUtils.getDrawable(mContext, R.drawable.icon5, R.color.colorPrimary));
        } else {
            holder.mTimelineView.setMarker(ContextCompat.getDrawable(mContext, R.drawable.ic_marker), ContextCompat.getColor(mContext, R.color.colorPrimary));
        }

        if (!timeLineModel.getDate().isEmpty()) {
            holder.mDate.setVisibility(View.VISIBLE);
            holder.mDate.setText(DateTimeUtils.parseDateTime(timeLineModel.getDate(), "yyyy-MM-dd HH:mm", "hh:mm a, dd-MMM-yyyy"));
        } else
            holder.mDate.setVisibility(View.GONE);

        holder.mMessage.setText(timeLineModel.getMessage());
    }

    @Override
    public int getItemCount() {
        return (mFeedList != null ? mFeedList.size() : 0);
    }

    @Override
    public long getHeaderId(int position) {

        try {
            String gID = mFeedList.get(position).getGroupDate();
            StringBuilder sb = new StringBuilder();
            for (char c : gID.toCharArray())
                sb.append((int) c);
            BigInteger mInt = new BigInteger(sb.toString());
            return Long.valueOf(mInt.toString());
        } catch (Exception ex) {
            //ex.printStackTrace();
        }
        return 000;
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public HeaderHolder onCreateHeaderViewHolder(ViewGroup parent) {
        final View view = mLayoutInflater.inflate(R.layout.header_time_line, parent, false);
        return new HeaderHolder(view);
    }

    @Override
    public void onBindHeaderViewHolder(HeaderHolder viewholder, int position) {
        try {
            viewholder.header.setText(mFeedList.get(position).getGroupDate());
            viewholder.header.setBackgroundResource(R.drawable.text_header_bg);//"@drawable/text_header_bg");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public class ActivityViewHolder extends RecyclerView.ViewHolder {

        TextView mDate;
        TextView mMessage;
        TimelineView mTimelineView;

        public ActivityViewHolder(View itemView, int viewType) {
            super(itemView);

            mTimelineView = (TimelineView) itemView.findViewById(R.id.time_marker);
            mMessage = (TextView) itemView.findViewById(R.id.text_timeline_title);
            mDate = (TextView) itemView.findViewById(R.id.text_timeline_date);
        }
    }

    class HeaderHolder extends RecyclerView.ViewHolder {
        public TextView header;

        public HeaderHolder(View itemView) {
            super(itemView);
            header = (TextView) itemView.findViewById(R.id.txtHader);
        }
    }

}
