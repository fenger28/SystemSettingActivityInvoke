package cn.blowing.test.systemsettingactivityinvoke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author fenger7
 * @date 2018/1/28
 */
public class MainActivity extends AppCompatActivity {

    private List<String> listString;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        initListener();

        initData();
    }

    /**加载数据*/
    private void initData() {
        listString = Arrays.asList("ACCESSIBILITY_SETTINGS",
                "ADD_ACCOUNT",
                "AIRPLANE_MODE_SETTINGS",
                "APN_SETTINGS",
                "APPLICATION_DETAILS_SETTINGS",
                "APPLICATION_DEVELOPMENT_SETTINGS",
                "APPLICATION_SETTINGS",
                "BLUETOOTH_SETTINGS",
                "DATA_ROAMING_SETTINGS",
                "DATE_SETTINGS",
                "DEVICE_INFO_SETTINGS",
                "DISPLAY_SETTINGS",
                "INPUT_METHOD_SETTINGS",
                "INPUT_METHOD_SUBTYPE_SETTINGS",
                "INTERNAL_STORAGE_SETTINGS",
                "LOCALE_SETTINGS",
                "LOCATION_SOURCE_SETTINGS",
                "MANAGE_ALL_APPLICATIONS_SETTINGS",
                "MANAGE_APPLICATIONS_SETTINGS",
                "MEMORY_CARD_SETTINGS",
                "NETWORK_OPERATOR_SETTINGS",
                "NFCSHARING_SETTINGS",
                "PRIVACY_SETTINGS",
                "QUICK_LAUNCH_SETTINGS",
                "SEARCH_SETTINGS",
                "SECURITY_SETTINGS",
                "SETTINGS",
                "SOUND_SETTINGS",
                "SYNC_SETTINGS",
                "USER_DICTIONARY_SETTINGS",
                "WIFI_IP_SETTINGS",
                "WIFI_SETTINGS",
                "WIRELESS_SETTINGS"
        );

        List<Map<String, Object>> data = new ArrayList<>();
        for (int i = 0; i < listString.size(); ++i) {
            Map<String, Object> item = new HashMap<String, Object>();
            item.put("text", listString.get(i));
            data.add(item);
        }

        SimpleAdapter adapter = new SimpleAdapter(this, data,
                R.layout.item_layout, new String[] { "text" },
                new int[] { R.id.info });
        listView.setAdapter(adapter);
    }

    /**添加监听*/
    private void initListener() {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String action = "android.settings." + listString.get(i);
                startActivity(new Intent(action));
            }
        });
    }

    /**加载控件*/
    private void initView() {
        listView = findViewById(R.id.listview);
    }
}