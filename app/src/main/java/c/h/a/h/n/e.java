package c.h.a.h.n;

import a.i.h.j;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.media.AudioAttributes;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Environment;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import c.h.a.h.f;
import c.h.a.i.q.m;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.facebook.ads.InterstitialAd;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.model.callback.GetEpisdoeDetailsCallback;
import com.nst.iptvsmarterstvbox.model.pojo.XMLTVProgrammePojo;
import com.nst.iptvsmarterstvbox.view.activity.CheckAppupdateActivity;
import com.nst.iptvsmarterstvbox.view.activity.ExoPlayerMoviesSeriesActivity;
import com.nst.iptvsmarterstvbox.view.activity.HoneyPlayer;
import com.nst.iptvsmarterstvbox.view.activity.ImportM3uActivity;
import com.nst.iptvsmarterstvbox.view.activity.LoginActivity;
import com.nst.iptvsmarterstvbox.view.activity.MultiUserActivity;
import com.nst.iptvsmarterstvbox.view.activity.NewDashboardActivity;
import com.nst.iptvsmarterstvbox.view.activity.NotificationActivity;
import com.nst.iptvsmarterstvbox.view.activity.PlayExternalPlayerActivity;
import com.nst.iptvsmarterstvbox.view.activity.RateUsActivity;
import com.nst.iptvsmarterstvbox.view.activity.RecordingActivity;
import com.nst.iptvsmarterstvbox.view.activity.RoutingActivity;
import com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories;
import com.nst.iptvsmarterstvbox.view.adapter.RecordingAdapter;
import com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyActivity;
import com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerEPGActivity;
import com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.NetworkInterface;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import k.x;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import o.m;
import org.joda.time.DateTimeFieldType;
import org.joda.time.LocalDateTime;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static PopupWindow f17059a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static SharedPreferences f17060b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static SharedPreferences f17061c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static c.h.a.k.d.a.a f17062d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static AsyncTask f17063e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static AsyncTask f17064f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static AsyncTask f17065g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static AsyncTask f17066h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f17067i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static AsyncTask f17068j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Dialog f17069k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SharedPreferences f17070l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f17071m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f17072n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f17073o = 5;
    public int[] p = {1};
    public String q = BuildConfig.FLAVOR;
    public ArrayList<String> r = new ArrayList<>();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.f17059a.dismiss();
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f17075b;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e.f17059a.dismiss();
            }
        }

        public b(Activity activity) {
            this.f17075b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.this.f17070l = PreferenceManager.getDefaultSharedPreferences(this.f17075b);
            SharedPreferences.Editor editorEdit = e.this.f17070l.edit();
            editorEdit.putBoolean("CANCELLED", true);
            editorEdit.apply();
            e.this.p0(this.f17075b, "stopped");
            Activity activity = this.f17075b;
            Toast.makeText(activity, activity.getResources().getString(R.string.download_stopped), 0).show();
            new Handler().postDelayed(new a(), 500L);
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.f17059a.dismiss();
        }
    }

    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f17079b = BuildConfig.FLAVOR;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f17080c = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Activity f17081d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ EditText f17082e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ SharedPreferences f17083f;

        public class a implements f.j {
            public a() {
            }

            @Override // c.h.a.h.f.j
            public void a(String str) {
                d.this.f17079b = str;
                d.this.f17082e.setText(str);
                SharedPreferences.Editor editorEdit = d.this.f17083f.edit();
                editorEdit.putString("recordingDir", str);
                editorEdit.apply();
                Toast.makeText(d.this.f17081d, "Chosen directory: " + str, 1).show();
            }
        }

        public d(Activity activity, EditText editText, SharedPreferences sharedPreferences) {
            this.f17081d = activity;
            this.f17082e = editText;
            this.f17083f = sharedPreferences;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.f fVar = new c.h.a.h.f(this.f17081d, new a());
            fVar.J(this.f17080c);
            if (Build.VERSION.SDK_INT >= 30) {
                fVar.D(BuildConfig.FLAVOR);
            } else {
                fVar.C(BuildConfig.FLAVOR);
            }
            this.f17080c = !this.f17080c;
        }
    }

    /* JADX INFO: renamed from: c.h.a.h.n.e$e, reason: collision with other inner class name */
    public class ViewOnClickListenerC0227e implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ EditText f17086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Activity f17087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f17088d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ EditText f17089e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ EditText f17090f;

        /* JADX INFO: renamed from: c.h.a.h.n.e$e$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e.f17059a.dismiss();
            }
        }

        public ViewOnClickListenerC0227e(EditText editText, Activity activity, String str, EditText editText2, EditText editText3) {
            this.f17086b = editText;
            this.f17087c = activity;
            this.f17088d = str;
            this.f17089e = editText2;
            this.f17090f = editText3;
        }

        public final boolean a() {
            Activity activity;
            Resources resources;
            int i2;
            if (this.f17089e.getText().toString().trim().length() == 0) {
                activity = this.f17087c;
                resources = activity.getResources();
                i2 = R.string.input_filename;
            } else if (this.f17086b.getText().toString().trim().length() == 0) {
                activity = this.f17087c;
                resources = activity.getResources();
                i2 = R.string.input_duration;
            } else {
                if (this.f17086b.getText().toString().trim().length() == 0) {
                    return true;
                }
                try {
                    e.S(this.f17086b.getText().toString());
                    return true;
                } catch (NumberFormatException unused) {
                    activity = this.f17087c;
                    resources = activity.getResources();
                    i2 = R.string.enter_correct_duaration;
                }
            }
            Toast.makeText(activity, resources.getString(i2), 1).show();
            return false;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iS;
            if (a()) {
                try {
                    iS = e.S(this.f17086b.getText().toString());
                } catch (NumberFormatException unused) {
                    iS = 0;
                }
                e.this.new i(this.f17087c, this.f17088d, iS, this.f17089e.getText().toString(), true, this.f17090f.getText().toString());
                new Handler().postDelayed(new a(), 500L);
            }
        }
    }

    public static class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterstitialAd f17093b;

        public f(InterstitialAd interstitialAd) {
            this.f17093b = interstitialAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f17093b.isAdLoaded()) {
                this.f17093b.show();
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.");
            }
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.f17059a.dismiss();
        }
    }

    public class h implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ File f17095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ RecordingActivity f17096c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ArrayList f17097d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ RecordingAdapter f17098e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ TextView f17099f;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e.f17059a.dismiss();
            }
        }

        public h(File file, RecordingActivity recordingActivity, ArrayList arrayList, RecordingAdapter recordingAdapter, TextView textView) {
            this.f17095b = file;
            this.f17096c = recordingActivity;
            this.f17097d = arrayList;
            this.f17098e = recordingAdapter;
            this.f17099f = textView;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onClick(android.view.View r7) {
            /*
                r6 = this;
                java.io.File r7 = r6.f17095b
                boolean r7 = r7.exists()
                if (r7 == 0) goto L86
                java.io.File r7 = r6.f17095b
                boolean r7 = r7.delete()
                if (r7 == 0) goto L86
                com.nst.iptvsmarterstvbox.view.activity.RecordingActivity r7 = r6.f17096c
                android.content.res.Resources r0 = r7.getResources()
                r1 = 2132018407(0x7f1404e7, float:1.967512E38)
                java.lang.String r0 = r0.getString(r1)
                r1 = 0
                android.widget.Toast r7 = android.widget.Toast.makeText(r7, r0, r1)
                r7.show()
                com.nst.iptvsmarterstvbox.view.activity.RecordingActivity r7 = r6.f17096c
                java.io.File[] r7 = c.h.a.h.n.e.B(r7)
                if (r7 == 0) goto L68
                int r0 = r7.length
                if (r0 <= 0) goto L68
                java.util.ArrayList r0 = r6.f17097d
                r0.clear()
                int r0 = r7.length
                r2 = 0
            L37:
                if (r2 >= r0) goto L58
                r3 = r7[r2]
                java.lang.String r4 = r3.toString()
                java.lang.String r5 = ".ts"
                boolean r4 = r4.endsWith(r5)
                if (r4 == 0) goto L55
                r4 = 1
                java.io.File[] r4 = new java.io.File[r4]
                r4[r1] = r3
                java.util.List r3 = java.util.Arrays.asList(r4)
                java.util.ArrayList r4 = r6.f17097d
                r4.addAll(r3)
            L55:
                int r2 = r2 + 1
                goto L37
            L58:
                java.util.ArrayList r7 = r6.f17097d
                if (r7 == 0) goto L68
                int r7 = r7.size()
                if (r7 <= 0) goto L68
                com.nst.iptvsmarterstvbox.view.adapter.RecordingAdapter r7 = r6.f17098e
                r7.w()
                goto L77
            L68:
                java.util.ArrayList r7 = r6.f17097d
                r7.clear()
                com.nst.iptvsmarterstvbox.view.adapter.RecordingAdapter r7 = r6.f17098e
                r7.w()
                android.widget.TextView r7 = r6.f17099f
                r7.setVisibility(r1)
            L77:
                android.os.Handler r7 = new android.os.Handler
                r7.<init>()
                c.h.a.h.n.e$h$a r0 = new c.h.a.h.n.e$h$a
                r0.<init>()
                r1 = 500(0x1f4, double:2.47E-321)
                r7.postDelayed(r0, r1)
            L86:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: c.h.a.h.n.e.h.onClick(android.view.View):void");
        }
    }

    public class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f17102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f17103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17104c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f17105d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f17106e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f17107f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f17108g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public NotificationManager f17110i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public NotificationManager f17111j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Notification f17112k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public j.e f17113l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public j.e f17114m;
        public boolean r;
        public CountDownTimer s;
        public CountDownTimer t;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f17109h = BuildConfig.FLAVOR;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f17115n = 234231;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f17116o = false;
        public boolean p = false;
        public boolean q = false;
        public final String u = "CANCELLED";
        public boolean v = false;
        public boolean w = false;

        public class a extends CountDownTimer {

            /* JADX INFO: renamed from: c.h.a.h.n.e$i$a$a, reason: collision with other inner class name */
            public class CountDownTimerC0228a extends CountDownTimer {
                public CountDownTimerC0228a(long j2, long j3) {
                    super(j2, j3);
                }

                @Override // android.os.CountDownTimer
                public void onFinish() {
                    i.this.t.cancel();
                    i.this.f17116o = true;
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j2) {
                    NotificationManager notificationManager;
                    int i2;
                    Notification notificationC;
                    if (i.this.v) {
                        i iVar = i.this;
                        if (!e.this.f17072n) {
                            Log.e("Debugging:", "cancelled recording");
                            i.this.f17110i.cancelAll();
                            i.this.t.cancel();
                            i.this.C("stopped");
                            return;
                        }
                        iVar.f17103b -= e.this.p[0];
                        i iVar2 = i.this;
                        iVar2.f17104c = iVar2.f17103b * 1000;
                        Log.e("Debugging:", "retrying: " + i.this.f17104c);
                        i.this.t.cancel();
                        return;
                    }
                    int[] iArr = e.this.p;
                    int i3 = iArr[0];
                    iArr[0] = i3 + 1;
                    if (Build.VERSION.SDK_INT >= 26) {
                        i iVar3 = i.this;
                        e.this.f17070l = PreferenceManager.getDefaultSharedPreferences(iVar3.f17102a);
                        SharedPreferences.Editor editorEdit = e.this.f17070l.edit();
                        editorEdit.putBoolean("CANCELLED", false);
                        editorEdit.apply();
                        i iVar4 = i.this;
                        NotificationActivity.a(iVar4.f17115n, iVar4.f17102a);
                        i iVar5 = i.this;
                        Notification.Builder builder = new Notification.Builder(i.this.f17102a);
                        StringBuilder sb = new StringBuilder();
                        sb.append(i.this.f17102a.getResources().getString(R.string.recording_dots));
                        sb.append(e.this.e0(i3));
                        sb.append(" - ");
                        i iVar6 = i.this;
                        sb.append(e.this.e0(iVar6.f17106e / 1000));
                        iVar5.f17112k = builder.setContentTitle(sb.toString()).setSmallIcon(R.mipmap.ic_launcher).setChannelId("ksjadf87").setSound((Uri) null, (AudioAttributes) null).build();
                        i.this.f17110i.createNotificationChannel(new NotificationChannel("ksjadf87", i.this.f17102a.getResources().getString(R.string.recording_dots), 2));
                        i iVar7 = i.this;
                        notificationManager = iVar7.f17110i;
                        i2 = iVar7.f17115n;
                        notificationC = iVar7.f17112k;
                    } else {
                        j.e eVar = i.this.f17113l;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i.this.f17102a.getResources().getString(R.string.recording_dots));
                        sb2.append(e.this.e0(i3));
                        sb2.append(" - ");
                        i iVar8 = i.this;
                        sb2.append(e.this.e0(iVar8.f17106e / 1000));
                        eVar.n(sb2.toString());
                        i iVar9 = i.this;
                        notificationManager = iVar9.f17110i;
                        i2 = iVar9.f17115n;
                        notificationC = iVar9.f17113l.c();
                    }
                    notificationManager.notify(i2, notificationC);
                    if (i.this.w) {
                        i.this.f17110i.cancelAll();
                        i.this.t.cancel();
                    }
                    Log.e("Debugging:", "Seconds:" + e.this.e0(i3) + "   Reverse Seconds:" + e.this.e0((int) (j2 / 1000)) + " asdf:" + i.this.f17104c + " Timeinseconds:" + i.this.f17103b);
                    i iVar10 = i.this;
                    e.this.p0(iVar10.f17102a, "processing");
                }
            }

            public a(long j2, long j3) {
                super(j2, j3);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                cancel();
                i iVar = i.this;
                if (e.this.f17072n || !iVar.q) {
                    return;
                }
                i.this.C("failed");
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j2) {
                Log.e("onTick", "Testing:" + j2);
                if (i.this.p) {
                    Log.e("download started", "Testing:" + j2);
                    cancel();
                    i iVar = i.this;
                    iVar.t = new CountDownTimerC0228a((long) iVar.f17104c, 1000L).start();
                }
            }
        }

        @SuppressLint({"StaticFieldLeak"})
        public class b extends AsyncTask<Void, Void, Void> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public File f17119a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public FileOutputStream f17120b;

            public class a implements Runnable {
                public a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    i iVar = i.this;
                    e.this.f17071m++;
                    e.l0(iVar.f17102a, "Retrying (" + e.this.f17071m + "/" + e.this.f17073o + ")");
                    new b(i.this, null).execute(new Void[0]);
                }
            }

            /* JADX INFO: renamed from: c.h.a.h.n.e$i$b$b, reason: collision with other inner class name */
            public class RunnableC0229b implements Runnable {
                public RunnableC0229b() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    i iVar = i.this;
                    e.this.f17071m++;
                    e.l0(iVar.f17102a, "Retrying (" + e.this.f17071m + "/" + e.this.f17073o + ")");
                    new b(i.this, null).execute(new Void[0]);
                }
            }

            public b() {
                this.f17119a = null;
                this.f17120b = null;
            }

            public /* synthetic */ b(i iVar, c.h.a.h.n.d dVar) {
                this();
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void doInBackground(Void... voidArr) {
                File file;
                i iVar;
                String strValueOf;
                File file2;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(i.this.f17107f).openConnection();
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.connect();
                    if (httpURLConnection.getResponseCode() != 200) {
                        Log.e("Download Task", "Server returned HTTP " + httpURLConnection.getResponseCode() + " " + httpURLConnection.getResponseMessage());
                        SharedPreferences.Editor editorEdit = e.this.f17070l.edit();
                        editorEdit.putBoolean("CANCELLED", true);
                        editorEdit.apply();
                        i.this.v = true;
                        i iVar2 = i.this;
                        e.this.f17072n = true;
                        iVar2.p = false;
                        return null;
                    }
                    if (i.this.f17105d == null || i.this.f17105d.equals(BuildConfig.FLAVOR)) {
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 19) {
                            file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "IPTVSmarters");
                        } else {
                            file = new File(Environment.getExternalStorageDirectory() + "/Documents", "IPTVSmarters");
                        }
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        if (i2 >= 19) {
                            iVar = i.this;
                            strValueOf = String.valueOf(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "IPTVSmarters"));
                        } else {
                            iVar = i.this;
                            strValueOf = String.valueOf(new File(Environment.getExternalStorageDirectory() + "/Documents", "IPTVSmarters"));
                        }
                        iVar.f17105d = strValueOf;
                    }
                    if (i.this.f17109h == null || i.this.f17109h.equals(BuildConfig.FLAVOR)) {
                        if (!i.this.f17108g.contains(".ts")) {
                            i.this.f17108g = i.this.f17108g + ".ts";
                        }
                        file2 = new File(String.valueOf(i.this.f17105d + "/" + i.this.f17108g));
                        if (file2.exists() && !e.this.f17072n) {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
                            Date date = new Date();
                            i.this.f17109h = simpleDateFormat.format(date) + "_" + i.this.f17108g;
                            file2 = new File(String.valueOf(i.this.f17105d + "/" + i.this.f17109h));
                        }
                    } else {
                        file2 = new File(String.valueOf(i.this.f17105d + "/" + i.this.f17109h));
                    }
                    this.f17120b = new FileOutputStream(file2, true);
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(this.f17120b);
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
                    byte[] bArr = new byte[1024];
                    long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) + ((long) i.this.f17103b);
                    i.this.p = true;
                    i.this.v = false;
                    while (true) {
                        int i3 = bufferedInputStream.read(bArr);
                        if (i3 != -1 && System.currentTimeMillis() / 1000 < jCurrentTimeMillis && !i.this.f17116o) {
                            i iVar3 = i.this;
                            e.this.f17070l = PreferenceManager.getDefaultSharedPreferences(iVar3.f17102a);
                            i iVar4 = i.this;
                            iVar4.v = e.this.f17070l.getBoolean("CANCELLED", false);
                            if (i.this.v) {
                                i.this.v = true;
                                e eVar = e.this;
                                eVar.f17071m = 0;
                                eVar.f17072n = false;
                                SharedPreferences.Editor editorEdit2 = eVar.f17070l.edit();
                                editorEdit2.putBoolean("CANCELLED", true);
                                editorEdit2.apply();
                                break;
                            }
                            e eVar2 = e.this;
                            eVar2.f17071m = 0;
                            eVar2.f17072n = false;
                            bufferedOutputStream.write(bArr, 0, i3);
                        } else {
                            break;
                        }
                    }
                    bufferedOutputStream.close();
                    bufferedInputStream.close();
                    return null;
                } catch (Exception e2) {
                    SharedPreferences.Editor editorEdit3 = e.this.f17070l.edit();
                    editorEdit3.putBoolean("CANCELLED", true);
                    editorEdit3.apply();
                    i.this.v = true;
                    i iVar5 = i.this;
                    e.this.f17072n = true;
                    iVar5.p = false;
                    Log.e("Download Task", "Retrying " + e2.getMessage());
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Void r8) {
                Handler handler;
                Runnable runnableC0229b;
                i iVar;
                String string;
                try {
                    if (this.f17120b != null) {
                        if (i.this.v) {
                            e eVar = e.this;
                            if (eVar.f17072n) {
                                if (eVar.f17071m >= eVar.f17073o) {
                                    e.l0(i.this.f17102a, i.this.f17102a.getResources().getString(R.string.DownloadFailed));
                                    i iVar2 = i.this;
                                    e.this.f17072n = false;
                                    iVar2.q = true;
                                    iVar = i.this;
                                    string = iVar.f17102a.getResources().getString(R.string.failed);
                                } else {
                                    e.this.f17072n = true;
                                    handler = new Handler();
                                    runnableC0229b = new a();
                                    handler.postDelayed(runnableC0229b, 10000L);
                                }
                            }
                        } else {
                            iVar = i.this;
                            string = iVar.f17102a.getResources().getString(R.string.completed);
                        }
                        iVar.C(string);
                    } else {
                        e eVar2 = e.this;
                        if (eVar2.f17072n) {
                            if (eVar2.f17071m >= eVar2.f17073o) {
                                i iVar3 = i.this;
                                e.this.f17072n = false;
                                iVar3.q = true;
                                iVar = i.this;
                                string = iVar.f17102a.getResources().getString(R.string.failed);
                                iVar.C(string);
                            } else {
                                e.this.f17072n = true;
                                handler = new Handler();
                                runnableC0229b = new RunnableC0229b();
                                handler.postDelayed(runnableC0229b, 10000L);
                            }
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    i.this.q = true;
                    i iVar4 = i.this;
                    iVar4.C(iVar4.f17102a.getResources().getString(R.string.failed));
                }
                super.onPostExecute(r8);
            }

            @Override // android.os.AsyncTask
            public void onPreExecute() {
                super.onPreExecute();
                i.this.B();
                i.this.A();
            }
        }

        public i(Activity activity, String str, int i2, String str2, boolean z, String str3) {
            this.f17107f = BuildConfig.FLAVOR;
            this.f17108g = BuildConfig.FLAVOR;
            this.r = true;
            this.f17102a = activity;
            this.f17107f = str;
            int i3 = i2 * 60;
            int i4 = i3 * 1000;
            this.f17104c = i4;
            this.f17106e = i4;
            this.f17103b = i3;
            this.r = z;
            this.f17105d = str3;
            this.f17108g = str2;
            e.this.f17070l = PreferenceManager.getDefaultSharedPreferences(activity);
            new b(this, null).execute(new Void[0]);
        }

        public void A() {
            e.this.f17070l = PreferenceManager.getDefaultSharedPreferences(this.f17102a);
            SharedPreferences.Editor editorEdit = e.this.f17070l.edit();
            editorEdit.putBoolean("CANCELLED", false);
            editorEdit.apply();
            PendingIntent pendingIntentA = NotificationActivity.a(this.f17115n, this.f17102a);
            if (Build.VERSION.SDK_INT >= 26) {
                return;
            }
            this.f17113l.a(R.drawable.stop_icon, "Stop", pendingIntentA);
        }

        public void B() {
            NotificationManager notificationManager;
            int i2;
            Notification notificationC;
            NotificationManager notificationManager2 = this.f17110i;
            if (notificationManager2 != null) {
                notificationManager2.cancelAll();
            }
            NotificationManager notificationManager3 = this.f17111j;
            if (notificationManager3 != null) {
                notificationManager3.cancelAll();
            }
            if (!e.this.f17072n) {
                Context context = this.f17102a;
                Toast.makeText(context, context.getResources().getString(R.string.download_started), 0).show();
            }
            this.f17110i = (NotificationManager) this.f17102a.getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
            j.e eVar = new j.e(this.f17102a);
            this.f17113l = eVar;
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel("ksjadf87", this.f17102a.getResources().getString(R.string.recording_dots), 2);
                this.f17112k = new Notification.Builder(this.f17102a).setContentTitle(this.f17102a.getResources().getString(R.string.live_recording)).setContentText(this.f17102a.getResources().getString(R.string.recording_dots)).setSmallIcon(R.mipmap.ic_launcher).setChannelId("ksjadf87").setProgress(100, 0, true).build();
                this.f17110i.createNotificationChannel(notificationChannel);
                notificationManager = this.f17110i;
                i2 = this.f17115n;
                notificationC = this.f17112k;
            } else {
                eVar.o(this.f17102a.getResources().getString(R.string.live_recording)).y(100, 0, true).n(this.f17102a.getResources().getString(R.string.recording_dots)).A(R.mipmap.ic_launcher);
                notificationManager = this.f17110i;
                i2 = this.f17115n;
                notificationC = this.f17113l.c();
            }
            notificationManager.notify(i2, notificationC);
            CountDownTimer countDownTimer = this.s;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.s = new a(20000L, 1000L).start();
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0058 A[PHI: r1
  0x0058: PHI (r1v13 int) = (r1v8 int), (r1v10 int), (r1v15 int) binds: [B:18:0x00b7, B:13:0x008f, B:8:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void C(java.lang.String r4) {
            /*
                Method dump skipped, instruction units count: 210
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: c.h.a.h.n.e.i.C(java.lang.String):void");
        }
    }

    public static class j implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f17124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Activity f17125c;

        public j(View view, Activity activity) {
            this.f17124b = view;
            this.f17125c = activity;
        }

        public j(View view, CheckAppupdateActivity checkAppupdateActivity) {
            this.f17124b = view;
            this.f17125c = checkAppupdateActivity;
        }

        public j(View view, MultiUserActivity multiUserActivity) {
            this.f17124b = view;
            this.f17125c = multiUserActivity;
        }

        public j(View view, NewDashboardActivity newDashboardActivity) {
            this.f17124b = view;
            this.f17125c = newDashboardActivity;
        }

        public j(View view, RateUsActivity rateUsActivity) {
            this.f17124b = view;
            this.f17125c = rateUsActivity;
        }

        public j(View view, RecordingActivity recordingActivity) {
            this.f17124b = view;
            this.f17125c = recordingActivity;
        }

        public j(View view, VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories) {
            this.f17124b = view;
            this.f17125c = vodActivityNewFlowSubCategories;
        }

        public j(View view, NSTIJKPlayerSkyActivity nSTIJKPlayerSkyActivity) {
            this.f17124b = view;
            this.f17125c = nSTIJKPlayerSkyActivity;
        }

        public final void a(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f17124b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f17124b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            int i2;
            if (this.f17125c != null) {
                if (!z) {
                    if (z) {
                        return;
                    }
                    a(1.0f);
                    b(1.0f);
                    View view2 = this.f17124b;
                    if (view2 != null && view2.getTag() != null && this.f17124b.getTag().equals("1")) {
                        view.setBackgroundResource(R.drawable.black_button_dark);
                    }
                    View view3 = this.f17124b;
                    if (view3 != null && view3.getTag() != null && this.f17124b.getTag().equals("2")) {
                        view.setBackgroundResource(R.drawable.black_button_dark);
                    }
                    View view4 = this.f17124b;
                    if (view4 == null || view4.getTag() == null || !this.f17124b.getTag().equals("3")) {
                        return;
                    }
                    view.setBackgroundResource(R.drawable.black_button_dark);
                    return;
                }
                float f2 = z ? 1.12f : 1.0f;
                View view5 = this.f17124b;
                if (view5 == null || view5.getTag() == null || !this.f17124b.getTag().equals("1")) {
                    View view6 = this.f17124b;
                    if (view6 == null || view6.getTag() == null || !this.f17124b.getTag().equals("2")) {
                        View view7 = this.f17124b;
                        if (view7 == null || view7.getTag() == null || !this.f17124b.getTag().equals("3")) {
                            view.setBackground(this.f17125c.getResources().getDrawable(R.drawable.selector_checkbox));
                            return;
                        } else {
                            a(f2);
                            b(f2);
                            i2 = R.drawable.blue_btn_effect;
                        }
                    } else {
                        a(f2);
                        b(f2);
                        i2 = R.drawable.logout_btn_effect;
                    }
                } else {
                    a(f2);
                    b(f2);
                    i2 = R.drawable.back_btn_effect;
                }
                view.setBackgroundResource(i2);
            }
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public static class k extends AsyncTask<Void, Boolean, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f17126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c.h.a.i.q.f f17127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<XMLTVProgrammePojo> f17128c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c.h.a.k.h.c f17129d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f17130e;

        @SuppressLint({"StaticFieldLeak"})
        public class a extends AsyncTask<String, Integer, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public volatile boolean f17131a = true;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Context f17132b;

            public a(Context context) {
                this.f17132b = null;
                this.f17132b = context;
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean doInBackground(String... strArr) {
                publishProgress(0);
                if (k.this.f17127b != null) {
                    k.this.f17127b.r(k.this.f17128c);
                    k.this.f17128c.clear();
                    k.this.f17127b.v2("epg", "1", k.this.f17130e);
                }
                return Boolean.TRUE;
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Boolean bool) {
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onProgressUpdate(Integer... numArr) {
            }

            @Override // android.os.AsyncTask
            public void onCancelled() {
                this.f17131a = false;
            }

            @Override // android.os.AsyncTask
            public void onPreExecute() {
            }
        }

        public k(int i2, Context context, c.h.a.i.q.f fVar) {
            this.f17130e = "0";
            this.f17130e = String.valueOf(i2);
            this.f17126a = context;
            this.f17127b = fVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            c.h.a.i.q.f fVar;
            if (!this.f17130e.equals("0") && (fVar = this.f17127b) != null) {
                fVar.h2(this.f17130e);
            }
            Log.e("honey", "epg u 1");
            this.f17129d = new c.h.a.k.h.c();
            Log.e("honey", "epg u 2");
            this.f17129d.a(this.f17126a);
            Log.e("honey", "epg u 3");
            this.f17128c = this.f17129d.b();
            Log.e("honey", "epg u 4");
            ArrayList<XMLTVProgrammePojo> arrayList = this.f17128c;
            if (arrayList == null || arrayList.size() <= 0) {
                c.h.a.i.q.f fVar2 = this.f17127b;
                if (fVar2 == null || fVar2.w1(this.f17130e) == 0) {
                    return Boolean.FALSE;
                }
                this.f17127b.v2("epg", "1", this.f17130e);
            } else {
                Log.e("honey", "size u :" + this.f17128c.size());
            }
            return Boolean.TRUE;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            c.h.a.i.q.f fVar;
            String str;
            try {
                if (bool.booleanValue()) {
                    c.h.a.h.n.a.q0 = false;
                    ArrayList<XMLTVProgrammePojo> arrayList = this.f17128c;
                    if (arrayList == null || arrayList.size() <= 0) {
                        return;
                    }
                    try {
                        e.f17068j = new a(this.f17126a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
                        return;
                    } catch (Exception unused) {
                        fVar = this.f17127b;
                        str = "0";
                        fVar.v2("epg", str, this.f17130e);
                    }
                }
                fVar = this.f17127b;
                str = "2";
                fVar.v2("epg", str, this.f17130e);
            } catch (Exception unused2) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int A(String str) {
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    b2 = 0;
                }
                break;
            case 1382:
                if (str.equals("+1")) {
                    b2 = 1;
                }
                break;
            case 1383:
                if (str.equals("+2")) {
                    b2 = 2;
                }
                break;
            case 1384:
                if (str.equals("+3")) {
                    b2 = 3;
                }
                break;
            case 1385:
                if (str.equals("+4")) {
                    b2 = 4;
                }
                break;
            case 1386:
                if (str.equals("+5")) {
                    b2 = 5;
                }
                break;
            case 1387:
                if (str.equals("+6")) {
                    b2 = 6;
                }
                break;
            case 1388:
                if (str.equals("+7")) {
                    b2 = 7;
                }
                break;
            case 1389:
                if (str.equals("+8")) {
                    b2 = 8;
                }
                break;
            case 1390:
                if (str.equals("+9")) {
                    b2 = 9;
                }
                break;
            case 1444:
                if (str.equals("-1")) {
                    b2 = 10;
                }
                break;
            case 1445:
                if (str.equals("-2")) {
                    b2 = 11;
                }
                break;
            case 1446:
                if (str.equals("-3")) {
                    b2 = 12;
                }
                break;
            case 1447:
                if (str.equals("-4")) {
                    b2 = DateTimeFieldType.HALFDAY_OF_DAY;
                }
                break;
            case 1448:
                if (str.equals("-5")) {
                    b2 = DateTimeFieldType.HOUR_OF_HALFDAY;
                }
                break;
            case 1449:
                if (str.equals("-6")) {
                    b2 = DateTimeFieldType.CLOCKHOUR_OF_HALFDAY;
                }
                break;
            case 1450:
                if (str.equals("-7")) {
                    b2 = DateTimeFieldType.CLOCKHOUR_OF_DAY;
                }
                break;
            case 1451:
                if (str.equals("-8")) {
                    b2 = DateTimeFieldType.HOUR_OF_DAY;
                }
                break;
            case 1452:
                if (str.equals("-9")) {
                    b2 = DateTimeFieldType.MINUTE_OF_DAY;
                }
                break;
            case 42890:
                if (str.equals("+10")) {
                    b2 = DateTimeFieldType.MINUTE_OF_HOUR;
                }
                break;
            case 42891:
                if (str.equals("+11")) {
                    b2 = DateTimeFieldType.SECOND_OF_DAY;
                }
                break;
            case 42892:
                if (str.equals("+12")) {
                    b2 = DateTimeFieldType.SECOND_OF_MINUTE;
                }
                break;
            case 44812:
                if (str.equals("-10")) {
                    b2 = DateTimeFieldType.MILLIS_OF_DAY;
                }
                break;
            case 44813:
                if (str.equals("-11")) {
                    b2 = DateTimeFieldType.MILLIS_OF_SECOND;
                }
                break;
            case 44814:
                if (str.equals("-12")) {
                    b2 = 24;
                }
                break;
        }
        switch (b2) {
            case 0:
            default:
                return 12;
            case 1:
                return 13;
            case 2:
                return 14;
            case 3:
                return 15;
            case 4:
                return 16;
            case 5:
                return 17;
            case 6:
                return 18;
            case 7:
                return 19;
            case 8:
                return 20;
            case 9:
                return 21;
            case 10:
                return 11;
            case 11:
                return 10;
            case 12:
                return 9;
            case 13:
                return 8;
            case 14:
                return 7;
            case 15:
                return 6;
            case 16:
                return 5;
            case 17:
                return 4;
            case 18:
                return 3;
            case 19:
                return 22;
            case 20:
                return 23;
            case 21:
                return 24;
            case 22:
                return 2;
            case 23:
                return 1;
            case 24:
                return 0;
        }
    }

    public static File[] B(Context context) {
        File file;
        if (context == null) {
            return null;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("recordingDir", 0);
        if (Build.VERSION.SDK_INT >= 19) {
            file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "IPTVSmarters");
        } else {
            file = new File(Environment.getExternalStorageDirectory() + "/Documents", "IPTVSmarters");
        }
        return new File(sharedPreferences.getString("recordingDir", String.valueOf(file))).listFiles();
    }

    public static String C(Context context) {
        if (context == null) {
            return BuildConfig.FLAVOR;
        }
        try {
            return new SimpleDateFormat(context.getSharedPreferences("timeFormat", 0).getString("timeFormat", c.h.a.h.n.a.m0), Locale.US).format(new Date());
        } catch (Exception unused) {
            return BuildConfig.FLAVOR;
        }
    }

    public static long D(Context context) {
        if (context == null) {
            return 0L;
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("loginPrefs", 0);
            f17060b = sharedPreferences;
            if (sharedPreferences != null) {
                return w(sharedPreferences.getString("selectedEPGShift", c.h.a.h.n.a.k0));
            }
            return 0L;
        } catch (Exception unused) {
            return 0L;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String E(android.content.Context r16, int r17, java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.h.a.h.n.e.E(android.content.Context, int, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String F(android.content.Context r11, int r12, java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.h.a.h.n.e.F(android.content.Context, int, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String G(android.content.Context r11, int r12, java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.h.a.h.n.e.G(android.content.Context, int, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String H(android.content.Context r8) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.h.a.h.n.e.H(android.content.Context):java.lang.String");
    }

    public static void I() {
        try {
            Dialog dialog = f17069k;
            if (dialog == null || !dialog.isShowing()) {
                return;
            }
            f17069k.dismiss();
        } catch (Exception unused) {
        }
    }

    public static void J(Context context) {
        c.h.a.i.q.f fVar = new c.h.a.i.q.f(context);
        c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(context);
        ArrayList<c.h.a.i.q.c> arrayListS0 = fVar.S0();
        String strValueOf = (arrayListS0 == null || arrayListS0.size() <= 0) ? "0" : String.valueOf(arrayListS0.get(0).c());
        if (strValueOf.equals("0")) {
            return;
        }
        c.h.a.i.q.e eVarZ1 = fVar.Z1("epg", strValueOf);
        if (eVarZ1.d() == null && eVarZ1.e() == null && eVarZ1.f() == null) {
            eVarZ1 = new c.h.a.i.q.e();
            eVarZ1.l("epg");
            eVarZ1.j("0");
            eVarZ1.g(BuildConfig.FLAVOR);
            eVarZ1.k(BuildConfig.FLAVOR);
            eVarZ1.i(strValueOf);
            ArrayList<c.h.a.i.q.e> arrayList = new ArrayList<>();
            arrayList.add(0, eVarZ1);
            fVar.b2(arrayList, m.f(context));
        }
        if ((eVarZ1.d() == null || !eVarZ1.d().equals("2")) && (eVarZ1.d() == null || !eVarZ1.d().equals("0"))) {
            if (eVarZ1.d() == null || !eVarZ1.d().equals("1")) {
                if (eVarZ1.d() != null) {
                    eVarZ1.d().equals("3");
                    return;
                }
                return;
            } else {
                long jR = r(new SimpleDateFormat("dd/MM/yyyy", Locale.US), eVarZ1.a(), i());
                if (!h(context) || jR < aVar.h()) {
                    return;
                }
            }
        }
        K(fVar, strValueOf, context);
    }

    public static void K(c.h.a.i.q.f fVar, String str, Context context) {
        if (c.h.a.h.n.a.q0) {
            c.h.a.h.n.a.q0 = false;
        }
        fVar.u2("epg", "3");
        if (Build.VERSION.SDK_INT >= 11) {
            new k(S(str), context, fVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } else {
            new k(S(str), context, fVar).execute(new Void[0]);
        }
    }

    public static boolean L(long j2, long j3, Context context) {
        if (context != null) {
            try {
                long millis = LocalDateTime.now().toDateTime().getMillis() + D(context);
                if (j2 <= millis && j3 >= millis) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static String M(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    public static void N(Context context) {
        if (context != null && c.h.a.h.n.a.f17041e.booleanValue() && m.f(context).equals("m3u")) {
            context.startActivity(new Intent(context, (Class<?>) ImportM3uActivity.class));
        }
    }

    public static void O(Context context) {
        if (context != null) {
            if (!c.h.a.h.n.a.J.booleanValue()) {
                Toast.makeText(context, context.getString(R.string.logged_out), 0).show();
            }
            c.h.a.h.n.a.J = Boolean.FALSE;
            Intent intent = c.h.a.h.n.a.f17040d.booleanValue() ? new Intent(context, (Class<?>) MultiUserActivity.class) : (c.h.a.h.n.a.f17041e.booleanValue() && c.h.a.h.n.a.f17042f.booleanValue()) ? new Intent(context, (Class<?>) RoutingActivity.class) : new Intent(context, (Class<?>) LoginActivity.class);
            SharedPreferences sharedPreferences = context.getSharedPreferences("loginPrefs", 0);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            String string = sharedPreferences.getString("selectedEPGShift", BuildConfig.FLAVOR);
            editorEdit.clear();
            editorEdit.apply();
            editorEdit.putString("selectedEPGShift", string);
            editorEdit.apply();
            SharedPreferences.Editor editorEdit2 = context.getSharedPreferences("sharedprefremberme", 0).edit();
            editorEdit2.clear();
            editorEdit2.apply();
            if (c.h.a.h.n.a.f17041e.booleanValue() && c.h.a.h.n.a.f17042f.booleanValue()) {
                SharedPreferences.Editor editorEdit3 = context.getSharedPreferences("sharedprefremberme", 0).edit();
                editorEdit3.putBoolean("savelogin", false);
                editorEdit3.apply();
                if (m.f(context).equalsIgnoreCase("m3u")) {
                    SharedPreferences.Editor editorEdit4 = context.getSharedPreferences("sharedprefremberme", 0).edit();
                    editorEdit4.clear();
                    editorEdit4.apply();
                }
            }
            if (c.h.a.h.n.a.f17039c.booleanValue() && !(c.h.a.h.n.a.f17041e.booleanValue() && c.h.a.h.n.a.f17042f.booleanValue())) {
                context.startActivity(intent);
            } else {
                context.startActivity(intent);
                ((Activity) context).finish();
            }
        }
    }

    public static String P(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                String hexString = Integer.toHexString(b2 & 255);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return BuildConfig.FLAVOR;
        }
    }

    public static String Q(String str) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").format(new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.US).parse(str));
        } catch (ParseException e2) {
            e2.printStackTrace();
            return BuildConfig.FLAVOR;
        }
    }

    public static int R(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int S(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static void T(Context context, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        f17062d = new c.h.a.k.d.a.a(context);
        Intent intent = new Intent(context, (Class<?>) NSTIJKPlayerEPGActivity.class);
        intent.putExtra("MultiPlayer", "true");
        intent.putExtra("OPENED_STREAM_ID", i2);
        intent.putExtra("STREAM_TYPE", str);
        intent.putExtra("VIDEO_NUM", !str2.equals(BuildConfig.FLAVOR) ? S(str2) : -1);
        intent.putExtra("VIDEO_TITLE", str3);
        intent.putExtra("EPG_CHANNEL_ID", str4);
        intent.putExtra("EPG_CHANNEL_LOGO", str5);
        intent.putExtra("OPENED_CAT_ID", str6);
        intent.putExtra("VIDEO_URL", str7);
        context.startActivity(intent);
    }

    public static void U(Context context, String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Intent intent;
        if (context != null) {
            try {
                String strD = m.d(context);
                if (!m.d(context).equals("default") && !new c.h.a.i.q.d(context).d(strD)) {
                    m.M("default", "default", context);
                }
                f17062d = new c.h.a.k.d.a.a(context);
                String strE = m.e(context);
                if (!strE.equals("default")) {
                    String strE2 = E(context, i2, str6, str8);
                    String strD2 = m.d(context);
                    Intent intent2 = new Intent(context, (Class<?>) PlayExternalPlayerActivity.class);
                    intent2.putExtra("url", strE2);
                    intent2.putExtra("packagename", strE);
                    intent2.putExtra("app_name", strD2);
                    context.startActivity(intent2);
                    return;
                }
                if (f17062d.x() == 3) {
                    f17062d.U(context.getResources().getString(R.string.hardware_decoder));
                    intent = new Intent(context, (Class<?>) HoneyPlayer.class);
                } else {
                    intent = new Intent(context, (Class<?>) HoneyPlayer.class);
                }
                intent.putExtra("OPENED_STREAM_ID", i2);
                intent.putExtra("type", "catch_up");
                intent.putExtra("VIDEO_NUM", S(str2));
                intent.putExtra("VIDEO_TITLE", str3);
                intent.putExtra("STREAM_START_TIME", str6);
                intent.putExtra("STREAM_STOP_TIME", str8);
                context.startActivity(intent);
            } catch (Exception unused) {
            }
        }
    }

    public static void V(Context context, String str, int i2, String str2, String str3, String str4, String str5, List<GetEpisdoeDetailsCallback> list, String str6) {
        String str7;
        String str8;
        Intent intent;
        if (context != null) {
            String strU = m.u(context);
            if (!m.v(context).equals("default") && !new c.h.a.i.q.d(context).d(strU)) {
                m.a0("default", "default", context);
            }
            String strV = m.v(context);
            if (!strV.equals("default")) {
                String strF = m.f(context).equals("m3u") ? str6 : F(context, i2, str3, "series");
                String strU2 = m.u(context);
                Intent intent2 = new Intent(context, (Class<?>) PlayExternalPlayerActivity.class);
                intent2.putExtra("url", strF);
                intent2.putExtra("packagename", strV);
                intent2.putExtra("app_name", strU2);
                context.startActivity(intent2);
                return;
            }
            f17062d = new c.h.a.k.d.a.a(context);
            String str9 = m.f(context).equalsIgnoreCase("m3u") ? "movies_m3u" : "series";
            if (f17062d.x() == 3) {
                f17062d.U(context.getResources().getString(R.string.hardware_decoder));
                intent = new Intent(context, (Class<?>) HoneyPlayer.class);
                intent.putExtra("type", str9);
                intent.putExtra("OPENED_STREAM_ID", i2);
                intent.putExtra("STREAM_TYPE", str2);
                intent.putExtra("VIDEO_NUM", S(str4));
                intent.putExtra("VIDEO_TITLE", str5);
                intent.putExtra("CONTAINER_EXTENSION", str3);
                intent.putExtra("EPISODES", (Serializable) list);
                str7 = "VIDEO_URL";
                str8 = "type";
                intent.putExtra(str7, str6);
            } else {
                str7 = "VIDEO_URL";
                str8 = "type";
                intent = new Intent(context, (Class<?>) HoneyPlayer.class);
            }
            intent.putExtra(str8, str9);
            intent.putExtra("OPENED_STREAM_ID", i2);
            intent.putExtra("STREAM_TYPE", str2);
            intent.putExtra("VIDEO_NUM", S(str4));
            intent.putExtra("VIDEO_TITLE", str5);
            intent.putExtra("CONTAINER_EXTENSION", str3);
            intent.putExtra("EPISODES", (Serializable) list);
            intent.putExtra(str7, str6);
            context.startActivity(intent);
        }
    }

    public static void W(Context context, String str, int i2, String str2, String str3, String str4, String str5, String str6, int i3) {
        if (context != null) {
            String strC = m.C(context);
            if (!m.D(context).equals("default") && !new c.h.a.i.q.d(context).d(strC)) {
                m.i0("default", "default", context);
            }
            String str7 = m.f(context).equalsIgnoreCase("m3u") ? "movies_m3u" : "movies";
            String strC2 = m.C(context);
            String strD = m.D(context);
            if (!strD.equals("default")) {
                if (!m.f(context).equalsIgnoreCase("m3u")) {
                    str6 = F(context, i2, str3, "movie");
                }
                Intent intent = new Intent(context, (Class<?>) PlayExternalPlayerActivity.class);
                intent.putExtra("url", str6);
                intent.putExtra("packagename", strD);
                intent.putExtra("app_name", strC2);
                context.startActivity(intent);
                return;
            }
            c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(context);
            f17062d = aVar;
            Intent intent2 = aVar.x() == 3 ? new Intent(context, (Class<?>) ExoPlayerMoviesSeriesActivity.class) : new Intent(context, (Class<?>) HoneyPlayer.class);
            intent2.putExtra("type", str7);
            intent2.putExtra("OPENED_STREAM_ID", i2);
            intent2.putExtra("STREAM_TYPE", str2);
            intent2.putExtra("STREAM_TOTAL_DURATION", i3);
            intent2.putExtra("VIDEO_NUM", S(str4));
            intent2.putExtra("VIDEO_TITLE", str5);
            intent2.putExtra("CONTAINER_EXTENSION", str3);
            intent2.putExtra("VIDEO_URL", str6);
            context.startActivity(intent2);
        }
    }

    public static void X(Context context, String str, int i2, String str2, int i3, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (context != null) {
            f17062d = new c.h.a.k.d.a.a(context);
            String strL = m.l(context);
            Intent intent = (strL == null || !strL.equalsIgnoreCase("default")) ? new Intent(context, (Class<?>) NSTEXOPlayerSkyActivity.class) : new Intent(context, (Class<?>) NSTIJKPlayerSkyActivity.class);
            intent.putExtra("OPENED_STREAM_ID", i2);
            intent.putExtra("STREAM_TYPE", str2);
            intent.putExtra("VIDEO_NUM", i3);
            intent.putExtra("VIDEO_TITLE", str3);
            intent.putExtra("EPG_CHANNEL_ID", str4);
            intent.putExtra("EPG_CHANNEL_LOGO", str5);
            intent.putExtra("OPENED_CAT_ID", str6);
            intent.putExtra("VIDEO_URL", str7);
            intent.putExtra("OPENED_CAT_NAME", str8);
            context.startActivity(intent);
        }
    }

    public static void Y(Context context, String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Intent intent;
        if (context != null) {
            String strG = m.g(context);
            if (!m.h(context).equals("default") && !new c.h.a.i.q.d(context).d(strG)) {
                m.O("default", "default", context);
            }
            String strH = m.h(context);
            boolean zEquals = strH.equals("default");
            String str9 = BuildConfig.FLAVOR;
            if (zEquals) {
                c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(context);
                f17062d = aVar;
                if (aVar.x() == 3) {
                    f17062d.U(context.getResources().getString(R.string.hardware_decoder));
                    intent = new Intent(context, (Class<?>) NSTIJKPlayerEPGActivity.class);
                } else {
                    intent = new Intent(context, (Class<?>) NSTIJKPlayerEPGActivity.class);
                }
                intent.putExtra("MultiPlayer", "false");
                intent.putExtra("OPENED_STREAM_ID", i2);
                intent.putExtra("STREAM_TYPE", str2);
                intent.putExtra("VIDEO_NUM", str3.equals(BuildConfig.FLAVOR) ? -1 : S(str3));
                intent.putExtra("VIDEO_TITLE", str4);
                intent.putExtra("EPG_CHANNEL_ID", str5);
                intent.putExtra("EPG_CHANNEL_LOGO", str6);
                intent.putExtra("OPENED_CAT_ID", str7);
                intent.putExtra("VIDEO_URL", str8);
                context.startActivity(intent);
                return;
            }
            String string = context.getSharedPreferences("allowedFormat", 0).getString("allowedFormat", BuildConfig.FLAVOR);
            if (string == null || string.isEmpty() || string.equals(BuildConfig.FLAVOR) || !string.equals("default")) {
                if (string != null && !string.isEmpty() && !string.equals(BuildConfig.FLAVOR) && string.equals("ts")) {
                    str9 = ".ts";
                } else if (string != null && !string.isEmpty() && !string.equals(BuildConfig.FLAVOR) && string.equals("m3u8")) {
                    str9 = ".m3u8";
                }
            }
            if (!m.f(context).equalsIgnoreCase("m3u")) {
                str8 = G(context, i2, str9, "live");
            }
            String strG2 = m.g(context);
            Intent intent2 = new Intent(context, (Class<?>) PlayExternalPlayerActivity.class);
            intent2.putExtra("url", str8);
            intent2.putExtra("packagename", strH);
            intent2.putExtra("app_name", strG2);
            context.startActivity(intent2);
        }
    }

    public static o.m Z(Context context) {
        if (context != null) {
            try {
                String lowerCase = context.getSharedPreferences("loginPrefsserverurl", 0).getString(c.h.a.h.n.a.t, BuildConfig.FLAVOR).toLowerCase();
                Log.e("URl from Back", ">>>>>>>>" + lowerCase);
                if (!lowerCase.startsWith("http://") && !lowerCase.startsWith("https://")) {
                    lowerCase = "http://" + lowerCase;
                }
                if (!lowerCase.endsWith("/")) {
                    lowerCase = lowerCase + "/";
                }
                c.h.a.h.n.a.H = lowerCase;
                x.b bVar = new x.b();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                return new m.b().b(lowerCase).f(bVar.c(60L, timeUnit).g(60L, timeUnit).e(60L, timeUnit).d(true).a()).a(o.p.a.a.d()).d();
            } catch (IllegalArgumentException | NullPointerException | Exception unused) {
            }
        }
        return null;
    }

    public static Boolean a(Context context) {
        return Boolean.TRUE;
    }

    public static o.m a0(Context context) {
        if (context != null) {
            try {
                x.b bVar = new x.b();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                return new m.b().b("https://users.iptvsmarters.com/").f(bVar.c(60L, timeUnit).g(60L, timeUnit).e(60L, timeUnit).d(false).a()).a(o.p.a.a.d()).d();
            } catch (IllegalArgumentException | NullPointerException | Exception unused) {
            }
        }
        return null;
    }

    public static void b(Context context) {
        context.startActivity(new Intent(context, (Class<?>) NewDashboardActivity.class));
    }

    public static o.m b0(Context context) {
        if (context != null) {
            try {
                x.b bVar = new x.b();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                return new m.b().b("http://api.themoviedb.org/3/").f(bVar.c(60L, timeUnit).g(60L, timeUnit).e(60L, timeUnit).d(false).a()).a(o.p.a.a.d()).d();
            } catch (IllegalArgumentException | NullPointerException | Exception unused) {
            }
        }
        return null;
    }

    public static o.m c0(Context context) {
        if (context != null) {
            try {
                x.b bVar = new x.b();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                return new m.b().b("http://rokuapi.whmcssmarters.com").f(bVar.c(60L, timeUnit).g(60L, timeUnit).e(60L, timeUnit).d(false).a()).a(o.p.a.a.d()).d();
            } catch (IllegalArgumentException | NullPointerException | Exception unused) {
            }
        }
        return null;
    }

    public static void d0(Context context) {
        if (context != null) {
            try {
                if (new c.h.a.k.d.a.a(context).A().equals(c.h.a.h.n.a.s0) || a(context).booleanValue()) {
                    return;
                }
                InterstitialAd interstitialAd = new InterstitialAd(context, "269613774129228_269615270795745");
                interstitialAd.loadAd();
                new Handler().postDelayed(new f(interstitialAd), 2000L);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean f(String str, Context context) {
        if (context != null) {
            try {
                context.getPackageManager().getPackageInfo(str, 1);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    public static void f0(Context context, String str) {
        String str2 = "en";
        if (!str.equals("English")) {
            if (str.equals("Polish")) {
                str2 = "pl";
            } else if (str.equals("Portuguese")) {
                str2 = "pt";
            } else if (str.equals("Turkish")) {
                str2 = "tr";
            } else if (str.equals("Croatian")) {
                str2 = "hr";
            } else if (str.equals("Spanish")) {
                str2 = "es";
            } else if (str.equals("Arabic")) {
                str2 = "ar";
            } else if (str.equals("French")) {
                str2 = "fr";
            } else if (str.equals("German")) {
                str2 = "de";
            } else if (str.equals("Italian")) {
                str2 = "it";
            } else if (str.equals("Romanian")) {
                str2 = "ro";
            } else if (str.equals("Hungary")) {
                str2 = "hu";
            } else if (str.equals("Albanian")) {
                str2 = "sq";
            } else if (str.equals("Korean")) {
                str2 = "ko";
            } else if (str.equals("Hebrew")) {
                str2 = "he";
            } else if (str.equals("Ukrainian")) {
                str2 = "uk";
            } else if (str.equals("Malay")) {
                str2 = "ms";
            } else if (str.equals("Dutch")) {
                str2 = "nl";
            } else if (str.equals("Indonesian")) {
                str2 = "in";
            } else if (str.equals("Swedish")) {
                str2 = "sv";
            }
        }
        if (context != null) {
            Resources resources = context.getResources();
            Resources resources2 = context.getApplicationContext().getResources();
            Locale locale = new Locale(str2);
            Locale.setDefault(locale);
            Configuration configuration = new Configuration();
            configuration.locale = locale;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            resources2.updateConfiguration(configuration, resources.getDisplayMetrics());
            Configuration configuration2 = resources.getConfiguration();
            configuration2.setLocale(locale);
            context.getApplicationContext().createConfigurationContext(configuration2);
            context.createConfigurationContext(configuration2);
        }
    }

    public static void g(Context context) {
        if (context != null) {
            String string = context.getSharedPreferences("selected_language", 0).getString("selected_language", BuildConfig.FLAVOR);
            if (string.equals(BuildConfig.FLAVOR)) {
                return;
            }
            f0(context, string);
        }
    }

    public static boolean h(Context context) {
        return context.getSharedPreferences("automation_epg", 0).getString("automation_epg", BuildConfig.FLAVOR).equals("checked");
    }

    public static String i() {
        return Q(Calendar.getInstance().getTime().toString());
    }

    public static void i0(Activity activity) {
        try {
            Dialog dialog = new Dialog(activity);
            f17069k = dialog;
            dialog.setContentView(R.layout.spinkitanimation);
            f17069k.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            f17069k.getWindow().setGravity(17);
            f17069k.setCancelable(false);
            f17069k.show();
        } catch (Exception unused) {
        }
    }

    public static void j(Context context) {
        try {
            k(context.getCacheDir());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void j0(Context context) {
        try {
            Dialog dialog = new Dialog(context);
            f17069k = dialog;
            dialog.setContentView(R.layout.spinkitanimation);
            f17069k.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            f17069k.getWindow().setGravity(17);
            f17069k.setCancelable(false);
            f17069k.show();
        } catch (Exception unused) {
        }
    }

    public static boolean k(File file) {
        if (file == null || !file.isDirectory()) {
            if (file == null || !file.isFile()) {
                return false;
            }
            return file.delete();
        }
        for (String str : file.list()) {
            if (!k(new File(file, str))) {
                return false;
            }
        }
        return file.delete();
    }

    public static void l(File file) {
        try {
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    l(file2);
                }
            }
            file.delete();
        } catch (Exception unused) {
        }
    }

    public static void l0(Context context, String str) {
        if (context == null || str == BuildConfig.FLAVOR || str.isEmpty()) {
            return;
        }
        Toast.makeText(context, str, 0).show();
    }

    public static long m(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public static void m0(Context context, String str) {
        if (context == null || str == BuildConfig.FLAVOR || str.isEmpty()) {
            return;
        }
        Toast.makeText(context, str, 1).show();
    }

    public static long n(String str, Context context) {
        if (str == null) {
            return 0L;
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(new c.h.a.k.d.a.a(context).C()));
            return simpleDateFormat.parse(str.substring(0, 14)).getTime();
        } catch (NumberFormatException e2) {
            Log.e("XMLTVReader", "Exception", e2);
            return 0L;
        } catch (Exception e3) {
            Log.e("XMLTVReader", "Exception", e3);
            return 0L;
        }
    }

    public static String n0(long j2) {
        try {
            TimeUnit timeUnit = TimeUnit.DAYS;
            int i2 = 0;
            List listAsList = Arrays.asList(Long.valueOf(timeUnit.toMillis(365L)), Long.valueOf(timeUnit.toMillis(30L)), Long.valueOf(timeUnit.toMillis(1L)), Long.valueOf(TimeUnit.HOURS.toMillis(1L)), Long.valueOf(TimeUnit.MINUTES.toMillis(1L)), Long.valueOf(TimeUnit.SECONDS.toMillis(1L)));
            List listAsList2 = Arrays.asList("year", "month", "day", "hour", "min", "sec");
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                if (i2 >= listAsList.size()) {
                    break;
                }
                long jLongValue = j2 / ((Long) listAsList.get(i2)).longValue();
                if (jLongValue > 0) {
                    stringBuffer.append(jLongValue);
                    stringBuffer.append(" ");
                    stringBuffer.append((String) listAsList2.get(i2));
                    stringBuffer.append(jLongValue != 1 ? "s" : BuildConfig.FLAVOR);
                    stringBuffer.append(" ago");
                } else {
                    i2++;
                }
            }
            return BuildConfig.FLAVOR.equals(stringBuffer.toString()) ? "0 sec ago" : stringBuffer.toString();
        } catch (Exception unused) {
            return "0 sec ago";
        }
    }

    public static void o(Context context) {
        String strO0 = o0(c.h.a.k.d.c.a.a.a());
        String packageName = context.getApplicationContext().getPackageName();
        String strM = M(context);
        String strO02 = o0(c.h.a.k.d.c.a.e.d());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.US);
        if (m(simpleDateFormat, simpleDateFormat.format(new Date(c.h.a.k.d.c.a.f.a(context))), simpleDateFormat.format(new Date())) < c.h.a.k.d.c.a.d.p() || strO0 == null || strO02 == null) {
            return;
        }
        if (strM.equals(strO0) && packageName.equals(strO02)) {
            return;
        }
        Toast.makeText(context, o0(c.h.a.k.d.c.a.h.a() + c.h.a.k.d.c.a.h.i()) + o0(c.h.a.k.d.c.a.i.i() + c.h.a.k.d.c.a.i.h()) + o0(c.h.a.k.d.c.a.g.f() + c.h.a.k.d.c.a.g.h()), 1).show();
        ((Activity) context).finishAffinity();
    }

    public static String o0(String str) {
        return Build.VERSION.SDK_INT >= 19 ? new String(Base64.decode(str, 0), StandardCharsets.UTF_8) : BuildConfig.FLAVOR;
    }

    public static o.m p(Context context) {
        x.b bVar = new x.b();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return new m.b().b("http://51.158.145.183/").f(bVar.c(60L, timeUnit).g(60L, timeUnit).e(60L, timeUnit).d(false).a()).a(o.p.a.a.d()).d();
    }

    public static String q(String str) {
        try {
            return new SimpleDateFormat(" MMMM dd,yyyy").format(new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.US).parse(str));
        } catch (Exception e2) {
            e2.printStackTrace();
            return BuildConfig.FLAVOR;
        }
    }

    public static long r(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public static String s() {
        return Build.MANUFACTURER + " " + Build.PRODUCT;
    }

    public static String t(String str) {
        return str.replaceAll(" ", "%20");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int u(String str) {
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case 3121:
                if (str.equals("ar")) {
                    b2 = 0;
                }
                break;
            case 3201:
                if (str.equals("de")) {
                    b2 = 1;
                }
                break;
            case 3241:
                if (str.equals("en")) {
                    b2 = 2;
                }
                break;
            case 3246:
                if (str.equals("es")) {
                    b2 = 3;
                }
                break;
            case 3276:
                if (str.equals("fr")) {
                    b2 = 4;
                }
                break;
            case 3325:
                if (str.equals("he")) {
                    b2 = 5;
                }
                break;
            case 3338:
                if (str.equals("hr")) {
                    b2 = 6;
                }
                break;
            case 3341:
                if (str.equals("hu")) {
                    b2 = 7;
                }
                break;
            case 3365:
                if (str.equals("in")) {
                    b2 = 8;
                }
                break;
            case 3371:
                if (str.equals("it")) {
                    b2 = 9;
                }
                break;
            case 3428:
                if (str.equals("ko")) {
                    b2 = 10;
                }
                break;
            case 3494:
                if (str.equals("ms")) {
                    b2 = 11;
                }
                break;
            case 3518:
                if (str.equals("nl")) {
                    b2 = 12;
                }
                break;
            case 3580:
                if (str.equals("pl")) {
                    b2 = DateTimeFieldType.HALFDAY_OF_DAY;
                }
                break;
            case 3588:
                if (str.equals("pt")) {
                    b2 = DateTimeFieldType.HOUR_OF_HALFDAY;
                }
                break;
            case 3645:
                if (str.equals("ro")) {
                    b2 = DateTimeFieldType.CLOCKHOUR_OF_HALFDAY;
                }
                break;
            case 3678:
                if (str.equals("sq")) {
                    b2 = DateTimeFieldType.CLOCKHOUR_OF_DAY;
                }
                break;
            case 3683:
                if (str.equals("sv")) {
                    b2 = DateTimeFieldType.HOUR_OF_DAY;
                }
                break;
            case 3710:
                if (str.equals("tr")) {
                    b2 = DateTimeFieldType.MINUTE_OF_DAY;
                }
                break;
            case 3734:
                if (str.equals("uk")) {
                    b2 = DateTimeFieldType.MINUTE_OF_HOUR;
                }
                break;
        }
        switch (b2) {
            case 0:
                return 6;
            case 1:
                return 8;
            case 2:
            default:
                return 0;
            case 3:
                return 5;
            case 4:
                return 7;
            case 5:
                return 14;
            case 6:
                return 4;
            case 7:
                return 11;
            case 8:
                return 18;
            case 9:
                return 9;
            case 10:
                return 13;
            case 11:
                return 16;
            case 12:
                return 17;
            case 13:
                return 1;
            case 14:
                return 2;
            case 15:
                return 10;
            case 16:
                return 12;
            case 17:
                return 19;
            case 18:
                return 3;
            case 19:
                return 15;
        }
    }

    @SuppressLint({"HardwareIds"})
    public static String v(Context context) {
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (string != null && !string.equals(BuildConfig.FLAVOR)) {
                return string;
            }
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    if (hardwareAddress == null) {
                        try {
                            return ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getMacAddress();
                        } catch (Exception unused) {
                            return BuildConfig.FLAVOR;
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    for (byte b2 : hardwareAddress) {
                        sb.append(String.format("%02X:", Byte.valueOf(b2)));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    return sb.toString();
                }
            }
        } catch (Exception unused2) {
        }
        return BuildConfig.FLAVOR;
    }

    public static int w(String str) {
        int iS;
        int i2 = 0;
        if (str == null) {
            return 0;
        }
        try {
            if (str.isEmpty()) {
                return 0;
            }
            if (str.contains("+")) {
                iS = S(str.split("\\+")[1]);
            } else {
                if (!str.contains("-")) {
                    return 0;
                }
                iS = -S(str.split("\\-")[1]);
            }
            i2 = iS * 60 * 60 * 1000;
            return i2;
        } catch (Exception unused) {
            return i2;
        }
    }

    public static String x(String str, Context context) {
        try {
            String string = context.getSharedPreferences("timeFormat", 0).getString("timeFormat", c.h.a.h.n.a.m0);
            c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(context);
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(string, locale);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(aVar.C()));
            String str2 = simpleDateFormat2.format(new Date(Long.parseLong(String.valueOf(Long.valueOf(simpleDateFormat.parse(str).getTime())))));
            Log.e("TimeZone", TimeZone.getDefault().getID());
            return str2;
        } catch (Exception unused) {
            return "00-00-0000 00:00";
        }
    }

    public static int y(Context context) {
        return (int) ((r1.widthPixels / context.getResources().getDisplayMetrics().density) / 180.0f);
    }

    public static int z(long j2, long j3, Context context) {
        if (context != null) {
            try {
                long millis = LocalDateTime.now().toDateTime().getMillis() + D(context);
                if (j2 < j3 && millis < j3) {
                    if (millis <= j2) {
                        return 100;
                    }
                    return (int) (((j3 - millis) * 100) / (j3 - j2));
                }
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    @SuppressLint({"DefaultLocale"})
    public String e0(int i2) {
        return String.format("%02d:%02d:%02d", Integer.valueOf(i2 / 3600), Integer.valueOf((i2 % 3600) / 60), Integer.valueOf(i2 % 60));
    }

    public void g0(RecordingActivity recordingActivity, File file, RecordingAdapter recordingAdapter, ArrayList<File> arrayList, TextView textView) {
        if (recordingActivity != null) {
            RelativeLayout relativeLayout = (RelativeLayout) recordingActivity.findViewById(R.id.rl_password_verification);
            LayoutInflater layoutInflater = (LayoutInflater) recordingActivity.getSystemService("layout_inflater");
            c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(recordingActivity);
            f17062d = aVar;
            View viewInflate = layoutInflater.inflate(aVar.A().equals(c.h.a.h.n.a.s0) ? R.layout.delete_recording_popup_tv : R.layout.delete_recording_popup, relativeLayout);
            PopupWindow popupWindow = new PopupWindow(recordingActivity);
            f17059a = popupWindow;
            popupWindow.setContentView(viewInflate);
            f17059a.setWidth(-1);
            f17059a.setHeight(-1);
            f17059a.setFocusable(true);
            f17059a.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(R.id.bt_start_recording);
            Button button2 = (Button) viewInflate.findViewById(R.id.bt_close);
            if (button != null) {
                button.setOnFocusChangeListener(new j((View) button, recordingActivity));
                button.requestFocus();
                button.requestFocusFromTouch();
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new j((View) button2, recordingActivity));
            }
            button2.setOnClickListener(new g());
            if (button != null) {
                button.setOnClickListener(new h(file, recordingActivity, arrayList, recordingAdapter, textView));
            }
        }
    }

    public void h0(Activity activity) {
        if (activity != null) {
            RelativeLayout relativeLayout = (RelativeLayout) activity.findViewById(R.id.rl_password_verification);
            LayoutInflater layoutInflater = (LayoutInflater) activity.getSystemService("layout_inflater");
            c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(activity);
            f17062d = aVar;
            View viewInflate = layoutInflater.inflate(aVar.A().equals(c.h.a.h.n.a.s0) ? R.layout.download_running_popup_tv : R.layout.download_running_popup, relativeLayout);
            PopupWindow popupWindow = new PopupWindow(activity);
            f17059a = popupWindow;
            popupWindow.setContentView(viewInflate);
            f17059a.setWidth(-1);
            f17059a.setHeight(-1);
            f17059a.setFocusable(true);
            f17059a.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(R.id.bt_start_recording);
            Button button2 = (Button) viewInflate.findViewById(R.id.bt_close);
            if (button != null) {
                button.setOnFocusChangeListener(new j(button, activity));
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new j(button2, activity));
            }
            button2.setOnClickListener(new a());
            if (button != null) {
                button.setOnClickListener(new b(activity));
            }
        }
    }

    public void k0(Activity activity, String str, String str2, String str3, int i2, String str4) {
        String str5;
        String str6;
        File file;
        View view;
        File file2;
        EditText editText;
        if (activity != null) {
            RelativeLayout relativeLayout = (RelativeLayout) activity.findViewById(R.id.rl_password_verification);
            LayoutInflater layoutInflater = (LayoutInflater) activity.getSystemService("layout_inflater");
            c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(activity);
            f17062d = aVar;
            View viewInflate = layoutInflater.inflate(aVar.A().equals(c.h.a.h.n.a.s0) ? R.layout.recording_popup_tv : R.layout.recording_popup, relativeLayout);
            PopupWindow popupWindow = new PopupWindow(activity);
            f17059a = popupWindow;
            popupWindow.setContentView(viewInflate);
            f17059a.setWidth(-1);
            f17059a.setHeight(-1);
            f17059a.setFocusable(true);
            Button button = (Button) viewInflate.findViewById(R.id.bt_start_recording);
            Button button2 = (Button) viewInflate.findViewById(R.id.bt_close);
            EditText editText2 = (EditText) viewInflate.findViewById(R.id.et_file_name);
            EditText editText3 = (EditText) viewInflate.findViewById(R.id.et_duration);
            Button button3 = (Button) viewInflate.findViewById(R.id.bt_browse);
            EditText editText4 = (EditText) viewInflate.findViewById(R.id.et_browse);
            if (button != null) {
                button.setOnFocusChangeListener(new j(button, activity));
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new j(button2, activity));
            }
            if (button3 != null) {
                button3.setOnFocusChangeListener(new j(button3, activity));
            }
            String str7 = str + ".ts";
            if (c.h.a.i.q.m.f(activity).equals("m3u")) {
                str6 = str4;
            } else {
                if (str2.equals(BuildConfig.FLAVOR)) {
                    str5 = str3 + i2;
                } else {
                    str5 = str3 + i2 + ".ts";
                }
                str6 = str5;
            }
            editText2.setText(str7);
            editText2.requestFocus();
            editText4.setEnabled(false);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 19) {
                file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "IPTVSmarters");
                view = viewInflate;
            } else {
                StringBuilder sb = new StringBuilder();
                view = viewInflate;
                sb.append(Environment.getExternalStorageDirectory());
                sb.append("/");
                sb.append("Documents");
                file = new File(sb.toString(), "IPTVSmarters");
            }
            if (!file.exists()) {
                file.mkdirs();
            }
            SharedPreferences sharedPreferences = activity.getSharedPreferences("recordingDir", 0);
            if (i3 >= 19) {
                file2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "IPTVSmarters");
                editText = editText2;
            } else {
                StringBuilder sb2 = new StringBuilder();
                editText = editText2;
                sb2.append(Environment.getExternalStorageDirectory());
                sb2.append("/");
                sb2.append("Documents");
                file2 = new File(sb2.toString(), "IPTVSmarters");
            }
            editText4.setText(sharedPreferences.getString("recordingDir", String.valueOf(file2)));
            button2.setOnClickListener(new c());
            button3.setOnClickListener(new d(activity, editText4, sharedPreferences));
            if (button != null) {
                button.setOnClickListener(new ViewOnClickListenerC0227e(editText3, activity, str6, editText, editText4));
            }
            f17059a.showAtLocation(view, 17, 0, 0);
        }
    }

    public void p0(Context context, String str) {
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("downloadStatus", 0);
            f17061c = sharedPreferences;
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("downloadStatus", str);
            editorEdit.apply();
        }
    }
}
