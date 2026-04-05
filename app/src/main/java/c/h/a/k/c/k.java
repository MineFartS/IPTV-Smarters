package c.h.a.k.c;

import android.content.Intent;
import android.net.Uri;
import c.f.a.b.j3.x0;
import c.f.a.b.p1;
import c.f.a.b.q1;
import c.f.b.b.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.achartengine.ChartFactory;

/* JADX INFO: loaded from: classes2.dex */
public class k {
    public static void a(p1.d dVar, Intent intent, String str) {
        if (dVar.f9665b != 0) {
            intent.putExtra("clip_start_position_ms" + str, dVar.f9665b);
        }
        if (dVar.f9666c != Long.MIN_VALUE) {
            intent.putExtra("clip_end_position_ms" + str, dVar.f9666c);
        }
    }

    public static void b(p1.e eVar, Intent intent, String str) {
        intent.putExtra("drm_scheme" + str, eVar.f9670a.toString());
        String str2 = "drm_license_uri" + str;
        Uri uri = eVar.f9671b;
        intent.putExtra(str2, uri != null ? uri.toString() : null);
        intent.putExtra("drm_multi_session" + str, eVar.f9673d);
        intent.putExtra("drm_force_default_license_uri" + str, eVar.f9675f);
        String[] strArr = new String[eVar.f9672c.size() * 2];
        boolean z = false;
        int i2 = 0;
        for (Map.Entry<String, String> entry : eVar.f9672c.entrySet()) {
            int i3 = i2 + 1;
            strArr[i2] = entry.getKey();
            i2 = i3 + 1;
            strArr[i3] = entry.getValue();
        }
        intent.putExtra("drm_key_request_properties" + str, strArr);
        List<Integer> list = eVar.f9676g;
        if (list.isEmpty()) {
            return;
        }
        if (list.size() == 2 && list.contains(2) && list.contains(1)) {
            z = true;
        }
        c.f.a.b.j3.g.g(z);
        intent.putExtra("drm_session_for_clear_content" + str, true);
    }

    public static void c(p1.g gVar, Intent intent, String str) {
        Intent intentPutExtra = intent.putExtra("mime_type" + str, gVar.f9686b);
        String str2 = "ad_tag_uri" + str;
        p1.b bVar = gVar.f9688d;
        intentPutExtra.putExtra(str2, bVar != null ? bVar.f9647a.toString() : null);
        p1.e eVar = gVar.f9687c;
        if (eVar != null) {
            b(eVar, intent, str);
        }
        if (gVar.f9691g.isEmpty()) {
            return;
        }
        c.f.a.b.j3.g.g(gVar.f9691g.size() == 1);
        p1.h hVar = gVar.f9691g.get(0);
        intent.putExtra("subtitle_uri" + str, hVar.f9693a.toString());
        intent.putExtra("subtitle_mime_type" + str, hVar.f9694b);
        intent.putExtra("subtitle_language" + str, hVar.f9695c);
    }

    public static void d(List<p1> list, Intent intent) {
        c.f.a.b.j3.g.a(!list.isEmpty());
        if (list.size() == 1) {
            p1 p1Var = list.get(0);
            p1.g gVar = (p1.g) c.f.a.b.j3.g.e(p1Var.f9643d);
            intent.setAction("com.google.android.exoplayer.demo.action.VIEW").setData(p1Var.f9643d.f9685a);
            CharSequence charSequence = p1Var.f9645f.f9731c;
            if (charSequence != null) {
                intent.putExtra(ChartFactory.TITLE, charSequence);
            }
            c(gVar, intent, BuildConfig.FLAVOR);
            a(p1Var.f9646g, intent, BuildConfig.FLAVOR);
            return;
        }
        intent.setAction("com.google.android.exoplayer.demo.action.VIEW_LIST");
        for (int i2 = 0; i2 < list.size(); i2++) {
            p1 p1Var2 = list.get(i2);
            p1.g gVar2 = (p1.g) c.f.a.b.j3.g.e(p1Var2.f9643d);
            intent.putExtra("uri_" + i2, gVar2.f9685a.toString());
            StringBuilder sb = new StringBuilder();
            sb.append("_");
            sb.append(i2);
            c(gVar2, intent, sb.toString());
            a(p1Var2.f9646g, intent, "_" + i2);
            if (p1Var2.f9645f.f9731c != null) {
                intent.putExtra(ChartFactory.TITLE + "_" + i2, p1Var2.f9645f.f9731c);
            }
        }
    }

    public static p1 e(Uri uri, Intent intent, String str) {
        return h(new p1.c().B(uri).x(intent.getStringExtra("mime_type" + str)).w(new q1.b().V(intent.getStringExtra(ChartFactory.TITLE + str)).F()).d(intent.getStringExtra("ad_tag_uri" + str)).z(g(intent, str)).f(intent.getLongExtra("clip_start_position_ms" + str, 0L)).e(intent.getLongExtra("clip_end_position_ms" + str, Long.MIN_VALUE)), intent, str).a();
    }

    public static List<p1> f(Intent intent) {
        ArrayList arrayList = new ArrayList();
        if ("com.google.android.exoplayer.demo.action.VIEW_LIST".equals(intent.getAction())) {
            int i2 = 0;
            while (true) {
                if (!intent.hasExtra("uri_" + i2)) {
                    break;
                }
                arrayList.add(e(Uri.parse(intent.getStringExtra("uri_" + i2)), intent, "_" + i2));
                i2++;
            }
        } else {
            arrayList.add(e(intent.getData(), intent, BuildConfig.FLAVOR));
        }
        return arrayList;
    }

    public static List<p1.h> g(Intent intent, String str) {
        if (!intent.hasExtra("subtitle_uri" + str)) {
            return Collections.emptyList();
        }
        return Collections.singletonList(new p1.h(Uri.parse(intent.getStringExtra("subtitle_uri" + str)), (String) c.f.a.b.j3.g.e(intent.getStringExtra("subtitle_mime_type" + str)), intent.getStringExtra("subtitle_language" + str), 1));
    }

    public static p1.c h(p1.c cVar, Intent intent, String str) {
        String stringExtra = intent.getStringExtra("drm_scheme" + str);
        if (stringExtra == null) {
            return cVar;
        }
        HashMap map = new HashMap();
        String[] stringArrayExtra = intent.getStringArrayExtra("drm_key_request_properties" + str);
        if (stringArrayExtra != null) {
            for (int i2 = 0; i2 < stringArrayExtra.length; i2 += 2) {
                map.put(stringArrayExtra[i2], stringArrayExtra[i2 + 1]);
            }
        }
        cVar.p(x0.U((String) x0.i(stringExtra))).l(intent.getStringExtra("drm_license_uri" + str)).m(intent.getBooleanExtra("drm_multi_session" + str, false)).h(intent.getBooleanExtra("drm_force_default_license_uri" + str, false)).j(map);
        if (intent.getBooleanExtra("drm_session_for_clear_content" + str, false)) {
            cVar.o(t.L(2, 1));
        }
        return cVar;
    }
}
