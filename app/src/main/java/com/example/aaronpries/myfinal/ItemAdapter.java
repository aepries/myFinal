//package com.example.aaronpries.myfinal;
//
//import android.content.Context;
//import android.support.v7.widget.CardView;
//import android.support.v7.widget.RecyclerView;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//
//import java.util.ArrayList;
//
///**
// * Created by aaronpries on 12/6/16.
// */
//
//public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
//
//    private Context context;
//    private ArrayList<Item> itemList;
//
//    public ItemAdapter(Context context, ArrayList<Item> itemList){
//        this.context = context;
//        this.itemList = itemList;
//    }
//
//    @Override
//    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        return null;
//    }
//
//    @Override
//    public void onBindViewHolder(ItemViewHolder holder, int position) {
//
//    }
//
//    @Override
//    public int getItemCount() {
//        if (itemList != null) {
//
//            return itemList.size();
//        }
//        return 0;
//    }
//
//    //ViewHolder Class
//    public static class ItemViewHolder extends RecyclerView.ViewHolder{
//
//        public CardView cvItem;
//        public ImageView ivMainImage;
//        public tvTitle;
//
//
//        public ItemViewHolder(View itemView){
//            super(itemView);
//        }
//
//    }
//}
