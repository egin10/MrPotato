package id.egin.mr_potato;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView head, hair, eyebrow, eyes, moustache, beard;
    private CircleImageView checkHead, unCheckHead, checkHair, unCheckHair, checkEyeBrow, unCheckEyeBrow,
            checkEyes, unCheckEyes, checkMoustache, unCheckMoustache, checkBeard, unCheckBeard, dino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // init picture
        head = findViewById(R.id.iv_head);
        hair = findViewById(R.id.iv_hair);
        eyebrow = findViewById(R.id.iv_eyebrow);
        eyes = findViewById(R.id.iv_eyes);
        moustache = findViewById(R.id.iv_moustache);
        beard = findViewById(R.id.iv_beard);

        // init visibility
        head.setVisibility(View.INVISIBLE);
        hair.setVisibility(View.INVISIBLE);
        eyebrow.setVisibility(View.INVISIBLE);
        eyes.setVisibility(View.INVISIBLE);
        moustache.setVisibility(View.INVISIBLE);
        beard.setVisibility(View.INVISIBLE);

        // init imageview option
        checkHead = findViewById(R.id.iv_check_head);
        unCheckHead = findViewById(R.id.iv_uncheck_head);
        checkHair = findViewById(R.id.iv_check_hair);
        unCheckHair = findViewById(R.id.iv_uncheck_hair);
        checkEyeBrow = findViewById(R.id.iv_check_eyebrow);
        unCheckEyeBrow = findViewById(R.id.iv_uncheck_eyebrow);
        checkEyes = findViewById(R.id.iv_check_eyes);
        unCheckEyes = findViewById(R.id.iv_uncheck_eyes);
        checkMoustache = findViewById(R.id.iv_check_moustache);
        unCheckMoustache = findViewById(R.id.iv_uncheck_moustache);
        checkBeard = findViewById(R.id.iv_check_beard);
        unCheckBeard = findViewById(R.id.iv_uncheck_beard);
        dino = findViewById(R.id.iv_dino);

        // set option visibility
        unCheckHead.setVisibility(View.GONE);
        unCheckHair.setVisibility(View.GONE);
        unCheckEyeBrow.setVisibility(View.GONE);
        unCheckEyes.setVisibility(View.GONE);
        unCheckMoustache.setVisibility(View.GONE);
        unCheckBeard.setVisibility(View.GONE);

        // set eventhandler
        checkHead.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                changeVisibility(head);
                changeVisibility(unCheckHead);
                changeVisibility(checkHead);
                return false;
            }
        });
        unCheckHead.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                changeVisibility(head);
                changeVisibility(unCheckHead);
                changeVisibility(checkHead);
                return false;
            }
        });

        checkHair.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                changeVisibility(hair);
                changeVisibility(unCheckHair);
                changeVisibility(checkHair);
                return false;
            }
        });
        unCheckHair.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                changeVisibility(hair);
                changeVisibility(unCheckHair);
                changeVisibility(checkHair);
                return false;
            }
        });

        checkEyeBrow.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                changeVisibility(eyebrow);
                changeVisibility(unCheckEyeBrow);
                changeVisibility(checkEyeBrow);
                return false;
            }
        });
        unCheckEyeBrow.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                changeVisibility(eyebrow);
                changeVisibility(unCheckEyeBrow);
                changeVisibility(checkEyeBrow);
                return false;
            }
        });

        checkEyes.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                changeVisibility(eyes);
                changeVisibility(unCheckEyes);
                changeVisibility(checkEyes);
                return false;
            }
        });
        unCheckEyes.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                changeVisibility(eyes);
                changeVisibility(unCheckEyes);
                changeVisibility(checkEyes);
                return false;
            }
        });

        checkMoustache.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                changeVisibility(moustache);
                changeVisibility(unCheckMoustache);
                changeVisibility(checkMoustache);
                return false;
            }
        });
        unCheckMoustache.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                changeVisibility(moustache);
                changeVisibility(unCheckMoustache);
                changeVisibility(checkMoustache);
                return false;
            }
        });

        checkBeard.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                changeVisibility(beard);
                changeVisibility(unCheckBeard);
                changeVisibility(checkBeard);
                return false;
            }
        });
        unCheckBeard.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                changeVisibility(beard);
                changeVisibility(unCheckBeard);
                changeVisibility(checkBeard);
                return false;
            }
        });

        dino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Ginanjar S.B", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void changeVisibility(ImageView img) {
        if(img.isShown()){
            img.setVisibility(View.INVISIBLE);
        }else{
            img.setVisibility(View.VISIBLE);
        }
    }
}