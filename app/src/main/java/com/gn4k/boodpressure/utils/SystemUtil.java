package com.gn4k.boodpressure.utils;


import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SystemUtil {
    private static Locale myLocale;

    public static void viewReference(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        context.startActivity(intent);
    }

    public static boolean isMyServiceRunning(Class<?> cls, Context context) {
        for (ActivityManager.RunningServiceInfo runningServiceInfo : ((ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE)).getRunningServices(Integer.MAX_VALUE)) {
            if (cls.getName().equals(runningServiceInfo.service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    public static void setLocale(Context context) {
        String preLanguage = getPreLanguage(context);
        if (preLanguage.equals("")) {
            Configuration configuration = new Configuration();
            Locale locale = Locale.getDefault();
            Locale.setDefault(locale);
            configuration.locale = locale;
            context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
            return;
        }
        changeLang(preLanguage, context);
    }

    public static void changeLang(String str, Context context) {
        if (!str.equalsIgnoreCase("")) {
            myLocale = new Locale(str);
            saveLocale(context, str);
            Locale.setDefault(myLocale);
            Configuration configuration = new Configuration();
            configuration.locale = myLocale;
            context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
        }
    }

    public static void saveLocale(Context context, String str) {
        setPreLanguage(context, str);
    }

    public static String getPreLanguage(Context context) {
        String str;
        SharedPreferences sharedPreferences = context.getSharedPreferences("MY_PRE", 0);
        Locale.getDefault().getDisplayLanguage();
        if (Build.VERSION.SDK_INT >= 24) {
            str = Resources.getSystem().getConfiguration().getLocales().get(0).getLanguage();
        } else {
            str = Resources.getSystem().getConfiguration().locale.getLanguage();
        }
        if (!getLanguageApp().contains(str)) {
            return sharedPreferences.getString("KEY_LANGUAGE", "en");
        }
        return sharedPreferences.getString("KEY_LANGUAGE", str);
    }

    public static void setPreLanguage(Context context, String str) {
        if (str != null && !str.equals("")) {
            context.getSharedPreferences("MY_PRE", 0).edit().putString("KEY_LANGUAGE", str).apply();
        }
    }

    public static List<String> getLanguageApp() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("en");
        arrayList.add("pt");
        arrayList.add("fr");
        arrayList.add("es");
        arrayList.add("hi");
        arrayList.add("ru");
        return arrayList;
    }
}