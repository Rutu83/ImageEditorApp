package com.example.myprojectapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FrameAdapter extends RecyclerView.Adapter<FrameAdapter.FrameViewHolder> {

    Context context;
    List<Integer> frameList;
    FrameAdapterListener listener;

    int row_selected = -1;

    public FrameAdapter(Context context,FrameAdapterListener listener){
        this.context = context;
        this.frameList = getFrameList();
        this.listener = listener;
        this.row_selected = row_selected;
    }
    public  List<Integer> getFrameList(){
        List<Integer> result = new ArrayList<>();
        result.add(R.drawable.vecteezy_frame);
        result.add(R.drawable.vecteezy_foliage);
        result.add(R.drawable.vecteezy_flowers);
        result.add(R.drawable.vecteezy_gold);
        result.add(R.drawable.vecteezy_golden);
        result.add(R.drawable.vecteezy_watercolor);
    return result;

    }
    @NonNull
    @Override
    public FrameAdapter.FrameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.activity_frame_adapter,parent,false);

        return new FrameViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull FrameAdapter.FrameViewHolder holder, int position) {
        if(row_selected == position){
            holder.image_Check.setVisibility(View.VISIBLE);
        }else{
            holder.image_Check.setVisibility(View.INVISIBLE);
        }
        holder.image_frame.setImageResource(frameList.get(position));
    }

    @Override
    public int getItemCount() {
        return frameList.size();
    }

    public class FrameViewHolder extends RecyclerView.ViewHolder {

        ImageView image_Check,image_frame;
        public FrameViewHolder(@NonNull View itemView) {
            super(itemView);

            image_Check = itemView.findViewById(R.id.image_Check);
            image_frame = itemView.findViewById(R.id.image_frame);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onFrameSelected(frameList.get(getAdapterPosition()));
                    row_selected = getAdapterPosition();
                    notifyDataSetChanged();
                }
            });
        }
    }

    public interface  FrameAdapterListener{
        void onFrameSelected(int frame);
    }
}