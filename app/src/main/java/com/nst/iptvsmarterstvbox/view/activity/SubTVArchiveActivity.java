package minefarts.iptvsmarters.view.activity;

import a.b.k.b;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import c.h.a.j.h;
import c.h.a.k.b.x;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.model.callback.LiveStreamsEpgCallback;
import minefarts.iptvsmarters.model.callback.LoginCallback;
import minefarts.iptvsmarters.model.pojo.EpgListingPojo;
import minefarts.iptvsmarters.model.pojo.XMLTVProgrammePojo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class SubTVArchiveActivity extends a.b.k.c implements c.h.a.k.f.f, c.h.a.k.f.e, View.OnClickListener {

    @BindView
    public AppBarLayout appbarToolbar;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SharedPreferences f26771d;

    @BindView
    public TextView date;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SharedPreferences f26772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c.h.a.i.q.f f26773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f26774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h f26775h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Thread f26776i = null;

    @BindView
    public ImageView iv_back_button;

    @BindView
    public ImageView logo;

    @BindView
    public ProgressBar pbLoader;

    @BindView
    public RelativeLayout rlTvArchiveTitle;

    @BindView
    public TabLayout slidingTabs;

    @BindView
    public TextView time;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tvEpgRequired;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public ViewPager viewpager;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.n.e.b(SubTVArchiveActivity.this.f26774g);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SubTVArchiveActivity.this.onBackPressed();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = c.h.a.h.n.e.C(SubTVArchiveActivity.this.f26774g);
                String strQ = c.h.a.h.n.e.q(string);
                TextView textView = SubTVArchiveActivity.this.time;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = SubTVArchiveActivity.this.date;
                if (textView2 != null) {
                    textView2.setText(strQ);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.O(SubTVArchiveActivity.this.f26774g);
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    SubTVArchiveActivity.this.A0();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public static long B0(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public void A0() {
        runOnUiThread(new c());
    }

    public void C0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    @Override // c.h.a.k.f.f
    public void D(LoginCallback loginCallback, String str, ArrayList<String> arrayList) {
    }

    public final void D0() {
        int i2;
        this.slidingTabs.setVisibility(8);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f26772e = sharedPreferences;
        String string = sharedPreferences.getString("username", BuildConfig.FLAVOR);
        String string2 = this.f26772e.getString("password", BuildConfig.FLAVOR);
        String stringExtra = getIntent().getStringExtra("OPENED_STREAM_ID");
        String stringExtra2 = getIntent().getStringExtra("OPENED_NUM");
        String stringExtra3 = getIntent().getStringExtra("OPENED_CHANNEL_ID");
        String stringExtra4 = getIntent().getStringExtra("OPENED_NAME");
        String stringExtra5 = getIntent().getStringExtra("OPENED_STREAM_ICON");
        String stringExtra6 = getIntent().getStringExtra("OPENED_ARCHIVE_DURATION");
        this.f26773f = new c.h.a.i.q.f(this.f26774g);
        if (stringExtra3 != null) {
            stringExtra3.equals(BuildConfig.FLAVOR);
        }
        this.f26775h = new h(this, this.f26774g);
        try {
            i2 = Integer.parseInt(stringExtra);
        } catch (NumberFormatException unused) {
            i2 = -1;
        }
        this.f26775h.b(string, string2, i2, stringExtra3, stringExtra, stringExtra2, stringExtra4, stringExtra5, stringExtra6);
    }

    @Override // c.h.a.k.f.f
    public void I(String str) {
    }

    @Override // c.h.a.k.f.f
    public void O(ArrayList<String> arrayList, String str) {
    }

    @Override // c.h.a.k.f.f
    public void X(String str) {
    }

    @Override // c.h.a.k.f.b
    public void a() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    @Override // c.h.a.k.f.b
    public void b() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    @Override // c.h.a.k.f.b
    public void c(String str) {
    }

    @Override // c.h.a.k.f.e
    public void g(LiveStreamsEpgCallback liveStreamsEpgCallback, String str, String str2, String str3, String str4, String str5, String str6) {
        String str7;
        if (liveStreamsEpgCallback == null || liveStreamsEpgCallback.a() == null || liveStreamsEpgCallback.a().size() <= 0) {
            ViewPager viewPager = this.viewpager;
            if (viewPager != null) {
                viewPager.setVisibility(8);
            }
            TabLayout tabLayout = this.slidingTabs;
            if (tabLayout != null) {
                tabLayout.setVisibility(8);
            }
            RelativeLayout relativeLayout = this.rlTvArchiveTitle;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            TextView textView = this.tvNoRecordFound;
            if (textView != null) {
                textView.setVisibility(0);
            }
        } else {
            ArrayList arrayList = new ArrayList();
            new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (EpgListingPojo epgListingPojo : liveStreamsEpgCallback.a()) {
                if (epgListingPojo.d().intValue() == 1) {
                    arrayList.add(epgListingPojo);
                    XMLTVProgrammePojo xMLTVProgrammePojo = new XMLTVProgrammePojo();
                    xMLTVProgrammePojo.A(epgListingPojo.h());
                    xMLTVProgrammePojo.x(epgListingPojo.e());
                    xMLTVProgrammePojo.z(epgListingPojo.c());
                    xMLTVProgrammePojo.p(epgListingPojo.b());
                    xMLTVProgrammePojo.o(epgListingPojo.a());
                    xMLTVProgrammePojo.y(epgListingPojo.f());
                    xMLTVProgrammePojo.q(epgListingPojo.g());
                    arrayList2.add(xMLTVProgrammePojo);
                }
            }
            if (this.f26773f != null) {
                int size = arrayList2.size();
                if (size != 0) {
                    String str8 = new SimpleDateFormat("dd-MMM-yyyy", Locale.US).format(new Date());
                    ArrayList arrayList3 = new ArrayList();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        try {
                            str7 = new SimpleDateFormat("dd MMM yyyy").format(new SimpleDateFormat("yyyy-MM-dd").parse(((XMLTVProgrammePojo) arrayList2.get(i3)).j().split("\\s+")[0]));
                        } catch (ParseException e2) {
                            e2.printStackTrace();
                            str7 = BuildConfig.FLAVOR;
                        }
                        if (Long.valueOf(B0(simpleDateFormat, str7, str8)).longValue() >= 0 && !arrayList3.contains(str7)) {
                            arrayList3.add(i2, str7);
                            if (str8.equals(str7)) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                    this.viewpager.setAdapter(new x(arrayList3, arrayList2, str2, str3, str4, str5, str, str6, getSupportFragmentManager(), this));
                    this.slidingTabs.setVisibility(0);
                    this.slidingTabs.setupWithViewPager(this.viewpager);
                    this.viewpager.setCurrentItem(i2 - 1);
                } else {
                    ViewPager viewPager2 = this.viewpager;
                    if (viewPager2 != null) {
                        viewPager2.setVisibility(8);
                    }
                    TabLayout tabLayout2 = this.slidingTabs;
                    if (tabLayout2 != null) {
                        tabLayout2.setVisibility(8);
                    }
                    RelativeLayout relativeLayout2 = this.rlTvArchiveTitle;
                    if (relativeLayout2 != null) {
                        relativeLayout2.setVisibility(0);
                    }
                    TextView textView2 = this.tvNoRecordFound;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                }
                b();
            }
        }
        b();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f26774g = this;
        C0();
        super.onCreate(bundle);
        setContentView(R.layout.activity_sub_archive);
        ButterKnife.a(this);
        z0();
        v0((Toolbar) findViewById(R.id.toolbar));
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        D0();
        Thread thread = this.f26776i;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new f());
            this.f26776i = thread2;
            thread2.start();
        }
        this.logo.setOnClickListener(new a());
        this.iv_back_button.setOnClickListener(new b());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.x(R.menu.menu_dashboard_logout);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i2 = 0; i2 < this.toolbar.getChildCount(); i2++) {
            if (this.toolbar.getChildAt(i2) instanceof ActionMenuView) {
                ((Toolbar.e) this.toolbar.getChildAt(i2).getLayoutParams()).f135a = 16;
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.nav_home) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == R.id.nav_settings) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == R.id.action_logout && (context = this.f26774g) != null) {
            new b.a(context, R.style.AlertDialogCustom).setTitle(getResources().getString(R.string.logout_title)).f(getResources().getString(R.string.logout_message)).j(getResources().getString(R.string.yes), new e()).g(getResources().getString(R.string.no), new d()).n();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f26776i;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f26776i.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        C0();
        super.onResume();
        Thread thread = this.f26776i;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new f());
            this.f26776i = thread2;
            thread2.start();
        }
        c.h.a.h.n.e.g(this.f26774g);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f26771d = sharedPreferences;
        if (sharedPreferences.getString("username", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR) && this.f26771d.getString("password", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        }
    }

    @Override // androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.clear();
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C0();
    }

    @Override // c.h.a.k.f.f
    public void p(LoginCallback loginCallback, String str) {
        if (loginCallback == null || loginCallback.b().c().intValue() != 1) {
            return;
        }
        String strI = loginCallback.b().i();
        if (strI.equals("Active")) {
            return;
        }
        c.h.a.h.n.e.l0(this.f26774g, "Your Account is " + strI);
        Context context = this.f26774g;
        if (context != null) {
            c.h.a.h.n.e.O(context);
        }
    }

    @Override // c.h.a.k.f.f
    public void t(ArrayList<String> arrayList, String str) {
    }

    public final void z0() {
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
}
