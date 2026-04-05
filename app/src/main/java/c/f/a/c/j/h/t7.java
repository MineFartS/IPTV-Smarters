package c.f.a.c.j.h;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class t7 {
    public static String a(q7 q7Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        c(q7Var, sb, 0);
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
            sb.append(o8.a(l5.v((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof l5) {
            sb.append(": \"");
            sb.append(o8.a((l5) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof l6) {
            sb.append(" {");
            c((l6) obj, sb, i2 + 2);
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

    public static void c(q7 q7Var, StringBuilder sb, int i2) {
        Object obj;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : q7Var.getClass().getDeclaredMethods()) {
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
                    b(sb, i2, d(strConcat), l6.k(method2, q7Var, new Object[0]));
                }
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map")) {
                String strValueOf3 = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf4 = String.valueOf(strSubstring.substring(1, strSubstring.length() - 3));
                String strConcat2 = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    b(sb, i2, d(strConcat2), l6.k(method3, q7Var, new Object[0]));
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
                    Object objK = l6.k(method4, q7Var, new Object[0]);
                    if (method5 == null) {
                        if (objK instanceof Boolean) {
                            if (((Boolean) objK).booleanValue()) {
                                b(sb, i2, d(strConcat3), objK);
                            }
                        } else if (objK instanceof Integer) {
                            if (((Integer) objK).intValue() != 0) {
                                b(sb, i2, d(strConcat3), objK);
                            }
                        } else if (objK instanceof Float) {
                            if (((Float) objK).floatValue() != 0.0f) {
                                b(sb, i2, d(strConcat3), objK);
                            }
                        } else if (!(objK instanceof Double)) {
                            if (objK instanceof String) {
                                obj = BuildConfig.FLAVOR;
                            } else if (objK instanceof l5) {
                                obj = l5.f13413b;
                            } else if (objK instanceof q7) {
                                if (objK != ((q7) objK).g()) {
                                    b(sb, i2, d(strConcat3), objK);
                                }
                            } else if (!(objK instanceof Enum) || ((Enum) objK).ordinal() != 0) {
                                b(sb, i2, d(strConcat3), objK);
                            }
                            if (!objK.equals(obj)) {
                                b(sb, i2, d(strConcat3), objK);
                            }
                        } else if (((Double) objK).doubleValue() != 0.0d) {
                            b(sb, i2, d(strConcat3), objK);
                        }
                    } else if (((Boolean) l6.k(method5, q7Var, new Object[0])).booleanValue()) {
                        b(sb, i2, d(strConcat3), objK);
                    }
                }
            }
        }
        if (q7Var instanceof j6) {
            throw null;
        }
        r8 r8Var = ((l6) q7Var).zzc;
        if (r8Var != null) {
            r8Var.g(sb, i2);
        }
    }

    public static final String d(String str) {
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
}
