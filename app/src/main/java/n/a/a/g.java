package n.a.a;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import n.a.a.c;

/* JADX INFO: loaded from: classes2.dex */
public class g extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c.a f31231b;

    public static g a(int i2, int i3, String str, int i4, String[] strArr) {
        g gVar = new g();
        gVar.setArguments(new f(i2, i3, str, i4, strArr).b());
        return gVar;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    @SuppressLint({"NewApi"})
    public void onAttach(Context context) {
        Object parentFragment;
        super.onAttach(context);
        if ((Build.VERSION.SDK_INT >= 17) && getParentFragment() != null && (getParentFragment() instanceof c.a)) {
            parentFragment = getParentFragment();
        } else {
            boolean z = context instanceof c.a;
            parentFragment = context;
            if (!z) {
                return;
            }
        }
        this.f31231b = (c.a) parentFragment;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        setCancelable(false);
        f fVar = new f(getArguments());
        return fVar.a(getActivity(), new e(this, fVar, this.f31231b));
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f31231b = null;
    }
}
