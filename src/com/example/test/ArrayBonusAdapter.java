package com.example.test;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ArrayBonusAdapter extends ArrayAdapter<Bonus>{
	
	 private int resource;
	private List<Button> list = new ArrayList<Button>();
	
	public ArrayBonusAdapter(Context context,
			int textViewResourceId, List<Bonus> objects) {
		super(context, textViewResourceId, objects);
		// TODO Auto-generated constructor stub
		resource = textViewResourceId;
		
		
	}
	@Override
    public View getView(int position, View convertView, ViewGroup parent) {
            RelativeLayout feedView = null;
            Bonus feed = getItem(position);
            
            
            int temp = feed.getIle();
            int ile = feed.getIle();
            int wymagane = feed.getWymagane();
            
           
            if(convertView == null) {
                    feedView = new RelativeLayout(getContext());
                    LayoutInflater inflater = 
                            (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    inflater.inflate(resource, feedView, true);
            } else {
                    feedView = (RelativeLayout)convertView;
            }
            Button btn1 = (Button)feedView.findViewById(R.id.button1);
            Button btn2 = (Button)feedView.findViewById(R.id.button2);
            Button btn3 = (Button)feedView.findViewById(R.id.button3);
            Button btn4 = (Button)feedView.findViewById(R.id.button4);
            TextView text = (TextView)feedView.findViewById(R.id.textView1);
            list.clear();
            list.add(btn1);
            list.add(btn2);
            list.add(btn3);
            list.add(btn4);
            LinearLayout lay = (LinearLayout)feedView.findViewById(R.id.linear123);
            if(position == 0){
            		lay.setVisibility(View.VISIBLE);
            		btn1.setVisibility(View.GONE);
            		btn2.setVisibility(View.GONE);
            		btn3.setVisibility(View.GONE);
            		btn4.setVisibility(View.GONE);
            		text.setVisibility(View.GONE);
            		
            }
            else
            {
            	int sad= 0;
            	lay.setVisibility(View.GONE);
            	for(int g = 0; g < wymagane;g++){
            		if(sad < ile){
                	list.get(g).setBackgroundColor(Color.RED);
                	list.get(g).setVisibility(View.VISIBLE);
                	sad++;
            		}
            		else{
            			list.get(g).setBackgroundColor(Color.BLUE);
                    	list.get(g).setVisibility(View.VISIBLE);
            		}
                }
            	text.setText("Ile mam=" + ile + " wymagane=" + wymagane);
            	text.setVisibility(View.VISIBLE);
            }
            

            
            
            
            return feedView;
    }
}
