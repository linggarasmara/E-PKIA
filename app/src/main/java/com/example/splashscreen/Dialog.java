package com.example.splashscreen;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class Dialog extends AppCompatDialogFragment {
  @Override
    public android.app.Dialog onCreateDialog(Bundle savedInstanteState){
      AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
      builder.setTitle("Information")
                .setMessage("Keluhan anda telah terkirim")
              .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                  @Override
                  public void onClick(DialogInterface dialog, int which) {

                  }
              });
      return builder.create();
  }
}
