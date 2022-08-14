package com.hashinology.mynavigationcardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.MyViews> {
    private List<Book> books;
    private LayoutInflater mInflater;
    private MyInterface myInterface;

    public BookAdapter(List<Book> books, Context context) {
        this.books = books;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public MyViews onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.books_list, parent, false);
        return new MyViews(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViews holder, int position) {
        Book book = books.get(position);
        holder.tvAuthor.setText(book.getAuthor());
        holder.tvDescription.setText(book.getDescription());
        holder.imgID.setImageResource(book.getImgID());
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    public class MyViews extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tvAuthor, tvDescription;
        ImageView imgID;
        public MyViews(@NonNull View itemView) {
            super(itemView);
            tvAuthor = itemView.findViewById(R.id.tvAuthor);
            tvDescription = itemView.findViewById(R.id.tvDescription);
            imgID = itemView.findViewById(R.id.imgBook);

            imgID.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (myInterface != null){
                myInterface.myClick(view, getAdapterPosition());
            }
        }
    }
    public void getAdapterInterface(MyInterface myInterface){
        this.myInterface = myInterface;
    }
}
