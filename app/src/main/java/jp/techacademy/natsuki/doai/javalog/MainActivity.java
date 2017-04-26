package jp.techacademy.natsuki.doai.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human kouu = new Human("項羽", 30, "テニス");

        kouu.say();
        kouu.think();

        Human ryuhou = new Human("劉邦", 46, "カラオケ");

        ryuhou.say();
        ryuhou.think();
    }

}
