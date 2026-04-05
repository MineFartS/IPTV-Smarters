package c.f.a.c.f;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import c.f.a.c.f.q.o;

/* JADX INFO: loaded from: classes2.dex */
public class c extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Dialog f12303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DialogInterface.OnCancelListener f12304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Dialog f12305d;

    public static c a(@RecentlyNonNull Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        c cVar = new c();
        Dialog dialog2 = (Dialog) o.j(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        cVar.f12303b = dialog2;
        if (onCancelListener != null) {
            cVar.f12304c = onCancelListener;
        }
        return cVar;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@RecentlyNonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f12304c;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f12303b;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f12305d == null) {
            this.f12305d = new AlertDialog.Builder(getActivity()).create();
        }
        return this.f12305d;
    }

    @Override // android.app.DialogFragment
    public void show(@RecentlyNonNull FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
