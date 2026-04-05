package a.v;

import a.v.s;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
@s.b("activity")
public class a extends s<C0083a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f3516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f3517b;

    /* JADX INFO: renamed from: a.v.a$a, reason: collision with other inner class name */
    public static class C0083a extends k {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Intent f3518k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f3519l;

        public C0083a(s<? extends C0083a> sVar) {
            super(sVar);
        }

        @Override // a.v.k
        public void F(Context context, AttributeSet attributeSet) {
            super.F(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, v.f3632a);
            String string = typedArrayObtainAttributes.getString(v.f3637f);
            if (string != null) {
                string = string.replace("${applicationId}", context.getPackageName());
            }
            V(string);
            String string2 = typedArrayObtainAttributes.getString(v.f3633b);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = context.getPackageName() + string2;
                }
                S(new ComponentName(context, string2));
            }
            R(typedArrayObtainAttributes.getString(v.f3634c));
            String string3 = typedArrayObtainAttributes.getString(v.f3635d);
            if (string3 != null) {
                T(Uri.parse(string3));
            }
            U(typedArrayObtainAttributes.getString(v.f3636e));
            typedArrayObtainAttributes.recycle();
        }

        @Override // a.v.k
        public boolean M() {
            return false;
        }

        public final String N() {
            Intent intent = this.f3518k;
            if (intent == null) {
                return null;
            }
            return intent.getAction();
        }

        public final ComponentName O() {
            Intent intent = this.f3518k;
            if (intent == null) {
                return null;
            }
            return intent.getComponent();
        }

        public final String P() {
            return this.f3519l;
        }

        public final Intent Q() {
            return this.f3518k;
        }

        public final C0083a R(String str) {
            if (this.f3518k == null) {
                this.f3518k = new Intent();
            }
            this.f3518k.setAction(str);
            return this;
        }

        public final C0083a S(ComponentName componentName) {
            if (this.f3518k == null) {
                this.f3518k = new Intent();
            }
            this.f3518k.setComponent(componentName);
            return this;
        }

        public final C0083a T(Uri uri) {
            if (this.f3518k == null) {
                this.f3518k = new Intent();
            }
            this.f3518k.setData(uri);
            return this;
        }

        public final C0083a U(String str) {
            this.f3519l = str;
            return this;
        }

        public final C0083a V(String str) {
            if (this.f3518k == null) {
                this.f3518k = new Intent();
            }
            this.f3518k.setPackage(str);
            return this;
        }

        @Override // a.v.k
        public String toString() {
            String strN;
            ComponentName componentNameO = O();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (componentNameO == null) {
                strN = N();
                if (strN != null) {
                    sb.append(" action=");
                }
                return sb.toString();
            }
            sb.append(" class=");
            strN = componentNameO.getClassName();
            sb.append(strN);
            return sb.toString();
        }
    }

    public static final class b implements s.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a.i.h.c f3521b;

        public a.i.h.c a() {
            return this.f3521b;
        }

        public int b() {
            return this.f3520a;
        }
    }

    public a(Context context) {
        this.f3516a = context;
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                this.f3517b = (Activity) context;
                return;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
    }

    @Override // a.v.s
    public boolean e() {
        Activity activity = this.f3517b;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // a.v.s
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0083a a() {
        return new C0083a(this);
    }

    public final Context g() {
        return this.f3516a;
    }

    @Override // a.v.s
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public k b(C0083a c0083a, Bundle bundle, p pVar, s.a aVar) {
        Intent intent;
        int intExtra;
        if (c0083a.Q() == null) {
            throw new IllegalStateException("Destination " + c0083a.v() + " does not have an Intent set.");
        }
        Intent intent2 = new Intent(c0083a.Q());
        if (bundle != null) {
            intent2.putExtras(bundle);
            String strP = c0083a.P();
            if (!TextUtils.isEmpty(strP)) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(strP);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    if (!bundle.containsKey(strGroup)) {
                        throw new IllegalArgumentException("Could not find " + strGroup + " in " + bundle + " to fill data pattern " + strP);
                    }
                    matcher.appendReplacement(stringBuffer, BuildConfig.FLAVOR);
                    stringBuffer.append(Uri.encode(bundle.get(strGroup).toString()));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        boolean z = aVar instanceof b;
        if (z) {
            intent2.addFlags(((b) aVar).b());
        }
        if (!(this.f3516a instanceof Activity)) {
            intent2.addFlags(268435456);
        }
        if (pVar != null && pVar.g()) {
            intent2.addFlags(536870912);
        }
        Activity activity = this.f3517b;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", c0083a.v());
        Resources resources = g().getResources();
        if (pVar != null) {
            int iC = pVar.c();
            int iD = pVar.d();
            if ((iC <= 0 || !resources.getResourceTypeName(iC).equals("animator")) && (iD <= 0 || !resources.getResourceTypeName(iD).equals("animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", iC);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", iD);
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(iC) + " and popExit resource " + resources.getResourceName(iD) + "when launching " + c0083a);
            }
        }
        if (z && ((b) aVar).a() != null) {
            throw null;
        }
        this.f3516a.startActivity(intent2);
        if (pVar != null && this.f3517b != null) {
            int iA = pVar.a();
            int iB = pVar.b();
            if ((iA > 0 && resources.getResourceTypeName(iA).equals("animator")) || (iB > 0 && resources.getResourceTypeName(iB).equals("animator"))) {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(iA) + " and exit resource " + resources.getResourceName(iB) + "when launching " + c0083a);
            } else if (iA >= 0 || iB >= 0) {
                this.f3517b.overridePendingTransition(Math.max(iA, 0), Math.max(iB, 0));
            }
        }
        return null;
    }
}
