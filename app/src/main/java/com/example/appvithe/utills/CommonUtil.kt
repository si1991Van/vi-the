package com.example.appvithe.utills

import android.app.Activity
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.widget.EditText
import java.text.SimpleDateFormat
import java.util.*
import android.text.Html
import android.text.Spanned
import android.text.TextUtils
import com.example.appvithe.R
import java.lang.Exception

object CommonUtil {
    fun requestPermissionGrantResults(grantResults: IntArray): Boolean {
        var ret = true
        grantResults.forEach {
            ret = ret && (it == PackageManager.PERMISSION_GRANTED)
        }
        return ret
    }

    fun shareAppLinkViaFacebook(activity: Activity, urlToShare: String) {
        val share = Intent(Intent.ACTION_SEND)
        share.type = "text/plain"
        share.putExtra(Intent.EXTRA_TEXT, urlToShare)
        activity.startActivity(share)
    }

    fun clickSendMail(context: Activity?, email: String?) {
        try {
            val intent = Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", email, null))
            context?.startActivity(Intent.createChooser(intent, context.getString(R.string.text_choose_email_client)))
        }catch (e: Exception){
            ShowAlert.fail(pContext = context, message = context?.getString(R.string.text_cannot_fail_email))
        }
    }

    fun clickAndCall(context: Activity?, phoneNumber: String?) {
        val i = Intent(Intent.ACTION_DIAL)
        val p = "tel:$phoneNumber"
        i.data = Uri.parse(p)
        context?.startActivity(i)
    }


    fun showDatePickerDialog(activity: Activity?, editText: EditText?) {
        val newCalendar = Calendar.getInstance()
        var dateFormatter = SimpleDateFormat("dd-MM-yyyy", Locale.US)
        val fromDatePickerDialog =
            activity?.let {
                DatePickerDialog(it, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                    val newDate = Calendar.getInstance()
                    newDate.set(year, monthOfYear, dayOfMonth)
                    editText?.setText(dateFormatter.format(newDate.time))
                }, newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH))
            }
        fromDatePickerDialog?.show()
    }

    fun showTimePickerDialog(activity: Activity, edTime: EditText?) {
        var calendar = Calendar.getInstance()
        val timePickerDialog =
            TimePickerDialog(activity, TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
                edTime?.setText(hourOfDay.toString() + ":" + minute)
            }, calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), true)
        timePickerDialog.show()
    }

    fun toHtml(text: String?): Spanned? {
        var result: Spanned? = null
        if (TextUtils.isEmpty(text))
            return result
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            return Html.fromHtml(text, Html.FROM_HTML_MODE_LEGACY)
        } else {
            result = Html.fromHtml(text)
        }
        return result
    }
}