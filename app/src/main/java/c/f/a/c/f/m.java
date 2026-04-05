package c.f.a.c.f;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import c.f.a.c.f.q.o;

/* JADX INFO: loaded from: classes2.dex */
public class m extends a.l.d.d {
    public Dialog r;
    public DialogInterface.OnCancelListener s;
    public Dialog t;

    public static m K(@RecentlyNonNull Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        m mVar = new m();
        Dialog dialog2 = (Dialog) o.j(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        mVar.r = dialog2;
        if (onCancelListener != null) {
            mVar.s = onCancelListener;
        }
        return mVar;
    }

    @Override // a.l.d.d
    public void J(@RecentlyNonNull a.l.d.n nVar, String str) {
        super.J(nVar, str);
    }

    @Override // a.l.d.d, android.content.DialogInterface.OnCancelListener
    public void onCancel(@RecentlyNonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.s;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // a.l.d.d
    public Dialog w(Bundle bundle) {
        Dialog dialog = this.r;
        if (dialog != null) {
            return dialog;
        }
        F(false);
        if (this.t == null) {
            this.t = new AlertDialog.Builder(getActivity()).create();
        }
        return this.t;
    }
}
