package cn.johnsen.learnandroid.paint;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import cn.johnsen.learnandroid.R;

public class PaintActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //---------------------------渲染---------------------------------
//        setContentView(new MyGradientView(this));
//        setContentView(R.layout.activity_paint);
//        setContentView(new RadarGradientView(this));
//        setContentView(new ZoomImageView(this));

        //---------------------------滤镜---------------------------------
//        setContentView(new FilterView(this));

        //---------------------------xfermode---------------------------------
//        setContentView(R.layout.activity_main_xf);

        //dts
//        setContentView(R.layout.activity_main2);
//        findViewById(R.id.rounddstinbtn).setOnClickListener(this);
//        findViewById(R.id.invertdstinbtn).setOnClickListener(this);
//        findViewById(R.id.irregularwavebtn).setOnClickListener(this);
//        findViewById(R.id.heartbitbtn).setOnClickListener(this);
        //other
        setContentView(R.layout.activity_main3);
        findViewById(R.id.lightbookview).setOnClickListener(this);
        findViewById(R.id.twitterview).setOnClickListener(this);
        //src
//        setContentView(R.layout.activity_main4);
//        findViewById(R.id.roundsrcin).setOnClickListener(this);
//        findViewById(R.id.invertsrcin).setOnClickListener(this);
//        findViewById(R.id.eraserview).setOnClickListener(this);
//        findViewById(R.id.guaguaview).setOnClickListener(this);
//        findViewById(R.id.roundsrcatop).setOnClickListener(this);
//        findViewById(R.id.invertsrcatop).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        hideAllViews();
        switch (v.getId()) {
            //src
//            case R.id.roundsrcin:
//                findViewById(R.id.roundsrcin_view).setVisibility(View.VISIBLE);
//                break;
//            case R.id.invertsrcin:
//                findViewById(R.id.invertsrcin_view).setVisibility(View.VISIBLE);
//                break;
//            case R.id.eraserview:
//                findViewById(R.id.eraserview_view).setVisibility(View.VISIBLE);
//                break;
//            case R.id.guaguaview:
//                findViewById(R.id.guaguaview_view).setVisibility(View.VISIBLE);
//                break;
//            case R.id.roundsrcatop:
//                findViewById(R.id.roundsrcatop_view).setVisibility(View.VISIBLE);
//                break;
//            case R.id.invertsrcatop:
//                findViewById(R.id.invertsrcatop_view).setVisibility(View.VISIBLE);
//                break;

            //other
            case R.id.lightbookview:
                findViewById(R.id.lightbookview_view).setVisibility(View.VISIBLE);
                break;
            case R.id.twitterview:
                findViewById(R.id.twitterview_view).setVisibility(View.VISIBLE);
                break;
            //dts
//            case R.id.rounddstinbtn:
//                findViewById(R.id.roundimage).setVisibility(View.VISIBLE);
//                break;
//            case R.id.invertdstinbtn:
//                findViewById(R.id.invertimg).setVisibility(View.VISIBLE);
//                break;
//            case R.id.irregularwavebtn:
//                findViewById(R.id.irregularwaveview).setVisibility(View.VISIBLE);
//                break;
//            case R.id.heartbitbtn:
//                findViewById(R.id.heartbitview).setVisibility(View.VISIBLE);
//                break;
        }
    }

    private void hideAllViews() {
        //src
//        findViewById(R.id.roundsrcin_view).setVisibility(View.GONE);
//        findViewById(R.id.invertsrcin_view).setVisibility(View.GONE);
//        findViewById(R.id.eraserview_view).setVisibility(View.GONE);
//        findViewById(R.id.guaguaview_view).setVisibility(View.GONE);
//        findViewById(R.id.roundsrcatop_view).setVisibility(View.GONE);
//        findViewById(R.id.invertsrcatop_view).setVisibility(View.GONE);

//        other
        findViewById(R.id.lightbookview_view).setVisibility(View.GONE);
        findViewById(R.id.twitterview_view).setVisibility(View.GONE);

//        dts
//        findViewById(R.id.roundimage).setVisibility(View.GONE);
//        findViewById(R.id.invertimg).setVisibility(View.GONE);
//        findViewById(R.id.irregularwaveview).setVisibility(View.GONE);
//        findViewById(R.id.heartbitview).setVisibility(View.GONE);
    }
}
