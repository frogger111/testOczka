package com.example.test;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.support.v4.app.NavUtils;

public class MainActivity extends Activity {

	
    private ListView lvFeeds;
    private List<Bonus> bonuses = new ArrayList<Bonus>();
    private ArrayBonusAdapter arrayFeedAdapter;
    
    
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        lvFeeds = (ListView)findViewById(R.id.listView1);
        Bonus bonus1 = new Bonus();
        Bonus bonus2 = new Bonus();
        Bonus bonus3 = new Bonus();
        Bonus bonus4 = new Bonus();
        Bonus bonus5 = new Bonus();
        Bonus bonus6 = new Bonus();
        Bonus bonus7 = new Bonus();
        Bonus bonus8 = new Bonus();
        Bonus bonus9 = new Bonus();
        Bonus bonus10 = new Bonus();
        bonus1.setIle(2);
        bonus2.setIle(2);
        bonus3.setIle(3);
        bonus4.setIle(4);
        bonus5.setIle(1);
        bonus6.setIle(0);
        bonus7.setIle(1);
        bonus8.setIle(3);
        bonus9.setIle(0);
        bonus10.setIle(2);
        bonus1.setWymagane(4);
        bonus2.setWymagane(4);
        bonus3.setWymagane(4);
        bonus4.setWymagane(4);
        bonus5.setWymagane(4);
        bonus6.setWymagane(4);
        bonus7.setWymagane(4);
        bonus8.setWymagane(4);
        bonus9.setWymagane(4);
        bonus10.setWymagane(4);
        bonuses.add(bonus1);
        bonuses.add(bonus2);
        bonuses.add(bonus3);
        bonuses.add(bonus4);
        bonuses.add(bonus5);
        bonuses.add(bonus6);
        bonuses.add(bonus7);
        bonuses.add(bonus8);
        bonuses.add(bonus9);
        bonuses.add(bonus10);
        		arrayFeedAdapter = new ArrayBonusAdapter(this, R.layout.test, bonuses);
        lvFeeds.setAdapter(arrayFeedAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    
}
