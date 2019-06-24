package com.example.mybottomdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private BottomDialog bottomDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button_one);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBottomDialog("拿奖","还好","发的",0);
            }
        });


    }


    //仿iOS底部显示
    private void showBottomDialog(String teil, String textone, String texttwo, final int i) {
        bottomDialog = new BottomDialog(this);
        bottomDialog.setTitleText(teil);
        bottomDialog.setOneText(textone);
        bottomDialog.setTwoText(texttwo);
        bottomDialog.setClicklistener(new BottomDialog.ClickListenerInterface() {
            @Override
            public void onTitleClick() {

            }

            @Override
            public void onOneClick() {

                bottomDialog.dismissDialog();
            }

            @Override
            public void onTwoClick() {

                bottomDialog.dismissDialog();
            }
        });
    }
}
