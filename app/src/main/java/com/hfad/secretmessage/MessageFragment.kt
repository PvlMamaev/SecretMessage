package com.hfad.secretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController


class MessageFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_message, container, false)
        // надуваем xml фрагмента объектами чтобы ты мог обращаться к кнопке
        val nextButton = view.findViewById<Button>(R.id.next)
        // в view находим ссылку на объект кнопки
        val messageView = view.findViewById<EditText>(R.id.message)
        // в view находим ссылку на объект EditText

        nextButton.setOnClickListener {
            val message = messageView.text.toString()
            // сохраняем в переменную текст EditText'а
            val action = MessageFragmentDirections
                .actionMessageFragmentToEncryptFragment(message)
            // MessageFragmentDirections - класс фрагмента который используется для перехода
            // к другому фрагменту, а так же за передачу переменных (данных).
            // Класс генерит метод в котором можно передать данные

            view.findNavController().navigate(action)
            // в view находим контроллер и приказываем ему поменять фрагмент
        }

        return view
    }

}
