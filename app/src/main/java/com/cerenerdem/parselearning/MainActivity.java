package com.cerenerdem.parselearning;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.parse.FindCallback;
import com.parse.GetCallback;
import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.SaveCallback;
import com.parse.SignUpCallback;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*//KAYDET
        final ParseObject object = new ParseObject("Fruits");
        object.put("name","apple");
        object.put("calories",100);
        object.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if (e != null){//Hata varsa hata mesajını göster
                    Toast.makeText(getApplicationContext(),e.getLocalizedMessage(),Toast.LENGTH_SHORT).show();

                } else {//Hata yoksa kaydedildi mesajını göster
                    Toast.makeText(getApplicationContext(),"Object Saved",Toast.LENGTH_SHORT).show();

                }
            }
        });*/

       /* //Oku
        ParseQuery<ParseObject> query = ParseQuery.getQuery("Fruits");
        query.getInBackground("CepGcZFHjm", new GetCallback<ParseObject>() {
            @Override
            public void done(ParseObject object, ParseException e) {
                if (e != null){//Hata varsa hata mesajını göster
                   e.printStackTrace();//Logcat'e yaz.

                } else {//Hata yoksa kaydedildi mesajını göster
                     String objectname = object.getString("name");
                     Integer objectcalories = object.getInt("calories");

                     System.out.println("Object Name:" + objectname );
                     System.out.println("Object Calories:" + objectcalories );

                }
            }
        });
*/


       //Tüm Sınıfı Listeleme
      /*  ParseQuery<ParseObject> query = ParseQuery.getQuery("Fruits");
        query.whereEqualTo("name","apple"); //isim alanında apple yazanları getir
        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, ParseException e) {
                if (e != null){//Hata varsa hata mesajını göster
                    e.printStackTrace();//Logcat'e yaz.

                } else {//Hata yoksa kaydedildi mesajını göster

                    if (objects.size() > 0){

                        for (ParseObject object : objects){

                            String objectname = object.getString("name");
                            Integer objectcalories = object.getInt("calories");

                            System.out.println("Object Name:" + objectname );
                            System.out.println("Object Calories:" + objectcalories );

                        }
                    }

                }
            }
        });*/


      //USER
       /* ParseUser user = new ParseUser();
        user.setUsername("James");
        user.setPassword("123456");
        user.signUpInBackground(new SignUpCallback() {
            @Override
            public void done(ParseException e) {
                if (e != null) {//Hata varsa hata mesajını göster
                    e.printStackTrace();//Logcat'e yaz.

                } else {//Hata yoksa kaydedildi mesajını göster
                    Toast.makeText(MainActivity.this,"User Created", Toast.LENGTH_SHORT) .show();
                }
            }
        });*/


       //Kullanıcı Adı - Şifre - User sınıfını kullanma
      /*  ParseUser.logInInBackground("James", "123456", new LogInCallback() {
            @Override
            public void done(ParseUser user, ParseException e) {
                if (e != null) {//Hata varsa hata mesajını göster
                    e.printStackTrace();//Logcat'e yaz.

                } else {//Hata yoksa kaydedildi mesajını göster
                    Toast.makeText(getApplicationContext(), "Welcome " + user.getUsername().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });*/


    }
}
