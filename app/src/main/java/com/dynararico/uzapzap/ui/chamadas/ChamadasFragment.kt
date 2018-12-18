package com.dynararico.uzapzap.ui.chamadas


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.dynararico.uzapzap.R
import com.dynararico.uzapzap.ui.base.BaseFragment


class ChamadasFragment : BaseFragment() {

    override fun getTitulo(): Int {
        return R.string.tab_chamada
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chamadas, container, false)
    }


}
