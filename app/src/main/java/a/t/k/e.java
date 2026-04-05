package a.t.k;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class e extends a.l.d.d {
    public static final boolean r = Log.isLoggable("UseSupportDynamicGroup", 3);
    public Dialog s;
    public a.t.l.f t;

    public e() {
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

    public a N(Context context) {
        return new a(context);
    }

    public d P(Context context, Bundle bundle) {
        return new d(context);
    }

    public void Q(a.t.l.f fVar) {
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
        if (dialog == null || !r) {
            return;
        }
        ((a) dialog).n(fVar);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.s;
        if (dialog != null) {
            if (r) {
                ((a) dialog).r();
            } else {
                ((d) dialog).K();
            }
        }
    }

    @Override // a.l.d.d, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.s;
        if (dialog == null || r) {
            return;
        }
        ((d) dialog).m(false);
    }

    @Override // a.l.d.d
    public Dialog w(Bundle bundle) {
        if (r) {
            a aVarN = N(getContext());
            this.s = aVarN;
            aVarN.n(this.t);
        } else {
            this.s = P(getContext(), bundle);
        }
        return this.s;
    }
}
