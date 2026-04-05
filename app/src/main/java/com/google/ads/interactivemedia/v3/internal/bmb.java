package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class bmb {
    public static String a(blz blzVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        l(blzVar, sb, 0);
        return sb.toString();
    }

    public static final void b(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i2, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i2, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(bmx.a(bkd.q((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof bkd) {
            sb.append(": \"");
            sb.append(bmx.a((bkd) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof bkx) {
            sb.append(" {");
            l((bkx) obj, sb, i2 + 2);
            sb.append("\n");
            while (i3 < i2) {
                sb.append(' ');
                i3++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i5 = i2 + 2;
        b(sb, i5, TransferTable.COLUMN_KEY, entry.getKey());
        b(sb, i5, "value", entry.getValue());
        sb.append("\n");
        while (i3 < i2) {
            sb.append(' ');
            i3++;
        }
        sb.append("}");
    }

    public static final Map<?, ?> c(Object obj) {
        return (blu) obj;
    }

    public static final bls<?, ?> d(Object obj) {
        throw null;
    }

    public static final Map<?, ?> e(Object obj) {
        return (blu) obj;
    }

    public static final int f(Object obj, Object obj2) {
        blu bluVar = (blu) obj;
        if (bluVar.isEmpty()) {
            return 0;
        }
        Iterator it = bluVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final boolean g(Object obj) {
        return !((blu) obj).e();
    }

    public static final Object h(Object obj, Object obj2) {
        blu bluVarB = (blu) obj;
        blu bluVar = (blu) obj2;
        if (!bluVar.isEmpty()) {
            if (!bluVarB.e()) {
                bluVarB = bluVarB.b();
            }
            bluVarB.d(bluVar);
        }
        return bluVarB;
    }

    public static final Object i() {
        return blu.a().b();
    }

    public static final void j(Object obj) {
        ((blu) obj).c();
    }

    private static final String k(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    private static void l(blz blzVar, StringBuilder sb, int i2) {
        Object obj;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : blzVar.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strSubstring = str.startsWith("get") ? str.substring(3) : str;
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List")) {
                String strValueOf = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf2 = String.valueOf(strSubstring.substring(1, strSubstring.length() - 4));
                String strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    b(sb, i2, k(strConcat), bkx.ar(method2, blzVar, new Object[0]));
                }
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map")) {
                String strValueOf3 = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf4 = String.valueOf(strSubstring.substring(1, strSubstring.length() - 3));
                String strConcat2 = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    b(sb, i2, k(strConcat2), bkx.ar(method3, blzVar, new Object[0]));
                }
            }
            if (((Method) map2.get(strSubstring.length() != 0 ? "set".concat(strSubstring) : new String("set"))) != null) {
                if (strSubstring.endsWith("Bytes")) {
                    String strValueOf5 = String.valueOf(strSubstring.substring(0, strSubstring.length() - 5));
                    if (!map.containsKey(strValueOf5.length() != 0 ? "get".concat(strValueOf5) : new String("get"))) {
                    }
                }
                String strValueOf6 = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf7 = String.valueOf(strSubstring.substring(1));
                String strConcat3 = strValueOf7.length() != 0 ? strValueOf6.concat(strValueOf7) : new String(strValueOf6);
                Method method4 = (Method) map.get(strSubstring.length() != 0 ? "get".concat(strSubstring) : new String("get"));
                Method method5 = (Method) map.get(strSubstring.length() != 0 ? "has".concat(strSubstring) : new String("has"));
                if (method4 != null) {
                    Object objAr = bkx.ar(method4, blzVar, new Object[0]);
                    if (method5 == null) {
                        if (objAr instanceof Boolean) {
                            if (((Boolean) objAr).booleanValue()) {
                                b(sb, i2, k(strConcat3), objAr);
                            }
                        } else if (objAr instanceof Integer) {
                            if (((Integer) objAr).intValue() != 0) {
                                b(sb, i2, k(strConcat3), objAr);
                            }
                        } else if (objAr instanceof Float) {
                            if (((Float) objAr).floatValue() != 0.0f) {
                                b(sb, i2, k(strConcat3), objAr);
                            }
                        } else if (!(objAr instanceof Double)) {
                            if (objAr instanceof String) {
                                obj = BuildConfig.FLAVOR;
                            } else if (objAr instanceof bkd) {
                                obj = bkd.f21262b;
                            } else if (objAr instanceof blz) {
                                if (objAr != ((blz) objAr).aU()) {
                                    b(sb, i2, k(strConcat3), objAr);
                                }
                            } else if (!(objAr instanceof Enum) || ((Enum) objAr).ordinal() != 0) {
                                b(sb, i2, k(strConcat3), objAr);
                            }
                            if (!objAr.equals(obj)) {
                                b(sb, i2, k(strConcat3), objAr);
                            }
                        } else if (((Double) objAr).doubleValue() != 0.0d) {
                            b(sb, i2, k(strConcat3), objAr);
                        }
                    } else if (((Boolean) bkx.ar(method5, blzVar, new Object[0])).booleanValue()) {
                        b(sb, i2, k(strConcat3), objAr);
                    }
                }
            }
        }
        if (blzVar instanceof bkw) {
            throw null;
        }
        bmz bmzVar = ((bkx) blzVar).f21334c;
        if (bmzVar != null) {
            bmzVar.g(sb, i2);
        }
    }
}
