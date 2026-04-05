package c.c.a.a;

import com.android.billingclient.api.SkuDetails;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f5116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f5117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5118e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<SkuDetails> f5119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5120g;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f5121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f5122b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f5123c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f5124d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ArrayList<SkuDetails> f5125e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f5126f;

        public /* synthetic */ a(r rVar) {
        }

        public f a() {
            ArrayList<SkuDetails> arrayList = this.f5125e;
            if (arrayList == null || arrayList.isEmpty()) {
                throw new IllegalArgumentException("SkuDetails must be provided.");
            }
            ArrayList<SkuDetails> arrayList2 = this.f5125e;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                if (arrayList2.get(i2) == null) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
                i2 = i3;
            }
            if (this.f5125e.size() > 1) {
                SkuDetails skuDetails = this.f5125e.get(0);
                String strE = skuDetails.e();
                ArrayList<SkuDetails> arrayList3 = this.f5125e;
                int size2 = arrayList3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    SkuDetails skuDetails2 = arrayList3.get(i4);
                    if (!strE.equals("play_pass_subs") && !skuDetails2.e().equals("play_pass_subs") && !strE.equals(skuDetails2.e())) {
                        throw new IllegalArgumentException("SKUs should have the same type.");
                    }
                }
                String strH = skuDetails.h();
                ArrayList<SkuDetails> arrayList4 = this.f5125e;
                int size3 = arrayList4.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    SkuDetails skuDetails3 = arrayList4.get(i5);
                    if (!strE.equals("play_pass_subs") && !skuDetails3.e().equals("play_pass_subs") && !strH.equals(skuDetails3.h())) {
                        throw new IllegalArgumentException("All SKUs must have the same package name.");
                    }
                }
            }
            f fVar = new f(null);
            fVar.f5114a = true ^ this.f5125e.get(0).h().isEmpty();
            fVar.f5115b = this.f5121a;
            fVar.f5117d = this.f5123c;
            fVar.f5116c = this.f5122b;
            fVar.f5118e = this.f5124d;
            fVar.f5119f = this.f5125e;
            fVar.f5120g = this.f5126f;
            return fVar;
        }

        public a b(SkuDetails skuDetails) {
            ArrayList<SkuDetails> arrayList = new ArrayList<>();
            arrayList.add(skuDetails);
            this.f5125e = arrayList;
            return this;
        }
    }

    public /* synthetic */ f(r rVar) {
    }

    public static a b() {
        return new a(null);
    }

    public boolean a() {
        return this.f5120g;
    }

    public final int d() {
        return this.f5118e;
    }

    public final String h() {
        return this.f5115b;
    }

    public final String i() {
        return this.f5117d;
    }

    public final String j() {
        return this.f5116c;
    }

    public final ArrayList<SkuDetails> l() {
        ArrayList<SkuDetails> arrayList = new ArrayList<>();
        arrayList.addAll(this.f5119f);
        return arrayList;
    }

    public final boolean o() {
        return (!this.f5120g && this.f5115b == null && this.f5117d == null && this.f5118e == 0 && !this.f5114a) ? false : true;
    }
}
