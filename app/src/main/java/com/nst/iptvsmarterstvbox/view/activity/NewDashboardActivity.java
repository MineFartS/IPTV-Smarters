package minefarts.iptvsmarters.view.activity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import c.h.a.h.n.e;
import com.amazonaws.services.s3.internal.Constants;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.model.callback.BillingAddOrderCallback;
import minefarts.iptvsmarters.model.callback.BillingCheckGPACallback;
import minefarts.iptvsmarters.model.callback.BillingGetDevicesCallback;
import minefarts.iptvsmarters.model.callback.BillingIsPurchasedCallback;
import minefarts.iptvsmarters.model.callback.BillingLoginClientCallback;
import minefarts.iptvsmarters.model.callback.BillingUpdateDevicesCallback;
import minefarts.iptvsmarters.model.callback.GetEpisdoeDetailsCallback;
import minefarts.iptvsmarters.model.callback.GetSeriesStreamCallback;
import minefarts.iptvsmarters.model.callback.GetSeriesStreamCategoriesCallback;
import minefarts.iptvsmarters.model.callback.LiveStreamCategoriesCallback;
import minefarts.iptvsmarters.model.callback.LiveStreamsCallback;
import minefarts.iptvsmarters.model.callback.LoginCallback;
import minefarts.iptvsmarters.model.callback.RegisterClientCallback;
import minefarts.iptvsmarters.model.callback.SeriesDBModel;
import minefarts.iptvsmarters.model.callback.VodCategoriesCallback;
import minefarts.iptvsmarters.model.callback.VodStreamsCallback;
import d.a.a.d.i;
import d.a.a.d.z;
import de.blinkt.openvpn.LaunchVPN;
import de.blinkt.openvpn.core.OpenVPNService;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class NewDashboardActivity extends a.b.k.c implements View.OnClickListener, c.h.a.k.f.f, c.h.a.k.f.h, c.h.a.k.f.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static PopupWindow f25904d;
    public c.h.a.j.d A;
    public String B;
    public String C;
    public ProgressDialog H;
    public String J;
    public String K;
    public int L;
    public c.h.a.j.b M;
    public c.h.a.i.q.k R;
    public c.h.a.i.q.l S;

    @BindView
    public ImageView account_info;

    @BindView
    public LinearLayout catch_up;

    @BindView
    public ImageView check_VPN_Status;

    @BindView
    public TextView date;

    @BindView
    public LinearLayout epg;

    @BindView
    public TextView epgTV;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SharedPreferences f25906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SharedPreferences.Editor f25907g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c.h.a.i.q.f f25908h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SharedPreferences f25909i;

    @BindView
    public ImageView ivSwitchUser;

    @BindView
    public ImageView iv_arrow;

    @BindView
    public ImageView iv_catch_up;

    @BindView
    public ImageView iv_download_icon_live;

    @BindView
    public ImageView iv_download_icon_movies;

    @BindView
    public ImageView iv_download_icon_series;

    @BindView
    public ImageView iv_notification;

    @BindView
    public ImageView iv_premium_or_account;

    @BindView
    public ImageView iv_radio;

    @BindView
    public LinearLayout linearLayoutLoggedinUser;

    @BindView
    public LinearLayout live_tv;

    @BindView
    public LinearLayout llMultiscreen;

    @BindView
    public LinearLayout llRecording;

    @BindView
    public LinearLayout ll_billing;

    @BindView
    public LinearLayout ll_download_live;

    @BindView
    public LinearLayout ll_download_movies;

    @BindView
    public LinearLayout ll_download_series;

    @BindView
    public LinearLayout ll_last_updated_live;

    @BindView
    public LinearLayout ll_last_updated_movies;

    @BindView
    public LinearLayout ll_last_updated_series;

    @BindView
    public LinearLayout ll_purchase_add_free_version;

    @BindView
    public LinearLayout ll_search;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SharedPreferences f25914n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f25915o;

    @BindView
    public LinearLayout on_demand;
    public Button p;

    @BindView
    public ProgressBar pb_downloading_live;

    @BindView
    public ProgressBar pb_downloading_movies;

    @BindView
    public ProgressBar pb_downloading_series;

    @BindView
    public ProgressBar progressLive;

    @BindView
    public ProgressBar progressMovies;

    @BindView
    public ProgressBar progressSeries;

    @BindView
    public ProgressBar progress_catchup;

    @BindView
    public ProgressBar progress_epg;

    @BindView
    public ProgressBar progress_multiscreen;
    public Button q;

    @BindView
    public ImageView recordingsIV;
    public AlertDialog s;

    @BindView
    public LinearLayout settings;

    @BindView
    public ImageView settingsIV;
    public c.h.a.i.q.a t;

    @BindView
    public TextView time;

    @BindView
    public TextView tvAccountinfoButton;

    @BindView
    public TextView tvExpiryDate;

    @BindView
    public TextView tvLoggedinUser;

    @BindView
    public TextView tvRecordingsButton;

    @BindView
    public TextView tvSettingsButton;

    @BindView
    public TextView tvSwitchUserButton;

    @BindView
    public TextView tv_billing_subscription;

    @BindView
    public TextView tv_catch_up;

    @BindView
    public TextView tv_check_vpn_button;

    @BindView
    public TextView tv_download_text_live;

    @BindView
    public TextView tv_download_text_movies;

    @BindView
    public TextView tv_download_text_series;

    @BindView
    public TextView tv_last_updated_live;

    @BindView
    public TextView tv_last_updated_movies;

    @BindView
    public TextView tv_last_updated_series;

    @BindView
    public TextView tv_notification;

    @BindView
    public TextView tv_purchase;

    @BindView
    public TextView tv_radio;
    public String u;
    public c.h.a.i.q.g v;
    public c.h.a.j.c w;
    public ArrayList<c.h.a.l.e.a> x;
    public c.h.a.l.c.a y;
    public c.h.a.k.d.a.a z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f25905e = this;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f25910j = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f25911k = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f25912l = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.h.a.i.q.b f25913m = new c.h.a.i.q.b();
    public String r = BuildConfig.FLAVOR;
    public boolean D = true;
    public boolean E = false;
    public boolean F = false;
    public boolean G = false;
    public long I = 0;
    public Thread N = null;
    public boolean O = false;
    public boolean P = false;
    public boolean Q = false;
    public String T = BuildConfig.FLAVOR;
    public String U = BuildConfig.FLAVOR;
    public String V = BuildConfig.FLAVOR;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + NewDashboardActivity.this.getApplicationContext().getPackageName()));
                c.h.a.i.q.m.W(true, NewDashboardActivity.this.f25905e);
                NewDashboardActivity.this.startActivity(intent);
            } catch (Exception unused) {
                Toast.makeText(NewDashboardActivity.this.f25905e, NewDashboardActivity.this.getResources().getString(R.string.device_not_supported), 0).show();
            }
            NewDashboardActivity.this.s.dismiss();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.i.q.m.V(0, NewDashboardActivity.this.f25905e);
            NewDashboardActivity.this.s.dismiss();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!z.k()) {
                NewDashboardActivity.this.z0();
                return;
            }
            NewDashboardActivity.this.g1();
            NewDashboardActivity newDashboardActivity = NewDashboardActivity.this;
            newDashboardActivity.check_VPN_Status.setImageDrawable(newDashboardActivity.getResources().getDrawable(R.drawable.dis_con));
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class d extends AsyncTask<String, Integer, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f25919a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NewDashboardActivity.this.A.c(NewDashboardActivity.this.B, NewDashboardActivity.this.C);
            }
        }

        public d(Context context, List list) {
            this.f25919a = list;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            if (NewDashboardActivity.this.f25908h != null) {
                NewDashboardActivity.this.f25908h.i2();
            }
            publishProgress(0);
            return NewDashboardActivity.this.f25908h != null ? Boolean.valueOf(NewDashboardActivity.this.f25908h.s(this.f25919a)) : Boolean.FALSE;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            if (NewDashboardActivity.this.f25905e == null || !bool.booleanValue()) {
                NewDashboardActivity.this.u1();
                return;
            }
            if (NewDashboardActivity.this.B == null || NewDashboardActivity.this.B.isEmpty() || NewDashboardActivity.this.C == null || NewDashboardActivity.this.C.isEmpty()) {
                return;
            }
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(NewDashboardActivity.this.progressLive, "progress", 100, 50);
            objectAnimatorOfInt.setDuration(500L);
            objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
            objectAnimatorOfInt.start();
            new Handler().postDelayed(new a(), 500L);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class e extends AsyncTask<String, Integer, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f25922a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (NewDashboardActivity.this.ll_download_live.isFocused()) {
                    NewDashboardActivity.this.live_tv.requestFocus();
                }
                NewDashboardActivity.this.ll_download_live.setVisibility(8);
                NewDashboardActivity.this.progressLive.setVisibility(8);
                NewDashboardActivity.this.progress_epg.setVisibility(8);
                NewDashboardActivity.this.progress_multiscreen.setVisibility(8);
                NewDashboardActivity.this.progress_catchup.setVisibility(8);
                NewDashboardActivity.this.ll_last_updated_live.setVisibility(0);
                NewDashboardActivity.this.tv_last_updated_live.setText(NewDashboardActivity.this.f25905e.getResources().getString(R.string.last_updated) + " " + c.h.a.h.n.e.n0(1000L));
                NewDashboardActivity.this.n1();
                if (NewDashboardActivity.this.P) {
                    NewDashboardActivity.this.P = false;
                    NewDashboardActivity newDashboardActivity = NewDashboardActivity.this;
                    newDashboardActivity.r1(newDashboardActivity.f25905e.getResources().getString(R.string.updating));
                } else if (NewDashboardActivity.this.Q) {
                    NewDashboardActivity.this.Q = false;
                    NewDashboardActivity newDashboardActivity2 = NewDashboardActivity.this;
                    newDashboardActivity2.s1(newDashboardActivity2.f25905e.getResources().getString(R.string.updating));
                }
            }
        }

        public e(Context context, List list) {
            this.f25922a = list;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            ArrayList<c.h.a.i.b> arrayListR;
            boolean z;
            if (NewDashboardActivity.this.f25908h != null) {
                NewDashboardActivity.this.f25908h.j2();
            }
            publishProgress(0);
            if (NewDashboardActivity.this.f25908h == null) {
                return Boolean.FALSE;
            }
            try {
                if (NewDashboardActivity.this.f25908h.i(this.f25922a)) {
                    ArrayList arrayList = new ArrayList();
                    if (NewDashboardActivity.this.t != null && (arrayListR = NewDashboardActivity.this.t.r("live")) != null && arrayListR.size() > 0) {
                        ArrayList<c.h.a.i.f> arrayListT0 = NewDashboardActivity.this.f25908h.T0("live");
                        for (int i2 = 0; i2 < arrayListR.size(); i2++) {
                            int iE = arrayListR.get(i2).e();
                            if (arrayListT0 != null && arrayListT0.size() > 0) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= arrayListT0.size()) {
                                        z = false;
                                        break;
                                    }
                                    if (arrayListT0.get(i3).Y().equals(String.valueOf(iE))) {
                                        z = true;
                                        break;
                                    }
                                    i3++;
                                }
                                if (!z) {
                                    arrayList.add(String.valueOf(iE));
                                }
                            }
                        }
                    }
                    NewDashboardActivity.this.f25908h.D0();
                    if (arrayList.size() > 0 && NewDashboardActivity.this.t != null) {
                        NewDashboardActivity.this.t.n(TextUtils.join(",", arrayList));
                    }
                }
            } catch (Exception unused) {
            }
            return Boolean.TRUE;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            if (NewDashboardActivity.this.f25905e == null || !bool.booleanValue()) {
                NewDashboardActivity.this.u1();
                return;
            }
            NewDashboardActivity.this.E = false;
            if (NewDashboardActivity.this.f25908h != null) {
                NewDashboardActivity.this.f25908h.u2("live", "1");
            }
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(NewDashboardActivity.this.progressLive, "progress", 50, 0);
            objectAnimatorOfInt.setDuration(1000L);
            objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
            objectAnimatorOfInt.start();
            new Handler(Looper.getMainLooper()).postDelayed(new a(), 1000L);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class f extends AsyncTask<String, Integer, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f25925a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (NewDashboardActivity.this.ll_download_series.isFocused()) {
                    NewDashboardActivity.this.catch_up.requestFocus();
                }
                NewDashboardActivity.this.ll_download_series.setVisibility(8);
                NewDashboardActivity.this.progressSeries.setVisibility(8);
                NewDashboardActivity.this.ll_last_updated_series.setVisibility(0);
                NewDashboardActivity.this.tv_last_updated_series.setText(NewDashboardActivity.this.f25905e.getResources().getString(R.string.last_updated) + " " + c.h.a.h.n.e.n0(1000L));
                NewDashboardActivity.this.n1();
            }
        }

        public f(Context context, List list) {
            this.f25925a = list;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            ArrayList<GetEpisdoeDetailsCallback> arrayListO;
            boolean z;
            ArrayList<c.h.a.i.b> arrayListR;
            boolean z2;
            if (NewDashboardActivity.this.f25908h != null) {
                NewDashboardActivity.this.f25908h.m2();
            }
            publishProgress(0);
            if (NewDashboardActivity.this.f25908h == null) {
                return Boolean.FALSE;
            }
            try {
                if (NewDashboardActivity.this.f25908h.n((ArrayList) this.f25925a)) {
                    ArrayList arrayList = new ArrayList();
                    if (NewDashboardActivity.this.t != null && (arrayListR = NewDashboardActivity.this.t.r("series")) != null && arrayListR.size() > 0) {
                        ArrayList<SeriesDBModel> arrayListK1 = NewDashboardActivity.this.f25908h.k1();
                        for (int i2 = 0; i2 < arrayListR.size(); i2++) {
                            int iE = arrayListR.get(i2).e();
                            if (arrayListK1 != null && arrayListK1.size() > 0) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= arrayListK1.size()) {
                                        z2 = false;
                                        break;
                                    }
                                    if (arrayListK1.get(i3).r() == iE) {
                                        z2 = true;
                                        break;
                                    }
                                    i3++;
                                }
                                if (!z2) {
                                    arrayList.add(String.valueOf(iE));
                                }
                            }
                        }
                    }
                    if (arrayList.size() > 0 && NewDashboardActivity.this.t != null) {
                        NewDashboardActivity.this.t.n(TextUtils.join(",", arrayList));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (NewDashboardActivity.this.S != null && (arrayListO = NewDashboardActivity.this.S.o()) != null && arrayListO.size() > 0) {
                        ArrayList<SeriesDBModel> arrayListK12 = NewDashboardActivity.this.f25908h.k1();
                        for (int i4 = 0; i4 < arrayListO.size(); i4++) {
                            String strR = arrayListO.get(i4).r();
                            if (arrayListK12 != null && arrayListK12.size() > 0) {
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= arrayListK12.size()) {
                                        z = false;
                                        break;
                                    }
                                    if (String.valueOf(arrayListK12.get(i5).r()).equals(strR)) {
                                        z = true;
                                        break;
                                    }
                                    i5++;
                                }
                                if (!z) {
                                    arrayList2.add(String.valueOf(strR));
                                }
                            }
                        }
                    }
                    if (arrayList2.size() > 0 && NewDashboardActivity.this.S != null) {
                        NewDashboardActivity.this.S.m(TextUtils.join(",", arrayList2));
                    }
                }
            } catch (Exception unused) {
            }
            return Boolean.TRUE;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            if (NewDashboardActivity.this.f25905e == null || !bool.booleanValue()) {
                NewDashboardActivity.this.y1();
                return;
            }
            NewDashboardActivity.this.G = false;
            if (NewDashboardActivity.this.f25908h != null) {
                NewDashboardActivity.this.f25908h.u2("series", "1");
            }
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(NewDashboardActivity.this.progressSeries, "progress", 50, 0);
            objectAnimatorOfInt.setDuration(1000L);
            objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
            objectAnimatorOfInt.start();
            new Handler(Looper.getMainLooper()).postDelayed(new a(), 1000L);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class g extends AsyncTask<String, Integer, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f25928a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NewDashboardActivity.this.A.d(NewDashboardActivity.this.B, NewDashboardActivity.this.C);
            }
        }

        public g(Context context, List list) {
            this.f25928a = list;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            if (NewDashboardActivity.this.f25908h != null) {
                NewDashboardActivity.this.f25908h.l2();
            }
            publishProgress(0);
            return NewDashboardActivity.this.f25908h != null ? Boolean.valueOf(NewDashboardActivity.this.f25908h.y((ArrayList) this.f25928a)) : Boolean.FALSE;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            if (NewDashboardActivity.this.f25905e == null || !bool.booleanValue()) {
                NewDashboardActivity.this.y1();
                return;
            }
            if (NewDashboardActivity.this.B == null || NewDashboardActivity.this.B.isEmpty() || NewDashboardActivity.this.C == null || NewDashboardActivity.this.C.isEmpty()) {
                return;
            }
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(NewDashboardActivity.this.progressSeries, "progress", 100, 50);
            objectAnimatorOfInt.setDuration(500L);
            objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
            objectAnimatorOfInt.start();
            new Handler().postDelayed(new a(), 500L);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class h extends AsyncTask<String, Integer, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f25931a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NewDashboardActivity.this.A.g(NewDashboardActivity.this.B, NewDashboardActivity.this.C);
            }
        }

        public h(Context context, List list) {
            this.f25931a = list;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            if (NewDashboardActivity.this.f25908h != null) {
                NewDashboardActivity.this.f25908h.k2();
            }
            publishProgress(0);
            return NewDashboardActivity.this.f25908h != null ? Boolean.valueOf(NewDashboardActivity.this.f25908h.v(this.f25931a)) : Boolean.FALSE;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            if (NewDashboardActivity.this.f25905e == null || !bool.booleanValue()) {
                NewDashboardActivity.this.w1();
                return;
            }
            if (NewDashboardActivity.this.B == null || NewDashboardActivity.this.B.isEmpty() || NewDashboardActivity.this.C == null || NewDashboardActivity.this.C.isEmpty()) {
                return;
            }
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(NewDashboardActivity.this.progressMovies, "progress", 100, 50);
            objectAnimatorOfInt.setDuration(500L);
            objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
            objectAnimatorOfInt.start();
            new Handler().postDelayed(new a(), 500L);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class i extends AsyncTask<String, Integer, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f25934a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (NewDashboardActivity.this.ll_download_movies.isFocused()) {
                    NewDashboardActivity.this.on_demand.requestFocus();
                }
                NewDashboardActivity.this.ll_download_movies.setVisibility(8);
                NewDashboardActivity.this.progressMovies.setVisibility(8);
                NewDashboardActivity.this.ll_last_updated_movies.setVisibility(0);
                NewDashboardActivity.this.tv_last_updated_movies.setText(NewDashboardActivity.this.f25905e.getResources().getString(R.string.last_updated) + " " + c.h.a.h.n.e.n0(1000L));
                NewDashboardActivity.this.n1();
                if (NewDashboardActivity.this.Q) {
                    NewDashboardActivity.this.Q = false;
                    NewDashboardActivity newDashboardActivity = NewDashboardActivity.this;
                    newDashboardActivity.s1(newDashboardActivity.f25905e.getResources().getString(R.string.updating));
                }
            }
        }

        public i(Context context, List list) {
            this.f25934a = list;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            ArrayList<c.h.a.i.f> arrayListR;
            boolean z;
            ArrayList<c.h.a.i.b> arrayListR2;
            boolean z2;
            if (NewDashboardActivity.this.f25908h != null) {
                NewDashboardActivity.this.f25908h.n2();
            }
            publishProgress(0);
            if (NewDashboardActivity.this.f25908h == null) {
                return Boolean.FALSE;
            }
            try {
                if (NewDashboardActivity.this.f25908h.m(this.f25934a)) {
                    ArrayList arrayList = new ArrayList();
                    if (NewDashboardActivity.this.t != null && (arrayListR2 = NewDashboardActivity.this.t.r("vod")) != null && arrayListR2.size() > 0) {
                        ArrayList<c.h.a.i.f> arrayListT0 = NewDashboardActivity.this.f25908h.T0("movie");
                        for (int i2 = 0; i2 < arrayListR2.size(); i2++) {
                            int iE = arrayListR2.get(i2).e();
                            if (arrayListT0 != null && arrayListT0.size() > 0) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= arrayListT0.size()) {
                                        z2 = false;
                                        break;
                                    }
                                    if (arrayListT0.get(i3).Y().equals(String.valueOf(iE))) {
                                        z2 = true;
                                        break;
                                    }
                                    i3++;
                                }
                                if (!z2) {
                                    arrayList.add(String.valueOf(iE));
                                }
                            }
                        }
                    }
                    if (arrayList.size() > 0 && NewDashboardActivity.this.t != null) {
                        NewDashboardActivity.this.t.n(TextUtils.join(",", arrayList));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (NewDashboardActivity.this.R != null && (arrayListR = NewDashboardActivity.this.R.r()) != null && arrayListR.size() > 0) {
                        ArrayList<c.h.a.i.f> arrayListT02 = NewDashboardActivity.this.f25908h.T0("movie");
                        for (int i4 = 0; i4 < arrayListR.size(); i4++) {
                            String strY = arrayListR.get(i4).Y();
                            if (arrayListT02 != null && arrayListT02.size() > 0) {
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= arrayListT02.size()) {
                                        z = false;
                                        break;
                                    }
                                    if (arrayListT02.get(i5).Y().equals(String.valueOf(strY))) {
                                        z = true;
                                        break;
                                    }
                                    i5++;
                                }
                                if (!z) {
                                    arrayList2.add(String.valueOf(strY));
                                }
                            }
                        }
                    }
                    if (arrayList2.size() > 0 && NewDashboardActivity.this.R != null) {
                        NewDashboardActivity.this.R.n(TextUtils.join(",", arrayList2));
                    }
                }
            } catch (Exception unused) {
            }
            return Boolean.TRUE;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            if (NewDashboardActivity.this.f25905e == null || !bool.booleanValue()) {
                NewDashboardActivity.this.w1();
                return;
            }
            NewDashboardActivity.this.F = false;
            if (NewDashboardActivity.this.f25908h != null) {
                NewDashboardActivity.this.f25908h.u2("movies", "1");
            }
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(NewDashboardActivity.this.progressMovies, "progress", 50, 0);
            objectAnimatorOfInt.setDuration(1000L);
            objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
            objectAnimatorOfInt.start();
            new Handler(Looper.getMainLooper()).postDelayed(new a(), 1000L);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageView imageView;
            Resources resources;
            int i2;
            if (z.k()) {
                NewDashboardActivity newDashboardActivity = NewDashboardActivity.this;
                imageView = newDashboardActivity.check_VPN_Status;
                resources = newDashboardActivity.getResources();
                i2 = R.drawable.con_sta;
            } else {
                NewDashboardActivity newDashboardActivity2 = NewDashboardActivity.this;
                imageView = newDashboardActivity2.check_VPN_Status;
                resources = newDashboardActivity2.getResources();
                i2 = R.drawable.dis_con;
            }
            imageView.setImageDrawable(resources.getDrawable(i2));
        }
    }

    public class k implements ServiceConnection {
        public k() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            d.a.a.d.i iVarJ = i.a.J(iBinder);
            if (iVarJ != null) {
                try {
                    iVarJ.e(false);
                } catch (RemoteException e2) {
                    z.r(e2);
                }
            }
            NewDashboardActivity.this.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NewDashboardActivity.this.A.d(NewDashboardActivity.this.B, NewDashboardActivity.this.C);
        }
    }

    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NewDashboardActivity.this.A.c(NewDashboardActivity.this.B, NewDashboardActivity.this.C);
        }
    }

    public class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NewDashboardActivity.this.A.g(NewDashboardActivity.this.B, NewDashboardActivity.this.C);
        }
    }

    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = c.h.a.h.n.e.C(NewDashboardActivity.this.f25905e);
                String strQ = c.h.a.h.n.e.q(string);
                TextView textView = NewDashboardActivity.this.time;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = NewDashboardActivity.this.date;
                if (textView2 != null) {
                    textView2.setText(strQ);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class p implements View.OnClickListener {
        public p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NewDashboardActivity.f25904d.dismiss();
        }
    }

    public class q implements View.OnClickListener {
        public q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NewDashboardActivity.this.finish();
            c.h.a.h.n.e.O(NewDashboardActivity.this.f25905e);
            NewDashboardActivity.this.overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        }
    }

    public class r implements Runnable {
        public r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    try {
                        NewDashboardActivity.this.h1();
                        Thread.sleep(1000L);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    return;
                }
            }
        }
    }

    public class s extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f25946b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f25947c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f25948d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TextView f25949e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public TextView f25950f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public LinearLayout f25951g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public LinearLayout f25952h;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public View f25954b;

            public a(View view) {
                this.f25954b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z) {
                int i2;
                LinearLayout linearLayout;
                if (z) {
                    View view2 = this.f25954b;
                    i2 = R.drawable.blue_btn_effect;
                    if (view2 == null || view2.getTag() == null || !this.f25954b.getTag().equals("1")) {
                        View view3 = this.f25954b;
                        if (view3 == null || view3.getTag() == null || !this.f25954b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = s.this.f25952h;
                    }
                    linearLayout = s.this.f25951g;
                } else {
                    View view4 = this.f25954b;
                    i2 = R.drawable.black_button_dark;
                    if (view4 == null || view4.getTag() == null || !this.f25954b.getTag().equals("1")) {
                        View view5 = this.f25954b;
                        if (view5 == null || view5.getTag() == null || !this.f25954b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = s.this.f25952h;
                    }
                    linearLayout = s.this.f25951g;
                }
                linearLayout.setBackgroundResource(i2);
            }
        }

        public s(Activity activity) {
            super(activity);
            this.f25946b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            if (id == R.id.btn_no) {
                dismiss();
            } else if (id == R.id.btn_yes) {
                try {
                    NewDashboardActivity newDashboardActivity = NewDashboardActivity.this;
                    newDashboardActivity.q1(newDashboardActivity.getResources().getString(R.string.downloading));
                } catch (Exception unused) {
                }
            }
            dismiss();
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(NewDashboardActivity.this.z.A().equals(c.h.a.h.n.a.s0) ? R.layout.custom_dashboard_not_downloaded_layout_tv : R.layout.custom_dashboard_not_downloaded_layout);
            this.f25947c = (TextView) findViewById(R.id.btn_yes);
            this.f25948d = (TextView) findViewById(R.id.btn_no);
            this.f25951g = (LinearLayout) findViewById(R.id.ll_no_button_main_layout);
            this.f25952h = (LinearLayout) findViewById(R.id.ll_yes_button_main_layout);
            this.f25950f = (TextView) findViewById(R.id.tv_title);
            this.f25949e = (TextView) findViewById(R.id.txt_dia);
            this.f25950f.setText(NewDashboardActivity.this.getResources().getString(R.string.live_tv_not_downloaded));
            this.f25949e.setText(NewDashboardActivity.this.getResources().getString(R.string.need_to_download_live));
            this.f25947c.setOnClickListener(this);
            this.f25948d.setOnClickListener(this);
            TextView textView = this.f25947c;
            textView.setOnFocusChangeListener(new a(textView));
            TextView textView2 = this.f25948d;
            textView2.setOnFocusChangeListener(new a(textView2));
        }
    }

    public class t implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f25956b;

        public t(View view) {
            this.f25956b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25956b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25956b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25956b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x014c  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x01ff  */
        @Override // android.view.View.OnFocusChangeListener
        @android.annotation.SuppressLint({"ResourceType"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onFocusChange(android.view.View r10, boolean r11) {
            /*
                Method dump skipped, instruction units count: 684
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.activity.NewDashboardActivity.t.onFocusChange(android.view.View, boolean):void");
        }
    }

    public static ProgressDialog e1(Context context) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        try {
            progressDialog.show();
        } catch (Exception unused) {
        }
        progressDialog.setCancelable(false);
        progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        progressDialog.setContentView(R.layout.progress_dialog);
        return progressDialog;
    }

    public static long j1(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public void A0() {
        int iNextInt = new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS;
        this.L = iNextInt;
        c.h.a.f.b.f16735b = String.valueOf(iNextInt);
    }

    @TargetApi(26)
    public void A1() {
        LayoutInflater layoutInflaterFrom;
        int i2;
        if (this.f25905e != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.AlertDialogCustom);
            if (this.z.A().equals(c.h.a.h.n.a.s0)) {
                layoutInflaterFrom = LayoutInflater.from(this);
                i2 = R.layout.rate_us_alert_box_tv;
            } else {
                layoutInflaterFrom = LayoutInflater.from(this);
                i2 = R.layout.rate_us_alert_box;
            }
            View viewInflate = layoutInflaterFrom.inflate(i2, (ViewGroup) null);
            Button button = (Button) viewInflate.findViewById(R.id.btn_rateus);
            Button button2 = (Button) viewInflate.findViewById(R.id.btn_cancel);
            button.setOnFocusChangeListener(new e.j((View) button, this));
            button.requestFocus();
            button.setFocusableInTouchMode(true);
            button2.setOnFocusChangeListener(new e.j((View) button2, this));
            button.setOnClickListener(new a());
            button2.setOnClickListener(new b());
            builder.setView(viewInflate);
            this.s = builder.create();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(this.s.getWindow().getAttributes());
            layoutParams.width = -1;
            layoutParams.height = -2;
            this.s.show();
            this.s.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            this.s.getWindow().setAttributes(layoutParams);
            this.s.setCancelable(false);
        }
    }

    public void B1() {
        Intent intent = new Intent(this, (Class<?>) ImportM3uActivity.class);
        intent.putExtra("M3U_LINE", this.u);
        startActivity(intent);
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    @Override // c.h.a.k.f.h
    public void C(String str) {
        u1();
    }

    public final void C1(c.h.a.i.q.e eVar, c.h.a.i.q.e eVar2, c.h.a.i.q.e eVar3) {
        long jCurrentTimeMillis = (eVar.e() == null || eVar.e().equals(BuildConfig.FLAVOR)) ? 0L : System.currentTimeMillis() - Long.parseLong(eVar.e());
        long jCurrentTimeMillis2 = (eVar2.e() == null || eVar2.e().equals(BuildConfig.FLAVOR)) ? 0L : System.currentTimeMillis() - Long.parseLong(eVar2.e());
        long jCurrentTimeMillis3 = (eVar3.e() == null || eVar3.e().equals(BuildConfig.FLAVOR)) ? 0L : System.currentTimeMillis() - Long.parseLong(eVar3.e());
        if (jCurrentTimeMillis == 0 || jCurrentTimeMillis <= 0 || eVar.d() == null || !eVar.d().equals("1")) {
            this.ll_last_updated_live.setVisibility(8);
        } else {
            this.ll_last_updated_live.setVisibility(0);
            this.tv_last_updated_live.setText(this.f25905e.getResources().getString(R.string.last_updated) + " " + c.h.a.h.n.e.n0(jCurrentTimeMillis));
        }
        if (jCurrentTimeMillis2 == 0 || jCurrentTimeMillis2 <= 0 || eVar2.d() == null || !eVar2.d().equals("1")) {
            this.ll_last_updated_movies.setVisibility(8);
        } else {
            this.ll_last_updated_movies.setVisibility(0);
            this.tv_last_updated_movies.setText(this.f25905e.getResources().getString(R.string.last_updated) + " " + c.h.a.h.n.e.n0(jCurrentTimeMillis2));
        }
        if (jCurrentTimeMillis3 == 0 || jCurrentTimeMillis3 <= 0 || eVar3.d() == null || !eVar3.d().equals("1")) {
            this.ll_last_updated_series.setVisibility(8);
            return;
        }
        this.ll_last_updated_series.setVisibility(0);
        this.tv_last_updated_series.setText(this.f25905e.getResources().getString(R.string.last_updated) + " " + c.h.a.h.n.e.n0(jCurrentTimeMillis3));
    }

    @Override // c.h.a.k.f.f
    public void D(LoginCallback loginCallback, String str, ArrayList<String> arrayList) {
    }

    @Override // c.h.a.k.f.d
    public void E(BillingAddOrderCallback billingAddOrderCallback) {
    }

    @Override // c.h.a.k.f.h
    public void H(String str) {
        u1();
    }

    @Override // c.h.a.k.f.f
    public void I(String str) {
    }

    @Override // c.h.a.k.f.h
    public void K(List<GetSeriesStreamCallback> list) {
        if (list == null) {
            y1();
        } else if (Build.VERSION.SDK_INT >= 17) {
            new f(this.f25905e, list).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        } else {
            new f(this.f25905e, list).execute(new String[0]);
        }
    }

    @Override // c.h.a.k.f.f
    public void O(ArrayList<String> arrayList, String str) {
    }

    @Override // c.h.a.k.f.h
    public void R(String str) {
        y1();
    }

    @Override // c.h.a.k.f.d
    public void S(RegisterClientCallback registerClientCallback) {
    }

    @Override // c.h.a.k.f.d
    public void V(BillingIsPurchasedCallback billingIsPurchasedCallback) {
    }

    @Override // c.h.a.k.f.f
    public void X(String str) {
    }

    @Override // c.h.a.k.f.h
    public void Z(List<LiveStreamsCallback> list) {
        if (list == null) {
            u1();
        } else if (Build.VERSION.SDK_INT >= 17) {
            new e(this.f25905e, list).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        } else {
            new e(this.f25905e, list).execute(new String[0]);
        }
    }

    @Override // c.h.a.k.f.b
    public void a() {
    }

    public final void a1() {
        Window window = getWindow();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            window.clearFlags(67108864);
        }
        if (i2 >= 21) {
            window.addFlags(Integer.MIN_VALUE);
        }
        if (i2 >= 21) {
            window.setStatusBarColor(a.i.i.b.d(this, R.color.colorPrimaryDark));
        }
    }

    @Override // c.h.a.k.f.b
    public void b() {
    }

    public boolean b1() {
        SharedPreferences sharedPreferences = getSharedPreferences("automation_channels", 0);
        this.f25914n = sharedPreferences;
        return sharedPreferences.getString("automation_channels", BuildConfig.FLAVOR).equals("checked");
    }

    @Override // c.h.a.k.f.b
    public void c(String str) {
    }

    @Override // c.h.a.k.f.h
    public void c0(List<GetSeriesStreamCategoriesCallback> list) {
        String str;
        String str2;
        if (list != null) {
            if (Build.VERSION.SDK_INT >= 17) {
                new g(this.f25905e, list).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
                return;
            } else {
                new g(this.f25905e, list).execute(new String[0]);
                return;
            }
        }
        if (this.f25905e == null || (str = this.B) == null || str.isEmpty() || (str2 = this.C) == null || str2.isEmpty()) {
            return;
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.progressSeries, "progress", 100, 50);
        objectAnimatorOfInt.setDuration(500L);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.start();
        new Handler().postDelayed(new l(), 500L);
    }

    @Override // c.h.a.k.f.d
    public void d(BillingGetDevicesCallback billingGetDevicesCallback) {
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d1() {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.activity.NewDashboardActivity.d1():void");
    }

    @Override // c.h.a.k.f.d
    public void e0(BillingLoginClientCallback billingLoginClientCallback) {
        if (billingLoginClientCallback != null) {
            try {
                if (billingLoginClientCallback.c() == null || !billingLoginClientCallback.c().equals("success") || billingLoginClientCallback.d() == null) {
                    return;
                }
                if (!billingLoginClientCallback.d().equalsIgnoreCase(c.h.a.h.n.e.P("Vu6HilnbLo63*KJHGFkugu345*&^klih*" + c.h.a.f.b.f16735b)) || billingLoginClientCallback.a() == null || billingLoginClientCallback.b() == null || !billingLoginClientCallback.b().equals("Max Connection Reached")) {
                    return;
                }
                this.z.a();
                d1();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f1(boolean r19) {
        /*
            Method dump skipped, instruction units count: 1048
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.activity.NewDashboardActivity.f1(boolean):void");
    }

    @Override // c.h.a.k.f.d
    public void g0(BillingUpdateDevicesCallback billingUpdateDevicesCallback) {
    }

    public void g1() {
        Intent intent = new Intent(this, (Class<?>) OpenVPNService.class);
        intent.setAction("de.blinkt.openvpn.START_SERVICE");
        bindService(intent, new k(), 1);
    }

    public void h1() {
        try {
            runOnUiThread(new o());
        } catch (Exception unused) {
        }
    }

    @Override // c.h.a.k.f.h
    public void i(String str) {
        w1();
    }

    @Override // c.h.a.k.f.h
    public void i0(List<VodStreamsCallback> list) {
        if (list == null) {
            w1();
        } else if (Build.VERSION.SDK_INT >= 17) {
            new i(this.f25905e, list).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        } else {
            new i(this.f25905e, list).execute(new String[0]);
        }
    }

    public final void i1(String str) {
        String str2 = this.B;
        if (str2 == null || this.C == null || str2.isEmpty() || this.C.isEmpty() || this.B.equals(BuildConfig.FLAVOR) || this.C.equals(BuildConfig.FLAVOR)) {
            return;
        }
        this.iv_download_icon_live.setVisibility(8);
        this.pb_downloading_live.setVisibility(0);
        this.tv_download_text_live.setText(str);
        this.A.b(this.B, this.C);
    }

    public final void k1() {
        Context context = this.f25905e;
        if (context != null) {
            this.w = new c.h.a.j.c(this, context);
            SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
            sharedPreferences.edit();
            String string = sharedPreferences.getString("username", BuildConfig.FLAVOR);
            String string2 = sharedPreferences.getString("password", BuildConfig.FLAVOR);
            try {
                if (this.w == null || string == null || string.isEmpty() || string.equals(BuildConfig.FLAVOR) || string2 == null || string2.isEmpty() || string2.equals(BuildConfig.FLAVOR)) {
                    return;
                }
                this.w.g(string, string2);
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // c.h.a.k.f.h
    public void l(String str) {
        y1();
    }

    public final void l1(String str) {
        String str2 = this.B;
        if (str2 == null || this.C == null || str2.isEmpty() || this.C.isEmpty() || this.B.equals(BuildConfig.FLAVOR) || this.C.equals(BuildConfig.FLAVOR)) {
            return;
        }
        this.iv_download_icon_movies.setVisibility(8);
        this.pb_downloading_movies.setVisibility(0);
        this.tv_download_text_movies.setText(str);
        this.A.f(this.B, this.C);
    }

    public final void m1(String str) {
        String str2 = this.B;
        if (str2 == null || this.C == null || str2.isEmpty() || this.C.isEmpty() || this.B.equals(BuildConfig.FLAVOR) || this.C.equals(BuildConfig.FLAVOR)) {
            return;
        }
        this.iv_download_icon_series.setVisibility(8);
        this.pb_downloading_series.setVisibility(0);
        this.tv_download_text_series.setText(str);
        this.A.e(this.B, this.C);
    }

    public final void n1() {
        if (this.E || this.F || this.G) {
            return;
        }
        o1();
    }

    public void o1() {
        try {
            ProgressDialog progressDialog = this.H;
            if (progressDialog == null || !progressDialog.isShowing()) {
                return;
            }
            this.H.dismiss();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f25915o + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
            finishAffinity();
            finish();
        } else {
            try {
                Toast.makeText(getBaseContext(), getResources().getString(R.string.press_back_to_exit), 0).show();
            } catch (Exception unused) {
            }
        }
        this.f25915o = System.currentTimeMillis();
    }

    /* JADX WARN: Code restructure failed: missing block: B:233:0x05e1, code lost:
    
        if (java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - java.lang.Long.parseLong(r1.e())).longValue() > 60000) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x07d2, code lost:
    
        if (java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - java.lang.Long.parseLong(r1.e())).longValue() > 60000) goto L311;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onClick(android.view.View r17) {
        /*
            Method dump skipped, instruction units count: 2096
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.activity.NewDashboardActivity.onClick(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0458  */
    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    @android.annotation.SuppressLint({"SetTextI18n"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instruction units count: 1370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.activity.NewDashboardActivity.onCreate(android.os.Bundle):void");
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fa, code lost:
    
        if (r12.ll_last_updated_movies.getVisibility() != 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0210, code lost:
    
        if (r12.ll_last_updated_series.getVisibility() == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x021a, code lost:
    
        if (r12.ll_last_updated_live.getVisibility() == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0231, code lost:
    
        if (r12.ll_last_updated_movies.getVisibility() != 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x025a, code lost:
    
        if (r12.ll_last_updated_live.getVisibility() == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0272, code lost:
    
        if (r12.ll_last_updated_movies.getVisibility() == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x028a, code lost:
    
        if (r12.ll_last_updated_series.getVisibility() == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0343, code lost:
    
        if (getCurrentFocus().getTag().equals("1") != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00dd, code lost:
    
        if (r12.ll_last_updated_movies.getVisibility() != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f7, code lost:
    
        if (r12.ll_last_updated_live.getVisibility() == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f9, code lost:
    
        r13 = r12.ll_last_updated_live;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0102, code lost:
    
        if (r12.ll_last_updated_series.getVisibility() == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011a, code lost:
    
        if (r12.ll_last_updated_movies.getVisibility() != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0146, code lost:
    
        if (c.h.a.i.q.m.t(r12.f25905e).equalsIgnoreCase("Arabic") != false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb  */
    @Override // a.b.k.c, android.app.Activity, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyDown(int r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instruction units count: 898
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.activity.NewDashboardActivity.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        c.h.a.h.n.e.g(this.f25905e);
        super.onPause();
        try {
            Thread thread = this.N;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.N.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        try {
            p1();
            if (c.h.a.h.n.a.M.booleanValue()) {
                d1();
            }
            c.h.a.h.n.e.g(this.f25905e);
            this.x = new ArrayList<>();
            if (!this.D) {
                if (!this.E && !this.F && !this.G) {
                    f1(false);
                }
                c.h.a.l.c.a aVar = new c.h.a.l.c.a(this.f25905e);
                this.y = aVar;
                try {
                    this.x = aVar.q();
                } catch (Exception unused) {
                }
                ArrayList<c.h.a.l.e.a> arrayList = this.x;
                if (arrayList == null || arrayList.size() <= 0 || z.g() == null) {
                    this.check_VPN_Status.setVisibility(8);
                } else {
                    this.check_VPN_Status.setVisibility(0);
                    y0();
                }
            }
            this.D = false;
            c.h.a.i.p.b().m(null);
            c.h.a.i.a.c().f(null);
            overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
            Thread thread = this.N;
            if (thread == null || !thread.isAlive()) {
                Thread thread2 = new Thread(new r());
                this.N = thread2;
                thread2.start();
            }
            c.h.a.i.q.m.t(this.f25905e).equalsIgnoreCase("Arabic");
        } catch (Exception unused2) {
        }
        super.onResume();
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        p1();
    }

    @Override // c.h.a.k.f.f
    public void p(LoginCallback loginCallback, String str) {
        TextView textView;
        String str2;
        if (loginCallback != null) {
            try {
                if (loginCallback.b() != null) {
                    int i2 = 1;
                    if (loginCallback.b().c().intValue() == 1 && loginCallback.b().i().equals("Active")) {
                        if (loginCallback.b().e() != null) {
                            String strE = loginCallback.b().e();
                            String strE2 = loginCallback.a().e();
                            SharedPreferences.Editor editor = this.f25907g;
                            if (editor != null) {
                                editor.putString("expDate", strE);
                                this.f25907g.putString("serverTimeZone", strE2);
                                this.f25907g.apply();
                            }
                            if (this.tvExpiryDate == null) {
                                return;
                            }
                            if (strE != null && !strE.isEmpty()) {
                                try {
                                    i2 = Integer.parseInt(strE);
                                } catch (NumberFormatException unused) {
                                }
                                String str3 = new SimpleDateFormat("MMMM d, yyyy").format(new Date(((long) i2) * 1000));
                                this.tvExpiryDate.setText(getResources().getString(R.string.expiration) + " " + str3);
                                return;
                            }
                            textView = this.tvExpiryDate;
                            str2 = getResources().getString(R.string.expiration) + " " + getResources().getString(R.string.unlimited);
                        } else {
                            textView = this.tvExpiryDate;
                            if (textView == null) {
                                return;
                            }
                            str2 = getResources().getString(R.string.expiration) + " " + getResources().getString(R.string.unlimited);
                        }
                        textView.setText(str2);
                    }
                }
            } catch (Exception e2) {
                Log.e("honey", e2.getMessage());
            }
        }
    }

    public void p1() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    @Override // c.h.a.k.f.h
    public void q(List<LiveStreamCategoriesCallback> list) {
        String str;
        String str2;
        if (list != null) {
            if (Build.VERSION.SDK_INT >= 17) {
                new d(this.f25905e, list).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
                return;
            } else {
                new d(this.f25905e, list).execute(new String[0]);
                return;
            }
        }
        if (this.f25905e == null || (str = this.B) == null || str.isEmpty() || (str2 = this.C) == null || str2.isEmpty()) {
            return;
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.progressLive, "progress", 100, 50);
        objectAnimatorOfInt.setDuration(500L);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.start();
        new Handler().postDelayed(new m(), 500L);
    }

    public final void q1(String str) {
        ProgressDialog progressDialogE1 = this.H;
        if (progressDialogE1 == null) {
            progressDialogE1 = e1(this.f25905e);
            this.H = progressDialogE1;
        }
        progressDialogE1.show();
        if (this.f25905e != null) {
            this.E = true;
            c.h.a.i.q.f fVar = this.f25908h;
            if (fVar != null) {
                fVar.u2("live", "3");
            }
            i1(str);
        }
    }

    public final void r1(String str) {
        ProgressDialog progressDialogE1 = this.H;
        if (progressDialogE1 == null) {
            progressDialogE1 = e1(this.f25905e);
            this.H = progressDialogE1;
        }
        progressDialogE1.show();
        if (this.f25905e != null) {
            this.F = true;
            c.h.a.i.q.f fVar = this.f25908h;
            if (fVar != null) {
                fVar.u2("movies", "3");
            }
            l1(str);
        }
    }

    public final void s1(String str) {
        ProgressDialog progressDialogE1 = this.H;
        if (progressDialogE1 == null) {
            progressDialogE1 = e1(this.f25905e);
            this.H = progressDialogE1;
        }
        progressDialogE1.show();
        if (this.f25905e != null) {
            this.G = true;
            c.h.a.i.q.f fVar = this.f25908h;
            if (fVar != null) {
                fVar.u2("series", "3");
            }
            m1(str);
        }
    }

    @Override // c.h.a.k.f.f
    public void t(ArrayList<String> arrayList, String str) {
    }

    public final void t1() {
        new s(this).show();
    }

    @Override // c.h.a.k.f.h
    public void u(String str) {
        w1();
    }

    public final void u1() {
        this.E = false;
        n1();
        c.h.a.i.q.f fVar = this.f25908h;
        if (fVar != null) {
            fVar.u2("live", "2");
        }
        this.progressLive.setVisibility(0);
        this.ll_download_live.setVisibility(0);
        this.iv_download_icon_live.setImageResource(R.drawable.hp_download);
        this.iv_download_icon_live.setVisibility(0);
        this.pb_downloading_live.setVisibility(8);
        this.tv_download_text_live.setText(this.f25905e.getResources().getString(R.string.retry));
        if (this.P) {
            this.P = false;
            r1(this.f25905e.getResources().getString(R.string.updating));
        } else if (this.Q) {
            this.Q = false;
            s1(this.f25905e.getResources().getString(R.string.updating));
        }
    }

    public final void v1() {
        this.live_tv.setOnClickListener(this);
        this.on_demand.setOnClickListener(this);
        this.catch_up.setOnClickListener(this);
        this.epg.setOnClickListener(this);
        this.account_info.setOnClickListener(this);
        this.settings.setOnClickListener(this);
        this.settingsIV.setOnClickListener(this);
        this.recordingsIV.setOnClickListener(this);
        this.ivSwitchUser.setOnClickListener(this);
        this.llMultiscreen.setOnClickListener(this);
        this.iv_notification.setOnClickListener(this);
        this.ll_billing.setOnClickListener(this);
        this.ll_purchase_add_free_version.setOnClickListener(this);
        this.ll_last_updated_live.setOnClickListener(this);
        this.ll_last_updated_movies.setOnClickListener(this);
        this.ll_last_updated_series.setOnClickListener(this);
        this.ll_search.setOnClickListener(this);
        this.iv_radio.setOnClickListener(this);
    }

    public final void w1() {
        this.F = false;
        n1();
        c.h.a.i.q.f fVar = this.f25908h;
        if (fVar != null) {
            fVar.u2("movies", "2");
        }
        this.progressMovies.setVisibility(0);
        this.ll_download_movies.setVisibility(0);
        this.iv_download_icon_movies.setImageResource(R.drawable.hp_download);
        this.iv_download_icon_movies.setVisibility(0);
        this.pb_downloading_movies.setVisibility(8);
        this.tv_download_text_movies.setText(this.f25905e.getResources().getString(R.string.retry));
        if (this.Q) {
            this.Q = false;
            s1(this.f25905e.getResources().getString(R.string.updating));
        }
    }

    public final void x1() {
        startActivity(new Intent(this, (Class<?>) NewEPGCategoriesActivity.class));
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    @Override // c.h.a.k.f.h
    public void y(List<VodCategoriesCallback> list) {
        String str;
        String str2;
        if (list != null) {
            if (Build.VERSION.SDK_INT >= 17) {
                new h(this.f25905e, list).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
                return;
            } else {
                new h(this.f25905e, list).execute(new String[0]);
                return;
            }
        }
        if (this.f25905e == null || (str = this.B) == null || str.isEmpty() || (str2 = this.C) == null || str2.isEmpty()) {
            return;
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.progressMovies, "progress", 100, 50);
        objectAnimatorOfInt.setDuration(500L);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.start();
        new Handler().postDelayed(new n(), 500L);
    }

    public final void y0() {
        this.check_VPN_Status.setOnClickListener(new c());
        new Handler().postDelayed(new j(), 100L);
    }

    public final void y1() {
        this.G = false;
        n1();
        c.h.a.i.q.f fVar = this.f25908h;
        if (fVar != null) {
            fVar.u2("series", "2");
        }
        this.progressSeries.setVisibility(0);
        this.ll_download_series.setVisibility(0);
        this.iv_download_icon_series.setImageResource(R.drawable.hp_download);
        this.iv_download_icon_series.setVisibility(0);
        this.pb_downloading_series.setVisibility(8);
        this.tv_download_text_series.setText(this.f25905e.getResources().getString(R.string.retry));
    }

    @Override // c.h.a.k.f.d
    public void z(BillingCheckGPACallback billingCheckGPACallback) {
    }

    public final void z0() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setClass(this.f25905e, LaunchVPN.class);
        intent.putExtra("de.blinkt.openvpn.shortcutProfileUUID", z.g());
        intent.setFlags(268435456);
        intent.putExtra("de.blinkt.openvpn.showNoLogWindow", true);
        this.f25905e.startActivity(intent);
    }

    public void z1() {
        if (this.f25905e != null) {
            View viewInflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.delete_recording_popup, (RelativeLayout) findViewById(R.id.rl_password_verification));
            PopupWindow popupWindow = new PopupWindow(this);
            f25904d = popupWindow;
            popupWindow.setContentView(viewInflate);
            f25904d.setWidth(-1);
            f25904d.setHeight(-1);
            f25904d.setFocusable(true);
            f25904d.setBackgroundDrawable(new BitmapDrawable());
            f25904d.showAtLocation(viewInflate, 17, 0, 0);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_parental_password);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_delete_recording);
            Button button = (Button) viewInflate.findViewById(R.id.bt_start_recording);
            Button button2 = (Button) viewInflate.findViewById(R.id.bt_close);
            if (textView != null) {
                textView.setText(getResources().getString(R.string.logout_title));
            }
            if (textView2 != null) {
                textView2.setText(getResources().getString(R.string.logout_message));
            }
            if (button != null) {
                button.setOnFocusChangeListener(new e.j((View) button, this));
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new e.j((View) button2, this));
            }
            button2.setOnClickListener(new p());
            if (button != null) {
                button.setOnClickListener(new q());
            }
        }
    }
}
