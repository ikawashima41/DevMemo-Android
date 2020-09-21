package devmemo.iichirokawashima.devmemo.service

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {

    override fun onNewToken(p0: String) {
        // 端末＋アプリを一意に識別するためのトークンを取得
        Log.i("FIREBASE", "[SERVICE] Token = ${p0 ?: "Empty"}")
    }

    override fun onMessageReceived(p0: RemoteMessage) {
        p0?.let { message ->
            // 通知メッセージ
            message.notification?.let {
                // 通知メッセージを処理
            }

            // データメッセージ
            message.data?.let {
                // データメッセージを処理
            }
        }
    }
}
