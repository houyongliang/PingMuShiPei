package com.fnfh.pingmushipei;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * 1. 作用
 * 2. 作者 侯永亮
 * 3. 时间 2016/12/28.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private String[] strs;
    private Context context;
    private LayoutInflater inflater;
    public MyAdapter(Context context, String[] strs) {
        this.strs = strs;
        this.context = context;
        inflater=LayoutInflater. from(context);
    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new MyViewHolder(inflater.inflate(R.layout.item,parent,false));
    }

    @Override
    public void onBindViewHolder(MyAdapter.MyViewHolder holder, int position) {
        holder.other.setText(strs[position]+"verygood!");
    }

    @Override
    public int getItemCount() {
        return strs.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView name,other;
        public MyViewHolder(View itemView) {
            super(itemView);
            name= (TextView) itemView.findViewById(R.id.tv_name);
            other= (TextView) itemView.findViewById(R.id.tv_other);
        }


    }
}
