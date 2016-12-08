//package com.example.aaronpries.myfinal;
//import android.content.Context;
//import android.support.v7.widget.CardView;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import java.util.List;
//
//public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder>{
//
//    private Context context;
//    private List<Item> books;
//    public CardView cardview;
//        public ImageView ivMainImage;
//        public tvTitle;
//
//
//
//    ItemAdapter(List<Item> books){
//        this.books = books;
//    }
//
//    @Override
//    public int getItemCount() {
//        return books.size();
//    }
//
//    @Override
//    public ItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
//        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_cal, viewGroup, false);
//        ItemViewHolder bvh = new ItemViewHolder(v);
//        return bvh;
//    }
//
//    @Override
//    public void onBindViewHolder(ItemViewHolder bookViewHolder, int i) {
//
//        bookViewHolder.title.setText(books.get(i).text);
//        bookViewHolder.cover.setImageResource(books.get(i).imgID);
//    }
//
//    @Override
//    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
//        super.onAttachedToRecyclerView(recyclerView);
//    }
//
//    public static class ItemViewHolder extends RecyclerView.ViewHolder {
//        CardView cv;
//        TextView title;
//        ImageView cover;
//
//
//
//        ItemViewHolder(View itemView) {
//            super(itemView);
//            cv = (CardView)itemView.findViewById(R.id.cardview);
//            title = (TextView)itemView.findViewById(R.id.title);
//            cover = (ImageView)itemView.findViewById(R.id.photo);
//        }
//    }
//
//}
//
//
//
//
//
////package com.example.aaronpries.myfinal;
////
////import android.content.Context;
////import android.support.v7.widget.CardView;
////import android.support.v7.widget.RecyclerView;
////import android.view.View;
////import android.view.ViewGroup;
////import android.widget.ImageView;
////
////import java.util.ArrayList;
////
/////**
//// * Created by aaronpries on 12/6/16.
//// */
////
////public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
////
////    private Context context;
////    private ArrayList<Item> itemList;
////
////    public ItemAdapter(Context context, ArrayList<Item> itemList){
////        this.context = context;
////        this.itemList = itemList;
////    }
////
////    @Override
////    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
////        return null;
////    }
////
////    @Override
////    public void onBindViewHolder(ItemViewHolder holder, int position) {
////
////    }
////
////    @Override
////    public int getItemCount() {
////        if (itemList != null) {
////
////            return itemList.size();
////        }
////        return 0;
////    }
////
////    //ViewHolder Class
////    public static class ItemViewHolder extends RecyclerView.ViewHolder{
////
////        public CardView cvItem;
////        public ImageView ivMainImage;
////        public tvTitle;
////
////
////        public ItemViewHolder(View itemView){
////            super(itemView);
////        }
////
////    }
////}
