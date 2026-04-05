package c.h.a.l.d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.AlertDialog;
import android.app.ListFragment;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import com.nst.iptvsmarterstvbox.R;
import d.a.a.d.m;
import d.a.a.d.u;
import d.a.a.d.v;
import d.a.a.d.z;
import de.blinkt.openvpn.LaunchVPN;
import de.blinkt.openvpn.core.OpenVPNService;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Vector;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class a extends ListFragment implements z.e, SeekBar.OnSeekBarChangeListener, RadioGroup.OnCheckedChangeListener, z.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SeekBar f17991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinearLayout f17992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RadioGroup f17993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f17994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f17995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f17996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17997h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CheckBox f17998i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g f17999j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f18000k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorListenerAdapter f18001l = new b();

    /* JADX INFO: renamed from: c.h.a.l.d.a$a, reason: collision with other inner class name */
    public class RunnableC0240a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f18002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f18003c;

        public RunnableC0240a(String str, String str2) {
            this.f18002b = str;
            this.f18003c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f17994e.setText(this.f18002b);
            a.this.f17995f.setText(this.f18003c);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f17992c.setVisibility(8);
        }
    }

    public class c implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d.a.a.a f18006b;

        public c(d.a.a.a aVar) {
            this.f18006b = aVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            Intent intent = new Intent(a.this.getActivity(), (Class<?>) LaunchVPN.class);
            intent.putExtra("de.blinkt.openvpn.shortcutProfileUUID", this.f18006b.F());
            intent.setAction("android.intent.action.MAIN");
            a.this.startActivity(intent);
        }
    }

    public class d implements AdapterView.OnItemLongClickListener {
        public d() {
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            ((ClipboardManager) a.this.getActivity().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Log Entry", ((TextView) view).getText()));
            Toast.makeText(a.this.getActivity(), R.string.copied_entry, 0).show();
            return true;
        }
    }

    public class e implements CompoundButton.OnCheckedChangeListener {
        public e() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            u.a(a.this.getActivity()).edit().putBoolean("clearlogconnect", z).apply();
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f18010b;

        public f(String str) {
            this.f18010b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.isAdded()) {
                if (a.this.f18000k != null) {
                    a.this.f18000k.setText(this.f18010b);
                }
                if (a.this.f17996g != null) {
                    a.this.f17996g.setText(this.f18010b);
                }
            }
        }
    }

    public class g implements ListAdapter, z.d, Handler.Callback, z.b, z.e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Handler f18014d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Vector<m> f18012b = new Vector<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Vector<m> f18013c = new Vector<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Vector<DataSetObserver> f18015e = new Vector<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f18016f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f18017g = 3;

        public g() {
            h();
            if (this.f18014d == null) {
                this.f18014d = new Handler(this);
            }
            z.b(this);
        }

        @Override // d.a.a.d.z.e
        public void I2(String str) {
        }

        @Override // d.a.a.d.z.e
        public void J(String str, String str2, int i2, d.a.a.d.f fVar, Intent intent) {
        }

        @Override // d.a.a.d.z.d
        public void a(m mVar) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 0;
            Bundle bundle = new Bundle();
            bundle.putParcelable("logmessage", mVar);
            messageObtain.setData(bundle);
            this.f18014d.sendMessage(messageObtain);
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return true;
        }

        @Override // d.a.a.d.z.b
        public void c1(long j2, long j3, long j4, long j5) {
        }

        public final boolean e(m mVar) {
            this.f18012b.add(mVar);
            if (this.f18012b.size() <= 1000) {
                if (mVar.f() > this.f18017g) {
                    return false;
                }
                this.f18013c.add(mVar);
                return true;
            }
            Vector<m> vector = this.f18012b;
            this.f18012b = new Vector<>(this.f18012b.size());
            for (int i2 = 50; i2 < vector.size(); i2++) {
                this.f18012b.add(vector.elementAt(i2));
            }
            g();
            return true;
        }

        public final String f(m mVar, int i2) {
            if (i2 == 0) {
                return BuildConfig.FLAVOR;
            }
            Date date = new Date(mVar.b());
            return (i2 == 2 ? new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()) : DateFormat.getTimeFormat(a.this.getActivity())).format(date) + " ";
        }

        public final void g() {
            this.f18013c.clear();
            for (m mVar : this.f18012b) {
                int iF = mVar.f();
                int i2 = this.f18017g;
                if (iF <= i2 || i2 == 4) {
                    this.f18013c.add(mVar);
                }
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f18013c.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            return this.f18013c.get(i2);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return this.f18013c.get(i2).hashCode();
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i2) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            TextView textView = view == null ? new TextView(a.this.getActivity()) : (TextView) view;
            m mVar = this.f18013c.get(i2);
            textView.setTextColor(a.this.getActivity().getResources().getColor(R.color.White));
            String strE = mVar.e(a.this.getActivity());
            String strF = f(mVar, this.f18016f);
            strF.length();
            textView.setText(new SpannableString(strF + strE));
            return textView;
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        public final void h() {
            this.f18012b.clear();
            Collections.addAll(this.f18012b, z.j());
            g();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                if (e((m) message.getData().getParcelable("logmessage"))) {
                    Iterator<DataSetObserver> it = this.f18015e.iterator();
                    while (it.hasNext()) {
                        it.next().onChanged();
                    }
                }
            } else if (i2 == 1) {
                Iterator<DataSetObserver> it2 = this.f18015e.iterator();
                while (it2.hasNext()) {
                    it2.next().onInvalidated();
                }
                h();
            } else if (i2 == 2) {
                Iterator<DataSetObserver> it3 = this.f18015e.iterator();
                while (it3.hasNext()) {
                    it3.next().onInvalidated();
                }
            } else if (i2 == 3) {
                g();
                Iterator<DataSetObserver> it4 = this.f18015e.iterator();
                while (it4.hasNext()) {
                    it4.next().onChanged();
                }
            }
            return true;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }

        public void i(int i2) {
            this.f18017g = i2;
            this.f18014d.sendEmptyMessage(3);
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return this.f18013c.isEmpty();
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i2) {
            return true;
        }

        public void j(int i2) {
            this.f18016f = i2;
            this.f18014d.sendEmptyMessage(2);
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f18015e.add(dataSetObserver);
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f18015e.remove(dataSetObserver);
        }
    }

    @Override // d.a.a.d.z.e
    public void I2(String str) {
    }

    @Override // d.a.a.d.z.e
    public void J(String str, String str2, int i2, d.a.a.d.f fVar, Intent intent) {
        if (isAdded()) {
            getActivity().runOnUiThread(new f(z.f(getActivity())));
        }
    }

    @Override // d.a.a.d.z.b
    public void c1(long j2, long j3, long j4, long j5) {
        Resources resources = getActivity().getResources();
        String str = String.format("%2$s %1$s", OpenVPNService.h3(j2, false, resources), OpenVPNService.h3(j4 / 2, true, resources));
        String str2 = String.format("%2$s %1$s", OpenVPNService.h3(j3, false, resources), OpenVPNService.h3(j5 / 2, true, resources));
        if (this.f17994e == null || this.f17995f == null || getActivity() == null) {
            return;
        }
        getActivity().runOnUiThread(new RunnableC0240a(str2, str));
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getListView().setOnItemLongClickListener(new d());
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 0 && i3 == -1) {
            d.a.a.a aVarC = v.c(getActivity(), intent.getStringExtra("de.blinkt.openvpn.profileUUID"));
            v.g(getActivity()).o(getActivity(), aVarC);
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle(R.string.configuration_changed);
            builder.setMessage(R.string.restart_vpn_after_change);
            builder.setPositiveButton(R.string.restart, new c(aVarC));
            builder.setNegativeButton(R.string.ignore, (DialogInterface.OnClickListener) null);
            builder.create().show();
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f17997h = false;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i2) {
        g gVar;
        int i3;
        switch (i2) {
            case R.id.radioISO /* 2131428838 */:
                gVar = this.f17999j;
                i3 = 2;
                break;
            case R.id.radioNone /* 2131428839 */:
                gVar = this.f17999j;
                i3 = 0;
                break;
            case R.id.radioShort /* 2131428840 */:
                gVar = this.f17999j;
                i3 = 1;
                break;
            default:
                return;
        }
        gVar.j(i3);
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00f3  */
    @Override // android.app.ListFragment, android.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.h.a.l.d.a.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        z.D(this.f17999j);
        super.onDestroy();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
        this.f17999j.i(i2 + 1);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        new Intent(getActivity(), (Class<?>) OpenVPNService.class).setAction("de.blinkt.openvpn.START_SERVICE");
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        z.c(this);
        z.a(this);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        z.E(this);
        z.C(this);
        getActivity().getPreferences(0).edit().putInt("logtimeformat", this.f17999j.f18016f).putInt("verbositylevel", this.f17999j.f18017g).apply();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.app.ListFragment, android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }
}
