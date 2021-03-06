package com.androidex.config;

import com.tencent.devicedemo.BuildConfig;

/**
 * Created by simon on 2016/7/23.
 */
public class DeviceConfig {
    /********residential*****/
    public static final String SERVER_URL="http://www.lockaxial.com";
	public static final String UPDATE_SERVER_URL="http://www.lockaxial.com";
    public static final String UPDATE_RELEASE_FOLDER_1="/release/doorAccessMachine/v1/"; //A000000类用户目录
    public static final String UPDATE_RELEASE_FOLDER_2="/release/doorAccessMachine/v2/"; //A000001类用户目录
    public static final String UPDATE_RELEASE_FOLDER_3="/release/doorAccessMachine/v3/"; //A000002类用户目录
    public static final String UPDATE_RELEASE_PACKAGE="package.json";
    public static final int RELEASE_VERSION= BuildConfig.BUILD_VERSION;
    public static final String USER_A0000000 = "A000000";//通用
    public static final String USER_A0000001 = "A000001";//北京马总
    public static final String USER_A0000002 = "A000002";//维拓智能（背景不一致）
    public static final String USER_ID = USER_A0000001;
    public static final String ACTIVE_ARCFACE = "active_arcface";
    public static int RELEASE_VERSION_WAIT_TIME=1000*60*1;
    public static int RELEASE_VERSION_UPDATE_TIME=3;
    public static final String TARGET_PACKAGE_NAME="com.tencent.devicedemo";
    public static final String TARGET_ACTIVITY_NAME="com.tencent.devicedemo.InitActivity";
	
    public static final int APPLICATION_MODEL=0; //0:debug  1:product
	public static final int CALL_MEMBER_MODE_SERIAL=0;
    public static final int CALL_MEMBER_MODE_PARALL=1;
    public static final String LOCAL_FILE_PATH="residential";
    public static final int HIDE_SCREEN_STATUS=1;
    public static final boolean IS_SUPPORT_OFFLINE=true;//是否离线运行
	public static final boolean IS_KEY_VOICE_AVAILABLE=false;
    public static final int DEVICE_KEYCODE_POUND=66;
    public static final int DEVICE_KEYCODE_STAR=67;
	public static final String DEVICE_MODE_FLAG="a"; //设备型号

	public static boolean IS_PUSH_AVAILABLE=true;//是否推送
    public static boolean IS_CALL_DIRECT_AVAILABLE=false;
    public static int CALL_MEMBER_MODE=CALL_MEMBER_MODE_PARALL;

    public static boolean IS_RFID_AVAILABLE=false;
    public static boolean IS_ASSEMBLE_AVAILABLE=false;
    public static boolean IS_FINGER_AVAILABLE=true;
	public static boolean IS_NFC_AVAILABLE=true;
    public static boolean IS_AEX_AVAILABLE=true;
    public static boolean IS_NFC_PORT_AVAILABLE=false;
    public static boolean IS_AD_AVAILABLE=true;
    public static boolean IS_BLE_AVAILABLE=false;

	public static String RFID_PORT="/dev/ttyS1";
    public static String ASSEMBLE_PORT="/dev/ttyS0";
	public static String NFC_PORT="/dev/ttyS3";
    public static String AEX_PORT="/dev/rkey";
	
    public static int PARALL_WAIT_TIME=1000*30;
    public static int SERIAL_WAIT_TIME=1000*30;

    public static int AD_INIT_WAIT_TIME=1000*60;
    public static int AD_REFRESH_WAIT_TIME=1000*60*60;//1000*60*60;//等待下载广告刷新的时间
    public static int CONNECT_REPORT_WAIT_TIME=1000*60*10;
    public static int MAX_DIRECT_CALL_TIME=1000*60;//通话时长应该有个最大值
    public static int PASSWORD_WAIT_TIME=1000*20;

    public static int UNIT_NO_LENGTH=4;
    public static int BLOCK_NO_LENGTH=2;
    public static int BLOCK_LENGTH=6;
    public static String DEVICE_TYPE="B"; //C：社区大门门禁 B:楼栋单元门禁

    public static int VOLUME_STREAM_MUSIC=5;
    public static int VOLUME_STREAM_VOICE_CALL=5;
    public static int VOLUME_STREAM_RING=5;
    public static int VOLUME_STREAM_SYSTEM=5;
	
	public static int VIDEO_STATUS=0; //0：标清；1：流畅；2：高清；3：720P；4：1080P 5：hd_land
    public static int VIDEO_ADAPT=1;  //0:关闭，1:开启

    public static final float FACE_MAX = 0.6f;

    public static final boolean KEY_VOL = false;

    public static final String Lockaxial_Monitor_PackageName = "com.androidex.lockaxialqq.monitor";
    public static final String Lockaxial_Monitor_SERVICE = "com.androidex.lockaxialqq.monitor.MonitorService";

    public static final String SD_PATH = "LockaxialQQ/Monitor";
    /*******************************/


    /*********************************************************************************************/
    /**
     * 人脸SDK2.0版本
     */
    public static final String APP_ID = "2PE9KmkuJBxv26DjHakvptvJNgCupYSJZMgGcudcJTRt";
    public static final String SDK_KEY = "He6CNxBAA2RZ4yuiGnje9SVxJ6DX3FrHDEKUYfaZ8DSE";
}
