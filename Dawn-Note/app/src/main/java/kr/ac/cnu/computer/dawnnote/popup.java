package kr.ac.cnu.computer.dawnnote;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;

public class popup extends Dialog {

    public popup(@NonNull Context context) {
        super(context);
        setContentView(R.layout.set_popup);

    }

}
