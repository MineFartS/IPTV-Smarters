package com.nst.iptvsmarterstvbox.view.adapter;

import a.b.q.j0;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import c.h.a.h.n.e;
import c.h.a.i.q.k;
import c.h.a.i.q.l;
import c.h.a.i.q.m;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.Constants;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.model.callback.LoginCallback;
import com.nst.iptvsmarterstvbox.view.activity.ImportM3uActivity;
import com.nst.iptvsmarterstvbox.view.activity.MultiUserActivity;
import com.nst.iptvsmarterstvbox.view.activity.NewDashboardActivity;
import com.nst.iptvsmarterstvbox.view.activity.RoutingActivity;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MultiUserAdapter extends RecyclerView.h<MyViewHolder> implements c.h.a.k.f.f, c.h.a.f.c<String> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static PopupWindow f27577e;
    public SharedPreferences A;
    public SharedPreferences.Editor B;
    public SharedPreferences C;
    public SharedPreferences.Editor D;
    public SharedPreferences E;
    public SharedPreferences.Editor F;
    public c.h.a.i.q.a G;
    public InputStream H;
    public String K;
    public Button L;
    public Button M;
    public c.h.a.k.d.a.a T;
    public String U;
    public String V;
    public String W;
    public String X;
    public int Y;
    public String Z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c.h.a.i.i f27578f;
    public SharedPreferences f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinearLayout f27579g;
    public SharedPreferences g0;
    public SharedPreferences.Editor h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f27581i;
    public String i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<c.h.a.i.i> f27582j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayout f27583k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f27584l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.h.a.i.q.f f27585m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c.h.a.i.q.g f27586n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public MultiUserActivity f27587o;
    public String p;
    public c.h.a.j.c r;
    public String s;
    public String t;
    public String u;
    public String v;
    public ProgressDialog w;
    public String x;
    public SharedPreferences.Editor y;
    public SharedPreferences z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f27580h = true;
    public boolean q = true;
    public final c.h.a.k.g.a I = new c.h.a.k.g.a();
    public String J = BuildConfig.FLAVOR;
    public String N = BuildConfig.FLAVOR;
    public String O = BuildConfig.FLAVOR;
    public String P = BuildConfig.FLAVOR;
    public String Q = BuildConfig.FLAVOR;
    public long R = -1;
    public boolean S = false;
    public ArrayList<String> j0 = new ArrayList<>();

    public static class MyViewHolder extends RecyclerView.e0 {

        @BindView
        public ImageView ivUserimg;

        @BindView
        public ProgressBar pbPagingLoader;

        @BindView
        public RelativeLayout rlDelete;

        @BindView
        public RelativeLayout rlListOfCategories;

        @BindView
        public RelativeLayout rlOuter;

        @BindView
        public RelativeLayout testing;

        @BindView
        public TextView tvMovieCategoryName;

        @BindView
        public TextView tvServerName;

        @BindView
        public TextView tvUserName;

        @BindView
        public TextView tvXubCount;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.b(this, view);
            L(false);
        }
    }

    public class MyViewHolder_ViewBinding implements Unbinder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MyViewHolder f27588b;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.f27588b = myViewHolder;
            myViewHolder.tvMovieCategoryName = (TextView) b.c.c.c(view, R.id.tv_movie_category_name, "field 'tvMovieCategoryName'", TextView.class);
            myViewHolder.tvServerName = (TextView) b.c.c.c(view, R.id.tv_servername, "field 'tvServerName'", TextView.class);
            myViewHolder.ivUserimg = (ImageView) b.c.c.c(view, R.id.iv_user_img, "field 'ivUserimg'", ImageView.class);
            myViewHolder.tvUserName = (TextView) b.c.c.c(view, R.id.tv_username, "field 'tvUserName'", TextView.class);
            myViewHolder.pbPagingLoader = (ProgressBar) b.c.c.c(view, R.id.pb_paging_loader, "field 'pbPagingLoader'", ProgressBar.class);
            myViewHolder.rlOuter = (RelativeLayout) b.c.c.c(view, R.id.rl_outer, "field 'rlOuter'", RelativeLayout.class);
            myViewHolder.rlListOfCategories = (RelativeLayout) b.c.c.c(view, R.id.rl_list_of_categories, "field 'rlListOfCategories'", RelativeLayout.class);
            myViewHolder.testing = (RelativeLayout) b.c.c.c(view, R.id.testing, "field 'testing'", RelativeLayout.class);
            myViewHolder.rlDelete = (RelativeLayout) b.c.c.c(view, R.id.delete, "field 'rlDelete'", RelativeLayout.class);
            myViewHolder.tvXubCount = (TextView) b.c.c.c(view, R.id.tv_sub_cat_count, "field 'tvXubCount'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void a() {
            MyViewHolder myViewHolder = this.f27588b;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f27588b = null;
            myViewHolder.tvMovieCategoryName = null;
            myViewHolder.tvServerName = null;
            myViewHolder.ivUserimg = null;
            myViewHolder.tvUserName = null;
            myViewHolder.pbPagingLoader = null;
            myViewHolder.rlOuter = null;
            myViewHolder.rlListOfCategories = null;
            myViewHolder.testing = null;
            myViewHolder.rlDelete = null;
            myViewHolder.tvXubCount = null;
        }
    }

    public class a implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f27590c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27591d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f27592e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f27593f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f27594g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f27595h;

        public a(String str, String str2, String str3, String str4, MyViewHolder myViewHolder, int i2, int i3) {
            this.f27589b = str;
            this.f27590c = str2;
            this.f27591d = str3;
            this.f27592e = str4;
            this.f27593f = myViewHolder;
            this.f27594g = i2;
            this.f27595h = i3;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            MultiUserAdapter multiUserAdapter = MultiUserAdapter.this;
            String str = this.f27589b;
            multiUserAdapter.s = str;
            String str2 = this.f27590c;
            multiUserAdapter.t = str2;
            String str3 = this.f27591d;
            multiUserAdapter.u = str3;
            String str4 = this.f27592e;
            multiUserAdapter.v = str4;
            multiUserAdapter.M0(this.f27593f, this.f27594g, str, this.f27595h, view, str2, str3, str4);
            return true;
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f27598c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27599d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f27600e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ c.h.a.i.i f27601f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f27602g;

        public b(String str, String str2, String str3, String str4, c.h.a.i.i iVar, int i2) {
            this.f27597b = str;
            this.f27598c = str2;
            this.f27599d = str3;
            this.f27600e = str4;
            this.f27601f = iVar;
            this.f27602g = i2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MultiUserAdapter multiUserAdapter = MultiUserAdapter.this;
            multiUserAdapter.y = multiUserAdapter.z.edit();
            MultiUserAdapter.this.a();
            MultiUserAdapter.this.B.putString("username", this.f27597b);
            MultiUserAdapter.this.B.putString("password", this.f27598c);
            MultiUserAdapter.this.B.putString(c.h.a.h.n.a.t, this.f27599d);
            MultiUserAdapter.this.B.putString("activationCode", BuildConfig.FLAVOR);
            MultiUserAdapter.this.B.putString("loginWith", "loginWithDetails");
            MultiUserAdapter.this.B.apply();
            MultiUserAdapter multiUserAdapter2 = MultiUserAdapter.this;
            multiUserAdapter2.s = this.f27600e;
            multiUserAdapter2.t = this.f27597b;
            multiUserAdapter2.u = this.f27598c;
            multiUserAdapter2.v = this.f27599d;
            multiUserAdapter2.y.putString(c.h.a.h.n.a.t, this.f27599d);
            MultiUserAdapter.this.y.apply();
            String strA = this.f27601f.a();
            if ((strA == null || !strA.equals(TransferTable.COLUMN_FILE)) && (strA == null || !strA.equals("url"))) {
                MultiUserAdapter.this.p = "api";
            } else {
                MultiUserAdapter.this.p = "m3u";
            }
            if (!c.h.a.h.n.a.f17041e.booleanValue() || !MultiUserAdapter.this.p.equals("m3u")) {
                m.N("api", MultiUserAdapter.this.f27581i);
                try {
                    if (!c.h.a.h.n.a.f17038b.booleanValue() && !c.h.a.h.n.a.M.booleanValue()) {
                        MultiUserAdapter.this.new f().execute(new Void[0]);
                        m.f0(this.f27602g, MultiUserAdapter.this.f27581i);
                        return;
                    } else {
                        c.h.a.j.c cVar = MultiUserAdapter.this.r;
                        String str = this.f27597b;
                        cVar.g(str, this.f27598c);
                        m.f0(this.f27602g, MultiUserAdapter.this.f27581i);
                        return;
                    }
                } catch (Exception unused) {
                    return;
                }
            }
            m.N("m3u", MultiUserAdapter.this.f27581i);
            m.f0(this.f27602g, MultiUserAdapter.this.f27581i);
            if (!this.f27601f.a().equals(TransferTable.COLUMN_FILE)) {
                if (this.f27601f.a().equals("url")) {
                    MultiUserAdapter.this.K = "url";
                    MultiUserAdapter.this.new g().execute(new Void[0]);
                    return;
                }
                return;
            }
            MultiUserAdapter.this.K = TransferTable.COLUMN_FILE;
            if (!new File(MultiUserAdapter.this.v).exists()) {
                MultiUserAdapter.this.b();
                Toast.makeText(MultiUserAdapter.this.f27581i, MultiUserAdapter.this.f27581i.getResources().getString(R.string.m3u_file_not_found), 0).show();
            } else if (c.h.a.h.n.a.M.booleanValue()) {
                MultiUserAdapter.this.new j().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, MultiUserAdapter.this.v);
            } else {
                MultiUserAdapter.this.new f().execute(new Void[0]);
            }
        }
    }

    public class c implements j0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f27604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f27606c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f27607d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f27608e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f27609f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ MyViewHolder f27610g;

        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MultiUserAdapter.f27577e.dismiss();
            }
        }

        public class b implements View.OnClickListener {
            public b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MultiUserAdapter.this.f27581i != null) {
                    SharedPreferences sharedPreferences = MultiUserAdapter.this.f27581i.getSharedPreferences("loginprefsmultiuser", 0);
                    String string = sharedPreferences.getString("name", BuildConfig.FLAVOR);
                    String string2 = sharedPreferences.getString("username", BuildConfig.FLAVOR);
                    String string3 = sharedPreferences.getString("password", BuildConfig.FLAVOR);
                    String string4 = sharedPreferences.getString(c.h.a.h.n.a.t, BuildConfig.FLAVOR);
                    c cVar = c.this;
                    String str = cVar.f27604a;
                    if (str != null && cVar.f27605b != null && cVar.f27606c != null && cVar.f27607d != null && str.equals(string) && c.this.f27607d.contains(string4) && c.this.f27605b.equals(string2) && c.this.f27606c.equals(string3)) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.clear();
                        editorEdit.apply();
                        SharedPreferences.Editor editorEdit2 = MultiUserAdapter.this.f27581i.getSharedPreferences("loginPrefs", 0).edit();
                        editorEdit2.clear();
                        editorEdit2.apply();
                    }
                    if (MultiUserAdapter.this.p.equals("m3u")) {
                        MultiUserAdapter.this.f27585m.f2(c.this.f27608e);
                        c.h.a.i.q.f fVar = MultiUserAdapter.this.f27585m;
                        c cVar2 = c.this;
                        fVar.M0(cVar2.f27608e, MultiUserAdapter.this.p);
                        c.h.a.i.q.f fVar2 = MultiUserAdapter.this.f27585m;
                        c cVar3 = c.this;
                        fVar2.J0(cVar3.f27608e, MultiUserAdapter.this.p);
                        c.h.a.i.q.f fVar3 = MultiUserAdapter.this.f27585m;
                        c cVar4 = c.this;
                        fVar3.C0(cVar4.f27608e, MultiUserAdapter.this.p);
                        MultiUserAdapter.this.f27586n.n(c.this.f27608e);
                        c.h.a.i.q.f fVar4 = MultiUserAdapter.this.f27585m;
                        c cVar5 = c.this;
                        fVar4.g2(cVar5.f27608e, MultiUserAdapter.this.p);
                    } else {
                        new c.h.a.i.q.a(MultiUserAdapter.this.f27581i).m(c.this.f27608e);
                        new k(MultiUserAdapter.this.f27581i).l(c.this.f27608e);
                        c.h.a.i.q.f fVar5 = new c.h.a.i.q.f(MultiUserAdapter.this.f27581i);
                        c cVar6 = c.this;
                        fVar5.M0(cVar6.f27608e, MultiUserAdapter.this.p);
                        c cVar7 = c.this;
                        fVar5.J0(cVar7.f27608e, MultiUserAdapter.this.p);
                        c cVar8 = c.this;
                        fVar5.C0(cVar8.f27608e, MultiUserAdapter.this.p);
                        c cVar9 = c.this;
                        fVar5.g2(cVar9.f27608e, MultiUserAdapter.this.p);
                        new l(MultiUserAdapter.this.f27581i).l();
                        MultiUserAdapter.this.f27586n.m(c.this.f27608e);
                    }
                    MultiUserAdapter.this.f27582j.remove(c.this.f27609f);
                    c cVar10 = c.this;
                    MultiUserAdapter.this.C(cVar10.f27609f);
                    c cVar11 = c.this;
                    MultiUserAdapter multiUserAdapter = MultiUserAdapter.this;
                    multiUserAdapter.B(cVar11.f27609f, multiUserAdapter.f27582j.size());
                    MultiUserAdapter.this.w();
                    Toast.makeText(MultiUserAdapter.this.f27581i, MultiUserAdapter.this.f27581i.getResources().getString(R.string.item_deleted) + "  " + c.this.f27604a, 0).show();
                    if (MultiUserAdapter.this.f27582j.size() == 0 && MultiUserAdapter.this.f27583k != null) {
                        MultiUserAdapter.this.f27583k.setVisibility(0);
                        MultiUserAdapter.this.f27584l.setVisibility(8);
                        MultiUserAdapter.this.f27579g.setNextFocusDownId(R.id.ll_add_new_user);
                    }
                    MultiUserAdapter.f27577e.dismiss();
                }
            }
        }

        public c(String str, String str2, String str3, String str4, int i2, int i3, MyViewHolder myViewHolder) {
            this.f27604a = str;
            this.f27605b = str2;
            this.f27606c = str3;
            this.f27607d = str4;
            this.f27608e = i2;
            this.f27609f = i3;
            this.f27610g = myViewHolder;
        }

        @Override // a.b.q.j0.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId != R.id.delete_user) {
                if (itemId == R.id.login_user) {
                    this.f27610g.rlOuter.performClick();
                }
            } else if (MultiUserAdapter.this.f27581i != null) {
                View viewInflate = ((LayoutInflater) MultiUserAdapter.this.f27587o.getSystemService("layout_inflater")).inflate(R.layout.delete_recording_popup, (RelativeLayout) MultiUserAdapter.this.f27587o.findViewById(R.id.rl_password_verification));
                PopupWindow unused = MultiUserAdapter.f27577e = new PopupWindow(MultiUserAdapter.this.f27587o);
                MultiUserAdapter.f27577e.setContentView(viewInflate);
                MultiUserAdapter.f27577e.setWidth(-1);
                MultiUserAdapter.f27577e.setHeight(-1);
                MultiUserAdapter.f27577e.setFocusable(true);
                MultiUserAdapter.f27577e.showAtLocation(viewInflate, 17, 0, 0);
                TextView textView = (TextView) viewInflate.findViewById(R.id.tv_delete_recording);
                Button button = (Button) viewInflate.findViewById(R.id.bt_start_recording);
                Button button2 = (Button) viewInflate.findViewById(R.id.bt_close);
                if (textView != null) {
                    textView.setText(MultiUserAdapter.this.f27581i.getResources().getString(R.string.delete_message));
                }
                if (button != null) {
                    button.setOnFocusChangeListener(new e.j((View) button, MultiUserAdapter.this.f27587o));
                }
                if (button2 != null) {
                    button2.setOnFocusChangeListener(new e.j((View) button2, MultiUserAdapter.this.f27587o));
                }
                button2.setOnClickListener(new a());
                if (button != null) {
                    button.setOnClickListener(new b());
                }
            }
            return false;
        }
    }

    public class d extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f27614b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f27615c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f27616d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f27617e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f27618f;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public View f27620b;

            public a(View view) {
                this.f27620b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z) {
                int i2;
                LinearLayout linearLayout;
                if (z) {
                    View view2 = this.f27620b;
                    i2 = R.drawable.blue_btn_effect;
                    if (view2 == null || view2.getTag() == null || !this.f27620b.getTag().equals("1")) {
                        View view3 = this.f27620b;
                        if (view3 == null || view3.getTag() == null || !this.f27620b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = d.this.f27618f;
                    }
                    linearLayout = d.this.f27617e;
                } else {
                    View view4 = this.f27620b;
                    i2 = R.drawable.black_button_dark;
                    if (view4 == null || view4.getTag() == null || !this.f27620b.getTag().equals("1")) {
                        View view5 = this.f27620b;
                        if (view5 == null || view5.getTag() == null || !this.f27620b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = d.this.f27618f;
                    }
                    linearLayout = d.this.f27617e;
                }
                linearLayout.setBackgroundResource(i2);
            }
        }

        public d(Activity activity) {
            super(activity);
            this.f27614b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            if (id == R.id.btn_close || id == R.id.btn_try_again) {
                try {
                    dismiss();
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(MultiUserAdapter.this.T.A().equals(c.h.a.h.n.a.s0) ? R.layout.custom_internet_not_working_layout_tv : R.layout.custom_internet_not_working_layout);
            this.f27615c = (TextView) findViewById(R.id.btn_try_again);
            this.f27616d = (TextView) findViewById(R.id.btn_close);
            this.f27617e = (LinearLayout) findViewById(R.id.ll_yes_button_main_layout);
            this.f27618f = (LinearLayout) findViewById(R.id.ll_no_button_main_layout);
            this.f27615c.setOnClickListener(this);
            this.f27616d.setOnClickListener(this);
            TextView textView = this.f27615c;
            textView.setOnFocusChangeListener(new a(textView));
            TextView textView2 = this.f27616d;
            textView2.setOnFocusChangeListener(new a(textView2));
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class e extends AsyncTask<String, String, Boolean> {
        public e() {
        }

        public /* synthetic */ e(MultiUserAdapter multiUserAdapter, a aVar) {
            this();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            File file;
            try {
                URL url = new URL(strArr[0]);
                MultiUserAdapter.this.H0();
                if (Build.VERSION.SDK_INT >= 19) {
                    file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "IPTVSmarters");
                } else {
                    file = new File(Environment.getExternalStorageDirectory() + "/Documents", "IPTVSmarters");
                }
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(MultiUserAdapter.this.f27581i.getFilesDir() + "/data_temp.txt");
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(MultiUserAdapter.this.f27581i.getFilesDir() + "/data_temp.txt").toString())));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    if (!(((!line.contains("http://") || line.contains("tvg-logo")) && (!line.contains("https://") || line.contains("tvg-logo"))) ? BuildConfig.FLAVOR : line).equals(BuildConfig.FLAVOR)) {
                        sb.append(line);
                        break;
                    }
                }
                bufferedWriter.write(sb.toString());
                bufferedWriter.flush();
                bufferedWriter.close();
                return Boolean.TRUE;
            } catch (Exception e3) {
                Log.d("Google", "DownloadFileFromUrl " + e3.getMessage());
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            try {
                if (!bool.booleanValue()) {
                    c.h.a.h.n.e.l0(MultiUserAdapter.this.f27581i, MultiUserAdapter.this.f27581i.getResources().getString(R.string.file_url_not_valid));
                    MultiUserAdapter.this.f27581i.startActivity(c.h.a.h.n.a.f17039c.booleanValue() ? new Intent(MultiUserAdapter.this.f27581i, (Class<?>) MultiUserActivity.class) : new Intent(MultiUserAdapter.this.f27581i, (Class<?>) RoutingActivity.class));
                    MultiUserAdapter.this.f27587o.finish();
                } else {
                    if (!c.h.a.h.n.a.M.booleanValue()) {
                        MultiUserAdapter.this.c0();
                        return;
                    }
                    MultiUserAdapter.this.new j().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, MultiUserAdapter.this.f27581i.getFilesDir() + "/data_temp.txt");
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(String... strArr) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class f extends AsyncTask<Void, Boolean, Boolean> {
        public f() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("http://www.google.com").openConnection();
                httpURLConnection.setRequestMethod("HEAD");
                httpURLConnection.setReadTimeout(1500);
                httpURLConnection.setConnectTimeout(1500);
                return Boolean.valueOf(httpURLConnection.getResponseCode() == 200);
            } catch (Exception e2) {
                Log.e("LOG_TAG", e2.toString());
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (bool.booleanValue()) {
                MultiUserAdapter.this.c0();
                return;
            }
            MultiUserAdapter.this.b();
            MultiUserAdapter multiUserAdapter = MultiUserAdapter.this;
            d dVar = multiUserAdapter.new d((Activity) multiUserAdapter.f27581i);
            dVar.setCancelable(false);
            dVar.show();
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class g extends AsyncTask<Void, Boolean, Boolean> {
        public g() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("http://www.google.com").openConnection();
                httpURLConnection.setRequestMethod("HEAD");
                httpURLConnection.setReadTimeout(1500);
                httpURLConnection.setConnectTimeout(1500);
                return Boolean.valueOf(httpURLConnection.getResponseCode() == 200);
            } catch (Exception e2) {
                Log.e("LOG_TAG", e2.toString());
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (bool.booleanValue()) {
                MultiUserAdapter.this.new i().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, MultiUserAdapter.this.v);
                return;
            }
            MultiUserAdapter.this.b();
            MultiUserAdapter multiUserAdapter = MultiUserAdapter.this;
            d dVar = multiUserAdapter.new d((Activity) multiUserAdapter.f27581i);
            dVar.setCancelable(false);
            dVar.show();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public class h implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f27625b;

        public h(View view) {
            this.f27625b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27625b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27625b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27625b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            float f2;
            if (z) {
                f2 = z ? 1.09f : 1.0f;
                b(f2);
                c(f2);
                Log.e("id is", BuildConfig.FLAVOR + this.f27625b.getTag());
                this.f27625b.setBackgroundResource(R.drawable.shape_list_multidns_focused);
                if (this.f27625b.getTag() != null && this.f27625b.getTag().equals("8")) {
                    MultiUserAdapter.this.L.setBackgroundResource(R.drawable.back_btn_effect);
                }
                if (this.f27625b.getTag() == null || !this.f27625b.getTag().equals("9")) {
                    return;
                }
                MultiUserAdapter.this.M.setBackgroundResource(R.drawable.logout_btn_effect);
                return;
            }
            if (z) {
                return;
            }
            f2 = z ? 1.09f : 1.0f;
            b(f2);
            c(f2);
            a(z);
            this.f27625b.setBackgroundResource(R.drawable.shape_list_multidns);
            View view2 = this.f27625b;
            if (view2 != null && view2.getTag() != null && this.f27625b.getTag().equals("8")) {
                MultiUserAdapter.this.L.setBackgroundResource(R.drawable.black_button_dark);
            }
            View view3 = this.f27625b;
            if (view3 == null || view3.getTag() == null || !this.f27625b.getTag().equals("9")) {
                return;
            }
            MultiUserAdapter.this.M.setBackgroundResource(R.drawable.black_button_dark);
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class i extends AsyncTask<String, Void, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f27627a = BuildConfig.FLAVOR;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f27628b = BuildConfig.FLAVOR;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f27629c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f27630d = BuildConfig.FLAVOR;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f27631e = BuildConfig.FLAVOR;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f27632f = false;

        public i() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strArr[0]).openConnection();
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(30000);
                httpURLConnection.setRequestMethod(ClientConstants.HTTP_REQUEST_TYPE_POST);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                return Boolean.valueOf(responseCode == 200 || responseCode == 405 || responseCode == 404);
            } catch (Exception e2) {
                Log.e("Google", e2.toString());
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            if (bool.booleanValue()) {
                new e(MultiUserAdapter.this, null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, MultiUserAdapter.this.v);
            } else {
                MultiUserAdapter.this.b();
                c.h.a.h.n.e.l0(MultiUserAdapter.this.f27581i, MultiUserAdapter.this.f27581i.getResources().getString(R.string.file_url_not_valid));
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class j extends AsyncTask<String, Void, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f27634a = BuildConfig.FLAVOR;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f27635b = BuildConfig.FLAVOR;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f27636c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f27637d = BuildConfig.FLAVOR;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f27638e = BuildConfig.FLAVOR;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f27639f = false;

        public j() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            try {
                MultiUserAdapter.this.H = new FileInputStream(new File(strArr[0]));
                MultiUserAdapter multiUserAdapter = MultiUserAdapter.this;
                return multiUserAdapter.I.c(multiUserAdapter.H, multiUserAdapter.f27581i);
            } catch (Exception unused) {
                return BuildConfig.FLAVOR;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            Toast toastMakeText;
            super.onPostExecute(str);
            boolean z = true;
            if (str.equals(BuildConfig.FLAVOR)) {
                if (MultiUserAdapter.this.f27585m != null) {
                    MultiUserAdapter.this.f27585m.u2("all", "2");
                }
                MultiUserAdapter multiUserAdapter = MultiUserAdapter.this;
                multiUserAdapter.S = false;
                multiUserAdapter.b();
                Toast.makeText(MultiUserAdapter.this.f27581i, MultiUserAdapter.this.f27581i.getResources().getString(R.string.unable_to_login), 1).show();
                return;
            }
            try {
                MultiUserAdapter.this.i0 = str;
                if (c.h.a.h.n.a.f17040d.booleanValue()) {
                    if (c.h.a.h.n.a.M.booleanValue()) {
                        MultiUserAdapter.this.B0();
                        return;
                    }
                    MultiUserAdapter multiUserAdapter2 = MultiUserAdapter.this;
                    multiUserAdapter2.P = c.h.a.f.f.a(multiUserAdapter2.f27581i);
                    String str2 = MultiUserAdapter.this.P;
                    if (str2 != null && !str2.equals(BuildConfig.FLAVOR) && !MultiUserAdapter.this.P.isEmpty()) {
                        MultiUserAdapter.this.j0 = new ArrayList<>(Arrays.asList(MultiUserAdapter.this.P.split(",")));
                    }
                    ArrayList<String> arrayList = MultiUserAdapter.this.j0;
                    if (arrayList == null || arrayList.size() < 1) {
                        MultiUserAdapter.this.b();
                        toastMakeText = Toast.makeText(MultiUserAdapter.this.f27581i, MultiUserAdapter.this.f27581i.getResources().getString(R.string.please_check_portal), 0);
                    } else {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= MultiUserAdapter.this.j0.size()) {
                                z = false;
                                break;
                            } else {
                                if (MultiUserAdapter.this.i0 != null && MultiUserAdapter.this.i0.contains(MultiUserAdapter.this.j0.get(i2))) {
                                    MultiUserAdapter.this.B0();
                                    break;
                                }
                                i2++;
                            }
                        }
                        if (z) {
                            return;
                        }
                        MultiUserAdapter.this.b();
                        toastMakeText = Toast.makeText(MultiUserAdapter.this.f27581i, MultiUserAdapter.this.f27581i.getResources().getString(R.string.invalid_server_url), 0);
                    }
                    toastMakeText.show();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public MultiUserAdapter(MultiUserActivity multiUserActivity, List<c.h.a.i.i> list, Context context, LinearLayout linearLayout, TextView textView, String str, c.h.a.i.i iVar, LinearLayout linearLayout2) {
        this.x = BuildConfig.FLAVOR;
        this.U = "false";
        this.f27578f = iVar;
        this.f27582j = list;
        this.f27587o = multiUserActivity;
        this.f27581i = context;
        this.U = str;
        this.f27584l = textView;
        this.f27583k = linearLayout;
        this.r = new c.h.a.j.c(this, context);
        this.f27585m = new c.h.a.i.q.f(context);
        this.T = new c.h.a.k.d.a.a(context);
        this.f0 = multiUserActivity.getSharedPreferences("loginPrefs", 0);
        SharedPreferences sharedPreferences = multiUserActivity.getSharedPreferences("sharedPreference", 0);
        this.g0 = sharedPreferences;
        this.h0 = sharedPreferences.edit();
        this.f27579g = linearLayout2;
        if (!c.h.a.h.n.a.M.booleanValue()) {
            C0();
            W();
            G0();
            Z();
        }
        this.G = new c.h.a.i.q.a(context);
        this.f27586n = new c.h.a.i.q.g(context);
        this.x = context.getSharedPreferences("selected_language", 0).getString("selected_language", "English");
        ProgressDialog progressDialog = new ProgressDialog(context);
        this.w = progressDialog;
        progressDialog.setMessage(context.getResources().getString(R.string.please_wait));
        this.w.setCanceledOnTouchOutside(false);
        this.w.setCancelable(false);
        this.w.setProgressStyle(0);
    }

    public static String D0(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (char c2 : charArray) {
            if (z && Character.isLetter(c2)) {
                sb.append(Character.toUpperCase(c2));
                z = false;
            } else {
                if (Character.isWhitespace(c2)) {
                    z = true;
                }
                sb.append(c2);
            }
        }
        return sb.toString();
    }

    public static long F0(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public static String G0() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return D0(str2);
        }
        return D0(str) + " " + str2;
    }

    public static String I0(String str) {
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

    public final void B0() {
        Context context;
        try {
            SharedPreferences.Editor editorEdit = this.f27581i.getSharedPreferences("loginPrefs", 0).edit();
            SharedPreferences.Editor editorEdit2 = this.f27581i.getSharedPreferences("loginprefsmultiuser", 0).edit();
            editorEdit2.putString("name", this.s);
            editorEdit2.putString("username", "playlist");
            editorEdit2.putString("password", "playlist");
            editorEdit2.putString(c.h.a.h.n.a.t, this.v);
            editorEdit.putString("username", "playlist");
            editorEdit.putString("password", "playlist");
            editorEdit.putString("serverPort", BuildConfig.FLAVOR);
            editorEdit.putString("serverUrl", this.v);
            editorEdit.putString("serverM3UUrl", this.v);
            editorEdit.putString(c.h.a.h.n.a.t, this.v);
            editorEdit.apply();
            editorEdit2.apply();
            SharedPreferences sharedPreferences = this.f27581i.getSharedPreferences("allowedFormat", 0);
            this.C = sharedPreferences;
            this.D = sharedPreferences.edit();
            SharedPreferences sharedPreferences2 = this.f27581i.getSharedPreferences("timeFormat", 0);
            this.E = sharedPreferences2;
            this.F = sharedPreferences2.edit();
            String string = this.C.getString("allowedFormat", BuildConfig.FLAVOR);
            if (string != null && string.equals(BuildConfig.FLAVOR)) {
                this.D.putString("allowedFormat", "ts");
                this.D.apply();
            }
            String string2 = this.E.getString("timeFormat", c.h.a.h.n.a.m0);
            if (string2 != null && string2.equals(BuildConfig.FLAVOR)) {
                this.F.putString("timeFormat", c.h.a.h.n.a.m0);
                this.F.apply();
            }
            SharedPreferences sharedPreferences3 = this.f27581i.getSharedPreferences("sharedprefremberme", 0);
            this.A = sharedPreferences3;
            SharedPreferences.Editor editorEdit3 = sharedPreferences3.edit();
            this.B = editorEdit3;
            editorEdit3.putBoolean("savelogin", true);
            this.B.apply();
            b();
            try {
                Context context2 = this.f27581i;
                Toast.makeText(context2, context2.getResources().getString(R.string.logged_in), 0).show();
            } catch (WindowManager.BadTokenException unused) {
            }
            c.h.a.i.q.e eVarY1 = this.f27585m.Y1("all");
            if (eVarY1 != null) {
                if ((eVarY1.d() == null || !eVarY1.d().equals("0")) && (eVarY1.d() == null || !eVarY1.d().equals("2"))) {
                    if (eVarY1.d() != null && eVarY1.d().equals("1")) {
                        long jF0 = F0(new SimpleDateFormat("dd/MM/yyyy", Locale.US), eVarY1.a(), c.h.a.h.n.e.i());
                        if (!E0() || jF0 < this.T.g()) {
                            this.f27581i.startActivity(new Intent(this.f27581i, (Class<?>) NewDashboardActivity.class));
                            context = this.f27581i;
                        } else {
                            this.f27581i.startActivity(new Intent(this.f27581i, (Class<?>) ImportM3uActivity.class));
                            context = this.f27581i;
                        }
                    } else {
                        if (eVarY1.d() == null || !eVarY1.d().equals("3")) {
                            return;
                        }
                        this.f27581i.startActivity(new Intent(this.f27581i, (Class<?>) ImportM3uActivity.class));
                        context = this.f27581i;
                    }
                } else {
                    if (this.f27581i == null) {
                        return;
                    }
                    this.f27581i.startActivity(new Intent(this.f27581i, (Class<?>) ImportM3uActivity.class));
                    context = this.f27581i;
                }
                ((Activity) context).finish();
            }
        } catch (Exception unused2) {
        }
    }

    public void C0() {
        try {
            this.X = this.f27587o.getPackageManager().getPackageInfo(this.f27587o.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
        }
    }

    @Override // c.h.a.k.f.f
    public void D(LoginCallback loginCallback, String str, ArrayList<String> arrayList) {
    }

    public boolean E0() {
        return this.f27581i.getSharedPreferences("automation_channels", 0).getString("automation_channels", BuildConfig.FLAVOR).equals("checked");
    }

    public boolean H0() {
        if (Build.VERSION.SDK_INT < 23) {
            Log.v("TAG", "Permission is granted");
            return true;
        }
        if (this.f27581i.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            Log.v("TAG", "Permission is granted");
            return true;
        }
        Log.v("TAG", "Permission is revoked");
        a.i.h.a.q((Activity) this.f27581i, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 1);
        return false;
    }

    @Override // c.h.a.k.f.f
    public void I(String str) {
        b();
        c.h.a.h.n.e.l0(this.f27581i, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013c  */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    @android.annotation.SuppressLint({"RecyclerView"})
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void F(com.nst.iptvsmarterstvbox.view.adapter.MultiUserAdapter.MyViewHolder r23, int r24) {
        /*
            Method dump skipped, instruction units count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.adapter.MultiUserAdapter.F(com.nst.iptvsmarterstvbox.view.adapter.MultiUserAdapter$MyViewHolder, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @SuppressLint({"RtlHardcoded"})
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public MyViewHolder H(ViewGroup viewGroup, int i2) {
        LayoutInflater layoutInflaterFrom;
        int i3;
        if (c.h.a.h.n.a.M.booleanValue()) {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i3 = R.layout.layout_multiuser_list_item_p;
        } else {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i3 = R.layout.layout_multiuser_list_item;
        }
        View viewInflate = layoutInflaterFrom.inflate(i3, viewGroup, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_servername);
        if (this.x.equalsIgnoreCase("Arabic")) {
            textView.setGravity(21);
        }
        return new MyViewHolder(viewInflate);
    }

    @Override // c.h.a.f.c
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public void d0(String str, int i2, boolean z) {
        boolean z2 = false;
        if (!z) {
            b();
            Context context = this.f27581i;
            Toast.makeText(context, context.getResources().getString(R.string.could_not_connect), 0).show();
            return;
        }
        if (i2 == 1) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                c.h.a.f.b.f16734a = jSONObject;
                if (!jSONObject.getString("status").equalsIgnoreCase("true")) {
                    b();
                    Context context2 = this.f27581i;
                    Toast.makeText(context2, context2.getResources().getString(R.string.status_suspend), 0).show();
                    return;
                }
                this.P = c.h.a.f.b.f16734a.getString("su");
                this.Q = c.h.a.f.b.f16734a.getString("ndd");
                this.R = System.currentTimeMillis();
                try {
                    c.h.a.f.f.e(this.f27587o, c.h.a.f.b.f16734a.optString("su"));
                    this.Z = I0(c.h.a.f.b.f16734a.optString("su") + "*" + c.h.a.f.f.d(this.f27587o) + "*" + c.h.a.f.b.f16735b);
                    if (!c.h.a.f.b.f16734a.getString("sc").equalsIgnoreCase(this.Z)) {
                        b();
                        Toast.makeText(this.f27587o, this.f27581i.getResources().getString(R.string.could_not_connect), 0).show();
                        return;
                    }
                    if (m.f(this.f27581i).equals("m3u")) {
                        String str2 = this.K;
                        if (str2 != null && str2.equals(TransferTable.COLUMN_FILE)) {
                            new j().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.v);
                            return;
                        }
                        String str3 = this.K;
                        if (str3 == null || !str3.equals("url")) {
                            return;
                        }
                        new j().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f27581i.getFilesDir() + "/data_temp.txt");
                        return;
                    }
                    ArrayList arrayList = null;
                    String str4 = this.P;
                    if (str4 != null && !str4.equals(BuildConfig.FLAVOR) && !this.P.isEmpty()) {
                        this.P = this.P.toLowerCase();
                        arrayList = new ArrayList(Arrays.asList(this.P.split(",")));
                    }
                    if (arrayList != null && arrayList.size() > 0) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= arrayList.size()) {
                                break;
                            }
                            if (this.v.contains((CharSequence) arrayList.get(i3))) {
                                z2 = true;
                                break;
                            }
                            i3++;
                        }
                    }
                    if (z2) {
                        this.r.g(this.t, this.u);
                    } else {
                        b();
                        c.h.a.h.n.e.l0(this.f27581i, "Your Account is invalid or has expired !");
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } catch (Exception unused) {
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    public final void M0(MyViewHolder myViewHolder, int i2, String str, int i3, View view, String str2, String str3, String str4) {
        String strA = this.f27582j.get(i2).a();
        this.p = ((strA == null || !strA.equals(TransferTable.COLUMN_FILE)) && (strA == null || !strA.equals("url"))) ? "api" : "m3u";
        j0 j0Var = new j0(this.f27581i, myViewHolder.testing);
        try {
            Field declaredField = j0.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(j0Var);
            obj.getClass().getDeclaredMethod("setForceShowIcon", Boolean.TYPE).invoke(obj, Boolean.TRUE);
        } catch (Exception unused) {
        }
        j0Var.c().inflate(R.menu.menu_card_multiuser, j0Var.b());
        j0Var.f(new c(str, str2, str3, str4, i3, i2, myViewHolder));
        j0Var.g();
    }

    @Override // c.h.a.k.f.f
    public void O(ArrayList<String> arrayList, String str) {
    }

    public void W() {
        this.W = Build.VERSION.RELEASE + " " + Build.VERSION_CODES.class.getFields()[Build.VERSION.SDK_INT].getName();
    }

    @Override // c.h.a.k.f.f
    public void X(String str) {
    }

    public void Z() {
        int iNextInt = new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS;
        this.Y = iNextInt;
        c.h.a.f.b.f16735b = String.valueOf(iNextInt);
    }

    @Override // c.h.a.k.f.b
    public void a() {
        ProgressDialog progressDialog = this.w;
        if (progressDialog != null) {
            progressDialog.show();
        }
    }

    @Override // c.h.a.k.f.b
    public void b() {
        try {
            ProgressDialog progressDialog = this.w;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    @Override // c.h.a.k.f.b
    public void c(String str) {
        b();
        c.h.a.h.n.e.l0(this.f27581i, str);
    }

    public void c0() {
        StringBuilder sb;
        List<c.h.a.f.e> list;
        String str = "playlist";
        if (m.f(this.f27581i).equals("m3u")) {
            sb = new StringBuilder();
            sb.append(c.h.a.f.f.c(this.f27581i));
            sb.append("*");
            sb.append(c.h.a.f.f.d(this.f27581i));
            sb.append("-");
            sb.append("playlist");
        } else {
            sb = new StringBuilder();
            sb.append(c.h.a.f.f.c(this.f27581i));
            sb.append("*");
            sb.append(c.h.a.f.f.d(this.f27581i));
            sb.append("-");
            sb.append(this.t);
        }
        sb.append("-");
        sb.append(c.h.a.f.b.f16735b);
        sb.append("-");
        sb.append(this.X);
        sb.append("-unknown-");
        sb.append(G0());
        sb.append("-");
        sb.append(this.W);
        this.V = I0(sb.toString());
        ArrayList arrayList = new ArrayList();
        c.h.a.f.g.f16757a = arrayList;
        arrayList.add(c.h.a.f.g.a("m", "gu"));
        c.h.a.f.g.f16757a.add(c.h.a.f.g.a("k", c.h.a.f.f.c(this.f27587o)));
        c.h.a.f.g.f16757a.add(c.h.a.f.g.a("sc", this.V));
        if (m.f(this.f27581i).equals("m3u")) {
            list = c.h.a.f.g.f16757a;
        } else {
            list = c.h.a.f.g.f16757a;
            str = this.t;
        }
        list.add(c.h.a.f.g.a("u", str));
        c.h.a.f.g.f16757a.add(c.h.a.f.g.a("pw", "no_password"));
        c.h.a.f.g.f16757a.add(c.h.a.f.g.a("r", c.h.a.f.b.f16735b));
        c.h.a.f.g.f16757a.add(c.h.a.f.g.a("av", this.X));
        c.h.a.f.g.f16757a.add(c.h.a.f.g.a("dt", "unknown"));
        c.h.a.f.g.f16757a.add(c.h.a.f.g.a("d", G0()));
        c.h.a.f.g.f16757a.add(c.h.a.f.g.a("do", this.W));
        c.h.a.f.g.f16758b.b(this);
    }

    @Override // c.h.a.f.c
    public void n(int i2) {
        if (this.f27581i != null) {
            try {
                b();
                if (m.f(this.f27581i).equals("m3u")) {
                    String str = this.K;
                    if (str == null || !str.equals(TransferTable.COLUMN_FILE)) {
                        String str2 = this.K;
                        if (str2 != null && str2.equals("url")) {
                            new j().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f27581i.getFilesDir() + "/data_temp.txt");
                        }
                    } else {
                        new j().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.v);
                    }
                } else {
                    this.r.g(this.t, this.u);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f27582j.size();
    }

    @Override // c.h.a.k.f.f
    public void p(LoginCallback loginCallback, String str) {
        Toast toastMakeText;
        if (this.f27581i != null) {
            if (loginCallback == null || loginCallback.b() == null) {
                b();
                c(this.f27581i.getResources().getString(R.string.invalid_server_response));
                return;
            }
            if (loginCallback.b().c().intValue() == 1) {
                String strI = loginCallback.b().i();
                if (strI.equals("Active")) {
                    String strJ = loginCallback.b().j();
                    String strH = loginCallback.b().h();
                    String strB = loginCallback.a().b();
                    String strF = loginCallback.a().f();
                    String strE = loginCallback.b().e();
                    String strF2 = loginCallback.b().f();
                    String strA = loginCallback.b().a();
                    String strD = loginCallback.b().d();
                    String strG = loginCallback.b().g();
                    String strD2 = loginCallback.a().d();
                    String strA2 = loginCallback.a().a();
                    String strC = loginCallback.a().c();
                    String strE2 = loginCallback.a().e();
                    SharedPreferences.Editor editorEdit = this.f27581i.getSharedPreferences("loginPrefs", 0).edit();
                    SharedPreferences sharedPreferences = this.f27581i.getSharedPreferences("loginprefsmultiuser", 0);
                    SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                    String string = sharedPreferences.getString("name", BuildConfig.FLAVOR);
                    String string2 = sharedPreferences.getString("username", BuildConfig.FLAVOR);
                    String string3 = sharedPreferences.getString("password", BuildConfig.FLAVOR);
                    String string4 = sharedPreferences.getString(c.h.a.h.n.a.t, BuildConfig.FLAVOR);
                    editorEdit2.putString("name", this.s);
                    editorEdit2.putString("username", strJ);
                    editorEdit2.putString("password", strH);
                    editorEdit2.putString(c.h.a.h.n.a.t, strF);
                    new c.h.a.i.q.g(this.f27581i).s(m.z(this.f27581i), strF);
                    editorEdit.putString("username", strJ);
                    editorEdit.putString("password", strH);
                    editorEdit.putString("serverPort", strB);
                    editorEdit.putString("serverUrl", strF);
                    editorEdit.putString("expDate", strE);
                    editorEdit.putString("isTrial", strF2);
                    editorEdit.putString("activeCons", strA);
                    editorEdit.putString("createdAt", strD);
                    editorEdit.putString("maxConnections", strG);
                    editorEdit.putString(c.h.a.h.n.a.t, strF);
                    editorEdit.putString("serverProtocol", strD2);
                    editorEdit.putString("serverPortHttps", strA2);
                    editorEdit.putString("serverPortRtmp", strC);
                    editorEdit.putString("serverTimeZone", strE2);
                    editorEdit.apply();
                    editorEdit2.apply();
                    SharedPreferences sharedPreferences2 = this.f27581i.getSharedPreferences("allowedFormat", 0);
                    this.C = sharedPreferences2;
                    this.D = sharedPreferences2.edit();
                    SharedPreferences sharedPreferences3 = this.f27581i.getSharedPreferences("timeFormat", 0);
                    this.E = sharedPreferences3;
                    this.F = sharedPreferences3.edit();
                    String string5 = this.C.getString("allowedFormat", BuildConfig.FLAVOR);
                    if (string5 != null && string5.equals(BuildConfig.FLAVOR)) {
                        this.D.putString("allowedFormat", "ts");
                        this.D.apply();
                    }
                    String string6 = this.E.getString("timeFormat", c.h.a.h.n.a.m0);
                    if (string6 != null && string6.equals(BuildConfig.FLAVOR)) {
                        this.F.putString("timeFormat", c.h.a.h.n.a.m0);
                        this.F.apply();
                    }
                    SharedPreferences sharedPreferences4 = this.f27581i.getSharedPreferences("sharedprefremberme", 0);
                    this.A = sharedPreferences4;
                    SharedPreferences.Editor editorEdit3 = sharedPreferences4.edit();
                    this.B = editorEdit3;
                    editorEdit3.putBoolean("savelogin", true);
                    this.B.apply();
                    b();
                    try {
                        Context context = this.f27581i;
                        Toast.makeText(context, context.getResources().getString(R.string.logged_in), 0).show();
                    } catch (WindowManager.BadTokenException unused) {
                    }
                    if (!(this.f27581i != null && this.s.equals(string) && this.t.equals(string2) && this.u.equals(string3) && strF.equals(string4)) && this.f27581i == null) {
                        return;
                    }
                    Intent intent = new Intent(this.f27581i, (Class<?>) NewDashboardActivity.class);
                    this.f27581i.startActivity(intent);
                    ((Activity) this.f27581i).finish();
                    return;
                }
                b();
                toastMakeText = Toast.makeText(this.f27581i, this.f27581i.getResources().getString(R.string.invalid_status) + strI, 0);
            } else {
                b();
                Context context2 = this.f27581i;
                toastMakeText = Toast.makeText(context2, context2.getResources().getString(R.string.invalid_details), 0);
            }
            toastMakeText.show();
        }
    }

    @Override // c.h.a.k.f.f
    public void t(ArrayList<String> arrayList, String str) {
    }
}
