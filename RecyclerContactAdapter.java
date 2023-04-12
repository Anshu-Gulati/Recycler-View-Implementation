package com.example.mythirdapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.viewHolder> {
    Context context;
    ArrayList<ContactModel> arrContacts;
    RecyclerContactAdapter(Context context, ArrayList<ContactModel> arrContacts){
        this.context=context;
        this.arrContacts=arrContacts;
    }
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.list,parent,false);
        ViewHolder viewHolder = new viewHolder(v);
        return (RecyclerContactAdapter.viewHolder) viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
    holder.imgContact.setImageResource(arrContacts.get(position).img);
    holder.txtName.setText(arrContacts.get(position).name);
    holder.txtNumber.setText(arrContacts.get(position).number);
    }

    @Override
    public int getItemCount() {
        return arrContacts.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
    TextView txtName,txtNumber;
    ImageView imgContact;
        public viewHolder(View itemView ) {
            super(itemView);

            txtName = itemView.findViewById(R.id.contact);
            txtNumber = itemView.findViewById(R.id.contactNumber);
            imgContact = itemView.findViewById(R.id.profileImg);
        }
    }
}
