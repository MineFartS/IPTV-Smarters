package c.f.a.c.k.b;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.achartengine.chart.TimeChart;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends x5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f14129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f14130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AccountManager f14131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f14132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f14133g;

    public n(c5 c5Var) {
        super(c5Var);
    }

    @Override // c.f.a.c.k.b.x5
    public final boolean h() {
        Calendar calendar = Calendar.getInstance();
        this.f14129c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.f14130d = sb.toString();
        return false;
    }

    public final long o() {
        k();
        return this.f14129c;
    }

    public final String p() {
        k();
        return this.f14130d;
    }

    public final long q() {
        g();
        return this.f14133g;
    }

    public final void r() {
        g();
        this.f14132f = null;
        this.f14133g = 0L;
    }

    public final boolean s() {
        g();
        long jA = this.f14413a.a().a();
        if (jA - this.f14133g > TimeChart.DAY) {
            this.f14132f = null;
        }
        Boolean bool = this.f14132f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (a.i.i.b.a(this.f14413a.b(), "android.permission.GET_ACCOUNTS") != 0) {
            this.f14413a.c().s().a("Permission error checking for dasher/unicorn accounts");
        } else {
            if (this.f14131e == null) {
                this.f14131e = AccountManager.get(this.f14413a.b());
            }
            try {
                Account[] result = this.f14131e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
                if (result != null && result.length > 0) {
                    this.f14132f = Boolean.TRUE;
                    this.f14133g = jA;
                    return true;
                }
                Account[] result2 = this.f14131e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.f14132f = Boolean.TRUE;
                    this.f14133g = jA;
                    return true;
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e2) {
                this.f14413a.c().p().b("Exception checking account types", e2);
            }
        }
        this.f14133g = jA;
        this.f14132f = Boolean.FALSE;
        return false;
    }
}
