package com.example.calculatorfullfunction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    Button btn_ce, btn_c, btn_bs, btn_divide, btn_7, btn_8, btn_9;
    Button btn_4, btn_5, btn_6, btn_1, btn_2, btn_3, btn_0;
    Button btn_multiply, btn_plus, btn_minus, btn_negative, btn_point, btn_equal;

    TextView txt_pheptoan, txt_inputvaketqua;
    boolean isNegative = false;

    double num1, num2, resNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //region Button for number
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        //endregion

        //region function
        btn_ce = (Button) findViewById(R.id.btn_ce);
        btn_c = (Button) findViewById(R.id.btn_c);
        btn_bs = (Button) findViewById(R.id.btn_bs);
        btn_divide = (Button) findViewById(R.id.btn_divide);
        btn_multiply = (Button) findViewById(R.id.btn_multiply);
        btn_plus = (Button) findViewById(R.id.btn_plus);
        btn_minus = (Button) findViewById(R.id.btn_minus);
        btn_negative = (Button) findViewById(R.id.btn_negative);
        btn_point = (Button) findViewById(R.id.btn_point);
        btn_equal = (Button) findViewById(R.id.btn_equal);
        //endregion


        txt_inputvaketqua = (TextView) findViewById(R.id.tv_inputvaketqua);
        // set gia tri mac dinh khi tao text la 0
        txt_inputvaketqua.setText("0");

        txt_pheptoan = (TextView) findViewById(R.id.tv_pheptoan);


        //region Nhap so vao txt
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txt_inputvaketqua.getText() == "" || txt_inputvaketqua.getText() == "0")
                    txt_inputvaketqua.setText("0");
                else
                    txt_inputvaketqua.setText(txt_inputvaketqua.getText() + "0");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txt_inputvaketqua.getText() == "0")
                    txt_inputvaketqua.setText("1");
                else {
                    txt_inputvaketqua.setText(txt_inputvaketqua.getText() + "1");
                }
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txt_inputvaketqua.getText() == "0")
                    txt_inputvaketqua.setText("2");
                else {
                    txt_inputvaketqua.setText(txt_inputvaketqua.getText() + "2");
                }
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txt_inputvaketqua.getText() == "0")
                    txt_inputvaketqua.setText("3");
                else {
                    txt_inputvaketqua.setText(txt_inputvaketqua.getText() + "3");
                }
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txt_inputvaketqua.getText() == "0")
                    txt_inputvaketqua.setText("4");
                else {
                    txt_inputvaketqua.setText(txt_inputvaketqua.getText() + "4");
                }
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txt_inputvaketqua.getText() == "0")
                    txt_inputvaketqua.setText("5");
                else {
                    txt_inputvaketqua.setText(txt_inputvaketqua.getText() + "5");
                }
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txt_inputvaketqua.getText() == "0")
                    txt_inputvaketqua.setText("6");
                else {
                    txt_inputvaketqua.setText(txt_inputvaketqua.getText() + "6");
                }
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txt_inputvaketqua.getText() == "0")
                    txt_inputvaketqua.setText("7");
                else {
                    txt_inputvaketqua.setText(txt_inputvaketqua.getText() + "7");
                }
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txt_inputvaketqua.getText() == "0")
                    txt_inputvaketqua.setText("8");
                else {
                    txt_inputvaketqua.setText(txt_inputvaketqua.getText() + "8");
                }
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txt_inputvaketqua.getText() == "0")
                    txt_inputvaketqua.setText("9");
                else {
                    txt_inputvaketqua.setText(txt_inputvaketqua.getText() + "9");
                }
            }
        });

        btn_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s = txt_inputvaketqua.getText().toString();
                int length = s.length();

                if (length > 0 && Character.isDigit(s.charAt(length - 1)) && !s.contains(".")) {
                    txt_inputvaketqua.setText(txt_inputvaketqua.getText() + ".");
                }

            }
        });

        btn_ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_inputvaketqua.setText("0");
                
            }
        });


        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_pheptoan.setText("");
                txt_inputvaketqua.setText("0");
                isNegative = false;
            }
        });


        btn_bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = txt_inputvaketqua.getText().toString();
                int length_s1 = s1.length();

                if (length_s1 > 1) {
                    txt_inputvaketqua.setText(s1.substring(0, length_s1 - 1));
                } else {
                    txt_inputvaketqua.setText("0");
                    isNegative = false;
                }

            }
        });


        //endregion


        //region add, substract, mult, div,...
        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = txt_pheptoan.getText().toString();
                String s2 = txt_inputvaketqua.getText().toString();
                int length_s2 = s2.length();
                int count = 0;
                for (int i = 0; i < s1.length(); i++) {
                    if (s1.charAt(i) == '-') {
                        count++;
                    }
                }


                if (!s1.contains("+") || !s1.contains("-") || !s1.contains("*") || !s1.contains("/")) {
                    if (s2.charAt(length_s2 - 1) == '.') {
                        txt_pheptoan.setText(s2.substring(0, length_s2 - 1) + "=");
                        txt_inputvaketqua.setText(s2.substring(0, length_s2 - 1));
                    } else {
                        txt_pheptoan.setText(s2 + "=");
                    }

                }

                if (s1.contains("=")) {

                } else {
                    if (s1.contains("+")) {
                        String temp2 = txt_inputvaketqua.getText().toString();
                        num2 = Double.parseDouble(temp2);
                        resNum = num1 + num2;
                        txt_pheptoan.setText(s1 + temp2 + "=");
                        txt_inputvaketqua.setText(String.valueOf(resNum));
                    }

                    if (!isNegative && count == 1) {
                        String temp2 = txt_inputvaketqua.getText().toString();
                        num2 = Double.parseDouble(temp2);
                        resNum = num1 - num2;
                        txt_pheptoan.setText(s1 + temp2 + "=");
                        txt_inputvaketqua.setText(String.valueOf(resNum));
                    }

                    if (isNegative && count == 2) {
                        String temp2 = txt_inputvaketqua.getText().toString();
                        num2 = Double.parseDouble(temp2);
                        resNum = num1 - num2;
                        txt_pheptoan.setText(s1 + temp2 + "=");
                        txt_inputvaketqua.setText(String.valueOf(resNum));
                    }

                    if (s1.contains("x")) {
                        String temp2 = txt_inputvaketqua.getText().toString();
                        num2 = Double.parseDouble(temp2);
                        resNum = num1 * num2;
                        txt_pheptoan.setText(s1 + temp2 + "=");
                        txt_inputvaketqua.setText(String.valueOf(resNum));
                    }

                    if (s1.contains("/")) {
                        String temp2 = txt_inputvaketqua.getText().toString();
                        num2 = Double.parseDouble(temp2);
                        resNum = num1 / num2;
                        txt_pheptoan.setText(s1 + temp2 + "=");
                        txt_inputvaketqua.setText(String.valueOf(resNum));
                    }
                }


                isNegative = false;
            }
        });


        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp1 = txt_inputvaketqua.getText().toString();
                num1 = Double.parseDouble(temp1);
                txt_pheptoan.setText(temp1 + "+");
            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp1 = txt_inputvaketqua.getText().toString();
                num1 = Double.parseDouble(temp1);
                txt_pheptoan.setText(temp1 + "-");
            }
        });

        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp1 = txt_inputvaketqua.getText().toString();
                num1 = Double.parseDouble(temp1);
                txt_pheptoan.setText(temp1 + "x");
            }
        });

        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp1 = txt_inputvaketqua.getText().toString();
                num1 = Double.parseDouble(temp1);
                txt_pheptoan.setText(temp1 + "/");
            }
        });


        btn_negative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isNegative = (!isNegative) ? true : false;
                String s3 = txt_inputvaketqua.getText().toString();
                double temp3 = Double.parseDouble(s3) * (-1);
                txt_inputvaketqua.setText(String.valueOf(temp3));
            }
        });
        //endregion
    }


}