package com.liu.pcp.utils;

public class Utils {
    /*
     * -1代表含有特殊富豪
     * -2代表长度过长
     *  1代表合规
     * */
    public static int checkUserName(String userName) {
        if (userName.length() >= 13) {
            return -2;
        }
        for (int i = 0; i < userName.length(); i++) {
            if (userName.charAt(i) > 'z' && userName.charAt(i) < 'a') {
                if (userName.charAt(i) > 'Z' && userName.charAt(i) < 'A') {
                    if (userName.charAt(i) > '9' && userName.charAt(i) < '0') {
                        if (userName.charAt(i) != '_') {
                            return -1;
                        }
                    }
                }
            }
        }
        return 1;
    }

    public static boolean checkEmail(String email) {
        int index = 0;
        int tail = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                index = i;
                continue;
            }
            if (email.charAt(i) == '.') {
                tail = i;
                continue;
            }
            if (email.charAt(i)>'z'&&email.charAt(i)<'a'&&email.charAt(i)>'Z'&&email.charAt(i)<'A'&&email.charAt(i)>'9'&&email.charAt(i)<'0'){
                return false;
            }

        }
        if (index == 0 || index == email.length()-1 || tail == email.length()-1) {
            return false;
        }
        return true;

    }
}
