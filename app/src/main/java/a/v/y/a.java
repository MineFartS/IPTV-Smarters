package a.v.y;

import a.v.k;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.navigation.NavController;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements NavController.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<Integer> f3685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference<a.k.b.c> f3686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a.b.m.a.d f3687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ValueAnimator f3688e;

    public a(Context context, b bVar) {
        this.f3684a = context;
        this.f3685b = bVar.c();
        a.k.b.c cVarB = bVar.b();
        if (cVarB != null) {
            this.f3686c = new WeakReference<>(cVarB);
        } else {
            this.f3686c = null;
        }
    }

    @Override // androidx.navigation.NavController.b
    public void a(NavController navController, k kVar, Bundle bundle) {
        if (kVar instanceof a.v.b) {
            return;
        }
        WeakReference<a.k.b.c> weakReference = this.f3686c;
        a.k.b.c cVar = weakReference != null ? weakReference.get() : null;
        if (this.f3686c != null && cVar == null) {
            navController.x(this);
            return;
        }
        CharSequence charSequenceX = kVar.x();
        if (charSequenceX != null) {
            StringBuffer stringBuffer = new StringBuffer();
            Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(charSequenceX);
            while (matcher.find()) {
                String strGroup = matcher.group(1);
                if (bundle == null || !bundle.containsKey(strGroup)) {
                    throw new IllegalArgumentException("Could not find " + strGroup + " in " + bundle + " to fill label " + ((Object) charSequenceX));
                }
                matcher.appendReplacement(stringBuffer, BuildConfig.FLAVOR);
                stringBuffer.append(bundle.get(strGroup).toString());
            }
            matcher.appendTail(stringBuffer);
            d(stringBuffer);
        }
        boolean zB = c.b(kVar, this.f3685b);
        if (cVar == null && zB) {
            c(null, 0);
        } else {
            b(cVar != null && zB);
        }
    }

    public final void b(boolean z) {
        boolean z2;
        if (this.f3687d == null) {
            this.f3687d = new a.b.m.a.d(this.f3684a);
            z2 = false;
        } else {
            z2 = true;
        }
        c(this.f3687d, z ? d.f3698b : d.f3697a);
        float f2 = z ? 0.0f : 1.0f;
        if (!z2) {
            this.f3687d.setProgress(f2);
            return;
        }
        float fA = this.f3687d.a();
        ValueAnimator valueAnimator = this.f3688e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f3687d, "progress", fA, f2);
        this.f3688e = objectAnimatorOfFloat;
        objectAnimatorOfFloat.start();
    }

    public abstract void c(Drawable drawable, int i2);

    public abstract void d(CharSequence charSequence);
}
