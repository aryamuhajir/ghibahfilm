package com.dicoding.ghibahfilm

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetBehavior.STATE_EXPANDED
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.fragment_informasi.view.*
import kotlinx.android.synthetic.main.fragment_sheet.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [sheet.newInstance] factory method to
 * create an instance of this fragment.
 */
class sheet : BottomSheetDialogFragment(), View.OnClickListener {
    // TODO: Rename and change types of parameters
    private lateinit var bintang1 : ImageView
    private lateinit var bintang2 : ImageView
    private lateinit var bintang3 : ImageView
    private lateinit var bintang4 : ImageView
    private lateinit var bintang5 : ImageView
    private lateinit var kirimBtn : ImageView
    var warna1 = "abu"
    var warna2 = "abu"
    var warna3 = "abu"

    var warna4 = "abu"

    var warna5 = "abu"


    private  var terakhir : Int = 1





    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)




    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view2 = inflater.inflate(R.layout.fragment_sheet, container, false)
        view2.appCompatButton.setOnClickListener{
            findNavController().navigate(R.id.action_sheet_to_review2)

        }

        return view2
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        var dialoog = BottomSheetDialog(requireActivity(), R.style.CustomizedBottomDialogStyle).apply {

            window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
            setOnShowListener {
                Handler().post {
                    val bottomSheet = findViewById<View>(R.id.design_bottom_sheet) as? FrameLayout
                    bottomSheet?.let {
                        BottomSheetBehavior.from(it).state = STATE_EXPANDED
                    }
                }
            }
            setContentView(R.layout.fragment_sheet)

        }
        


        return  dialoog
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bintang1 = view.findViewById(R.id.imageView2)
        bintang1.setOnClickListener(this)
        bintang2 = view.findViewById(R.id.imageView3)
        bintang2.setOnClickListener(this)
        bintang3 = view.findViewById(R.id.imageView)
        bintang3.setOnClickListener(this)
        bintang4 = view.findViewById(R.id.imageView4)
        bintang4.setOnClickListener(this)
        bintang5 = view.findViewById(R.id.image5)
        bintang5.setOnClickListener(this)



        BottomSheetDialog(requireActivity(), R.style.CustomizedBottomDialogStyle).apply {

            window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)

            setOnShowListener {
                Handler().post {
                    val bottomSheet = findViewById<View>(R.id.design_bottom_sheet) as? FrameLayout
                    bottomSheet?.let {
                        BottomSheetBehavior.from(it).state = STATE_EXPANDED
                    }
                }
            }
            setContentView(R.layout.fragment_sheet)

        }





    }

    private fun showDialog() {



    }

    override fun onClick(v: View?) {

        when (v?.id) {
            R.id.imageView2 -> {

                if (warna1 == "abu" && terakhir == 1){
                    bintang1.setImageResource(R.drawable.ic_starred)
                    warna1 = "merah"
                }else{
                    if (terakhir != 1 && warna1 == "merah"){
                        bintang1.setImageResource(R.drawable.ic_starred)
                        bintang2.setImageResource(R.drawable.ic_starabu)
                        bintang3.setImageResource(R.drawable.ic_starabu)
                        bintang4.setImageResource(R.drawable.ic_starabu)
                        bintang5.setImageResource(R.drawable.ic_starabu)
                        warna1 = "abu"
                        warna2 = "abu"

                        warna3 = "abu"

                        warna4 = "abu"

                        warna5 = "abu"


                    }else{
                        bintang1.setImageResource(R.drawable.ic_starabu)
                        warna1 = "abu"

                        warna2 = "abu"

                        warna3 = "abu"

                        warna4 = "abu"

                        warna5 = "abu"
                    }


                }
                terakhir = 1


            }
            R.id.imageView3 -> {

                if (warna2 == "abu" && terakhir <= 2){
                    bintang1.setImageResource(R.drawable.ic_starred)
                    bintang2.setImageResource(R.drawable.ic_starred)


                    warna1 = "merah"
                    warna2 = "merah"
                    warna3 = "abu"
                    warna4 = "abu"
                    warna5 = "abu"


                }else {
                    if (terakhir != 2 && warna2 == "merah"){
                        bintang1.setImageResource(R.drawable.ic_starred)
                        bintang2.setImageResource(R.drawable.ic_starred)
                        bintang3.setImageResource(R.drawable.ic_starabu)
                        bintang4.setImageResource(R.drawable.ic_starabu)
                        bintang5.setImageResource(R.drawable.ic_starabu)
                        warna2 = "abu"
                        warna3 = "abu"
                        warna4 = "abu"

                        warna5 = "abu"




                    }else{
                        bintang1.setImageResource(R.drawable.ic_starabu)
                        bintang2.setImageResource(R.drawable.ic_starabu)
                        warna2 = "abu"
                        warna3 = "abu"
                        warna4 = "abu"

                        warna5 = "abu"
                    }
                }
                terakhir = 2

            }
            R.id.imageView -> {

                if (warna3 == "abu" && terakhir <= 3 ){
                    bintang1.setImageResource(R.drawable.ic_starred)
                    bintang2.setImageResource(R.drawable.ic_starred)
                    bintang3.setImageResource(R.drawable.ic_starred)
                    warna1 = "merah"
                    warna2 = "merah"
                    warna3 = "merah"
                    warna4 = "abu"
                    warna5 = "abu"


                }else {
                    if (terakhir != 3 && warna3 == "merah"){
                        bintang1.setImageResource(R.drawable.ic_starred)
                        bintang2.setImageResource(R.drawable.ic_starred)
                        bintang3.setImageResource(R.drawable.ic_starred)
                        bintang4.setImageResource(R.drawable.ic_starabu)
                        bintang5.setImageResource(R.drawable.ic_starabu)
                        warna3 = "abu"
                        warna4 = "abu"
                        warna5 = "abu"

                    }else{
                        bintang1.setImageResource(R.drawable.ic_starabu)
                        bintang2.setImageResource(R.drawable.ic_starabu)
                        bintang3.setImageResource(R.drawable.ic_starabu)
                        warna3 = "abu"
                        warna4 = "abu"

                        warna5 = "abu"
                    }
                }
                terakhir = 3
            }
            R.id.imageView4 -> {
                if (warna4 == "abu" && terakhir <= 4) {
                    bintang1.setImageResource(R.drawable.ic_starred)
                    bintang2.setImageResource(R.drawable.ic_starred)
                    bintang3.setImageResource(R.drawable.ic_starred)
                    bintang4.setImageResource(R.drawable.ic_starred)

                    warna1 = "merah"
                    warna2 = "merah"
                    warna3 = "merah"
                    warna4 = "merah"
                    warna5 = "abu"

                } else {
                    if (terakhir != 4 && warna4 == "merah") {
                        bintang1.setImageResource(R.drawable.ic_starred)
                        bintang2.setImageResource(R.drawable.ic_starred)
                        bintang3.setImageResource(R.drawable.ic_starred)
                        bintang4.setImageResource(R.drawable.ic_starred)
                        bintang5.setImageResource(R.drawable.ic_starabu)
                        warna4 = "abu"
                        warna5 = "abu"


                    } else {
                        bintang1.setImageResource(R.drawable.ic_starabu)
                        bintang2.setImageResource(R.drawable.ic_starabu)
                        bintang3.setImageResource(R.drawable.ic_starabu)
                        bintang4.setImageResource(R.drawable.ic_starabu)
                        warna4 = "abu"
                        warna5 = "abu"

                    }

                }
                terakhir = 4


            }
            R.id.image5 -> {

                if (warna5 == "abu"){

                    bintang1.setImageResource(R.drawable.ic_starred)
                    bintang2.setImageResource(R.drawable.ic_starred)
                    bintang3.setImageResource(R.drawable.ic_starred)
                    bintang4.setImageResource(R.drawable.ic_starred)
                    bintang5.setImageResource(R.drawable.ic_starred)
                    warna5 = "merah"
                    warna1 = "merah"

                    warna2 = "merah"

                    warna3 = "merah"

                    warna4 = "merah"

                }else{
                    bintang1.setImageResource(R.drawable.ic_starabu)
                    bintang2.setImageResource(R.drawable.ic_starabu)
                    bintang3.setImageResource(R.drawable.ic_starabu)
                    bintang4.setImageResource(R.drawable.ic_starabu)
                    bintang5.setImageResource(R.drawable.ic_starabu)
                    warna5 = "abu"


                }
                terakhir = 5

            }

        }
    }


}