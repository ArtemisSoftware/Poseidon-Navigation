package com.artemissoftware.poseidonnavegation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_choose_recipient.*
import kotlinx.android.synthetic.main.fragment_confirmation.*
import kotlinx.android.synthetic.main.fragment_specify_amount.*
import kotlinx.android.synthetic.main.fragment_specify_amount.cancel_btn


class ConfirmationFragment : Fragment() {


    lateinit var recipientName: String
    lateinit var money: Money

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        recipientName = arguments!!.getString("recipient").toString()
        money = arguments!!.getParcelable<Money>("amount")!!
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_confirmation, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        confirmation_message.text = "You have sent ${money.amount} to $recipientName"

    }
}