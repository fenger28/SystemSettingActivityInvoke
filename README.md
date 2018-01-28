大家好，
    之前项目开发时需要调用系统设置里面的页面，实现比较简单，本文章总结了调用系统设置界面的API及对应的界面解释，请大家参考，纠正，互喷！
    采用标准的安卓开启界面startActivity(new Intent(String action));
    例：开启安卓系统设置日期时间设置界面
        startActivity(new Intent(Settings.ACTION_DATE_SETTINGS));
        等价于 startActivity(new Intent("android.settings.DATE_SETTINGS"));
    下面是系统设置中所有调用的界面API：
      //设置总页面
      ACTION_SETTINGS = "android.settings.SETTINGS";
      //APN设置页面
      ACTION_APN_SETTINGS = "android.settings.APN_SETTINGS";
      //位置信息设置
      ACTION_LOCATION_SOURCE_SETTINGS ="android.settings.LOCATION_SOURCE_SETTINGS";
      //无线和网络设置
      ACTION_WIRELESS_SETTINGS ="android.settings.WIRELESS_SETTINGS";
      //无线和网络设置
      ACTION_AIRPLANE_MODE_SETTINGS ="android.settings.AIRPLANE_MODE_SETTINGS";
      //辅助功能
      ACTION_ACCESSIBILITY_SETTINGS ="android.settings.ACCESSIBILITY_SETTINGS";
      //安全设置
      ACTION_SECURITY_SETTINGS ="android.settings.SECURITY_SETTINGS";
      //备份与重置
      ACTION_PRIVACY_SETTINGS ="android.settings.PRIVACY_SETTINGS";
      //WIFI设置
      ACTION_WIFI_SETTINGS ="android.settings.WIFI_SETTINGS";
      //Ip设置
      ACTION_WIFI_IP_SETTINGS ="android.settings.WIFI_IP_SETTINGS";
      //蓝牙
      ACTION_BLUETOOTH_SETTINGS = "android.settings.BLUETOOTH_SETTINGS";
      //日期时间
      ACTION_DATE_SETTINGS ="android.settings.DATE_SETTINGS";
      //声音
      ACTION_SOUND_SETTINGS ="android.settings.SOUND_SETTINGS";
      //显示
      ACTION_DISPLAY_SETTINGS ="android.settings.DISPLAY_SETTINGS";
      //语言设置
      ACTION_LOCALE_SETTINGS ="android.settings.LOCALE_SETTINGS";
      //输入法设置
      ACTION_INPUT_METHOD_SETTINGS ="android.settings.INPUT_METHOD_SETTINGS";
      //有效输入法
      ACTION_INPUT_METHOD_SUBTYPE_SETTINGS ="android.settings.INPUT_METHOD_SUBTYPE_SETTINGS";
      //个人字典
      ACTION_USER_DICTIONARY_SETTINGS ="android.settings.USER_DICTIONARY_SETTINGS";
      //应用
      ACTION_APPLICATION_SETTINGS ="android.settings.APPLICATION_SETTINGS";
      //开发者选项
      ACTION_APPLICATION_DEVELOPMENT_SETTINGS ="android.settings.APPLICATION_DEVELOPMENT_SETTINGS";
      //快速启动
      ACTION_QUICK_LAUNCH_SETTINGS = "android.settings.QUICK_LAUNCH_SETTINGS";
      //已下载应用
      ACTION_MANAGE_APPLICATIONS_SETTINGS = "android.settings.MANAGE_APPLICATIONS_SETTINGS";
      //全部应用
      ACTION_MANAGE_ALL_APPLICATIONS_SETTINGS = "android.settings.MANAGE_ALL_APPLICATIONS_SETTINGS";
      //
      ACTION_APPLICATION_DETAILS_SETTINGS ="android.settings.APPLICATION_DETAILS_SETTINGS";
      //添加账号
      ACTION_SYNC_SETTINGS ="android.settings.SYNC_SETTINGS";
      //邮箱账号
      ACTION_ADD_ACCOUNT ="android.settings.ADD_ACCOUNT_SETTINGS";
      //网络运营商
      ACTION_NETWORK_OPERATOR_SETTINGS = "android.settings.NETWORK_OPERATOR_SETTINGS";
      //移动网络设置
      ACTION_DATA_ROAMING_SETTINGS ="android.settings.DATA_ROAMING_SETTINGS";
      //存储设置
      ACTION_INTERNAL_STORAGE_SETTINGS = "android.settings.INTERNAL_STORAGE_SETTINGS";
      //存储设置
      ACTION_MEMORY_CARD_SETTINGS ="android.settings.MEMORY_CARD_SETTINGS";
      //
      ACTION_SEARCH_SETTINGS ="android.search.action.SEARCH_SETTINGS";
      //状态信息
      ACTION_DEVICE_INFO_SETTINGS = "android.settings.DEVICE_INFO_SETTINGS";
      //NFC功能
      ACTION_NFCSHARING_SETTINGS ="android.settings.NFCSHARING_SETTINGS";

    以上就是系统设置中的api，请大家自行取用。
