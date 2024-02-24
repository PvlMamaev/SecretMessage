package com.hfad.secretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class EncryptFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_encrypt, container, false)
        //  получаем корневое представление
        val message = EncryptFragmentArgs.fromBundle(requireArguments()).message
        // Обращаемся к классу EncryptFragmentArgs. Который был сгенерирован при помощи плагина SaveArgs.
        // Далее методом fromBundle достаем данные
        // message - показывает какой аргумент достать
        val encryptedView = view.findViewById<TextView>(R.id.encrypted_message)
        encryptedView.text = message.reversed()

        return view
    }

}