package com.applications.arunjotsingh.youlearn;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class CardLayoutDemo extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_layout_demo);
        RecyclerView ABlist = (RecyclerView) findViewById(R.id.ab_list);
        ABlist.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));
        ABlist.setAdapter(new ABAdapter(this));
        ABlist.setHasFixedSize(true);

        RecyclerView APlist = (RecyclerView) findViewById(R.id.ap_list);
        APlist.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));
        APlist.setAdapter(new APAdapter(this));
        APlist.setHasFixedSize(true);

        RecyclerView CBlist = (RecyclerView) findViewById(R.id.cb_list);
        CBlist.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));
        CBlist.setAdapter(new CBAdapter(this));
        CBlist.setHasFixedSize(true);

        RecyclerView LMlist = (RecyclerView) findViewById(R.id.lm_list);
        LMlist.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));
        LMlist.setAdapter(new LMAdapter(this));
        LMlist.setHasFixedSize(true);

        RecyclerView Alist = (RecyclerView) findViewById(R.id.a_list);
        Alist.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));
        Alist.setAdapter(new AAdapter(this));
        Alist.setHasFixedSize(true);
    }

    class APAdapter extends RecyclerView.Adapter<MyHolder>
    {


        private Activity host;
        private final LayoutInflater inflater;

        public APAdapter(Activity activity) {
            host = activity;
            inflater = LayoutInflater.from(host);
        }
        @Override
        public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new MyHolder(inflater.inflate(R.layout.category_single, parent, false));
        }

        @Override
        public void onBindViewHolder(MyHolder holder, final int position) {

            holder.iv.setImageResource(GlobalApp.APslides[position]);
            holder.tv.setText(GlobalApp.titles[position]);
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view,"Opening Slide "+(position+1),Snackbar.LENGTH_SHORT).show();
                    GlobalApp.viewedSlides.add(position);
                    Intent intent=new Intent(getApplicationContext(), LoginActivity.class);

                    startActivity(intent);
                }
            });
        }

        @Override
        public int getItemCount() {
            return 10;
        }
    }
    class CBAdapter extends RecyclerView.Adapter<MyHolder>
    {


        private Activity host;
        private final LayoutInflater inflater;

        public CBAdapter(Activity activity) {
            host = activity;
            inflater = LayoutInflater.from(host);
        }
        @Override
        public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new MyHolder(inflater.inflate(R.layout.category_single, parent, false));
        }

        @Override
        public void onBindViewHolder(MyHolder holder, final int position) {

            holder.iv.setImageResource(GlobalApp.CBslides[position]);
            holder.tv.setText(GlobalApp.titles[position]);
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view,"Opening Slide "+(position+1),Snackbar.LENGTH_SHORT).show();
                    GlobalApp.viewedSlides.add(position);
                    Intent intent=new Intent(getApplicationContext(), LoginActivity.class);

                    startActivity(intent);
                }
            });
        }

        @Override
        public int getItemCount() {
            return 10;
        }
    }
    class LMAdapter extends RecyclerView.Adapter<MyHolder>
    {


        private Activity host;
        private final LayoutInflater inflater;

        public LMAdapter(Activity activity) {
            host = activity;
            inflater = LayoutInflater.from(host);
        }
        @Override
        public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new MyHolder(inflater.inflate(R.layout.category_single, parent, false));
        }

        @Override
        public void onBindViewHolder(MyHolder holder, final int position) {

            holder.iv.setImageResource(GlobalApp.LMslides[position]);
            holder.tv.setText(GlobalApp.titles[position]);
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view,"Opening Slide "+(position+1),Snackbar.LENGTH_SHORT).show();
                    GlobalApp.viewedSlides.add(position);
                    Intent intent=new Intent(getApplicationContext(), LoginActivity.class);

                    startActivity(intent);
                }
            });
        }

        @Override
        public int getItemCount() {
            return 10;
        }
    }
    class ABAdapter extends RecyclerView.Adapter<MyHolder>
    {

        private Activity host;
        private final LayoutInflater inflater;

        public ABAdapter(Activity activity) {
            host = activity;
            inflater = LayoutInflater.from(host);
        }
        @Override
        public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new MyHolder(inflater.inflate(R.layout.category_single, parent, false));
        }

        @Override
        public void onBindViewHolder(MyHolder holder, final int position) {

            holder.iv.setImageResource(GlobalApp.ABslides[position]);
            holder.tv.setText(GlobalApp.titles[position]);
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view,"Opening Slide "+(position+1),Snackbar.LENGTH_SHORT).show();
                    GlobalApp.viewedSlides.add(position);
                    Intent intent=new Intent(getApplicationContext(), LoginActivity.class);

                    startActivity(intent);
                }
            });
        }

        @Override
        public int getItemCount() {
            return 10;
        }
    }

   class AAdapter extends RecyclerView.Adapter<MyHolder>
    {

        private Activity host;
        private final LayoutInflater inflater;

        public AAdapter(Activity activity) {
            host = activity;
            inflater = LayoutInflater.from(host);
        }
        @Override
        public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new MyHolder(inflater.inflate(R.layout.category_single, parent, false));
        }

        @Override
        public void onBindViewHolder(MyHolder holder, final int position) {

            holder.iv.setImageResource(GlobalApp.Aslides[position]);
            holder.tv.setText(GlobalApp.titles[position]);
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view,"Opening Slide "+(position+1),Snackbar.LENGTH_SHORT).show();
                    GlobalApp.viewedSlides.add(position);
                    Intent intent=new Intent(getApplicationContext(), LoginActivity.class);

                    startActivity(intent);
                }
            });
        }

        @Override
        public int getItemCount() {
            return 10;
        }
    }

    class MyHolder extends RecyclerView.ViewHolder
    {
        ImageView iv;
        TextView tv;

        public MyHolder(View itemView) {
            super(itemView);
            iv=(ImageView)itemView.findViewById(R.id.imgCat);
            tv=(TextView)itemView.findViewById(R.id.titleCat);

        }
    }

    public void logout(View v)
    {
        startActivity(new Intent(getApplicationContext(),LoginActivity1.class));
    }
}
