package com.example.maki.tap_u5_curp;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText nomb,app,apm;
    Spinner spinaño,spinmes,spindia,spinestado;
    RadioButton radioh,radiom;
    Button done;
    TextView fin;
    String result="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarObjeto();
        cargarSpiners();
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fin.setText("");
                result="";
                generarCurp();
            }
        });

    }
  public  void generarCurp(){
        try {

            String desc = app.getText().toString().toUpperCase();
            char p1 = desc.charAt(0);
            result = result + p1;


            for (int i = 1; i <= desc.length() - 1; i++) {
                char app1 = desc.charAt(i);
                if (app1 == 'A' || app1 == 'E' || app1 == 'I' || app1 == 'O' || app1 == 'U') {
                    char p2 = app1;
                    result = result + p2;
                    break;
                } else {
                    char p2 = app1;
                    result = result + p2;
                }

            }

            String desc2 = apm.getText().toString().toUpperCase();
            char p3 = desc2.charAt(0);
            result = result + p3;

            String desc3 = nomb.getText().toString().toUpperCase();
            char p4 = desc3.charAt(0);
            result = result + p4;

            String an = spinaño.getSelectedItem().toString();
            String p5 = an.substring(2, 4);
            result = result + p5;

            String m = spinmes.getSelectedItem().toString();
            String p6;
            switch (m) {
                case "Enero":
                    p6 = "01";
                    result = result + p6;
                    break;
                case "Febrero":
                    p6 = "02";
                    result = result + p6;
                case "Marzo":
                    p6 = "03";
                    result = result + p6;
                    break;
                case "Abril":
                    p6 = "04";
                    result = result + p6;
                    break;
                case "Mayo":
                    p6 = "05";
                    result = result + p6;
                    break;
                case "Junio":
                    p6 = "06";
                    result = result + p6;
                    break;
                case "Julio":
                    p6 = "07";
                    result = result + p6;
                    break;
                case "Agosto":
                    p6 = "08";
                    result = result + p6;
                    break;
                case "Septiembre":
                    p6 = "09";
                    result = result + p6;
                    break;
                case "Octubre":
                    p6 = "10";
                    result = result + p6;
                    break;
                case "Nomviembre":
                    p6 = "11";
                    result = result + p6;
                    break;
                case "Diciembre":
                    p6 = "12";
                    result = result + p6;
                    break;


            }
            String p7 = spindia.getSelectedItem().toString();
            result = result + p7;
            String p8;
            if (radioh.isChecked()) {
                p8 = "H";
                result = result + p8;
            } else {
                p8 = "M";
                result = result + p8;
            }
            String f = spinestado.getSelectedItem().toString().toUpperCase();

            switch (f) {

                case "AGUASCALIENTES":
                    f = "AS";
                    result = result + f;
                    ;
                    break;
                case "BAJA CALIFORNIA NTE.":
                    f = "BN";
                    result = result + f;
                    break;
                case "BAJA CALIFORNIA SUR":
                    f = "BS";
                    result = result + f;
                    break;
                case "CAMPECHE":
                    f = "CM";
                    result = result + f;
                    break;
                case "CHIAPAS":
                    f = "CS";
                    result = result + f;
                    break;
                case "CHIHUAHUA":
                    f = "CH";
                    result = result + f;
                    break;
                case "COLIMA":
                    f = "CL";
                    result = result + f;
                    break;
                case "COAHUILA":
                    f = "CO";
                    result = result + f;
                    break;
                case "DURANGO":
                    f = "DG";
                    result = result + f;
                    break;
                case "DISTRITO FEDERAL":
                    f = "DF";
                    result = result + f;
                    break;
                case "EXTERIOR MEXICANO":
                    f = "EM";
                    result = result + f;
                    break;
                case "GUANAJUATO":
                    f = "GT";
                    break;
                case "GUERRERO":
                    f = "GR";
                    result = result + f;
                    break;
                case "HIDALGO":
                    f = "HG";
                    result = result + f;
                    break;
                case "JALISCO":
                    f = "JC";
                    result = result + f;
                    break;
                case "MICHOACAN":
                    f = "MN";
                    result = result + f;
                    break;
                case "NACIDO EXTERIOR":
                    f = "NT";
                    result = result + f;
                    break;
                case "NUEVO LEON":
                    f = "NL";
                    result = result + f;
                    result = result + f;
                    break;
                case "OAXACA":
                    f = "OC";
                    result = result + f;
                    break;
                case "PUEBLA":
                    f = "PL";
                    result = result + f;
                    break;
                case "QUINTANA ROO":
                    f = "QT";
                    result = result + f;
                    break;
                case "QUERETARO":
                    f = "QR";
                    result = result + f;
                    break;
                case "SAN LUIS POTOSI":
                    f = "SP";
                    result = result + f;
                    break;
                case "SINALOA":
                    f = "SL";
                    result = result + f;
                    break;
                case "SONORA":
                    f = "SR";
                    result = result + f;
                    break;
                case "TABASCO":
                    f = "TC";
                    result = result + f;
                    break;
                case "TAMAULIPAS":
                    f = "TS";
                    result = result + f;
                    break;
                case "TLAXCALA":
                    f = "TL";
                    result = result + f;
                    break;
                case "VERACRUZ":
                    f = "VZ";
                    result = result + f;
                    break;
                case "YUCATAN":
                    f = "YN";
                    result = result + f;
                    break;
                case "ZACATECAS":
                    f = "ZS";
                    result = result + f;
                    break;

            }
            String pp = app.getText().toString().toUpperCase();
            for (int i = 1; i <= pp.length() - 1; i++) {
                char app1 = pp.charAt(i);
                if (app1 == 'A' || app1 == 'E' || app1 == 'I' || app1 == 'O' || app1 == 'U') {
                } else {
                    char p10 = app1;
                    result = result + p10;
                    break;
                }
            }

            for (int i = 1; i <= desc2.length() - 1; i++) {
                char app1 = desc2.charAt(i);
                if (app1 == 'A' || app1 == 'E' || app1 == 'I' || app1 == 'O' || app1 == 'U') {
                } else {
                    char p11 = app1;
                    result = result + p11;
                    break;
                }
            }

            for (int i = 1; i <= desc3.length() - 1; i++) {
                char app1 = desc3.charAt(i);
                if (app1 == 'A' || app1 == 'E' || app1 == 'I' || app1 == 'O' || app1 == 'U') {
                } else {
                    char p12 = app1;
                    result = result + p12;
                    break;
                }
            }
            int conv = Integer.parseInt(an);
            if (conv < 2000) {
                int num = (int) (Math.random() * 9) + 1;
                int num2 = (int) (Math.random() * 9) + 1;
                result = result + num + num2;
            } else {
                String letra="";
                String letra2="";
                String [] abecedario ={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R"
                        ,"S","T","U","V","W","X","Y","Z"};
                int numR=(int) Math.round(Math.random()*26);
                letra=abecedario[numR];
                int numR2=(int) Math.round(Math.random()*26);
                letra=abecedario[numR2];
                result=result+letra+letra2;
            }


            fin.setText(result);
        }catch (Exception e){
            Toast.makeText(this, "Error Verfique Sus Datos", Toast.LENGTH_SHORT).show();
        }




  }

    public void cargarObjeto(){
        spinaño = (Spinner) findViewById(R.id.year);
        spinmes = (Spinner) findViewById(R.id.mounth);
        spindia = (Spinner) findViewById(R.id.day);
        spinestado = (Spinner) findViewById(R.id.estado);
        nomb=(EditText) findViewById(R.id.txtnombre);
        app=(EditText) findViewById(R.id.apellidop);
        apm=(EditText) findViewById(R.id.apellidom);
        radioh=(RadioButton) findViewById(R.id.rad_h);
        radiom=(RadioButton) findViewById(R.id.rad_m);
        done=(Button) findViewById(R.id.generar);
        fin=(TextView) findViewById(R.id.resultado);
    }


    public void cargarSpiners(){
        ArrayList<String> años =new ArrayList<>();
        ArrayList<String> mes =new ArrayList<>();
        ArrayList<String> dia =new ArrayList<>();
        ArrayList<String> estado =new ArrayList<>();

        años.add("2010");
        años.add("2009");
        años.add("2008");
        años.add("2007");
        años.add("2006");
        años.add("2005");
        años.add("2004");
        años.add("2003");
        años.add("2002");
        años.add("2001");
        años.add("2000");
        años.add("1999");
        años.add("1998");
        años.add("1997");
        años.add("1996");
        años.add("1995");
        años.add("1994");
        años.add("1993");
        años.add("1992");
        años.add("1991");
        años.add("1990");
        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_spinner_item, años);
        spinaño.setAdapter(adapter);
        // mes
        mes.add("Enero");
        mes.add("Febrero");
        mes.add("Marzo");
        mes.add("Abril");
        mes.add("Mayo");
        mes.add("Junio");
        mes.add("Julio");
        mes.add("Agosto");
        mes.add("Septiembre");
        mes.add("Octubre");
        mes.add("Noviembre");
        mes.add("Diciembre");
        ArrayAdapter adapter2=new ArrayAdapter(this, android.R.layout.simple_spinner_item, mes);
         spinmes.setAdapter(adapter2);
         //dia
         dia.add("01");
        dia.add("02");
        dia.add("03");
        dia.add("04");
        dia.add("05");
        dia.add("06");
        dia.add("07");
        dia.add("08");
        dia.add("09");
        dia.add("10");
        dia.add("11");
        dia.add("12");
        dia.add("13");
        dia.add("14");
        dia.add("15");
        dia.add("16");
        dia.add("17");
        dia.add("18");
        dia.add("19");
        dia.add("20");
        dia.add("21");
        dia.add("22");
        dia.add("23");
        dia.add("24");
        dia.add("25");
        dia.add("26");
        dia.add("27");
        dia.add("28");
        dia.add("29");
        dia.add("30");
        dia.add("31");
        ArrayAdapter adapter3=new ArrayAdapter(this, android.R.layout.simple_spinner_item, dia);
        spindia.setAdapter(adapter3);
        //estados
        estado.add("AGUASCALIENTES");
        estado.add( "BAJA CALIFORNIA NTE.");
        estado.add("BAJA CALIFORNIA SUR");
        estado.add("CAMPECHE");
        estado.add("COAHUILA");
        estado.add("COLIMA");
        estado.add("CHIAPAS");
        estado.add("CHIHUAHUA");
        estado.add("DISTRITO FEDERAL");
        estado.add("DURANGO");
        estado.add("GUANAJUATO");
        estado.add("GUERRERO");
        estado.add("HIDALGO");
        estado.add("JALISCO");
        estado.add("MEXICO");
        estado.add("MICHOACAN");
        estado.add("MORELOS");
        estado.add("NAYARIT");
        estado.add("NUEVO LEON");
        estado.add("OAXACA");
        estado.add("PUEBLA");
        estado.add("QUERETARO");
        estado.add("QUINTANA ROO");
        estado.add("SAN LUIS POTOSI");
        estado.add("SINALOA");
        estado.add("SONORA");
        estado.add("TABASCO");
        estado.add("TAMAULIPAS");
        estado.add("TLAXCALA");
        estado.add("VERACRUZ");
        estado.add("YUCATAN");
        estado.add("ZACATECAS");
        estado.add("NACIDO EXTERIOR");
        estado.add("EXTERIOR MEXICANO");
        ArrayAdapter adapter4=new ArrayAdapter(this, android.R.layout.simple_spinner_item, estado);
        spinestado.setAdapter(adapter4);
    }
}
