package a.t.k;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class c extends a.l.d.d {
    public static final boolean r = Log.isLoggable("UseSupportDynamicGroup", 3);
    public Dialog s;
    public a.t.l.f t;

    public c() {
        E(true);
    }

    public final void K() {
        if (this.t == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.t = a.t.l.f.d(arguments.getBundle("selector"));
            }
            if (this.t == null) {
                this.t = a.t.l.f.f3357a;
            }
        }
    }

    public a.t.l.f N() {
        K();
        return this.t;
    }

    public b P(Context context, Bundle bundle) {
        return new b(context);
    }

    public f Q(Context context) {
        return new f(context);
    }

    public void R(a.t.l.f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        K();
        if (this.t.equals(fVar)) {
            return;
        }
        this.t = fVar;
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBundle("selector", fVar.a());
        setArguments(arguments);
        Dialog dialog = this.s;
        if (dialog != null) {
            if (r) {
                ((f) dialog).h(fVar);
            } else {
                ((b) dialog).h(fVar);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.s;
        if (dialog == null) {
            return;
        }
        if (r) {
            ((f) dialog).i();
        } else {
            ((b) dialog).i();
        }
    }

    @Override // a.l.d.d
    public Dialog w(Bundle bundle) {
        if (r) {
            f fVarQ = Q(getContext());
            this.s = fVarQ;
            fVarQ.h(N());
        } else {
            b bVarP = P(getContext(), bundle);
            this.s = bVarP;
            bVarP.h(N());
        }
        return this.s;
    }
}
