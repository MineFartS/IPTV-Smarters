package com.nst.iptvsmarterstvbox.view.demo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.JsonReader;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import c.f.a.b.c3.b0;
import c.f.a.b.i3.p;
import c.f.a.b.i3.r;
import c.f.a.b.i3.s;
import c.f.a.b.j3.g;
import c.f.a.b.j3.x0;
import c.f.a.b.j3.z;
import c.f.a.b.p1;
import c.f.a.b.w1;
import c.h.a.k.c.h;
import c.h.a.k.c.i;
import c.h.a.k.c.j;
import c.h.a.k.c.k;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.nst.iptvsmarterstvbox.R;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class SampleChooserActivity extends a.b.k.c implements j.c, ExpandableListView.OnChildClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String[] f28856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j f28858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f28859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MenuItem f28860h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ExpandableListView f28861i;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f28862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<c> f28863b = new ArrayList();

        public b(String str) {
            this.f28862a = str;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f28864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<p1> f28865b;

        public c(String str, List<p1> list) {
            g.a(!list.isEmpty());
            this.f28864a = str;
            this.f28865b = Collections.unmodifiableList(new ArrayList(list));
        }
    }

    public final class d extends BaseExpandableListAdapter implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<b> f28866b = Collections.emptyList();

        public d() {
        }

        @Override // android.widget.ExpandableListAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c getChild(int i2, int i3) {
            return getGroup(i2).f28863b.get(i3);
        }

        @Override // android.widget.ExpandableListAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b getGroup(int i2) {
            return this.f28866b.get(i2);
        }

        public final void c(View view, c cVar) {
            view.setTag(cVar);
            ((TextView) view.findViewById(R.id.sample_title)).setText(cVar.f28864a);
            boolean z = SampleChooserActivity.this.C0(cVar) == 0;
            boolean z2 = z && SampleChooserActivity.this.f28858f.h(cVar.f28865b.get(0));
            ImageButton imageButton = (ImageButton) view.findViewById(R.id.download_button);
            imageButton.setTag(cVar);
            imageButton.setColorFilter(z ? z2 ? -12409355 : -4342339 : -10066330);
            imageButton.setImageResource(z2 ? R.drawable.hp_download : R.drawable.ic_download);
        }

        public void d(List<b> list) {
            this.f28866b = list;
            notifyDataSetChanged();
        }

        @Override // android.widget.ExpandableListAdapter
        public long getChildId(int i2, int i3) {
            return i3;
        }

        @Override // android.widget.ExpandableListAdapter
        public View getChildView(int i2, int i3, boolean z, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = SampleChooserActivity.this.getLayoutInflater().inflate(R.layout.sample_list_item, viewGroup, false);
                View viewFindViewById = view.findViewById(R.id.download_button);
                viewFindViewById.setOnClickListener(this);
                viewFindViewById.setFocusable(false);
            }
            c(view, getChild(i2, i3));
            return view;
        }

        @Override // android.widget.ExpandableListAdapter
        public int getChildrenCount(int i2) {
            return getGroup(i2).f28863b.size();
        }

        @Override // android.widget.ExpandableListAdapter
        public int getGroupCount() {
            return this.f28866b.size();
        }

        @Override // android.widget.ExpandableListAdapter
        public long getGroupId(int i2) {
            return i2;
        }

        @Override // android.widget.ExpandableListAdapter
        public View getGroupView(int i2, boolean z, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = SampleChooserActivity.this.getLayoutInflater().inflate(android.R.layout.simple_expandable_list_item_1, viewGroup, false);
            }
            ((TextView) view).setText(getGroup(i2).f28862a);
            return view;
        }

        @Override // android.widget.ExpandableListAdapter
        public boolean hasStableIds() {
            return false;
        }

        @Override // android.widget.ExpandableListAdapter
        public boolean isChildSelectable(int i2, int i3) {
            return true;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SampleChooserActivity.this.G0((c) view.getTag());
        }
    }

    public final class e extends AsyncTask<String, Void, List<b>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f28868a;

        public e() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<b> doInBackground(String... strArr) {
            ArrayList arrayList = new ArrayList();
            p pVarA = i.d(SampleChooserActivity.this.getApplicationContext()).a();
            for (String str : strArr) {
                try {
                    try {
                        f(new JsonReader(new InputStreamReader(new r(pVarA, new s(Uri.parse(str))), "UTF-8")), arrayList);
                    } catch (Exception e2) {
                        z.e("SampleChooserActivity", "Error loading sample list: " + str, e2);
                        this.f28868a = true;
                    }
                } finally {
                    x0.n(pVarA);
                }
            }
            return arrayList;
        }

        public final b b(String str, List<b> list) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (x0.b(str, list.get(i2).f28862a)) {
                    return list.get(i2);
                }
            }
            b bVar = new b(str);
            list.add(bVar);
            return bVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(List<b> list) {
            SampleChooserActivity.this.F0(list, this.f28868a);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Incorrect condition in loop: B:108:0x0223 */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.nst.iptvsmarterstvbox.view.demo.SampleChooserActivity.c d(android.util.JsonReader r16, boolean r17) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 746
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.demo.SampleChooserActivity.e.d(android.util.JsonReader, boolean):com.nst.iptvsmarterstvbox.view.demo.SampleChooserActivity$c");
        }

        public final void e(JsonReader jsonReader, List<b> list) throws IOException {
            String strNextName;
            ArrayList arrayList = new ArrayList();
            jsonReader.beginObject();
            String strNextString = BuildConfig.FLAVOR;
            while (jsonReader.hasNext()) {
                strNextName = jsonReader.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "_comment":
                        jsonReader.nextString();
                        break;
                    case "name":
                        strNextString = jsonReader.nextString();
                        break;
                    case "samples":
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList.add(d(jsonReader, false));
                        }
                        jsonReader.endArray();
                        break;
                    default:
                        throw w1.c("Unsupported name: " + strNextName, null);
                }
            }
            jsonReader.endObject();
            b(strNextString, list).f28863b.addAll(arrayList);
        }

        public final void f(JsonReader jsonReader, List<b> list) throws IOException {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                e(jsonReader, list);
            }
            jsonReader.endArray();
        }
    }

    public static boolean D0(MenuItem menuItem) {
        return menuItem != null && menuItem.isChecked();
    }

    public final int C0(c cVar) {
        if (cVar.f28865b.size() > 1) {
            return R.string.download_playlist_unsupported;
        }
        p1.g gVar = (p1.g) g.e(cVar.f28865b.get(0).f9643d);
        if (gVar.f9688d != null) {
            return R.string.download_ads_unsupported;
        }
        String scheme = gVar.f9685a.getScheme();
        if ("http".equals(scheme) || ClientConstants.DOMAIN_SCHEME.equals(scheme)) {
            return 0;
        }
        return R.string.download_scheme_unsupported;
    }

    public final void E0() {
        g.e(this.f28856d);
        int i2 = 0;
        while (true) {
            String[] strArr = this.f28856d;
            if (i2 >= strArr.length) {
                new e().execute(this.f28856d);
                return;
            } else if (x0.z0(this, Uri.parse(strArr[i2]))) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void F0(List<b> list, boolean z) {
        if (z) {
            Toast.makeText(getApplicationContext(), R.string.sample_list_load_error, 1).show();
        }
        this.f28859g.d(list);
        SharedPreferences preferences = getPreferences(0);
        int i2 = preferences.getInt("sample_chooser_group_position", -1);
        int i3 = preferences.getInt("sample_chooser_child_position", -1);
        if (i2 == -1 || i3 == -1 || i2 >= list.size() || i3 >= list.get(i2).f28863b.size()) {
            return;
        }
        this.f28861i.expandGroup(i2);
        this.f28861i.setSelectedChild(i2, i3, true);
    }

    public final void G0(c cVar) {
        int iC0 = C0(cVar);
        if (iC0 != 0) {
            Toast.makeText(getApplicationContext(), iC0, 1).show();
        } else {
            this.f28858f.k(getSupportFragmentManager(), cVar.f28865b.get(0), i.b(this, D0(this.f28860h)));
        }
    }

    @Override // c.h.a.k.c.j.c
    public void l0() {
        this.f28859g.notifyDataSetChanged();
    }

    @Override // android.widget.ExpandableListView.OnChildClickListener
    public boolean onChildClick(ExpandableListView expandableListView, View view, int i2, int i3, long j2) {
        SharedPreferences.Editor editorEdit = getPreferences(0).edit();
        editorEdit.putInt("sample_chooser_group_position", i2);
        editorEdit.putInt("sample_chooser_child_position", i3);
        editorEdit.apply();
        c cVar = (c) view.getTag();
        Intent intent = new Intent(this, (Class<?>) PlayerActivity.class);
        intent.putExtra("prefer_extension_decoders", D0(this.f28860h));
        k.d(cVar.f28865b, intent);
        startActivity(intent);
        return true;
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.sample_chooser_activity);
        this.f28859g = new d();
        ExpandableListView expandableListView = (ExpandableListView) findViewById(R.id.sample_list);
        this.f28861i = expandableListView;
        expandableListView.setAdapter(this.f28859g);
        this.f28861i.setOnChildClickListener(this);
        String dataString = getIntent().getDataString();
        if (dataString != null) {
            this.f28856d = new String[]{dataString};
        } else {
            ArrayList arrayList = new ArrayList();
            try {
                for (String str : getAssets().list(BuildConfig.FLAVOR)) {
                    if (str.endsWith(".exolist.json")) {
                        arrayList.add("asset:///" + str);
                    }
                }
            } catch (IOException unused) {
                Toast.makeText(getApplicationContext(), R.string.sample_list_load_error, 1).show();
            }
            String[] strArr = new String[arrayList.size()];
            this.f28856d = strArr;
            arrayList.toArray(strArr);
            Arrays.sort(this.f28856d);
        }
        this.f28857e = i.m();
        this.f28858f = i.j(this);
        E0();
        try {
            b0.z(this, h.class);
        } catch (IllegalStateException unused2) {
            b0.A(this, h.class);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.sample_chooser_menu, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.prefer_extension_decoders);
        this.f28860h = menuItemFindItem;
        menuItemFindItem.setVisible(this.f28857e);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.setChecked(!menuItem.isChecked());
        return true;
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, android.app.Activity, a.i.h.a.c
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i2, strArr, iArr);
        if (iArr.length == 0) {
            return;
        }
        if (iArr[0] == 0) {
            E0();
        } else {
            Toast.makeText(getApplicationContext(), R.string.sample_list_load_error, 1).show();
            finish();
        }
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f28858f.f(this);
        this.f28859g.notifyDataSetChanged();
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onStop() {
        this.f28858f.j(this);
        super.onStop();
    }
}
