package com.example.demo.boxdrawingview

import android.os.Bundle
import android.support.v4.app.Fragment
import com.example.demo.photogallery.BaseFragmentActivity

class BoxDrawingActivity : BaseFragmentActivity() {

    override fun createFragment(): Fragment {
        return BoxDrawingFragment.newInstance()
    }

}
