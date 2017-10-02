package com.example.bornittah.myapplication;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.bornittah.myapplication.fragments.BagsFragment;
import com.example.bornittah.myapplication.fragments.ClothesFragment;
import com.example.bornittah.myapplication.fragments.DrinksFragment;
import com.example.bornittah.myapplication.fragments.FruitsFragment;
import com.example.bornittah.myapplication.fragments.VegetableFragment;

public class ItemDetailActivity extends AppCompatActivity {
    private static final String TAG = "ItemDetailActivity";
    FragmentManager fm;
    FragmentTransaction ft;
    private Context context;
    String userschoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);
        context=ItemDetailActivity.this;

       userschoice =getIntent().getStringExtra("choice");
        Log.d(TAG, "onCreate: users choice"+userschoice);

        fm=getSupportFragmentManager();
        ft=fm.beginTransaction();

        if(userschoice.equals("fruits")){
            Fragment f=new FruitsFragment();
            ft.replace(R.id.main,f);
            ft.commit();
        }
        if(userschoice.equals("clothes")){
            Fragment f=new ClothesFragment();
            ft.replace(R.id.main,f);
            ft.commit();
        }
        if(userschoice.equals("bags")){
            Fragment f=new BagsFragment();
            ft.replace(R.id.main,f);
            ft.commit();
        }
        if(userschoice.equals("drinks")){
            Fragment f=new DrinksFragment();
            ft.replace(R.id.main,f);
            ft.commit();
        }
        if(userschoice.equals("vegetables")){
            Fragment f=new VegetableFragment();
            ft.replace(R.id.main,f);
            ft.commit();
        }

    }
}
