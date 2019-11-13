package com.example.dika08

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.EventLog
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.core.view.GestureDetectorCompat
import kotlinx.android.synthetic.main.activity_main.*
import androidx.core.view.MotionEventCompat as Motion

class MainActivity : AppCompatActivity(),GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    override fun onGenericMotionEvent(ev: MotionEvent?): Boolean {
        gesture_status.text ="onDown"
        return true
    }

    override fun onShowPress(p0: MotionEvent?) {
        gesture_status.text ="onShowPress"
             }

    override fun onSingleTapUp(p0: MotionEvent?): Boolean {
        gesture_status.text ="onSingleTapUp"
        return true     }

    override fun onScroll(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
        gesture_status.text ="onScroll"
        return true     }

    override fun onLongPress(p0: MotionEvent?) {
        gesture_status.text ="onLongPress"
    }

    override fun onDoubleTap(p0: MotionEvent?): Boolean {
        gesture_status.text ="onDoubleTap"
        return true    }

    override fun onDoubleTapEvent(p0: MotionEvent?): Boolean {
        gesture_status.text ="onDoubleTapEvent"
        return true    }

    override fun onSingleTapConfirmed(p0: MotionEvent?): Boolean {
        gesture_status.text ="onSingleTapConfirmed"
        return true    }

    var gDetector: GestureDetectorCompat?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.gDetector= GestureDetectorCompat(this,this)
        gDetector?.setOnDoubleTapListener(this)
    }

    override fun onTouchEvent(ev: MotionEvent?): Boolean {
        this.gDetector?.onTouchEvent(ev)
        return super.onTouchEvent(ev)
    }

    override fun onDown(p0: MotionEvent?): Boolean {
        gesture_status.text ="onDown"
        return true
    }

    override fun onFling(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
        gesture_status.text ="onFling"
        return true
    }
}
