package com.example.android.tourlagosisland;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {

    ImageView imageOne;
    ImageView imageTwo;
    ImageView imageThree;
    ImageView imageFour;
    TextView aboutText;
    TextView location;
    String mName;
    String mLocation;
    TextView aboutTextID;
    TextView locationTextID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_details);

        imageOne = findViewById(R.id.image_one);
        imageTwo = findViewById(R.id.image_two);
        imageThree = findViewById(R.id.image_three);
        imageFour = findViewById(R.id.image_four);
        aboutText = findViewById(R.id.about_text);
        location = findViewById(R.id.location);
        aboutTextID = findViewById(R.id.about_text_id);
        locationTextID = findViewById(R.id.location_text_id);

        aboutTextID.setText(R.string.about);
        locationTextID.setText(R.string.location);

        mName = getIntent().getStringExtra("name");
        mLocation = getIntent().getStringExtra("location");

        switch (mName) {
            case "Intercontinental Hotel":
                ActionBar interActionBar = getSupportActionBar();
                interActionBar.setTitle(R.string.inter_name);
                imageOne.setImageResource(R.drawable.inter_one);
                imageTwo.setImageResource(R.drawable.inter_two);
                imageThree.setImageResource(R.drawable.inter_three);
                imageFour.setImageResource(R.drawable.inter_four);
                aboutText.setText(R.string.about_intercontinental);
                location.setText(mLocation);
                break;

            case "Lagos Oriental Hotel":
                ActionBar lagosActionBar = getSupportActionBar();
                lagosActionBar.setTitle(R.string.lagos_oriental);
                imageOne.setImageResource(R.drawable.oriental_one);
                imageTwo.setImageResource(R.drawable.oriental_two);
                imageThree.setImageResource(R.drawable.oriental_three);
                imageFour.setImageResource(R.drawable.oriental_four);
                aboutText.setText(R.string.about_lagos_oriental);
                location.setText(mLocation);
                break;

            case "Federal Palace Hotel":
                ActionBar federalActionBar = getSupportActionBar();
                federalActionBar.setTitle(R.string.federal_name);
                imageOne.setImageResource(R.drawable.federal_one);
                imageTwo.setImageResource(R.drawable.federal_two);
                imageThree.setImageResource(R.drawable.federal_three);
                imageFour.setImageResource(R.drawable.federal_four);
                aboutText.setText(R.string.about_federal);
                location.setText(mLocation);
                break;

            case "Eko Hotel & Suites":
                ActionBar ekoActionBar = getSupportActionBar();
                ekoActionBar.setTitle(R.string.eko_name);
                imageOne.setImageResource(R.drawable.eko_one);
                imageTwo.setImageResource(R.drawable.eko_two);
                imageThree.setImageResource(R.drawable.eko_three);
                imageFour.setImageResource(R.drawable.eko_four);
                aboutText.setText(R.string.about_eko);
                location.setText(mLocation);
                break;

            case "Southern Sun":
                ActionBar southernActionBar = getSupportActionBar();
                southernActionBar.setTitle(R.string.southern_name);
                imageOne.setImageResource(R.drawable.southern_one);
                imageTwo.setImageResource(R.drawable.southern_two);
                imageThree.setImageResource(R.drawable.southern_three);
                imageFour.setImageResource(R.drawable.southern_four);
                aboutText.setText(R.string.about_southern);
                location.setText(mLocation);
                break;

            case "Radisson Blu Anchorage Hotel":
                ActionBar radissonActionBar = getSupportActionBar();
                radissonActionBar.setTitle(R.string.radisson_name);
                imageOne.setImageResource(R.drawable.radisson_one);
                imageTwo.setImageResource(R.drawable.radisson_two);
                imageThree.setImageResource(R.drawable.radisson_three);
                imageFour.setImageResource(R.drawable.radisson_four);
                aboutText.setText(R.string.about_radisson);
                location.setText(mLocation);
                break;

            case "Four Points":
                ActionBar fourActionBar = getSupportActionBar();
                fourActionBar.setTitle(R.string.four_name);
                imageOne.setImageResource(R.drawable.four_points_one);
                imageTwo.setImageResource(R.drawable.four_points_two);
                imageThree.setImageResource(R.drawable.four_points_three);
                imageFour.setImageResource(R.drawable.four_points_four);
                aboutText.setText(R.string.about_four);
                location.setText(mLocation);
                break;

            case "Elegushi Royal Beach":
                ActionBar elegushiActionBar = getSupportActionBar();
                elegushiActionBar.setTitle(R.string.elegushi_name);
                imageOne.setImageResource(R.drawable.elegushi_one);
                imageTwo.setImageResource(R.drawable.elegushi_two);
                imageThree.setImageResource(R.drawable.elegushi_three);
                imageFour.setImageResource(R.drawable.elegushi_four);
                aboutText.setText(R.string.about_elegushi);
                location.setText(mLocation);
                break;

            case "Tarkwa Bay Beach":
                ActionBar tarkwaActionBar = getSupportActionBar();
                tarkwaActionBar.setTitle(R.string.tarkwa_name);
                imageOne.setImageResource(R.drawable.tarkwa_one);
                imageTwo.setImageResource(R.drawable.tarkwa_two);
                imageThree.setImageResource(R.drawable.tarkwa_three);
                imageFour.setImageResource(R.drawable.tarkwa_four);
                aboutText.setText(R.string.about_tarkwa);
                location.setText(mLocation);
                break;

            case "Kuramo Beach":
                ActionBar kuramoActionBar = getSupportActionBar();
                kuramoActionBar.setTitle(R.string.kuramo_name);
                imageOne.setImageResource(R.drawable.kuramo_one);
                imageTwo.setImageResource(R.drawable.kuramo_two);
                imageThree.setImageResource(R.drawable.kuramo_three);
                imageFour.setImageResource(R.drawable.kuramo_four);
                aboutText.setText(R.string.about_kuramo);
                location.setText(mLocation);
                break;

            case "Oniru Private Beach":
                ActionBar oniruActionBar = getSupportActionBar();
                oniruActionBar.setTitle(R.string.oniru_name);
                imageOne.setImageResource(R.drawable.oniru_one);
                imageTwo.setImageResource(R.drawable.oniru_two);
                imageThree.setImageResource(R.drawable.oniru_three);
                imageFour.setImageResource(R.drawable.oniru_four);
                aboutText.setText(R.string.about_oniru);
                location.setText(mLocation);
                break;

            case "Atican Beach":
                ActionBar aticanActionBar = getSupportActionBar();
                aticanActionBar.setTitle(R.string.atican_name);
                imageOne.setImageResource(R.drawable.atican_one);
                imageTwo.setImageResource(R.drawable.atican_two);
                imageThree.setImageResource(R.drawable.atican_three);
                imageFour.setImageResource(R.drawable.atican_four);
                aboutText.setText(R.string.about_atican);
                location.setText(mLocation);
                break;

            case "Eleko Beach":
                ActionBar elekoActionBar = getSupportActionBar();
                elekoActionBar.setTitle(R.string.eleko_name);
                imageOne.setImageResource(R.drawable.eleko_one);
                imageTwo.setImageResource(R.drawable.eleko_two);
                imageThree.setImageResource(R.drawable.eleko_three);
                imageFour.setImageResource(R.drawable.eleko_four);
                aboutText.setText(R.string.about_eleko);
                location.setText(mLocation);
                break;

            case "Coconut Beach":
                ActionBar coconutActionBar = getSupportActionBar();
                coconutActionBar.setTitle(R.string.coconut_name);
                imageOne.setImageResource(R.drawable.coconut_one);
                imageTwo.setImageResource(R.drawable.coconut_two);
                imageThree.setImageResource(R.drawable.coconut_three);
                imageFour.setImageResource(R.drawable.coconut_four);
                aboutText.setText(R.string.about_coconut);
                location.setText(mLocation);
                break;

            case "Lekki Leisure Lake":
                ActionBar lekkiActionBar = getSupportActionBar();
                lekkiActionBar.setTitle(R.string.lekki_name);
                imageOne.setImageResource(R.drawable.lekki_one);
                imageTwo.setImageResource(R.drawable.lekki_two);
                imageThree.setImageResource(R.drawable.lekki_three);
                imageFour.setImageResource(R.drawable.lekki_four);
                aboutText.setText(R.string.about_lekki);
                location.setText(mLocation);
                break;

            case "Lekki Conservation Centre":
                ActionBar lekkiConActionBar = getSupportActionBar();
                lekkiConActionBar.setTitle(R.string.lekki_con_name);
                imageOne.setImageResource(R.drawable.lekki_con_one);
                imageTwo.setImageResource(R.drawable.lekki_con_two);
                imageThree.setImageResource(R.drawable.lekki_con_three);
                imageFour.setImageResource(R.drawable.lekki_con_four);
                aboutText.setText(R.string.about_lekki_con);
                location.setText(mLocation);
                break;

            case "LUFASI Nature Park":
                ActionBar lufasiActionBar = getSupportActionBar();
                lufasiActionBar.setTitle(R.string.lufasi_name);
                imageOne.setImageResource(R.drawable.lufasi_one);
                imageTwo.setImageResource(R.drawable.lufasi_two);
                imageThree.setImageResource(R.drawable.lufasi_three);
                imageFour.setImageResource(R.drawable.lufasi_four);
                aboutText.setText(R.string.about_lufasi);
                location.setText(mLocation);
                break;

            case "Gberefu Island":
                ActionBar gberefuActionBar = getSupportActionBar();
                gberefuActionBar.setTitle(R.string.gberefu_name);
                imageOne.setImageResource(R.drawable.gberefu_one);
                imageTwo.setImageResource(R.drawable.gberefu_two);
                imageThree.setImageResource(R.drawable.gberefu_three);
                imageFour.setImageResource(R.drawable.gberefu_four);
                aboutText.setText(R.string.about_gberefu);
                location.setText(mLocation);
                break;

            case "Freedom Park":
                ActionBar freedomActionBar = getSupportActionBar();
                freedomActionBar.setTitle(R.string.freedom_name);
                imageOne.setImageResource(R.drawable.freedom_one);
                imageTwo.setImageResource(R.drawable.freedom_two);
                imageThree.setImageResource(R.drawable.freedom_three);
                imageFour.setImageResource(R.drawable.freedom_four);
                aboutText.setText(R.string.about_freedom);
                location.setText(mLocation);
                break;

            case "Leisure Sports Park":
                ActionBar leisureActionBar = getSupportActionBar();
                leisureActionBar.setTitle(R.string.leisure_name);
                imageOne.setImageResource(R.drawable.leisure_one);
                imageTwo.setImageResource(R.drawable.leisure_two);
                imageThree.setImageResource(R.drawable.leisure_three);
                imageFour.setImageResource(R.drawable.leisure_four);
                aboutText.setText(R.string.about_leisure);
                location.setText(mLocation);
                break;

            case "Dolphin Park":
                ActionBar dolphinActionBar = getSupportActionBar();
                dolphinActionBar.setTitle(R.string.dolphin_name);
                imageOne.setImageResource(R.drawable.dolphin_one);
                imageTwo.setImageResource(R.drawable.dolphin_two);
                imageThree.setImageResource(R.drawable.dolphin_three);
                imageFour.setImageResource(R.drawable.dolphin_four);
                aboutText.setText(R.string.about_dolphin);
                location.setText(mLocation);
                break;


            case "Sailors Lounge":
                ActionBar sailorsActionBar = getSupportActionBar();
                sailorsActionBar.setTitle(R.string.sailors_name);
                imageOne.setImageResource(R.drawable.sailors_one);
                imageTwo.setImageResource(R.drawable.sailors_two);
                imageThree.setImageResource(R.drawable.sailors_three);
                imageFour.setImageResource(R.drawable.sailors_four);
                aboutText.setText(R.string.about_sailors);
                location.setText(mLocation);
                break;

            case "Villa Medici":
                ActionBar villaActionBar = getSupportActionBar();
                villaActionBar.setTitle(R.string.villa_name);
                imageOne.setImageResource(R.drawable.villa_one);
                imageTwo.setImageResource(R.drawable.villa_two);
                imageThree.setImageResource(R.drawable.villa_three);
                imageFour.setImageResource(R.drawable.villa_four);
                aboutText.setText(R.string.about_villa);
                location.setText(mLocation);
                break;

            case "Metisse Restaurant":
                ActionBar metisseActionBar = getSupportActionBar();
                metisseActionBar.setTitle(R.string.metisse_name);
                imageOne.setImageResource(R.drawable.metisse_one);
                imageTwo.setImageResource(R.drawable.metisse_two);
                imageThree.setImageResource(R.drawable.metisse_three);
                imageFour.setImageResource(R.drawable.metisse_four);
                aboutText.setText(R.string.about_metisse);
                location.setText(mLocation);
                break;

            case "Bungalow's":
                ActionBar bungalowActionBar = getSupportActionBar();
                bungalowActionBar.setTitle(R.string.bungalow_name);
                imageOne.setImageResource(R.drawable.bungalow_one);
                imageTwo.setImageResource(R.drawable.bungalow_two);
                imageThree.setImageResource(R.drawable.bungalow_three);
                imageFour.setImageResource(R.drawable.bungalow_four);
                aboutText.setText(R.string.about_bungalow);
                location.setText(mLocation);
                break;

            case "1662 Cafe & Bar":
                ActionBar sixteenActionBar = getSupportActionBar();
                sixteenActionBar.setTitle(R.string.sixteen_name);
                imageOne.setImageResource(R.drawable.sixteen_one);
                imageTwo.setImageResource(R.drawable.sixteen_two);
                imageThree.setImageResource(R.drawable.sixteen_three);
                imageFour.setImageResource(R.drawable.sixteen_four);
                aboutText.setText(R.string.about_1662);
                location.setText(mLocation);
                break;

            case "Hard Rock Cafe":
                ActionBar hardActionBar = getSupportActionBar();
                hardActionBar.setTitle(R.string.hard_name);
                imageOne.setImageResource(R.drawable.hard_one);
                imageTwo.setImageResource(R.drawable.hard_two);
                imageThree.setImageResource(R.drawable.hard_three);
                imageFour.setImageResource(R.drawable.hard_four);
                aboutText.setText(R.string.about_hard);
                location.setText(mLocation);
                break;

            case "The Place Lekki":
                ActionBar placeActionBar = getSupportActionBar();
                placeActionBar.setTitle(R.string.place_name);
                imageOne.setImageResource(R.drawable.place_one);
                imageTwo.setImageResource(R.drawable.place_two);
                imageThree.setImageResource(R.drawable.place_three);
                imageFour.setImageResource(R.drawable.place_four);
                aboutText.setText(R.string.about_the_place);
                location.setText(mLocation);
                break;

            default:
                Toast.makeText(DetailsActivity.this, R.string.toast_message, Toast.LENGTH_LONG).show();
        }
    }
}
