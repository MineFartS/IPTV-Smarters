package a.d.b;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f1139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f1140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f1141c;

    /* JADX INFO: renamed from: a.d.b.a$a, reason: collision with other inner class name */
    public static final class C0018a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f1142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f1143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f1144c;

        public a a() {
            return new a(this.f1142a, this.f1143b, this.f1144c);
        }
    }

    public a(Integer num, Integer num2, Integer num3) {
        this.f1139a = num;
        this.f1140b = num2;
        this.f1141c = num3;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f1139a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f1140b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f1141c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        return bundle;
    }
}
