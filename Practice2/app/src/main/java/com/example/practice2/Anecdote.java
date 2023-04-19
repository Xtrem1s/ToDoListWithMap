package com.example.practice2;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class Anecdote extends DialogFragment {

    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        return builder.setTitle("Анекдот").setMessage("- Я согрешил батюшка! \n" +
                "- И в чем же ты грешен? \n" +
                "- Я обманул еврея!\n" +
                "- Успокойся, это не грех, а чудо!").create();
    }
}
