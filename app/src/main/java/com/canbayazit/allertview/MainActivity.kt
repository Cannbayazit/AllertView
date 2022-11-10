package com.canbayazit.allertview

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        buttonNormal.setOnClickListener {

            val ad = AlertDialog.Builder(this@MainActivity)

            ad.setMessage("Mesaj")
            ad.setTitle("Başlık")
            ad.setIcon(R.drawable.resim)

            ad.setPositiveButton("Tamam"){ DialogInterface, i ->

            Toast.makeText(this@MainActivity,"Tamam tıklanıldı",Toast.LENGTH_SHORT).show()



            }
            ad.setNegativeButton("İptal"){ DialogInterface, i ->

                Toast.makeText(this@MainActivity,"İptal tıklanıldı",Toast.LENGTH_SHORT).show()



            }


            ad.create().show()





        }

        buttonOzel.setOnClickListener {

            val tasarim = layoutInflater.inflate(R.layout.alert_tasarim,null)
            val editTextAlert = tasarim.findViewById(R.id.editTextAlert) as EditText

            val ad = AlertDialog.Builder(this@MainActivity)

            ad.setMessage("Mesaj")
            ad.setTitle("Başlık")
            ad.setIcon(R.drawable.resim)

            ad.setView(tasarim)

            ad.setPositiveButton("Kaydet"){ DialogInterface, i ->

                val alinanVeri = editTextAlert.text.toString()

                Toast.makeText(this@MainActivity,"Alınan veri : $alinanVeri",Toast.LENGTH_SHORT).show()



            }
            ad.setNegativeButton("İptal"){ DialogInterface, i ->

                Toast.makeText(this@MainActivity,"İptal tıklanıldı",Toast.LENGTH_SHORT).show()



            }


            ad.create().show()







        }


    }
}