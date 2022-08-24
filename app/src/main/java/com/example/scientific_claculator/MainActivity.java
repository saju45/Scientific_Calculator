package com.example.scientific_claculator;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.scientific_claculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        clickListener();

        binding.display.setShowSoftInputOnFocus(false);

    }


    public void updateText(String strAdd){


        String oldText=binding.display.getText().toString();

        int cursorPosition=binding.display.getSelectionStart();
        String leftStr=oldText.substring(0,cursorPosition);
        String rightStr=oldText.substring(cursorPosition);

        binding.display.setText(String.format("%s%s%s",leftStr,strAdd,rightStr));
        binding.display.setSelection(cursorPosition+strAdd.length());

       // binding.display.setText(strAdd);

    }

    public void clickListener(){

        binding.clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  updateText("");
                binding.display.setText("");
            }
        });

        binding.backSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int cursorPosition=binding.display.getSelectionStart();
                int textLen=binding.display.getText().length();


                if (cursorPosition!=0 && textLen!=0){

                    SpannableStringBuilder selection= (SpannableStringBuilder) binding.display.getText();
                    selection.replace(cursorPosition-1,cursorPosition,"");
                    binding.display.setText(selection);
                    binding.display.setSelection(cursorPosition-1);
                }
            }
        });

        binding.zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText(getResources().getString(R.string.zeroText));

            }
        });

        binding.oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText(getResources().getString(R.string.oneText));

            }
        });

        binding.twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText(getResources().getString(R.string.twoText));

            }
        });

        binding.threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText(getResources().getString(R.string.threeText));
            }
        });
        binding.fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText(getResources().getString(R.string.fourText));

            }
        });
        binding.fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText(getResources().getString(R.string.fiveText));

            }
        });

        binding.sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText(getResources().getString(R.string.sixText));

            }
        });
        binding.sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText(getResources().getString(R.string.sevenText));

            }
        });
        binding.eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText(getResources().getString(R.string.eightText));

            }
        });
        binding.nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText(getResources().getString(R.string.nineText));
            }
        });


        binding.addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText(getResources().getString(R.string.addText));
            }
        });

        binding.substractBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText(getResources().getString(R.string.subtractText));
            }
        });

        binding.multiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText(getResources().getString(R.string.multiplyText));
            }
        });
        binding.divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText(getResources().getString(R.string.divideText));
            }
        });
        binding.decimalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText(getResources().getString(R.string.decimalText));
            }
        });

       binding.openParBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               updateText(getResources().getString(R.string.parenthesesOpenText));

           }
       });

       binding.closeParBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               updateText(getResources().getString(R.string.parenthesesCloseText));
           }
       });
       binding.equalBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               updateText(getResources().getString(R.string.equalsText));
           }
       });




    }
}