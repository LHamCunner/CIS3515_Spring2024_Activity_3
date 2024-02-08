package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter : BaseAdapter() {

    override fun getCount(): Int {
    }

    override fun getItem(position: Int): Any {
        TODO("Not yet implemented")
    }

    override fun getItemId(position: Int): Long {
        TODO("Not yet implemented")
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        TODO("Not yet implemented")
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View{
        val textView : TextView

        if (convertView != null) {
            textView = convertView as TextView
        } else {
            textView = TextView(context)
            textView.setPadding(5, 10, 0, 10)
        }

        textView.text = fontSizes[position].toString()
        textView.textSize = fontSizes[position].toFloat()

        return textView
    }

}