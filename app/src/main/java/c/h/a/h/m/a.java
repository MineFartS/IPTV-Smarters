package c.h.a.h.m;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;
import c.f.a.c.d.k;
import c.f.a.c.d.l;
import c.f.a.c.d.u.d;
import c.f.a.c.d.u.u.i;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.nst.iptvsmarterstvbox.miscelleneious.chromecastfeature.ExpandedControlsActivity;
import java.io.IOException;
import java.util.List;
import k.a0;
import k.c0;
import k.e;
import k.f;
import k.x;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: c.h.a.h.m.a$a, reason: collision with other inner class name */
    public static class C0216a implements i.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f16940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f16941b;

        public C0216a(Context context, i iVar) {
            this.f16940a = context;
            this.f16941b = iVar;
        }

        @Override // c.f.a.c.d.u.u.i.b
        public void a() {
            Log.e(BuildConfig.FLAVOR, "onMetadataUpdated()");
        }

        @Override // c.f.a.c.d.u.u.i.b
        public void b() {
            Log.e(BuildConfig.FLAVOR, "onQueueStatusUpdated()");
        }

        @Override // c.f.a.c.d.u.u.i.b
        public void c() {
            Log.e(BuildConfig.FLAVOR, "onPreloadStatusUpdated()");
        }

        @Override // c.f.a.c.d.u.u.i.b
        public void d() {
            Log.e(BuildConfig.FLAVOR, "onStatusUpdated()");
            this.f16940a.startActivity(new Intent(this.f16940a, (Class<?>) ExpandedControlsActivity.class));
            this.f16941b.O(this);
        }

        @Override // c.f.a.c.d.u.u.i.b
        public void e() {
            Log.e(BuildConfig.FLAVOR, "onAdBreakStatusUpdated()");
        }

        @Override // c.f.a.c.d.u.u.i.b
        public void f() {
            Log.e(BuildConfig.FLAVOR, "onSendingRemoteMediaRequest()");
        }
    }

    public static class b extends i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f16942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f16943b;

        public b(Context context, i iVar) {
            this.f16942a = context;
            this.f16943b = iVar;
        }

        @Override // c.f.a.c.d.u.u.i.a
        public void g() {
            Intent intent = new Intent(this.f16942a, (Class<?>) ExpandedControlsActivity.class);
            if (((Activity) this.f16942a).getClass().getSimpleName().equals("HoneyPlayer")) {
                ((Activity) this.f16942a).finish();
            }
            this.f16942a.startActivity(intent);
            this.f16943b.X(this);
        }
    }

    public static class c implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f16944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f16945b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Handler f16946c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f16947d;

        /* JADX INFO: renamed from: c.h.a.h.m.a$c$a, reason: collision with other inner class name */
        public class RunnableC0217a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MediaInfo f16948b;

            /* JADX INFO: renamed from: c.h.a.h.m.a$c$a$a, reason: collision with other inner class name */
            public class C0218a extends i.a {
                public C0218a() {
                }

                @Override // c.f.a.c.d.u.u.i.a
                public void g() {
                    Intent intent = new Intent(c.this.f16944a, (Class<?>) ExpandedControlsActivity.class);
                    if (((Activity) c.this.f16944a).getClass().getSimpleName().equals("NSTIJKPlayerSkyActivity") || ((Activity) c.this.f16944a).getClass().getSimpleName().equals("NSTEXOPlayerSkyActivity")) {
                        ((Activity) c.this.f16944a).finish();
                    }
                    c.this.f16944a.startActivity(intent);
                    c.this.f16947d.X(this);
                }
            }

            public RunnableC0217a(MediaInfo mediaInfo) {
                this.f16948b = mediaInfo;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f16947d.N(new C0218a());
                c.this.f16947d.z(new k.a().h(this.f16948b).c(Boolean.TRUE).f(0L).a());
            }
        }

        public c(Context context, l lVar, Handler handler, i iVar) {
            this.f16944a = context;
            this.f16945b = lVar;
            this.f16946c = handler;
            this.f16947d = iVar;
        }

        @Override // k.f
        public void a(@NotNull e eVar, @NotNull c0 c0Var) {
            Log.e("url with token==> ", BuildConfig.FLAVOR + c0Var.t().h().toString());
            this.f16946c.post(new RunnableC0217a(new MediaInfo.a(c0Var.t().h().toString()).e(1).b("application/x-mpegurl").d(this.f16945b).a()));
        }

        @Override // k.f
        public void b(@NotNull e eVar, @NotNull IOException iOException) {
            try {
                iOException.printStackTrace();
                Log.e("chrome cast ====>  ", "Unable to cast,please try again");
                Toast.makeText(this.f16944a, "Unable to cast,please try again ", 0).show();
            } catch (Exception unused) {
            }
        }
    }

    public static MediaInfo a(String str, String str2, String str3, int i2, String str4, String str5, String str6, String str7, List<MediaTrack> list) {
        JSONObject jSONObject;
        JSONException e2;
        l lVar = new l(1);
        lVar.N("com.google.android.gms.cast.metadata.SUBTITLE", str2);
        lVar.N("com.google.android.gms.cast.metadata.TITLE", str);
        lVar.b(new c.f.a.c.f.p.a(Uri.parse(str6)));
        lVar.b(new c.f.a.c.f.p.a(Uri.parse(str7)));
        try {
            jSONObject = new JSONObject();
        } catch (JSONException e3) {
            jSONObject = null;
            e2 = e3;
        }
        try {
            jSONObject.put("description", str3);
        } catch (JSONException e4) {
            e2 = e4;
            Log.e("honey", "Failed to add description to the json object", e2);
        }
        return new MediaInfo.a(str4).e(1).b(str5).d(lVar).c(jSONObject).a();
    }

    public static void b(Handler handler, i iVar, String str, l lVar, Context context) {
        new x().a(new a0.a().j(str).b()).i(new c(context, lVar, handler, iVar));
    }

    public static void c(int i2, boolean z, MediaInfo mediaInfo, d dVar, Context context) {
        i iVarP;
        if (dVar == null || (iVarP = dVar.p()) == null) {
            return;
        }
        iVarP.N(new b(context, iVarP));
        iVarP.z(new k.a().h(mediaInfo).c(Boolean.valueOf(z)).f(i2).a());
    }

    public static void d(MediaInfo mediaInfo, d dVar, Context context) {
        i iVarP;
        if (dVar == null || (iVarP = dVar.p()) == null) {
            return;
        }
        iVarP.b(new C0216a(context, iVarP));
        iVarP.y(mediaInfo, true, 0L);
    }
}
