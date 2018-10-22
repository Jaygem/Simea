package com.example.simea.simea;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chauthai.swipereveallayout.SwipeRevealLayout;
import com.chauthai.swipereveallayout.ViewBinderHelper;
import com.example.simea.simea.Classes.Mission;
import com.example.simea.simea.Classes.MissionList;
import com.example.simea.simea.MissionFragment.OnListFragmentInteractionListener;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link Mission} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Add the many menu items
 */
public class MyMissionRecyclerViewAdapter extends RecyclerView.Adapter<MyMissionRecyclerViewAdapter.ViewHolder> {

    private final List<Mission> mValues;
    private final OnListFragmentInteractionListener mListener;
    private final ViewBinderHelper viewBinderHelper = new ViewBinderHelper();

    public MyMissionRecyclerViewAdapter(MissionList items, OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_mission, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        Log.d("in the adapter", String.valueOf(holder.mItem.getId()));
        holder.mIdView.setText(String.valueOf(mValues.get(position).getId()));
        holder.mContentView.setText(mValues.get(position).getDescription());
        viewBinderHelper.bind(holder.swipee, holder.mItem.getDetails());
        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mIdView;
        public final TextView mContentView;
        public Mission mItem;
        public SwipeRevealLayout swipee;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mIdView = (TextView) view.findViewById(R.id.item_number);
            mContentView = (TextView) view.findViewById(R.id.missionTitle);
            swipee = (SwipeRevealLayout) view.findViewById(R.id.swipee);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}
