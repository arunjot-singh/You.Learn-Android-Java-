package com.applications.arunjotsingh.youlearn;

import android.app.Application;
import android.graphics.Bitmap;
import java.util.ArrayList;

/**
 * Created by arunjotsingh on 5/8/16.
 */
public class GlobalApp extends Application
{
    static ArrayList<Bitmap> als;
    static int[] ABslides=
            {
                    R.drawable.ab1_slide1,
                    R.drawable.ab2_slide1,
                    R.drawable.ab3_slide1,
                    R.drawable.ab4_slide1,
                    R.drawable.ab5_slide1,
                    R.drawable.ab6_slide1,
                    R.drawable.ab7_slide1,
                    R.drawable.ab8_slide1,
                    R.drawable.ab9_slide1,
                    R.drawable.ab10_slide1
            };

    static int[] Aslides=
            {
                    R.drawable.a1_slide1,
                    R.drawable.a2_slide1,
                    R.drawable.a3_slide1,
                    R.drawable.a4_slide1,
                    R.drawable.a5_slide1,
                    R.drawable.a6_slide1,
                    R.drawable.a7_slide1,
                    R.drawable.a8_slide1,
                    R.drawable.a9_slide1,
                    R.drawable.a10_slide1
            };


    static int[] APslides=
            {
                    R.drawable.ap1_slide1,
                    R.drawable.ap2_slide1,
                    R.drawable.ap3_slide1,
                    R.drawable.ap4_slide1,
                    R.drawable.ap5_slide1,
                    R.drawable.ap6_slide1,
                    R.drawable.ap7_slide1,
                    R.drawable.ap8_slide1,
                    R.drawable.ap9_slide1,
                    R.drawable.ap10_slide1
            };


    static int[] CBslides=
            {
                    R.drawable.cb1_slide1,
                    R.drawable.cb2_slide1,
                    R.drawable.cb3_slide1,
                    R.drawable.cb4_slide1,
                    R.drawable.cb5_slide1,
                    R.drawable.cb6_slide1,
                    R.drawable.cb7_slide1,
                    R.drawable.cb8_slide1,
                    R.drawable.cb9_slide1,
                    R.drawable.cb10_slide1
            };


    static int[] LMslides=
            {
                    R.drawable.lm1_slide1,
                    R.drawable.lm2_slide1,
                    R.drawable.lm3_slide1,
                    R.drawable.lm4_slide1,
                    R.drawable.lm5_slide1,
                    R.drawable.lm6_slide1,
                    R.drawable.lm7_slide1,
                    R.drawable.lm8_slide1,
                    R.drawable.lm9_slide1,
                    R.drawable.lm10_slide1
            };
    static String[] titles=
            {
                    "Lecture 1",
                    "Lecture 2",
                    "Lecture 3",
                    "Lecture 4",
                    "Lecture 5",
                    "Lecture 6",
                    "Lecture 7",
                    "Lecture 8",
                    "Lecture 9",
                    "Lecture 10"
            };
   static ArrayList<Integer> viewedSlides=new ArrayList<>();
}
