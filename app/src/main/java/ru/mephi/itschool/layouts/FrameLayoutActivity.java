package ru.mephi.itschool.layouts;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FrameLayoutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_frame_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.frame_layout), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            int padding = getResources().getDimensionPixelSize(R.dimen.horizontal_padding);
            v.setPadding(
                    systemBars.left + padding,
                    systemBars.top,
                    systemBars.right + padding,
                    systemBars.bottom
            );
            return insets;
        });
    }
}