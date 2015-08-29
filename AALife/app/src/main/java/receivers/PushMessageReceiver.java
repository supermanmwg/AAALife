package receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.example.supermanmwg.aaalife.ReceiveActivity;

import cn.bmob.push.PushConstants;

/**
 * Created by supermanmwg on 15-8-28.
 */
public class PushMessageReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("haha", intent.getStringExtra("msg"));
        if(intent.getAction().equals(PushConstants.ACTION_MESSAGE)) {
            //do some work;
            Log.d("haha", intent.getStringExtra("msg"));
            Intent newIntent = new Intent(context, ReceiveActivity.class);
            newIntent.putExtra("receive", intent.getStringExtra("msg"));
            newIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(newIntent);
        }
    }
}
