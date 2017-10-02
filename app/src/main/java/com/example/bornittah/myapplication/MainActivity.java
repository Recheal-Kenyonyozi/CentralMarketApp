package com.example.bornittah.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String[] items={"fruits","clothes","bags","drinks","vegetables"};

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context=MainActivity.this;


        int configuration=getResources().getConfiguration().orientation;
        if(configuration==Configuration.ORIENTATION_LANDSCAPE){
            setContentView(R.layout.landscape_view);
            ListView listView= (ListView) findViewById(R.id.list);

            ListAdapter adapter=new ArrayAdapter<String>(context,android.R.layout.simple_list_item_1,items);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                RelativeLayout rlt2= (RelativeLayout) findViewById(R.id.fruitsmain);
                RelativeLayout rlt= (RelativeLayout) findViewById(R.id.clothesmain);
                RelativeLayout rlt3= (RelativeLayout) findViewById(R.id.bagsmain);
                RelativeLayout rlt4= (RelativeLayout) findViewById(R.id.drinksmain);
                RelativeLayout rlt5= (RelativeLayout) findViewById(R.id.vegetablesmain);
                RelativeLayout rlt6= (RelativeLayout) findViewById(R.id.defaultfrag);

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String user_chose=String.valueOf(parent.getItemAtPosition(position));
                    switch (user_chose){
                       case "fruits":

                           rlt2.setVisibility(View.VISIBLE);
                           rlt.setVisibility(View.INVISIBLE);
                           rlt3.setVisibility(View.INVISIBLE);
                           rlt4.setVisibility(View.INVISIBLE);
                           rlt5.setVisibility(View.INVISIBLE);
                           rlt6.setVisibility(View.INVISIBLE);


                           break;
                        case "clothes":

                            rlt.setVisibility(View.VISIBLE);
                            rlt2.setVisibility(View.INVISIBLE);
                            rlt3.setVisibility(View.INVISIBLE);
                            rlt4.setVisibility(View.INVISIBLE);
                            rlt5.setVisibility(View.INVISIBLE);
                            rlt6.setVisibility(View.INVISIBLE);
                            break;
                        case "bags":

                            rlt.setVisibility(View.INVISIBLE);
                            rlt2.setVisibility(View.INVISIBLE);
                            rlt3.setVisibility(View.VISIBLE);
                            rlt4.setVisibility(View.INVISIBLE);
                            rlt5.setVisibility(View.INVISIBLE);
                            rlt6.setVisibility(View.INVISIBLE);
                            break;
                        case "drinks":

                            rlt.setVisibility(View.INVISIBLE);
                            rlt2.setVisibility(View.INVISIBLE);
                            rlt3.setVisibility(View.INVISIBLE);
                            rlt4.setVisibility(View.VISIBLE);
                            rlt5.setVisibility(View.INVISIBLE);
                            rlt6.setVisibility(View.INVISIBLE);
                            break;

                        case "vegetables":

                            rlt.setVisibility(View.INVISIBLE);
                            rlt2.setVisibility(View.INVISIBLE);
                            rlt3.setVisibility(View.INVISIBLE);
                            rlt4.setVisibility(View.INVISIBLE);
                            rlt5.setVisibility(View.VISIBLE);
                            rlt6.setVisibility(View.INVISIBLE);
                            break;




                    }
                }
            });






        }else if(configuration==Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.potrait_view);
            ListView listView= (ListView) findViewById(R.id.list);

            ListAdapter adapter=new ArrayAdapter<String>(context,android.R.layout.simple_list_item_1,items);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                RelativeLayout rlt2= (RelativeLayout) findViewById(R.id.fruitsmain);
                RelativeLayout rlt= (RelativeLayout) findViewById(R.id.clothesmain);
                RelativeLayout rlt3= (RelativeLayout) findViewById(R.id.bagsmain);
                RelativeLayout rlt4= (RelativeLayout) findViewById(R.id.drinksmain);
                RelativeLayout rlt5= (RelativeLayout) findViewById(R.id.vegetablesmain);
                RelativeLayout rlt6= (RelativeLayout) findViewById(R.id.defaultfrag);
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String user_chose=String.valueOf(parent.getItemAtPosition(position));
                    switch (user_chose){
                        case "fruits":

                            rlt2.setVisibility(View.VISIBLE);
                            rlt.setVisibility(View.INVISIBLE);
                            rlt3.setVisibility(View.INVISIBLE);
                            rlt4.setVisibility(View.INVISIBLE);
                            rlt5.setVisibility(View.INVISIBLE);
                            rlt6.setVisibility(View.INVISIBLE);


                            break;
                        case "clothes":

                            rlt.setVisibility(View.VISIBLE);
                            rlt2.setVisibility(View.INVISIBLE);
                            rlt3.setVisibility(View.INVISIBLE);
                            rlt4.setVisibility(View.INVISIBLE);
                            rlt5.setVisibility(View.INVISIBLE);
                            rlt6.setVisibility(View.INVISIBLE);
                            break;
                        case "bags":

                            rlt.setVisibility(View.INVISIBLE);
                            rlt2.setVisibility(View.INVISIBLE);
                            rlt3.setVisibility(View.VISIBLE);
                            rlt4.setVisibility(View.INVISIBLE);
                            rlt5.setVisibility(View.INVISIBLE);
                            rlt6.setVisibility(View.INVISIBLE);
                            break;
                        case "drinks":

                            rlt.setVisibility(View.INVISIBLE);
                            rlt2.setVisibility(View.INVISIBLE);
                            rlt3.setVisibility(View.INVISIBLE);
                            rlt4.setVisibility(View.VISIBLE);
                            rlt5.setVisibility(View.INVISIBLE);
                            rlt6.setVisibility(View.INVISIBLE);
                            break;

                        case "vegetables":

                            rlt.setVisibility(View.INVISIBLE);
                            rlt2.setVisibility(View.INVISIBLE);
                            rlt3.setVisibility(View.INVISIBLE);
                            rlt4.setVisibility(View.INVISIBLE);
                            rlt5.setVisibility(View.VISIBLE);
                            rlt6.setVisibility(View.INVISIBLE);
                            break;



                    }
                }
            });


        }












    }
}
