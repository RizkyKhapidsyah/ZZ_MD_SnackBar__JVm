package com.rk.md_sb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    CoordinatorLayout C_Layout_IDJAVA;
    Button B_SnackBar_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        C_Layout_IDJAVA = findViewById(R.id.C_Layout_IDXML);
        B_SnackBar_IDJAVA = findViewById(R.id.B_SnackBar_IDXML);

        B_SnackBar_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilkanSnackBar();
            }
        });
    }

    public void TampilkanSnackBar() {
        final Snackbar SB = Snackbar.make(C_Layout_IDJAVA, "Ini Adalah Snack Bar", Snackbar.LENGTH_INDEFINITE).setAction("UNDO", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar SB1 = Snackbar.make(C_Layout_IDJAVA, "Undo Berhasil", Snackbar.LENGTH_SHORT);
                View Tampil = SB1.getView();
                //TextView TV = Tampil.findViewById(android.support.design.R.id.snackbar_text);
                //TV.setTextColor(Color.GREEN);
                SB1.show();
            }
        }).setActionTextColor(Color.RED);

        View TampilSnack = SB.getView();
        //TextView TV1 = TampilSnack.findViewById(android.support.design.R.id.snackbar_text);
        //TV1.setTextColor(Color.YELLOW);
        SB.show();
    }
}
