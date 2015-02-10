package daimler.com.carpooling;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.support.v4.app.DialogFragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;

/**
 * Created by comp11 on 10-02-2015.
 */

public abstract class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener{

    DatePickerDialog.OnDateSetListener ondateSet;

    public  DatePickerFragment(){

    }

    public void setCallBack(DatePickerDialog.OnDateSetListener ondate) {
        ondateSet = ondate;
    }

    private int year, month, day;

    @Override
    public void setArguments(Bundle args) {
        super.setArguments(args);
        year = args.getInt("year");
        month = args.getInt("month");
        day = args.getInt("day");
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return  new DatePickerDialog(getActivity(),ondateSet,year,month,day);
    }


}
