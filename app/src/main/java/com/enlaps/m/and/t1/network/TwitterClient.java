package com.enlaps.m.and.t1.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

/**
 * Created by vsatish on 2/24/2016.
 */
public class TwitterClient {

    private Context mContext;

    public TwitterClient(Context _context) {
        this.mContext = _context;
    }

    public static boolean checkInternet(Context _context) {
        final ConnectivityManager cm = (ConnectivityManager) _context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo nwInfo = cm.getActiveNetworkInfo();

        if( (null == nwInfo)
         || (false == nwInfo.isConnected()) ){
            return false;
        }

        return true;
    }
}
