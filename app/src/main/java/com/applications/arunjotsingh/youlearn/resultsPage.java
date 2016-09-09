package com.applications.arunjotsingh.youlearn;

import android.app.Activity;
import android.content.Intent;
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

public class resultsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_page);

        RecyclerView ABlist = (RecyclerView) findViewById(R.id.ab_list);
        ABlist.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ABlist.setAdapter(new ABAdapter(this));
        ABlist.setHasFixedSize(true);

        TextView correctAnswers = (TextView) findViewById(R.id.correctAns);
        correctAnswers.setText("Correct Answers: "+QuestionsActivity.correct+"");
        TextView wrongAnswers = (TextView) findViewById(R.id.wrongAns);
        wrongAnswers.setText("Incorrect Answers: "+(QuestionsActivity.question.length - QuestionsActivity.correct)+" ");
    }


    class ABAdapter extends RecyclerView.Adapter<MyHolder> {

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
                    Snackbar.make(view, "Opening Slide " + (position + 1), Snackbar.LENGTH_SHORT).show();
                    GlobalApp.viewedSlides.add(position);
                    Intent intent = new Intent(getApplicationContext(), LoginActivity.class);

                    startActivity(intent);
                }
            });
        }

        @Override
        public int getItemCount() {
            return 10;
        }
    }

    class MyHolder extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView tv;

        public MyHolder(View itemView) {
            super(itemView);
            iv = (ImageView) itemView.findViewById(R.id.imgCat);
            tv = (TextView) itemView.findViewById(R.id.titleCat);

        }
    }
    public void home(View v)
    {
        startActivity(new Intent(getApplicationContext(),CardLayoutDemo.class));
    }

}