package c.c.a.a;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import c.c.a.a.g;
import com.android.billingclient.api.ProxyBillingActivity;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile int f5095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f5097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile b0 f5098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f5099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f5100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile c.f.a.c.j.i.d f5101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile q f5102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5103i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f5104j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5105k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5106l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5107m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f5108n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f5109o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public ExecutorService u;

    public d(Context context, boolean z, i iVar, String str, String str2) {
        this.f5095a = 0;
        this.f5097c = new Handler(Looper.getMainLooper());
        this.f5105k = 0;
        this.f5096b = str;
        i(context, iVar, z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(String str, boolean z, Context context, i iVar) {
        String str2;
        try {
            str2 = (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            str2 = "4.0.0";
        }
        this(context, z, iVar, str2, null);
    }

    public static /* synthetic */ Purchase.a y(d dVar, String str) {
        String strValueOf = String.valueOf(str);
        c.f.a.c.j.i.a.i("BillingClient", strValueOf.length() != 0 ? "Querying owned items, item type: ".concat(strValueOf) : new String("Querying owned items, item type: "));
        ArrayList arrayList = new ArrayList();
        Bundle bundleE = c.f.a.c.j.i.a.e(dVar.f5108n, dVar.t, dVar.f5096b);
        String string = null;
        do {
            try {
                Bundle bundleO2 = dVar.f5108n ? dVar.f5101g.o2(9, dVar.f5100f.getPackageName(), str, string, bundleE) : dVar.f5101g.y0(3, dVar.f5100f.getPackageName(), str, string);
                g gVarA = u.a(bundleO2, "BillingClient", "getPurchase()");
                if (gVarA != t.p) {
                    return new Purchase.a(gVarA, null);
                }
                ArrayList<String> stringArrayList = bundleO2.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleO2.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleO2.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                for (int i2 = 0; i2 < stringArrayList2.size(); i2++) {
                    String str2 = stringArrayList2.get(i2);
                    String str3 = stringArrayList3.get(i2);
                    String strValueOf2 = String.valueOf(stringArrayList.get(i2));
                    c.f.a.c.j.i.a.i("BillingClient", strValueOf2.length() != 0 ? "Sku is owned: ".concat(strValueOf2) : new String("Sku is owned: "));
                    try {
                        Purchase purchase = new Purchase(str2, str3);
                        if (TextUtils.isEmpty(purchase.d())) {
                            c.f.a.c.j.i.a.j("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e2) {
                        String strValueOf3 = String.valueOf(e2);
                        StringBuilder sb = new StringBuilder(strValueOf3.length() + 48);
                        sb.append("Got an exception trying to decode the purchase: ");
                        sb.append(strValueOf3);
                        c.f.a.c.j.i.a.j("BillingClient", sb.toString());
                        return new Purchase.a(t.f5176l, null);
                    }
                }
                string = bundleO2.getString("INAPP_CONTINUATION_TOKEN");
                String strValueOf4 = String.valueOf(string);
                c.f.a.c.j.i.a.i("BillingClient", strValueOf4.length() != 0 ? "Continuation token: ".concat(strValueOf4) : new String("Continuation token: "));
            } catch (Exception e3) {
                String strValueOf5 = String.valueOf(e3);
                StringBuilder sb2 = new StringBuilder(strValueOf5.length() + 57);
                sb2.append("Got exception trying to get purchases: ");
                sb2.append(strValueOf5);
                sb2.append("; try to reconnect");
                c.f.a.c.j.i.a.j("BillingClient", sb2.toString());
                return new Purchase.a(t.q, null);
            }
        } while (!TextUtils.isEmpty(string));
        return new Purchase.a(t.p, arrayList);
    }

    public final /* synthetic */ Object B(a aVar, b bVar) {
        g gVarA;
        try {
            Bundle bundleE2 = this.f5101g.E2(9, this.f5100f.getPackageName(), aVar.a(), c.f.a.c.j.i.a.b(aVar, this.f5096b));
            int iA = c.f.a.c.j.i.a.a(bundleE2, "BillingClient");
            String strG = c.f.a.c.j.i.a.g(bundleE2, "BillingClient");
            g.a aVarC = g.c();
            aVarC.c(iA);
            aVarC.b(strG);
            gVarA = aVarC.a();
        } catch (Exception e2) {
            String strValueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 32);
            sb.append("Error acknowledge purchase; ex: ");
            sb.append(strValueOf);
            c.f.a.c.j.i.a.j("BillingClient", sb.toString());
            gVarA = t.q;
        }
        bVar.a(gVarA);
        return null;
    }

    public final /* synthetic */ Object C(String str, List list, String str2, k kVar) {
        String strG;
        int i2;
        String str3;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i3 = 0;
        while (true) {
            strG = "Item is unavailable for purchase.";
            if (i3 >= size) {
                strG = BuildConfig.FLAVOR;
                i2 = 0;
                break;
            }
            int i4 = i3 + 20;
            ArrayList arrayList2 = new ArrayList(list.subList(i3, i4 > size ? size : i4));
            ArrayList<String> arrayList3 = new ArrayList<>();
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                arrayList3.add(((y) arrayList2.get(i5)).a());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle.putString("playBillingLibraryVersion", this.f5096b);
            try {
                Bundle bundleB = this.f5109o ? this.f5101g.B(10, this.f5100f.getPackageName(), str, bundle, c.f.a.c.j.i.a.c(this.f5105k, this.t, this.f5096b, null, arrayList2)) : this.f5101g.z1(3, this.f5100f.getPackageName(), str, bundle);
                if (bundleB == null) {
                    str3 = "querySkuDetailsAsync got null sku details list";
                    break;
                }
                if (bundleB.containsKey("DETAILS_LIST")) {
                    ArrayList<String> stringArrayList = bundleB.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList == null) {
                        str3 = "querySkuDetailsAsync got null response list";
                        break;
                    }
                    for (int i6 = 0; i6 < stringArrayList.size(); i6++) {
                        try {
                            SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i6));
                            String strValueOf = String.valueOf(skuDetails);
                            StringBuilder sb = new StringBuilder(strValueOf.length() + 17);
                            sb.append("Got sku details: ");
                            sb.append(strValueOf);
                            c.f.a.c.j.i.a.i("BillingClient", sb.toString());
                            arrayList.add(skuDetails);
                        } catch (JSONException unused) {
                            c.f.a.c.j.i.a.j("BillingClient", "Got a JSON exception trying to decode SkuDetails.");
                            strG = "Error trying to decode SkuDetails.";
                            arrayList = null;
                            i2 = 6;
                            g.a aVarC = g.c();
                            aVarC.c(i2);
                            aVarC.b(strG);
                            kVar.e(aVarC.a(), arrayList);
                            return null;
                        }
                    }
                    i3 = i4;
                } else {
                    int iA = c.f.a.c.j.i.a.a(bundleB, "BillingClient");
                    strG = c.f.a.c.j.i.a.g(bundleB, "BillingClient");
                    if (iA != 0) {
                        StringBuilder sb2 = new StringBuilder(50);
                        sb2.append("getSkuDetails() failed. Response code: ");
                        sb2.append(iA);
                        c.f.a.c.j.i.a.j("BillingClient", sb2.toString());
                        i2 = iA;
                    } else {
                        c.f.a.c.j.i.a.j("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                    }
                }
            } catch (Exception e2) {
                String strValueOf2 = String.valueOf(e2);
                StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 63);
                sb3.append("querySkuDetailsAsync got a remote exception (try to reconnect).");
                sb3.append(strValueOf2);
                c.f.a.c.j.i.a.j("BillingClient", sb3.toString());
                i2 = -1;
                strG = "Service connection is disconnected.";
                arrayList = null;
            }
        }
        c.f.a.c.j.i.a.j("BillingClient", str3);
        arrayList = null;
        i2 = 4;
        g.a aVarC2 = g.c();
        aVarC2.c(i2);
        aVarC2.b(strG);
        kVar.e(aVarC2.a(), arrayList);
        return null;
    }

    public final /* synthetic */ void E(g gVar) {
        this.f5098d.b().f(gVar, null);
    }

    @Override // c.c.a.a.c
    public final void a(final a aVar, final b bVar) {
        g gVarO;
        if (!c()) {
            gVarO = t.q;
        } else if (TextUtils.isEmpty(aVar.a())) {
            c.f.a.c.j.i.a.j("BillingClient", "Please provide a valid purchase token.");
            gVarO = t.f5175k;
        } else if (!this.f5108n) {
            gVarO = t.f5166b;
        } else if (p(new Callable() { // from class: c.c.a.a.e0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f5111a.B(aVar, bVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: c.c.a.a.d0
            @Override // java.lang.Runnable
            public final void run() {
                bVar.a(t.r);
            }
        }, m()) != null) {
            return;
        } else {
            gVarO = o();
        }
        bVar.a(gVarO);
    }

    @Override // c.c.a.a.c
    public final void b() {
        try {
            this.f5099e = null;
            this.f5098d.c();
            if (this.f5102h != null) {
                this.f5102h.c();
            }
            if (this.f5102h != null && this.f5101g != null) {
                c.f.a.c.j.i.a.i("BillingClient", "Unbinding from service.");
                this.f5100f.unbindService(this.f5102h);
                this.f5102h = null;
            }
            this.f5101g = null;
            ExecutorService executorService = this.u;
            if (executorService != null) {
                executorService.shutdownNow();
                this.u = null;
            }
        } catch (Exception e2) {
            String strValueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 48);
            sb.append("There was an exception while ending connection: ");
            sb.append(strValueOf);
            c.f.a.c.j.i.a.j("BillingClient", sb.toString());
        } finally {
            this.f5095a = 3;
        }
    }

    @Override // c.c.a.a.c
    public final boolean c() {
        return (this.f5095a != 2 || this.f5101g == null || this.f5102h == null) ? false : true;
    }

    @Override // c.c.a.a.c
    public final g d(Activity activity, final f fVar) {
        String str;
        String str2;
        String str3;
        Callable callable;
        long j2;
        Runnable runnable;
        Handler handler;
        d dVar;
        g gVar;
        boolean z;
        int i2;
        String strOptString;
        String str4 = "BUY_INTENT";
        if (c()) {
            ArrayList<SkuDetails> arrayListL = fVar.l();
            final SkuDetails skuDetails = arrayListL.get(0);
            final String strE = skuDetails.e();
            if (strE.equals("subs") && !this.f5103i) {
                c.f.a.c.j.i.a.j("BillingClient", "Current client doesn't support subscriptions.");
                gVar = t.s;
            } else if (fVar.o() && !this.f5106l) {
                c.f.a.c.j.i.a.j("BillingClient", "Current client doesn't support extra params for buy intent.");
                gVar = t.f5172h;
            } else if (arrayListL.size() <= 1 || this.s) {
                String str5 = BuildConfig.FLAVOR;
                for (int i3 = 0; i3 < arrayListL.size(); i3++) {
                    String strValueOf = String.valueOf(str5);
                    String strValueOf2 = String.valueOf(arrayListL.get(i3));
                    StringBuilder sb = new StringBuilder(strValueOf.length() + strValueOf2.length());
                    sb.append(strValueOf);
                    sb.append(strValueOf2);
                    String string = sb.toString();
                    if (i3 < arrayListL.size() - 1) {
                        string = String.valueOf(string).concat(", ");
                    }
                    str5 = string;
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 41 + strE.length());
                sb2.append("Constructing buy intent for ");
                sb2.append(str5);
                sb2.append(", item type: ");
                sb2.append(strE);
                c.f.a.c.j.i.a.i("BillingClient", sb2.toString());
                if (this.f5106l) {
                    final Bundle bundleD = c.f.a.c.j.i.a.d(fVar, this.f5108n, this.t, this.f5096b);
                    ArrayList<String> arrayList = new ArrayList<>();
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    ArrayList<String> arrayList3 = new ArrayList<>();
                    ArrayList<Integer> arrayList4 = new ArrayList<>();
                    ArrayList<String> arrayList5 = new ArrayList<>();
                    str2 = "; try to reconnect";
                    int size = arrayListL.size();
                    str3 = str5;
                    int i4 = 0;
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    boolean z5 = false;
                    while (i4 < size) {
                        SkuDetails skuDetails2 = arrayListL.get(i4);
                        if (skuDetails2.j().isEmpty()) {
                            i2 = size;
                        } else {
                            i2 = size;
                            arrayList.add(skuDetails2.j());
                        }
                        String str6 = str4;
                        try {
                            strOptString = new JSONObject(skuDetails2.a()).optString("offer_id_token");
                        } catch (JSONException unused) {
                            strOptString = BuildConfig.FLAVOR;
                        }
                        String strG = skuDetails2.g();
                        int iF = skuDetails2.f();
                        String strI = skuDetails2.i();
                        arrayList2.add(strOptString);
                        z2 |= !TextUtils.isEmpty(strOptString);
                        arrayList3.add(strG);
                        z3 |= !TextUtils.isEmpty(strG);
                        arrayList4.add(Integer.valueOf(iF));
                        z4 |= iF != 0;
                        z5 |= !TextUtils.isEmpty(strI);
                        arrayList5.add(strI);
                        i4++;
                        size = i2;
                        str4 = str6;
                    }
                    str = str4;
                    if (!arrayList.isEmpty()) {
                        bundleD.putStringArrayList("skuDetailsTokens", arrayList);
                    }
                    if (z2) {
                        if (this.q) {
                            bundleD.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
                        } else {
                            gVar = t.f5173i;
                        }
                    }
                    if (z3) {
                        bundleD.putStringArrayList("SKU_OFFER_ID_LIST", arrayList3);
                    }
                    if (z4) {
                        bundleD.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList4);
                    }
                    if (z5) {
                        bundleD.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                    }
                    if (TextUtils.isEmpty(skuDetails.h())) {
                        z = false;
                    } else {
                        bundleD.putString("skuPackageName", skuDetails.h());
                        z = true;
                    }
                    if (!TextUtils.isEmpty(null)) {
                        bundleD.putString("accountName", null);
                    }
                    if (arrayListL.size() > 1) {
                        ArrayList<String> arrayList6 = new ArrayList<>(arrayListL.size() - 1);
                        ArrayList<String> arrayList7 = new ArrayList<>(arrayListL.size() - 1);
                        for (int i5 = 1; i5 < arrayListL.size(); i5++) {
                            arrayList6.add(arrayListL.get(i5).d());
                            arrayList7.add(arrayListL.get(i5).e());
                        }
                        bundleD.putStringArrayList("additionalSkus", arrayList6);
                        bundleD.putStringArrayList("additionalSkuTypes", arrayList7);
                    }
                    if (!TextUtils.isEmpty(activity.getIntent().getStringExtra("PROXY_PACKAGE"))) {
                        String stringExtra = activity.getIntent().getStringExtra("PROXY_PACKAGE");
                        bundleD.putString("proxyPackage", stringExtra);
                        try {
                            bundleD.putString("proxyPackageVersion", this.f5100f.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            bundleD.putString("proxyPackageVersion", "package not found");
                        }
                    }
                    final int i6 = (this.r && z) ? 15 : this.f5108n ? 9 : fVar.a() ? 7 : 6;
                    Callable callable2 = new Callable() { // from class: c.c.a.a.l0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.f5148a.u(i6, skuDetails, strE, fVar, bundleD);
                        }
                    };
                    j2 = 5000;
                    runnable = null;
                    handler = this.f5097c;
                    dVar = this;
                    callable = callable2;
                } else {
                    str = "BUY_INTENT";
                    str2 = "; try to reconnect";
                    str3 = str5;
                    callable = new Callable() { // from class: c.c.a.a.f0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.f5127a.v(skuDetails, strE);
                        }
                    };
                    j2 = 5000;
                    runnable = null;
                    handler = this.f5097c;
                    dVar = this;
                }
                try {
                    Bundle bundle = (Bundle) dVar.p(callable, j2, runnable, handler).get(5000L, TimeUnit.MILLISECONDS);
                    int iA = c.f.a.c.j.i.a.a(bundle, "BillingClient");
                    String strG2 = c.f.a.c.j.i.a.g(bundle, "BillingClient");
                    if (iA == 0) {
                        Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                        String str7 = str;
                        intent.putExtra(str7, (PendingIntent) bundle.getParcelable(str7));
                        activity.startActivity(intent);
                        return t.p;
                    }
                    StringBuilder sb3 = new StringBuilder(52);
                    sb3.append("Unable to buy item, Error response code: ");
                    sb3.append(iA);
                    c.f.a.c.j.i.a.j("BillingClient", sb3.toString());
                    g.a aVarC = g.c();
                    aVarC.c(iA);
                    aVarC.b(strG2);
                    g gVarA = aVarC.a();
                    n(gVarA);
                    return gVarA;
                } catch (CancellationException | TimeoutException unused3) {
                    String str8 = str3;
                    StringBuilder sb4 = new StringBuilder(String.valueOf(str8).length() + 68);
                    sb4.append("Time out while launching billing flow: ; for sku: ");
                    sb4.append(str8);
                    sb4.append(str2);
                    c.f.a.c.j.i.a.j("BillingClient", sb4.toString());
                    gVar = t.r;
                } catch (Exception unused4) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(str3).length() + 69);
                    sb5.append("Exception while launching billing flow: ; for sku: ");
                    sb5.append(str3);
                    sb5.append(str2);
                    c.f.a.c.j.i.a.j("BillingClient", sb5.toString());
                }
            } else {
                c.f.a.c.j.i.a.j("BillingClient", "Current client doesn't support multi-item purchases.");
                gVar = t.u;
            }
        } else {
            gVar = t.q;
        }
        n(gVar);
        return gVar;
    }

    @Override // c.c.a.a.c
    public void f(String str, final h hVar) {
        g gVarO;
        if (!c()) {
            gVarO = t.q;
        } else if (TextUtils.isEmpty(str)) {
            c.f.a.c.j.i.a.j("BillingClient", "Please provide a valid SKU type.");
            gVarO = t.f5171g;
        } else if (p(new m(this, str, hVar), 30000L, new Runnable() { // from class: c.c.a.a.i0
            @Override // java.lang.Runnable
            public final void run() {
                hVar.a(t.r, c.f.a.c.j.i.p.i());
            }
        }, m()) != null) {
            return;
        } else {
            gVarO = o();
        }
        hVar.a(gVarO, c.f.a.c.j.i.p.i());
    }

    @Override // c.c.a.a.c
    public final void g(j jVar, final k kVar) {
        g gVarO;
        if (c()) {
            final String strA = jVar.a();
            List<String> listB = jVar.b();
            if (TextUtils.isEmpty(strA)) {
                c.f.a.c.j.i.a.j("BillingClient", "Please fix the input params. SKU type can't be empty.");
                gVarO = t.f5171g;
            } else if (listB != null) {
                final ArrayList arrayList = new ArrayList();
                for (String str : listB) {
                    x xVar = new x(null);
                    xVar.a(str);
                    arrayList.add(xVar.b());
                }
                final String str2 = null;
                if (p(new Callable(strA, arrayList, str2, kVar) { // from class: c.c.a.a.g0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ String f5135b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ List f5136c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ k f5137d;

                    {
                        this.f5137d = kVar;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        this.f5134a.C(this.f5135b, this.f5136c, null, this.f5137d);
                        return null;
                    }
                }, 30000L, new Runnable() { // from class: c.c.a.a.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        kVar.e(t.r, null);
                    }
                }, m()) != null) {
                    return;
                } else {
                    gVarO = o();
                }
            } else {
                c.f.a.c.j.i.a.j("BillingClient", "Please fix the input params. The list of SKUs can't be empty - set SKU list or SkuWithOffer list.");
                gVarO = t.f5170f;
            }
        } else {
            gVarO = t.q;
        }
        kVar.e(gVarO, null);
    }

    @Override // c.c.a.a.c
    public final void h(e eVar) {
        ServiceInfo serviceInfo;
        String str;
        if (c()) {
            c.f.a.c.j.i.a.i("BillingClient", "Service connection is valid. No need to re-initialize.");
            eVar.a(t.p);
            return;
        }
        if (this.f5095a == 1) {
            c.f.a.c.j.i.a.j("BillingClient", "Client is already in the process of connecting to billing service.");
            eVar.a(t.f5168d);
            return;
        }
        if (this.f5095a == 3) {
            c.f.a.c.j.i.a.j("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            eVar.a(t.q);
            return;
        }
        this.f5095a = 1;
        this.f5098d.d();
        c.f.a.c.j.i.a.i("BillingClient", "Starting in-app billing setup.");
        this.f5102h = new q(this, eVar, null);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> listQueryIntentServices = this.f5100f.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty() && (serviceInfo = listQueryIntentServices.get(0).serviceInfo) != null) {
            String str2 = serviceInfo.packageName;
            String str3 = serviceInfo.name;
            if (!"com.android.vending".equals(str2) || str3 == null) {
                str = "The device doesn't have valid Play Store.";
            } else {
                ComponentName componentName = new ComponentName(str2, str3);
                Intent intent2 = new Intent(intent);
                intent2.setComponent(componentName);
                intent2.putExtra("playBillingLibraryVersion", this.f5096b);
                if (this.f5100f.bindService(intent2, this.f5102h, 1)) {
                    c.f.a.c.j.i.a.i("BillingClient", "Service was bonded successfully.");
                    return;
                }
                str = "Connection to Billing service is blocked.";
            }
            c.f.a.c.j.i.a.j("BillingClient", str);
        }
        this.f5095a = 0;
        c.f.a.c.j.i.a.i("BillingClient", "Billing service unavailable on device.");
        eVar.a(t.f5167c);
    }

    public final void i(Context context, i iVar, boolean z) {
        Context applicationContext = context.getApplicationContext();
        this.f5100f = applicationContext;
        this.f5098d = new b0(applicationContext, iVar);
        this.f5099e = context;
        this.t = z;
    }

    public final Handler m() {
        return Looper.myLooper() == null ? this.f5097c : new Handler(Looper.myLooper());
    }

    public final g n(final g gVar) {
        if (Thread.interrupted()) {
            return gVar;
        }
        this.f5097c.post(new Runnable() { // from class: c.c.a.a.h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f5138b.E(gVar);
            }
        });
        return gVar;
    }

    public final g o() {
        return (this.f5095a == 0 || this.f5095a == 3) ? t.q : t.f5176l;
    }

    public final <T> Future<T> p(Callable<T> callable, long j2, final Runnable runnable, Handler handler) {
        double d2 = j2;
        Double.isNaN(d2);
        long j3 = (long) (d2 * 0.95d);
        if (this.u == null) {
            this.u = Executors.newFixedThreadPool(c.f.a.c.j.i.a.f13694a, new n(this));
        }
        try {
            final Future<T> futureSubmit = this.u.submit(callable);
            handler.postDelayed(new Runnable() { // from class: c.c.a.a.k0
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    Runnable runnable2 = runnable;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    future.cancel(true);
                    c.f.a.c.j.i.a.j("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, j3);
            return futureSubmit;
        } catch (Exception e2) {
            String strValueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 28);
            sb.append("Async task throws exception ");
            sb.append(strValueOf);
            c.f.a.c.j.i.a.j("BillingClient", sb.toString());
            return null;
        }
    }

    public final /* synthetic */ Bundle u(int i2, SkuDetails skuDetails, String str, f fVar, Bundle bundle) {
        return this.f5101g.v1(i2, this.f5100f.getPackageName(), skuDetails.d(), str, null, bundle);
    }

    public final /* synthetic */ Bundle v(SkuDetails skuDetails, String str) {
        return this.f5101g.H0(3, this.f5100f.getPackageName(), skuDetails.d(), str, null);
    }
}
