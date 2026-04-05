package a.i.h;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f1762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence[] f1763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f1766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set<String> f1767g;

    public static RemoteInput a(n nVar) {
        RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(nVar.i()).setLabel(nVar.h()).setChoices(nVar.e()).setAllowFreeFormInput(nVar.c()).addExtras(nVar.g());
        if (Build.VERSION.SDK_INT >= 29) {
            builderAddExtras.setEditChoicesBeforeSending(nVar.f());
        }
        return builderAddExtras.build();
    }

    public static RemoteInput[] b(n[] nVarArr) {
        if (nVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[nVarArr.length];
        for (int i2 = 0; i2 < nVarArr.length; i2++) {
            remoteInputArr[i2] = a(nVarArr[i2]);
        }
        return remoteInputArr;
    }

    public boolean c() {
        return this.f1764d;
    }

    public Set<String> d() {
        return this.f1767g;
    }

    public CharSequence[] e() {
        return this.f1763c;
    }

    public int f() {
        return this.f1765e;
    }

    public Bundle g() {
        return this.f1766f;
    }

    public CharSequence h() {
        return this.f1762b;
    }

    public String i() {
        return this.f1761a;
    }

    public boolean j() {
        return (c() || (e() != null && e().length != 0) || d() == null || d().isEmpty()) ? false : true;
    }
}
