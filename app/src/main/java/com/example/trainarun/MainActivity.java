package com.example.trainarun;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.trainarun.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MainVM mainVM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        mainVM = ViewModelProviders.of(this).get(MainVM.class);

        binding.setMain(mainVM);

        mainVM.getData().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                mainVM.name.set(s);
            }
        });

        binding.setImain(new IMain() {
            @Override
            public void onClickMe() {
               // Toast.makeText(MainActivity.this, "Hello Arun!", Toast.LENGTH_SHORT).show();
                mainVM.data.setValue("Hello Parthasarathy");
            }
        });
    }
}
