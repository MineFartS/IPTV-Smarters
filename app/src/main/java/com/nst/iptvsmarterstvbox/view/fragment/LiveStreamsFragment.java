package minefarts.iptvsmarters.view.fragment;

import a.b.k.b;
import a.i.r.j;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import c.h.a.i.q.m;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.view.activity.NewDashboardActivity;
import minefarts.iptvsmarters.view.activity.SettingsActivity;
import minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class LiveStreamsFragment extends Fragment {
    public SharedPreferences.Editor A;
    public PopupWindow B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView.p f28870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f28871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LiveStreamsAdapter f28872d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Toolbar f28874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SearchView f28875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f28876h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.h.a.i.q.a f28877i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Unbinder f28878j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f28879k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.h.a.i.q.f f28880l;

    @BindView
    public RecyclerView myRecyclerView;

    @BindView
    public ProgressBar pbLoader;
    public ArrayList<c.h.a.i.q.i> r;
    public ArrayList<c.h.a.i.f> s;
    public ArrayList<c.h.a.i.f> t;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tvNoStream;
    public ArrayList<c.h.a.i.f> u;
    public ArrayList<c.h.a.i.f> v;
    public ArrayList<c.h.a.i.f> w;
    public SharedPreferences x;
    public SharedPreferences.Editor y;
    public SharedPreferences z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<c.h.a.i.f> f28873e = new ArrayList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.h.a.i.q.b f28881m = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c.h.a.i.q.b f28882n = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c.h.a.i.f f28883o = new c.h.a.i.f();
    public ArrayList<?> p = new ArrayList<>();
    public ArrayList<String> q = new ArrayList<>();

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.O(LiveStreamsFragment.this.f28876h);
        }
    }

    public class c implements SearchView.l {
        public c() {
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            LiveStreamsFragment.this.tvNoRecordFound.setVisibility(8);
            if (LiveStreamsFragment.this.f28872d == null || (textView = LiveStreamsFragment.this.tvNoStream) == null || textView.getVisibility() == 0) {
                return false;
            }
            LiveStreamsFragment.this.f28872d.m0(str, LiveStreamsFragment.this.tvNoRecordFound);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.N(LiveStreamsFragment.this.f28876h);
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public class f implements DialogInterface.OnClickListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    public class g implements DialogInterface.OnClickListener {
        public g() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LiveStreamsFragment.this.B.dismiss();
        }
    }

    public class i implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RadioGroup f28892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f28893c;

        public i(RadioGroup radioGroup, View view) {
            this.f28892b = radioGroup;
            this.f28893c = view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharedPreferences.Editor editor;
            String str;
            RadioButton radioButton = (RadioButton) this.f28893c.findViewById(this.f28892b.getCheckedRadioButtonId());
            if (radioButton.getText().toString().equals(LiveStreamsFragment.this.getResources().getString(R.string.sort_last_added))) {
                editor = LiveStreamsFragment.this.A;
                str = "1";
            } else if (radioButton.getText().toString().equals(LiveStreamsFragment.this.getResources().getString(R.string.sort_atoz))) {
                editor = LiveStreamsFragment.this.A;
                str = "2";
            } else if (radioButton.getText().toString().equals(LiveStreamsFragment.this.getResources().getString(R.string.sort_ztoa))) {
                editor = LiveStreamsFragment.this.A;
                str = "3";
            } else {
                editor = LiveStreamsFragment.this.A;
                str = "0";
            }
            editor.putString("sort", str);
            LiveStreamsFragment.this.A.commit();
            LiveStreamsFragment liveStreamsFragment = LiveStreamsFragment.this;
            liveStreamsFragment.x = liveStreamsFragment.getActivity().getSharedPreferences("listgridview", 0);
            LiveStreamsFragment liveStreamsFragment2 = LiveStreamsFragment.this;
            liveStreamsFragment2.y = liveStreamsFragment2.x.edit();
            int i2 = LiveStreamsFragment.this.x.getInt("livestream", 0);
            c.h.a.h.n.a.u = i2;
            if (i2 == 1) {
                LiveStreamsFragment.this.C();
            } else {
                LiveStreamsFragment.this.E();
            }
            LiveStreamsFragment.this.B.dismiss();
        }
    }

    public final ArrayList<c.h.a.i.f> B(ArrayList<c.h.a.i.f> arrayList, ArrayList<String> arrayList2) {
        ArrayList<c.h.a.i.f> arrayList3;
        if (arrayList == null) {
            return null;
        }
        for (c.h.a.i.f fVar : arrayList) {
            boolean z = false;
            if (arrayList2 != null) {
                Iterator<String> it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (fVar.g().equals(it.next())) {
                        z = true;
                        break;
                    }
                }
                if (!z && (arrayList3 = this.s) != null) {
                    arrayList3.add(fVar);
                }
            }
        }
        return this.s;
    }

    public final void C() {
        this.f28876h = getContext();
        this.f28880l = new c.h.a.i.q.f(this.f28876h);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f28876h == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), c.h.a.h.n.e.y(this.f28876h) + 1);
        this.f28870b = gridLayoutManager;
        this.myRecyclerView.setLayoutManager(gridLayoutManager);
        this.myRecyclerView.setItemAnimator(new a.y.e.c());
        SharedPreferences sharedPreferences = this.f28876h.getSharedPreferences("loginPrefs", 0);
        this.f28871c = sharedPreferences;
        sharedPreferences.getString("username", BuildConfig.FLAVOR);
        this.f28871c.getString("password", BuildConfig.FLAVOR);
        G();
    }

    public final void E() {
        this.f28876h = getContext();
        this.f28880l = new c.h.a.i.q.f(this.f28876h);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f28876h == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f28870b = linearLayoutManager;
        this.myRecyclerView.setLayoutManager(linearLayoutManager);
        this.myRecyclerView.setItemAnimator(new a.y.e.c());
        SharedPreferences sharedPreferences = this.f28876h.getSharedPreferences("loginPrefs", 0);
        this.f28871c = sharedPreferences;
        sharedPreferences.getString("username", BuildConfig.FLAVOR);
        this.f28871c.getString("password", BuildConfig.FLAVOR);
        G();
    }

    public final void F() {
        this.f28874f = (Toolbar) getActivity().findViewById(R.id.toolbar);
    }

    public final void G() {
        try {
            a();
            if (this.f28876h != null) {
                c.h.a.i.q.f fVar = new c.h.a.i.q.f(this.f28876h);
                this.r = new ArrayList<>();
                this.s = new ArrayList<>();
                this.t = new ArrayList<>();
                this.u = new ArrayList<>();
                this.v = new ArrayList<>();
                this.w = new ArrayList<>();
                ArrayList<c.h.a.i.f> arrayListW0 = fVar.W0(this.f28879k, "live");
                if (fVar.I1(m.z(this.f28876h)) <= 0 || arrayListW0 == null) {
                    this.u = arrayListW0;
                } else {
                    ArrayList<String> arrayListZ = z();
                    this.q = arrayListZ;
                    if (arrayListZ != null) {
                        this.t = B(arrayListW0, arrayListZ);
                    }
                    this.u = this.t;
                }
                if (this.f28879k.equals("-1")) {
                    b();
                    return;
                }
                ArrayList<c.h.a.i.f> arrayList = this.u;
                if (arrayList == null || this.myRecyclerView == null || arrayList.size() == 0) {
                    b();
                    TextView textView = this.tvNoStream;
                    if (textView != null) {
                        textView.setVisibility(0);
                        return;
                    }
                    return;
                }
                b();
                LiveStreamsAdapter liveStreamsAdapter = new LiveStreamsAdapter(this.u, getContext());
                this.f28872d = liveStreamsAdapter;
                this.myRecyclerView.setAdapter(liveStreamsAdapter);
                this.f28872d.w();
            }
        } catch (NullPointerException | Exception unused) {
        }
    }

    public final void H(Activity activity) {
        try {
            View viewInflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(R.layout.sort_layout, (RelativeLayout) activity.findViewById(R.id.rl_password_prompt));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.B = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.B.setWidth(-1);
            this.B.setHeight(-1);
            this.B.setFocusable(true);
            this.B.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(R.id.bt_save_password);
            Button button2 = (Button) viewInflate.findViewById(R.id.bt_close);
            RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(R.id.rg_radio);
            RadioButton radioButton = (RadioButton) viewInflate.findViewById(R.id.rb_normal);
            RadioButton radioButton2 = (RadioButton) viewInflate.findViewById(R.id.rb_lastadded);
            RadioButton radioButton3 = (RadioButton) viewInflate.findViewById(R.id.rb_atoz);
            RadioButton radioButton4 = (RadioButton) viewInflate.findViewById(R.id.rb_ztoa);
            String string = this.z.getString("sort", BuildConfig.FLAVOR);
            if (string.equals("1")) {
                radioButton2.setChecked(true);
            } else if (string.equals("2")) {
                radioButton3.setChecked(true);
            } else if (string.equals("3")) {
                radioButton4.setChecked(true);
            } else {
                radioButton.setChecked(true);
            }
            button2.setOnClickListener(new h());
            button.setOnClickListener(new i(radioGroup, viewInflate));
        } catch (NullPointerException | Exception unused) {
        }
    }

    public void a() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    public void b() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f28879k = getArguments().getString(BuildConfig.FLAVOR);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.f28876h == null || this.f28874f == null) {
            return;
        }
        TypedValue typedValue = new TypedValue();
        if (this.f28876h.getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f28876h.getResources().getDisplayMetrics());
        }
        for (int i2 = 0; i2 < this.f28874f.getChildCount(); i2++) {
            if (this.f28874f.getChildAt(i2) instanceof ActionMenuView) {
                ((Toolbar.e) this.f28874f.getChildAt(i2).getLayoutParams()).f135a = 16;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_live_streams, viewGroup, false);
        this.f28878j = ButterKnife.b(this, viewInflate);
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("sort", 0);
        this.z = sharedPreferences;
        this.A = sharedPreferences.edit();
        if (this.z.getString("sort", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            this.A.putString("sort", "0");
            this.A.commit();
        }
        a.i.h.a.n(getActivity());
        setHasOptionsMenu(true);
        F();
        SharedPreferences sharedPreferences2 = getActivity().getSharedPreferences("listgridview", 0);
        this.x = sharedPreferences2;
        this.y = sharedPreferences2.edit();
        int i2 = this.x.getInt("livestream", 0);
        c.h.a.h.n.a.u = i2;
        if (i2 == 1) {
            C();
        } else {
            E();
        }
        if (this.f28879k.equals("-1")) {
            y();
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28878j.a();
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.nav_home) {
            startActivity(new Intent(this.f28876h, (Class<?>) NewDashboardActivity.class));
        }
        if (itemId == R.id.nav_settings) {
            startActivity(new Intent(this.f28876h, (Class<?>) SettingsActivity.class));
        }
        if (itemId == R.id.action_logout1 && (context = this.f28876h) != null) {
            new b.a(context, R.style.AlertDialogCustom).setTitle(getResources().getString(R.string.logout_title)).f(getResources().getString(R.string.logout_message)).j(getResources().getString(R.string.yes), new b()).g(getResources().getString(R.string.no), new a()).n();
        }
        if (itemId == R.id.action_search) {
            SearchView searchView = (SearchView) j.b(menuItem);
            this.f28875g = searchView;
            searchView.setQueryHint(getResources().getString(R.string.search_channel));
            this.f28875g.setIconifiedByDefault(false);
            this.f28875g.setOnQueryTextListener(new c());
            return true;
        }
        if (itemId == R.id.menu_load_channels_vod1) {
            b.a aVar = new b.a(this.f28876h);
            aVar.setTitle(this.f28876h.getResources().getString(R.string.confirm_to_refresh));
            aVar.f(this.f28876h.getResources().getString(R.string.do_you_want_toproceed));
            aVar.d(R.drawable.questionmark);
            aVar.j("YES", new d());
            aVar.g("NO", new e());
            aVar.n();
            return true;
        }
        if (itemId == R.id.menu_load_tv_guide1) {
            b.a aVar2 = new b.a(this.f28876h);
            aVar2.setTitle(this.f28876h.getResources().getString(R.string.confirm_to_refresh));
            aVar2.f(this.f28876h.getResources().getString(R.string.do_you_want_toproceed));
            aVar2.d(R.drawable.questionmark);
            aVar2.j("YES", new f());
            aVar2.g("NO", new g());
            aVar2.n();
            return true;
        }
        if (itemId == R.id.layout_view_grid) {
            this.y.putInt("livestream", 1);
            this.y.commit();
            C();
        }
        if (itemId == R.id.layout_view_linear) {
            this.y.putInt("livestream", 0);
            this.y.commit();
            E();
        }
        if (itemId == R.id.menu_sort) {
            H(getActivity());
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        menu.clear();
        this.f28874f.x(R.menu.menu_search_text_icon);
        menu.findItem(R.id.layout_view_grid);
    }

    public void y() {
        ArrayList<c.h.a.i.f> arrayList;
        ArrayList<c.h.a.i.f> arrayList2;
        this.f28873e.clear();
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.f28872d);
        }
        if (this.f28876h != null) {
            c.h.a.i.q.a aVar = new c.h.a.i.q.a(this.f28876h);
            this.f28877i = aVar;
            for (c.h.a.i.b bVar : aVar.p("live", m.z(this.f28876h))) {
                c.h.a.i.f fVarD1 = new c.h.a.i.q.f(this.f28876h).D1(bVar.a(), String.valueOf(bVar.e()));
                if (fVarD1 != null) {
                    this.f28873e.add(fVarD1);
                }
            }
            if (this.myRecyclerView != null && (arrayList2 = this.f28873e) != null && arrayList2.size() != 0) {
                b();
                LiveStreamsAdapter liveStreamsAdapter = new LiveStreamsAdapter(this.f28873e, getContext());
                this.f28872d = liveStreamsAdapter;
                this.myRecyclerView.setAdapter(liveStreamsAdapter);
                this.f28872d.w();
                this.tvNoStream.setVisibility(4);
            }
            if (this.tvNoStream == null || (arrayList = this.f28873e) == null || arrayList.size() != 0) {
                return;
            }
            b();
            RecyclerView recyclerView2 = this.myRecyclerView;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(this.f28872d);
            }
            this.tvNoStream.setText(getResources().getString(R.string.no_fav_channel_found));
            this.tvNoStream.setVisibility(0);
        }
    }

    public final ArrayList<String> z() {
        ArrayList<c.h.a.i.q.i> arrayListD1 = this.f28880l.d1(m.z(this.f28876h));
        this.r = arrayListD1;
        if (arrayListD1 != null) {
            for (c.h.a.i.q.i iVar : arrayListD1) {
                if (iVar.a().equals("1")) {
                    this.q.add(iVar.b());
                }
            }
        }
        return this.q;
    }
}
