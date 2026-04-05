package c.h.a.f;

import android.annotation.SuppressLint;
import android.content.Context;
import c.h.a.f.g;
import com.amazonaws.http.HttpHeader;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k.a0;
import k.b0;
import k.q;
import k.v;
import k.w;
import k.x;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"SimpleDateFormat"})
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c<String> f16732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f16733b = g.a.f16760a;

    public static String a(Context context, String str, int i2, String str2, List<e> list) {
        try {
            x xVar = new x();
            x.b bVarU = xVar.u();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            bVarU.c(30L, timeUnit).e(30L, timeUnit).f(true).a();
            a0 a0VarB = str2.equals(BuildConfig.FLAVOR) ? new a0.a().j(f16733b + str).e(HttpHeader.USER_AGENT, "IPTV Smarters Pro").b() : null;
            if (str2.equalsIgnoreCase("GET")) {
                a0.a aVar = new a0.a();
                aVar.j(f16733b + str);
                aVar.e(HttpHeader.USER_AGENT, "IPTV Smarters Pro");
                if (list != null) {
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        aVar.a(list.get(i3).b(), list.get(i3).c());
                    }
                }
                aVar.a("Content-Type", "application/json; charset=utf-8");
                a0VarB = aVar.b();
            }
            if (str2.equalsIgnoreCase("Form")) {
                q.a aVar2 = new q.a();
                for (int i4 = 0; i4 < list.size(); i4++) {
                    aVar2.a(list.get(i4).b(), list.get(i4).c());
                }
                a0VarB = new a0.a().j(f16733b + str).e(HttpHeader.USER_AGENT, "IPTV Smarters Pro").a("Content-Type", "application/json; charset=utf-8").h(aVar2.c()).b();
            }
            if (str2.equalsIgnoreCase("FormAPI")) {
                q.a aVar3 = new q.a();
                for (int i5 = 0; i5 < list.size(); i5++) {
                    aVar3.a(list.get(i5).b(), list.get(i5).c());
                }
                a0VarB = new a0.a().j(f16733b + str).e(HttpHeader.USER_AGENT, "IPTV Smarters Pro").a("Content-Type", "application/json; charset=utf-8").h(aVar3.c()).b();
            }
            if (str2.equalsIgnoreCase("DEL")) {
                a0.a aVar4 = new a0.a();
                aVar4.j(f16733b + str);
                aVar4.e(HttpHeader.USER_AGENT, "IPTV Smarters Pro");
                if (list != null) {
                    for (int i6 = 0; i6 < list.size(); i6++) {
                        aVar4.a(list.get(i6).b(), list.get(i6).c());
                    }
                }
                aVar4.a("Content-Type", "application/json; charset=utf-8");
                aVar4.c();
                a0VarB = aVar4.b();
            }
            if (str2.equalsIgnoreCase("Multipart")) {
                v vVarC = v.c("image/png");
                v vVarC2 = v.c("video/*");
                w.a aVar5 = new w.a();
                for (int i7 = 0; i7 < list.size(); i7++) {
                    if (list.get(i7).a() != null) {
                        if (list.get(i7).a().getAbsolutePath().endsWith(".png") || list.get(i7).a().getAbsolutePath().endsWith(".jpg") || list.get(i7).a().getAbsolutePath().endsWith(".jpeg")) {
                            aVar5.f(w.f30982e).b(list.get(i7).b(), list.get(i7).a().getName(), b0.c(vVarC, list.get(i7).a()));
                        }
                        if (list.get(i7).a().getAbsolutePath().endsWith(".mp4") || list.get(i7).a().getAbsolutePath().endsWith(".mpeg") || list.get(i7).a().getAbsolutePath().endsWith(".3gp") || list.get(i7).a().getAbsolutePath().endsWith(".avi")) {
                            aVar5.f(w.f30982e).b(list.get(i7).b(), list.get(i7).a().getName(), b0.c(vVarC2, list.get(i7).a()));
                        }
                    } else {
                        aVar5.f(w.f30982e).a(list.get(i7).b(), list.get(i7).c());
                    }
                }
                a0VarB = new a0.a().j(f16733b + str).e(HttpHeader.USER_AGENT, "IPTV Smarters Pro").h(aVar5.e()).b();
            }
            return xVar.a(a0VarB).execute().d().q();
        } catch (SocketTimeoutException e2) {
            e2.printStackTrace();
            f16732a.n(i2);
            return BuildConfig.FLAVOR;
        } catch (IOException e3) {
            e3.printStackTrace();
            f16732a.n(i2);
            return BuildConfig.FLAVOR;
        } catch (Exception e4) {
            e4.printStackTrace();
            f16732a.n(i2);
            return BuildConfig.FLAVOR;
        }
    }
}
