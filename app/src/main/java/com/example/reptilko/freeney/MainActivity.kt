package com.example.reptilko.freeney

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val cryptoList = arrayListOf("Bitcoin", "Ethereum", "BCash", "Cardano", "Litecoin", "NEM", "Stellar", "IOTA", "EOS", "NEO", "Dash", "Monero","Lisk", "Omisego", "Verge", "Waves", "Augur","Power Ledger", "Civic", "FunFair", "Golem", "BAT")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        makeMeRichBtn.setOnClickListener {
            val random = Random()
            val randomCrypto =  random.nextInt(cryptoList.count())
            selectedCryptoTxt.text = cryptoList[randomCrypto]
        }

        addCryptoTxt.setOnClickListener{
            val newCrypto = addCryptoTxt.text.toString()
            if(newCrypto != null && !newCrypto.isEmpty()) {
                cryptoList.add(newCrypto)
            }
           // addCryptoTxt.text=null
         //   print(cryptoList)
        }

    }
}
