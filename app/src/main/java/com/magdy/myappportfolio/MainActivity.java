package com.magdy.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button pop , stk , btb , myapm, goubi, capstn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pop = (Button) findViewById(R.id.popmov);
        stk = (Button) findViewById(R.id.stock);
        btb = (Button) findViewById(R.id.bitbr);
        myapm = (Button) findViewById(R.id.makeurappmat);
        goubi = (Button) findViewById(R.id.goubi);
        capstn = (Button) findViewById(R.id.caps);
        pop.setOnClickListener(this);
        stk.setOnClickListener(this);
        btb.setOnClickListener(this);
        myapm.setOnClickListener(this);
        goubi.setOnClickListener(this);
        capstn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view ==pop)
        {
            Toast.makeText(getBaseContext(),"this button will launch my Popular Movies project",Toast.LENGTH_SHORT).show();

        }else if(view ==stk)
        {
            Toast.makeText(getBaseContext(),"this button will launch my Stock Hawk project",Toast.LENGTH_SHORT).show();
        }
        else if(view ==btb)
        {
            Toast.makeText(getBaseContext(),"this button will launch my Build it Bigger project",Toast.LENGTH_SHORT).show();
        }
        else if(view ==myapm)
        {
            Toast.makeText(getBaseContext(),"this button will launch my Make Your App Material project",Toast.LENGTH_SHORT).show();
        }
        else if(view ==goubi)
        {
            Toast.makeText(getBaseContext(),"this button will launch my Go Ubiquitous project",Toast.LENGTH_SHORT).show();
        }
        else if(view ==capstn)
        {
            Toast.makeText(getBaseContext(),"this button will launch my Capstone project",Toast.LENGTH_SHORT).show();
        }

    }
}
