package com.example.myflexiblefragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment


class DetailCategoryFragment : Fragment(), View.OnClickListener {

    lateinit var tvCategoryName: TextView
    lateinit var tvCategoryDesc: TextView
    lateinit var btnProfile: Button
    lateinit var btnShowDialog: Button

    var description: String? = null

    companion object {
        var EXTRA_NAME = "extra_name"
        var EXTRA_DESCRIPTION = "extra_description"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_category, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnProfile = view.findViewById(R.id.btn_profile)
        btnProfile.setOnClickListener(this)

        btnShowDialog = view.findViewById(R.id.btn_show_dialog)
        btnShowDialog.setOnClickListener(this)

        tvCategoryDesc = view.findViewById(R.id.tv_category_desc)
        tvCategoryName = view.findViewById(R.id.tv_category_name)

        if (savedInstanceState != null) {
            val descCategory = savedInstanceState.getString(EXTRA_DESCRIPTION)
            description = descCategory
        }

        if (arguments != null) {
            val categoryName = arguments?.getString(EXTRA_NAME)
            tvCategoryName.text = categoryName
            tvCategoryDesc.text = description
        }
    }

    override fun onClick(v: View) {

    }
}